package com.dailycodebuffer.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long riskId;
    private String transactionName;
    private String transactionLocation;
    private String transactionCode;
}
