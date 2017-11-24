package com.symagic.mail.web.view;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author Administrator
 */
public class GoodsReponse {

    @JsonProperty("barCode")
    private String barcode;
    @JsonProperty("categoryId")
    private int categoryid;
    private String characteristic;
    private int commission;
    @JsonProperty("commissionType")
    private int commissiontype;
    @JsonProperty("dateAdd")
    private String dateadd;
    @JsonProperty("dateStart")
    private String datestart;
    @JsonProperty("dateUpdate")
    private String dateupdate;
    private int id;
    @JsonProperty("logisticsId")
    private int logisticsid;
    @JsonProperty("minPrice")
    private int minprice;
    private String name;
    @JsonProperty("numberFav")
    private int numberfav;
    @JsonProperty("numberGoodReputation")
    private int numbergoodreputation;
    @JsonProperty("numberOrders")
    private int numberorders;
    @JsonProperty("originalPrice")
    private int originalprice;
    private int paixu;
    private String pic;
    @JsonProperty("propertyIds")
    private Date propertyids;
    @JsonProperty("recommendStatus")
    private int recommendstatus;
    @JsonProperty("recommendStatusStr")
    private String recommendstatusstr;
    @JsonProperty("shopId")
    private int shopid;
    private int status;
    @JsonProperty("statusStr")
    private String statusstr;
    private int stores;
    @JsonProperty("userId")
    private int userid;
    private int views;
    private int weight;
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public String getBarcode() {
        return barcode;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }
    public int getCategoryid() {
        return categoryid;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
    public String getCharacteristic() {
        return characteristic;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }
    public int getCommission() {
        return commission;
    }

    public void setCommissiontype(int commissiontype) {
        this.commissiontype = commissiontype;
    }
    public int getCommissiontype() {
        return commissiontype;
    }

    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }
    public String getDateadd() {
        return dateadd;
    }

    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }
    public String getDatestart() {
        return datestart;
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

    public void setLogisticsid(int logisticsid) {
        this.logisticsid = logisticsid;
    }
    public int getLogisticsid() {
        return logisticsid;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }
    public int getMinprice() {
        return minprice;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumberfav(int numberfav) {
        this.numberfav = numberfav;
    }
    public int getNumberfav() {
        return numberfav;
    }

    public void setNumbergoodreputation(int numbergoodreputation) {
        this.numbergoodreputation = numbergoodreputation;
    }
    public int getNumbergoodreputation() {
        return numbergoodreputation;
    }

    public void setNumberorders(int numberorders) {
        this.numberorders = numberorders;
    }
    public int getNumberorders() {
        return numberorders;
    }

    public void setOriginalprice(int originalprice) {
        this.originalprice = originalprice;
    }
    public int getOriginalprice() {
        return originalprice;
    }

    public void setPaixu(int paixu) {
        this.paixu = paixu;
    }
    public int getPaixu() {
        return paixu;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getPic() {
        return pic;
    }

    public void setPropertyids(Date propertyids) {
        this.propertyids = propertyids;
    }
    public Date getPropertyids() {
        return propertyids;
    }

    public void setRecommendstatus(int recommendstatus) {
        this.recommendstatus = recommendstatus;
    }
    public int getRecommendstatus() {
        return recommendstatus;
    }

    public void setRecommendstatusstr(String recommendstatusstr) {
        this.recommendstatusstr = recommendstatusstr;
    }
    public String getRecommendstatusstr() {
        return recommendstatusstr;
    }

    public void setShopid(int shopid) {
        this.shopid = shopid;
    }
    public int getShopid() {
        return shopid;
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

    public void setStores(int stores) {
        this.stores = stores;
    }
    public int getStores() {
        return stores;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getUserid() {
        return userid;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public int getViews() {
        return views;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
