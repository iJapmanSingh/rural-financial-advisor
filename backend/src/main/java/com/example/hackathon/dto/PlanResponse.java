package com.example.hackathon.dto;

import java.util.UUID;

public class PlanResponse {
    private UUID id;
    private int totalSafeProjectBudget;
    private int maxSafeLoanAmount;
    private int emi;
    private String schemeName;
    private String riskLevel;

    public PlanResponse() {}

    public PlanResponse(UUID id, int totalSafeProjectBudget, int maxSafeLoanAmount, int emi, String schemeName, String riskLevel) {
        this.id = id;
        this.totalSafeProjectBudget = totalSafeProjectBudget;
        this.maxSafeLoanAmount = maxSafeLoanAmount;
        this.emi = emi;
        this.schemeName = schemeName;
        this.riskLevel = riskLevel;
    }

    public UUID getId() { return id; }
    public int getTotalSafeProjectBudget() { return totalSafeProjectBudget; }
    public int getMaxSafeLoanAmount() { return maxSafeLoanAmount; }
    public int getEmi() { return emi; }
    public String getSchemeName() { return schemeName; }
    public String getRiskLevel() { return riskLevel; }
}