package com.example.creditrisk.model;

public class Applicant {
    private String name;
    private int creditScore;
    private double income;
    private double debt;

    public Applicant() {}

    public Applicant(int creditScore, double debt, double income, String name) {
        this.creditScore = creditScore;
        this.debt = debt;
        this.income = income;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getDebt() {
        return debt;
    }

    
}
