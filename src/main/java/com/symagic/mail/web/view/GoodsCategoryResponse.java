package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrator
 */
public class GoodsCategoryResponse {

    @JsonProperty("dateAdd")
    private String dateadd;
    private String icon;
    private int id;
    @JsonProperty("isUse")
    private boolean isuse;
    private String key;
    private int level;
    private String name;
    private int paixu;
    private int pid;
    private String type;
    @JsonProperty("userId")
    private int userid;
    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }
    public String getDateadd() {
        return dateadd;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }
    public boolean getIsuse() {
        return isuse;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPaixu(int paixu) {
        this.paixu = paixu;
    }
    public int getPaixu() {
        return paixu;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    public int getPid() {
        return pid;
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
