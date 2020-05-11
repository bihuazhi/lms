package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 货物信息表
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("ca_goods")
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 货物编码
     */
    private String goodsCode;
    /**
     * 货物类型
     */
    private String goodsType;
    /**
     * 货物单价
     */
    private Float goodsPrice;
    /**
     * 数量
     */
    private Integer goodsCount;
    /**
     * 体积
     */
    private Float goodsVolume;
    /**
     * 重量
     */
    private Float goodsWeight;
    /**
     * 过期时间
     */
    private Date shelfLife;
    /**
     * 货物编码
     */
    private String goodsWhId;
    /**
     * 备注
     */
    private String marker;
    /**
     * 创建时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
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
        this.goodsWhId = goodsWhId;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goods{" +
        ", id=" + id +
        ", goodsName=" + goodsName +
        ", goodsCode=" + goodsCode +
        ", goodsType=" + goodsType +
        ", goodsPrice=" + goodsPrice +
        ", goodsCount=" + goodsCount +
        ", goodsVolume=" + goodsVolume +
        ", goodsWeight=" + goodsWeight +
        ", shelfLife=" + shelfLife +
        ", goodsWhId=" + goodsWhId +
        ", marker=" + marker +
        ", createTime=" + createTime +
        "}";
    }
}
