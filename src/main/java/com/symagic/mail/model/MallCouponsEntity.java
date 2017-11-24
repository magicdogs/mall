package com.symagic.mail.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mall_coupons", schema = "mall", catalog = "")
public class MallCouponsEntity {
    private int id;
    private Timestamp dateAdd;
    private Integer dateEndDays;
    private Integer dateEndType;
    private Integer dateStartType;
    private String moneyHreshold;
    private String moneyMax;
    private String moneyMin;
    private String name;
    private String needScore;
    private Integer numberGit;
    private Integer numberGitNumber;
    private Integer numberLeft;
    private Integer numberPersonMax;
    private Integer numberTotle;
    private Integer numberUsed;
    private String status;
    private String statusStr;
    private String type;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_add", nullable = true)
    public Timestamp getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Timestamp dateAdd) {
        this.dateAdd = dateAdd;
    }

    @Basic
    @Column(name = "date_end_days", nullable = true)
    public Integer getDateEndDays() {
        return dateEndDays;
    }

    public void setDateEndDays(Integer dateEndDays) {
        this.dateEndDays = dateEndDays;
    }

    @Basic
    @Column(name = "date_end_type", nullable = true)
    public Integer getDateEndType() {
        return dateEndType;
    }

    public void setDateEndType(Integer dateEndType) {
        this.dateEndType = dateEndType;
    }

    @Basic
    @Column(name = "date_start_type", nullable = true)
    public Integer getDateStartType() {
        return dateStartType;
    }

    public void setDateStartType(Integer dateStartType) {
        this.dateStartType = dateStartType;
    }

    @Basic
    @Column(name = "money_hreshold", nullable = true, length = 255)
    public String getMoneyHreshold() {
        return moneyHreshold;
    }

    public void setMoneyHreshold(String moneyHreshold) {
        this.moneyHreshold = moneyHreshold;
    }

    @Basic
    @Column(name = "money_max", nullable = true, length = 255)
    public String getMoneyMax() {
        return moneyMax;
    }

    public void setMoneyMax(String moneyMax) {
        this.moneyMax = moneyMax;
    }

    @Basic
    @Column(name = "money_min", nullable = true, length = 255)
    public String getMoneyMin() {
        return moneyMin;
    }

    public void setMoneyMin(String moneyMin) {
        this.moneyMin = moneyMin;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "need_score", nullable = true, length = 255)
    public String getNeedScore() {
        return needScore;
    }

    public void setNeedScore(String needScore) {
        this.needScore = needScore;
    }

    @Basic
    @Column(name = "number_git", nullable = true)
    public Integer getNumberGit() {
        return numberGit;
    }

    public void setNumberGit(Integer numberGit) {
        this.numberGit = numberGit;
    }

    @Basic
    @Column(name = "number_git_number", nullable = true)
    public Integer getNumberGitNumber() {
        return numberGitNumber;
    }

    public void setNumberGitNumber(Integer numberGitNumber) {
        this.numberGitNumber = numberGitNumber;
    }

    @Basic
    @Column(name = "number_left", nullable = true)
    public Integer getNumberLeft() {
        return numberLeft;
    }

    public void setNumberLeft(Integer numberLeft) {
        this.numberLeft = numberLeft;
    }

    @Basic
    @Column(name = "number_person_max", nullable = true)
    public Integer getNumberPersonMax() {
        return numberPersonMax;
    }

    public void setNumberPersonMax(Integer numberPersonMax) {
        this.numberPersonMax = numberPersonMax;
    }

    @Basic
    @Column(name = "number_totle", nullable = true)
    public Integer getNumberTotle() {
        return numberTotle;
    }

    public void setNumberTotle(Integer numberTotle) {
        this.numberTotle = numberTotle;
    }

    @Basic
    @Column(name = "number_used", nullable = true)
    public Integer getNumberUsed() {
        return numberUsed;
    }

    public void setNumberUsed(Integer numberUsed) {
        this.numberUsed = numberUsed;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "status_str", nullable = true, length = 255)
    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MallCouponsEntity that = (MallCouponsEntity) o;

        if (id != that.id) return false;
        if (dateAdd != null ? !dateAdd.equals(that.dateAdd) : that.dateAdd != null) return false;
        if (dateEndDays != null ? !dateEndDays.equals(that.dateEndDays) : that.dateEndDays != null) return false;
        if (dateEndType != null ? !dateEndType.equals(that.dateEndType) : that.dateEndType != null) return false;
        if (dateStartType != null ? !dateStartType.equals(that.dateStartType) : that.dateStartType != null)
            return false;
        if (moneyHreshold != null ? !moneyHreshold.equals(that.moneyHreshold) : that.moneyHreshold != null)
            return false;
        if (moneyMax != null ? !moneyMax.equals(that.moneyMax) : that.moneyMax != null) return false;
        if (moneyMin != null ? !moneyMin.equals(that.moneyMin) : that.moneyMin != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (needScore != null ? !needScore.equals(that.needScore) : that.needScore != null) return false;
        if (numberGit != null ? !numberGit.equals(that.numberGit) : that.numberGit != null) return false;
        if (numberGitNumber != null ? !numberGitNumber.equals(that.numberGitNumber) : that.numberGitNumber != null)
            return false;
        if (numberLeft != null ? !numberLeft.equals(that.numberLeft) : that.numberLeft != null) return false;
        if (numberPersonMax != null ? !numberPersonMax.equals(that.numberPersonMax) : that.numberPersonMax != null)
            return false;
        if (numberTotle != null ? !numberTotle.equals(that.numberTotle) : that.numberTotle != null) return false;
        if (numberUsed != null ? !numberUsed.equals(that.numberUsed) : that.numberUsed != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (statusStr != null ? !statusStr.equals(that.statusStr) : that.statusStr != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateAdd != null ? dateAdd.hashCode() : 0);
        result = 31 * result + (dateEndDays != null ? dateEndDays.hashCode() : 0);
        result = 31 * result + (dateEndType != null ? dateEndType.hashCode() : 0);
        result = 31 * result + (dateStartType != null ? dateStartType.hashCode() : 0);
        result = 31 * result + (moneyHreshold != null ? moneyHreshold.hashCode() : 0);
        result = 31 * result + (moneyMax != null ? moneyMax.hashCode() : 0);
        result = 31 * result + (moneyMin != null ? moneyMin.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (needScore != null ? needScore.hashCode() : 0);
        result = 31 * result + (numberGit != null ? numberGit.hashCode() : 0);
        result = 31 * result + (numberGitNumber != null ? numberGitNumber.hashCode() : 0);
        result = 31 * result + (numberLeft != null ? numberLeft.hashCode() : 0);
        result = 31 * result + (numberPersonMax != null ? numberPersonMax.hashCode() : 0);
        result = 31 * result + (numberTotle != null ? numberTotle.hashCode() : 0);
        result = 31 * result + (numberUsed != null ? numberUsed.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusStr != null ? statusStr.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
