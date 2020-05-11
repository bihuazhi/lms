package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class CaInterWarehouse implements Serializable {
    private String id;

    private String interCode;

    private String goodsName;

    private String goodsType;

    private Integer goodsCount;

    private Float goodsTotalWeight;

    private Float goodsTotalPrice;

    private Float goodsTotalVolume;

    private String interCustomer;

    private String interOutletId;

    private String interWhId;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInterCode() {
        return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode == null ? null : interCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Float getGoodsTotalWeight() {
        return goodsTotalWeight;
    }

    public void setGoodsTotalWeight(Float goodsTotalWeight) {
        this.goodsTotalWeight = goodsTotalWeight;
    }

    public Float getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(Float goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public Float getGoodsTotalVolume() {
        return goodsTotalVolume;
    }

    public void setGoodsTotalVolume(Float goodsTotalVolume) {
        this.goodsTotalVolume = goodsTotalVolume;
    }

    public String getInterCustomer() {
        return interCustomer;
    }

    public void setInterCustomer(String interCustomer) {
        this.interCustomer = interCustomer == null ? null : interCustomer.trim();
    }

    public String getInterOutletId() {
        return interOutletId;
    }

    public void setInterOutletId(String interOutletId) {
        this.interOutletId = interOutletId == null ? null : interOutletId.trim();
    }

    public String getInterWhId() {
        return interWhId;
    }

    public void setInterWhId(String interWhId) {
        this.interWhId = interWhId == null ? null : interWhId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}