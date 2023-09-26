package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risks")
@Slf4j
public class RiskController {

    @Autowired
    private RiskService riskService;

    @PostMapping("/")
    public RiskData saveRisk(@RequestBody RiskData riskData) {
        log.info("Inside saveRisk method of RiskController");
        return  riskService.saveRisk(riskData);
    }

    @GetMapping("/{id}")
    public RiskData findRiskById(@PathVariable("id") Long riskId) {
        log.info("Inside findRiskById method of RiskController");
        return riskService.findRiskById(riskId);
    }

}
