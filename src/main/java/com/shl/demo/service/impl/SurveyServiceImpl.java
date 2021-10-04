package com.shl.demo.service.impl;

import com.shl.demo.modal.HotjarSurveyData;
import com.shl.demo.repository.SurveyRepository;
import com.shl.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveSurveyData(HotjarSurveyData hotjarSurveyData) {
        surveyRepository.save(hotjarSurveyData);
    }
}
