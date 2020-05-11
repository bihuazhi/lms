package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 入库记录表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("ca_inter_warehouse")
public class InterWarehouse extends Model<InterWarehouse> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 入库编码
     */
    private String interCode;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 货物类型
     */
    private String goodsType;
    /**
     * 数量
     */
    private Integer goodsCount;
    /**
     * 总重量
     */
    private Float goodsTotalWeight;
    /**
     * 总价格
     */
    private Float goodsTotalPrice;
    /**
     * 总体积
     */
    private Float goodsTotalVolume;
    /**
     * 顾客
     */
    private String interCustomer;
    /**
     * 入库网点
     */
    private String interOutletId;
    /**
     * 入库仓库
     */
    private String interWhId;
    /**
     * 入库时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInterCode() {
        return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
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
        this.interCustomer = interCustomer;
    }

    public String getInterOutletId() {
        return interOutletId;
    }

    public void setInterOutletId(String interOutletId) {
        this.interOutletId = interOutletId;
    }

    public String getInterWhId() {
        return interWhId;
    }

    public void setInterWhId(String interWhId) {
        this.interWhId = interWhId;
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
        return "InterWarehouse{" +
        ", id=" + id +
        ", interCode=" + interCode +
        ", goodsName=" + goodsName +
        ", goodsType=" + goodsType +
        ", goodsCount=" + goodsCount +
        ", goodsTotalWeight=" + goodsTotalWeight +
        ", goodsTotalPrice=" + goodsTotalPrice +
        ", goodsTotalVolume=" + goodsTotalVolume +
        ", interCustomer=" + interCustomer +
        ", interOutletId=" + interOutletId +
        ", interWhId=" + interWhId +
        ", createTime=" + createTime +
        "}";
    }
}
