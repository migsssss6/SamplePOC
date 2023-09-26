package com.dailycodebuffer.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskData {

    private Long riskId;
    private String transactionName;
    private String transactionLocation;
    private String transactionCode;
}
