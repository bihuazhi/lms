package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 出库信息表
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("ca_outer_warehouse")
public class OuterWarehouse extends Model<OuterWarehouse> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 出库编码
     */
    private String outerCode;
    /**
     * 货物类型
     */
    private String goodsType;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 数量
     */
    private Integer goodsCount;
    /**
     * 总体积
     */
    private Float goodsTotalVolume;
    /**
     * 总价格
     */
    private Float goodsTotalPrice;
    /**
     * 总重量
     */
    private Float goodsTotalWeight;
    /**
     * 顾客
     */
    private String outerCustomer;
    /**
     * 出库时间
     */
    private Date createTime;
    /**
     * 出库网点
     */
    private String outerOutletId;
    /**
     * 出库仓库
     */
    private String outerWhId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOuterCode() {
        return outerCode;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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
        this.outerCustomer = outerCustomer;
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
        this.outerOutletId = outerOutletId;
    }

    public String getOuterWhId() {
        return outerWhId;
    }

    public void setOuterWhId(String outerWhId) {
        this.outerWhId = outerWhId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OuterWarehouse{" +
        ", id=" + id +
        ", outerCode=" + outerCode +
        ", goodsType=" + goodsType +
        ", goodsName=" + goodsName +
        ", goodsCount=" + goodsCount +
        ", goodsTotalVolume=" + goodsTotalVolume +
        ", goodsTotalPrice=" + goodsTotalPrice +
        ", goodsTotalWeight=" + goodsTotalWeight +
        ", outerCustomer=" + outerCustomer +
        ", createTime=" + createTime +
        ", outerOutletId=" + outerOutletId +
        ", outerWhId=" + outerWhId +
        "}";
    }
}
