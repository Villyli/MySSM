package com.villy.entity;

import java.util.Set;

public class User {

    private String id;

    private String userId;
    private String submitDate;
    private String counts;

    public User(String id, String userId, String submitDate, String counts) {
        this.id = id;
        this.userId = userId;
        this.submitDate = submitDate;
        this.counts = counts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }
}
