package com.shl.demo.controller;

import com.shl.demo.modal.HotjarSurveyData;
import com.shl.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping(value = "/zapTest")
    public void saveHotjarData(@RequestBody HotjarSurveyData hotjarSurveyData) {
        surveyService.saveSurveyData(hotjarSurveyData);
    }
}
