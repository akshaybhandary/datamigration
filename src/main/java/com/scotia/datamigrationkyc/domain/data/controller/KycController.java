package com.scotia.datamigrationkyc.domain.data.controller;

import com.scotia.datamigrationkyc.domain.data.model.QuestionsSets;
import com.scotia.datamigrationkyc.domain.data.service.KycService;
import com.scotia.datamigrationkyc.domain.data.service.WebQaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("kyc")
public class KycController {

    private KycService kycService;
    private WebQaService webQaService;

    KycController(KycService kycService, WebQaService webQaService){
        this.kycService = kycService;
        this.webQaService = webQaService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<QuestionsSets> getData() {
        this.kycService.getAllData();
        return this.webQaService.getAllQa();
    }
}
