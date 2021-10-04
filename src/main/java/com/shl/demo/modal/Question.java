package com.shl.demo.modal;

import javax.persistence.*;

@Entity
@Table(name = "QUESTION_DETAILS")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long questionId;
    private String question;
    private String answer;
    @ManyToOne
    private HotjarSurveyData hotjarSurveyData;

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public HotjarSurveyData getHotjarSurveyData() {
        return hotjarSurveyData;
    }

    public void setHotjarSurveyData(HotjarSurveyData hotjarSurveyData) {
        this.hotjarSurveyData = hotjarSurveyData;
    }
}
