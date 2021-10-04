package com.shl.demo.repository;

import com.shl.demo.modal.HotjarSurveyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<HotjarSurveyData,Long> {
}
