package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class CaOuterWarehouse implements Serializable {
    private String id;

    private String outerCode;

    private String goodsType;

    private String goodsName;

    private Integer goodsCount;

    private Float goodsTotalVolume;

    private Float goodsTotalPrice;

    private Float goodsTotalWeight;

    private String outerCustomer;

    private Date createTime;

    private String outerOutletId;

    private String outerWhId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOuterCode() {
        return outerCode;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode == null ? null : outerCode.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Float getGoodsTotalVolume() {
        return goodsTotalVolume;
    }

    public void setGoodsTotalVolume(Float goodsTotalVolume) {
        this.goodsTotalVolume = goodsTotalVolume;
    }

    public Float getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(Float goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public Float getGoodsTotalWeight() {
        return goodsTotalWeight;
    }

    public void setGoodsTotalWeight(Float goodsTotalWeight) {
        this.goodsTotalWeight = goodsTotalWeight;
    }

    public String getOuterCustomer() {
        return outerCustomer;
    }

    public void setOuterCustomer(String outerCustomer) {
        this.outerCustomer = outerCustomer == null ? null : outerCustomer.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOuterOutletId() {
        return outerOutletId;
    }

    public void setOuterOutletId(String outerOutletId) {
        this.outerOutletId = outerOutletId == null ? null : outerOutletId.trim();
    }

    public String getOuterWhId() {
        return outerWhId;
    }

    public void setOuterWhId(String outerWhId) {
        this.outerWhId = outerWhId == null ? null : outerWhId.trim();
    }
}