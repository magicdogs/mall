package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrator
 */
public class NoticeResponse {

    @JsonProperty("dateAdd")
    private String dateadd;
    private int id;
    @JsonProperty("isShow")
    private boolean isshow;
    private String title;
    @JsonProperty("userId")
    private int userid;
    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }
    public String getDateadd() {
        return dateadd;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setIsshow(boolean isshow) {
        this.isshow = isshow;
    }
    public boolean getIsshow() {
        return isshow;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {
        return userid;
    }

}
