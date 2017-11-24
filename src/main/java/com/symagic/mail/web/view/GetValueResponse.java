/**
 * Copyright 2017 aTool.org
 */
package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2017-11-22 13:33:41
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class GetValueResponse {

    @JsonProperty("creatAt")
    private String creatat;
    @JsonProperty("dateType")
    private int datetype;
    private int id;
    private String key;
    private String remark;
    @JsonProperty("updateAt")
    private String updateat;
    @JsonProperty("userId")
    private int userid;
    private String value;
    public void setCreatat(String creatat) {
        this.creatat = creatat;
    }
    public String getCreatat() {
        return creatat;
    }

    public void setDatetype(int datetype) {
        this.datetype = datetype;
    }
    public int getDatetype() {
        return datetype;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getRemark() {
        return remark;
    }

    public void setUpdateat(String updateat) {
        this.updateat = updateat;
    }
    public String getUpdateat() {
        return updateat;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {
        return userid;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
