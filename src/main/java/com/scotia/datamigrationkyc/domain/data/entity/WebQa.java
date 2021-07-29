package com.scotia.datamigrationkyc.domain.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "web_qa")
public class WebQa {

    @Id
    @GeneratedValue
    @Column(name = "web_qa_id")
    private Long webQaId;
    @Column(name = "qa_group")
    private String qaGroup;
    @Column(name = "qa_key")
    private String qaKey;
    @Column(name = "descr_en")
    private String descrEn;
    @Column(name = "tag")
    private String tag;
    @Column(name = "web_sis_tag_id")
    private String webSisTagId;

    public WebQa() {
    }

    public Long getWebQaId() {
        return webQaId;
    }

    public void setWebQaId(Long webQaId) {
        this.webQaId = webQaId;
    }

    public String getQaGroup() {
        return qaGroup;
    }

    public void setQaGroup(String qaGroup) {
        this.qaGroup = qaGroup;
    }

    public String getQaKey() {
        return qaKey;
    }

    public void setQaKey(String qaKey) {
        this.qaKey = qaKey;
    }

    public String getDescrEn() {
        return descrEn;
    }

    public void setDescrEn(String descrEn) {
        this.descrEn = descrEn;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getWebSisTagId() {
        return webSisTagId;
    }

    public void setWebSisTagId(String webSisTagId) {
        this.webSisTagId = webSisTagId;
    }
}