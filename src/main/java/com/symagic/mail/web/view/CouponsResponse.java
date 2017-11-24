package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Administrator
 */
public class CouponsResponse {

    @JsonProperty("dateAdd")
    private String dateadd;
    @JsonProperty("dateEndDays")
    private int dateenddays;
    @JsonProperty("dateEndType")
    private int dateendtype;
    @JsonProperty("dateStartType")
    private int datestarttype;
    private int id;
    @JsonProperty("moneyHreshold")
    private int moneyhreshold;
    @JsonProperty("moneyMax")
    private int moneymax;
    @JsonProperty("moneyMin")
    private int moneymin;
    private String name;
    @JsonProperty("needScore")
    private int needscore;
    @JsonProperty("numberGit")
    private int numbergit;
    @JsonProperty("numberGitNumber")
    private int numbergitnumber;
    @JsonProperty("numberLeft")
    private int numberleft;
    @JsonProperty("numberPersonMax")
    private int numberpersonmax;
    @JsonProperty("numberTotle")
    private int numbertotle;
    @JsonProperty("numberUsed")
    private int numberused;
    private int status;
    @JsonProperty("statusStr")
    private String statusstr;
    private String type;
    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }
    public String getDateadd() {
        return dateadd;
    }

    public void setDateenddays(int dateenddays) {
        this.dateenddays = dateenddays;
    }
    public int getDateenddays() {
        return dateenddays;
    }

    public void setDateendtype(int dateendtype) {
        this.dateendtype = dateendtype;
    }
    public int getDateendtype() {
        return dateendtype;
    }

    public void setDatestarttype(int datestarttype) {
        this.datestarttype = datestarttype;
    }
    public int getDatestarttype() {
        return datestarttype;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setMoneyhreshold(int moneyhreshold) {
        this.moneyhreshold = moneyhreshold;
    }
    public int getMoneyhreshold() {
        return moneyhreshold;
    }

    public void setMoneymax(int moneymax) {
        this.moneymax = moneymax;
    }
    public int getMoneymax() {
        return moneymax;
    }

    public void setMoneymin(int moneymin) {
        this.moneymin = moneymin;
    }
    public int getMoneymin() {
        return moneymin;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNeedscore(int needscore) {
        this.needscore = needscore;
    }
    public int getNeedscore() {
        return needscore;
    }

    public void setNumbergit(int numbergit) {
        this.numbergit = numbergit;
    }
    public int getNumbergit() {
        return numbergit;
    }

    public void setNumbergitnumber(int numbergitnumber) {
        this.numbergitnumber = numbergitnumber;
    }
    public int getNumbergitnumber() {
        return numbergitnumber;
    }

    public void setNumberleft(int numberleft) {
        this.numberleft = numberleft;
    }
    public int getNumberleft() {
        return numberleft;
    }

    public void setNumberpersonmax(int numberpersonmax) {
        this.numberpersonmax = numberpersonmax;
    }
    public int getNumberpersonmax() {
        return numberpersonmax;
    }

    public void setNumbertotle(int numbertotle) {
        this.numbertotle = numbertotle;
    }
    public int getNumbertotle() {
        return numbertotle;
    }

    public void setNumberused(int numberused) {
        this.numberused = numberused;
    }
    public int getNumberused() {
        return numberused;
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

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

}
