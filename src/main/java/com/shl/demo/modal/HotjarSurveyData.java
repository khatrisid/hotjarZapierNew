package com.shl.demo.modal;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "HOTJAR_DATA")
public class HotjarSurveyData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String createdDatetimeString;
    private String hotjarResponseUrl;
    private String pageResponseUrl;
    private String siteId;
    private String surveyId;
    @OneToMany(mappedBy="hotjarSurveyData")
    private List<Question> question;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedDatetimeString() {
        return createdDatetimeString;
    }

    public void setCreatedDatetimeString(String createdDatetimeString) {
        this.createdDatetimeString = createdDatetimeString;
    }

    public String getHotjarResponseUrl() {
        return hotjarResponseUrl;
    }

    public void setHotjarResponseUrl(String hotjarResponseUrl) {
        this.hotjarResponseUrl = hotjarResponseUrl;
    }

    public String getPageResponseUrl() {
        return pageResponseUrl;
    }

    public void setPageResponseUrl(String pageResponseUrl) {
        this.pageResponseUrl = pageResponseUrl;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "HotjarSurveyData{" +
                "id=" + id +
                ", createdDatetimeString='" + createdDatetimeString + '\'' +
                ", hotjarResponseUrl='" + hotjarResponseUrl + '\'' +
                ", pageResponseUrl='" + pageResponseUrl + '\'' +
                ", siteId='" + siteId + '\'' +
                ", surveyId='" + surveyId + '\'' +
                ", question=" + question +
                '}';
    }
}
