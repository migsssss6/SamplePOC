package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithRisk(Long userId) {
        log.info("Inside getUserWithRisk of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        RiskData riskData =
                restTemplate.getForObject("http://RISK-SERVICE/risks/" + user.getRiskId()
                        ,RiskData.class);

        vo.setUser(user);
        vo.setRiskData(riskData);

        return  vo;
    }
}
