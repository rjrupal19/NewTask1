package com.example.demo.model.request;

import com.example.demo.model.PaymentTerm;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CreatePolicyRequest {
    private long policyLife;
    private Double sumInsured;
    private PaymentTerm premiumTerm;
    private LocalDateTime inceptionDate;
}
