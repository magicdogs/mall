package com.symagic.mail.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mall_goods", schema = "mall", catalog = "")
public class MallGoodsEntity {
    private int id;
    private String barCode;
    private Integer categoryId;
    private String characteristic;
    private Integer commission;
    private Integer commissionType;
    private Timestamp dateAdd;
    private Timestamp dateStart;
    private Timestamp dateUpdate;
    private Integer logisticsId;
    private Integer minPrice;
    private String name;
    private Integer numberFav;
    private Integer numberGoodReputation;
    private Integer numberOrders;
    private Integer originalPrice;
    private Integer paixu;
    private String pic;
    private String propertyIds;
    private Integer recommendStatus;
    private String recommendStatusStr;
    private Integer shopId;
    private Integer status;
    private String statusStr;
    private Integer stores;
    private Integer userId;
    private Integer views;
    private Integer weight;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 255)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "characteristic", nullable = true, length = 255)
    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @Basic
    @Column(name = "commission", nullable = true)
    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    @Basic
    @Column(name = "commission_type", nullable = true)
    public Integer getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(Integer commissionType) {
        this.commissionType = commissionType;
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
    @Column(name = "date_start", nullable = true)
    public Timestamp getDateStart() {
        return dateStart;
    }

    public void setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "date_update", nullable = true)
    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Basic
    @Column(name = "logistics_id", nullable = true)
    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    @Basic
    @Column(name = "min_price", nullable = true)
    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
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
    @Column(name = "number_fav", nullable = true)
    public Integer getNumberFav() {
        return numberFav;
    }

    public void setNumberFav(Integer numberFav) {
        this.numberFav = numberFav;
    }

    @Basic
    @Column(name = "number_good_reputation", nullable = true)
    public Integer getNumberGoodReputation() {
        return numberGoodReputation;
    }

    public void setNumberGoodReputation(Integer numberGoodReputation) {
        this.numberGoodReputation = numberGoodReputation;
    }

    @Basic
    @Column(name = "number_orders", nullable = true)
    public Integer getNumberOrders() {
        return numberOrders;
    }

    public void setNumberOrders(Integer numberOrders) {
        this.numberOrders = numberOrders;
    }

    @Basic
    @Column(name = "original_price", nullable = true)
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Basic
    @Column(name = "paixu", nullable = true)
    public Integer getPaixu() {
        return paixu;
    }

    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "property_ids", nullable = true, length = 255)
    public String getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(String propertyIds) {
        this.propertyIds = propertyIds;
    }

    @Basic
    @Column(name = "recommend_status", nullable = true)
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    @Basic
    @Column(name = "recommend_status_str", nullable = true, length = 255)
    public String getRecommendStatusStr() {
        return recommendStatusStr;
    }

    public void setRecommendStatusStr(String recommendStatusStr) {
        this.recommendStatusStr = recommendStatusStr;
    }

    @Basic
    @Column(name = "shop_id", nullable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
    @Column(name = "stores", nullable = true)
    public Integer getStores() {
        return stores;
    }

    public void setStores(Integer stores) {
        this.stores = stores;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "views", nullable = true)
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Basic
    @Column(name = "weight", nullable = true)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MallGoodsEntity that = (MallGoodsEntity) o;

        if (id != that.id) return false;
        if (barCode != null ? !barCode.equals(that.barCode) : that.barCode != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (characteristic != null ? !characteristic.equals(that.characteristic) : that.characteristic != null)
            return false;
        if (commission != null ? !commission.equals(that.commission) : that.commission != null) return false;
        if (commissionType != null ? !commissionType.equals(that.commissionType) : that.commissionType != null)
            return false;
        if (dateAdd != null ? !dateAdd.equals(that.dateAdd) : that.dateAdd != null) return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (dateUpdate != null ? !dateUpdate.equals(that.dateUpdate) : that.dateUpdate != null) return false;
        if (logisticsId != null ? !logisticsId.equals(that.logisticsId) : that.logisticsId != null) return false;
        if (minPrice != null ? !minPrice.equals(that.minPrice) : that.minPrice != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (numberFav != null ? !numberFav.equals(that.numberFav) : that.numberFav != null) return false;
        if (numberGoodReputation != null ? !numberGoodReputation.equals(that.numberGoodReputation) : that.numberGoodReputation != null)
            return false;
        if (numberOrders != null ? !numberOrders.equals(that.numberOrders) : that.numberOrders != null) return false;
        if (originalPrice != null ? !originalPrice.equals(that.originalPrice) : that.originalPrice != null)
            return false;
        if (paixu != null ? !paixu.equals(that.paixu) : that.paixu != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (propertyIds != null ? !propertyIds.equals(that.propertyIds) : that.propertyIds != null) return false;
        if (recommendStatus != null ? !recommendStatus.equals(that.recommendStatus) : that.recommendStatus != null)
            return false;
        if (recommendStatusStr != null ? !recommendStatusStr.equals(that.recommendStatusStr) : that.recommendStatusStr != null)
            return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (statusStr != null ? !statusStr.equals(that.statusStr) : that.statusStr != null) return false;
        if (stores != null ? !stores.equals(that.stores) : that.stores != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (views != null ? !views.equals(that.views) : that.views != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (characteristic != null ? characteristic.hashCode() : 0);
        result = 31 * result + (commission != null ? commission.hashCode() : 0);
        result = 31 * result + (commissionType != null ? commissionType.hashCode() : 0);
        result = 31 * result + (dateAdd != null ? dateAdd.hashCode() : 0);
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + (dateUpdate != null ? dateUpdate.hashCode() : 0);
        result = 31 * result + (logisticsId != null ? logisticsId.hashCode() : 0);
        result = 31 * result + (minPrice != null ? minPrice.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (numberFav != null ? numberFav.hashCode() : 0);
        result = 31 * result + (numberGoodReputation != null ? numberGoodReputation.hashCode() : 0);
        result = 31 * result + (numberOrders != null ? numberOrders.hashCode() : 0);
        result = 31 * result + (originalPrice != null ? originalPrice.hashCode() : 0);
        result = 31 * result + (paixu != null ? paixu.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (propertyIds != null ? propertyIds.hashCode() : 0);
        result = 31 * result + (recommendStatus != null ? recommendStatus.hashCode() : 0);
        result = 31 * result + (recommendStatusStr != null ? recommendStatusStr.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusStr != null ? statusStr.hashCode() : 0);
        result = 31 * result + (stores != null ? stores.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (views != null ? views.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }
}
