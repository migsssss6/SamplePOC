package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RiskService {

    @Autowired
    private RiskRepository riskRepository;

    public RiskData saveRisk(RiskData riskData) {
        log.info("Inside saveRisk of RiskService");
        return riskRepository.save(riskData);
    }

    public RiskData findByRiskId(Long riskId) {
        log.info("Inside findByRiskId of RiskService");
        return riskRepository.findByRiskId(riskId);
    }
}
