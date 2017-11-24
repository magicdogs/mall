package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrator
 */
public class BannerResponse {

    @JsonProperty("businessId")
    private int businessid;
    @JsonProperty("dateAdd")
    private String dateadd;
    @JsonProperty("dateUpdate")
    private String dateupdate;
    private int id;
    @JsonProperty("linkUrl")
    private String linkurl;
    private int paixu;
    @JsonProperty("picUrl")
    private String picurl;
    private String remark;
    private int status;
    @JsonProperty("statusStr")
    private String statusstr;
    private String title;
    private String type;
    @JsonProperty("userId")
    private int userid;
    public void setBusinessid(int businessid) {
        this.businessid = businessid;
    }
    public int getBusinessid() {
        return businessid;
    }

    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }
    public String getDateadd() {
        return dateadd;
    }

    public void setDateupdate(String dateupdate) {
        this.dateupdate = dateupdate;
    }
    public String getDateupdate() {
        return dateupdate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }
    public String getLinkurl() {
        return linkurl;
    }

    public void setPaixu(int paixu) {
        this.paixu = paixu;
    }
    public int getPaixu() {
        return paixu;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
    public String getPicurl() {
        return picurl;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setStatusstr(String statusstr) {
        this.statusstr = statusstr;
    }
    public String getStatusstr() {
        return statusstr;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {
        return userid;
    }
}
