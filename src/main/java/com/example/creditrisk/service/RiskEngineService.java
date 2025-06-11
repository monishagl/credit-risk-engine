package com.example.creditrisk.service;

import org.springframework.stereotype.Service;

import com.example.creditrisk.model.Applicant;


@Service
public class RiskEngineService {
    public String assessRisk(Applicant applicant) {
        double dti = applicant.getDebt() / applicant.getIncome();

        if (applicant.getCreditScore() < 600 || dti > 0.4) {
            return "High Risk";
        } else if (applicant.getCreditScore() < 700) {
            return "Moderate Risk";
        } else {
            return "Low Risk";
        }
    }

}
