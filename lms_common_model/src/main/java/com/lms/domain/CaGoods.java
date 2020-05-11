package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class CaGoods implements Serializable {
    private String id;

    private String goodsName;

    private String goodsCode;

    private String goodsType;

    private Float goodsPrice;

    private Integer goodsCount;

    private Float goodsVolume;

    private Float goodsWeight;

    private Date shelfLife;

    private String goodsWhId;

    private String marker;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Float getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Float goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public Float getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Float goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Date getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Date shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getGoodsWhId() {
        return goodsWhId;
    }

    public void setGoodsWhId(String goodsWhId) {
        this.goodsWhId = goodsWhId == null ? null : goodsWhId.trim();
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker == null ? null : marker.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}