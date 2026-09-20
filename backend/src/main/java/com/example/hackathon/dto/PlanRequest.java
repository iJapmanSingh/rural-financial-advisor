package com.example.hackathon.dto;

public class PlanRequest {
    private String location;
    private int ownCapital;
    private String businessType;
    private int monthlyIncome; // 1. Added this

    public PlanRequest() {}

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getOwnCapital() { return ownCapital; }
    public void setOwnCapital(int ownCapital) { this.ownCapital = ownCapital; }

    public String getBusinessType() { return businessType; }
    public void setBusinessType(String businessType) { this.businessType = businessType; }

    public int getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(int monthlyIncome) { this.monthlyIncome = monthlyIncome; }
}