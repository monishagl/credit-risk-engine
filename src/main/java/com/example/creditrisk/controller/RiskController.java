package com.example.creditrisk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.creditrisk.model.Applicant;
import com.example.creditrisk.service.RiskEngineService;

@RestController
@RequestMapping("/api")
public class RiskController {

    @Autowired
    private RiskEngineService riskEngineService;

    @PostMapping("/assess")
    public String assessRisk(@RequestBody Applicant applicant) {
        return riskEngineService.assessRisk(applicant);
    }
}
