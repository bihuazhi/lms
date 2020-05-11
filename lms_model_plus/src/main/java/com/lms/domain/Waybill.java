package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 运单表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("wb_waybill")
public class Waybill extends Model<Waybill> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private String waybId;
    /**
     * 运单编码
     */
    private String waybCode;
    /**
     * 取货员工
     */
    private String empId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 调配的网点
     */
    private String outletId;
    /**
     * 运送类型
     */
    private String transportType;
    /**
     * 货物类型
     */
    private Date transportTime;
    /**
     * 完成时间
     */
    private Date completeTime;
    /**
     * 寄货人
     */
    private String sender;
    /**
     * 寄货邮编
     */
    private String senderPostcode;
    /**
     * 寄货人身份证
     */
    private String senderIdentity;
    /**
     * 寄货人地区
     */
    private String senderArea;
    /**
     * 寄货人地址
     */
    private String senderAddress;
    /**
     * 寄货人手机
     */
    private String senderMobile;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货编码
     */
    private String recePostcode;
    /**
     * 收货身份证
     */
    private String receIdentity;
    /**
     * 收货地区
     */
    private String receArea;
    /**
     * 收货地址
     */
    private String receAddress;
    /**
     * 收货手机
     */
    private String receMobile;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 货物数量
     */
    private Integer goodsCount;
    /**
     * 货物重量
     */
    private Float goodsWeight;
    /**
     * 货物体积
     */
    private Float goodsVolume;
    /**
     * 商品总价格
     */
    private BigDecimal goodsTotalPrice;
    /**
     * 货物类型
     */
    private String goodsType;
    /**
     * 商品备注
     */
    private String goodsMarker;
    /**
     * 回单号
     */
    private String receipt;
    /**
     * 支付方式
     */
    private String settlementType;
    /**
     * 总费用
     */
    private Float totalCost;
    /**
     * 客户
     */
    private String customer;
    /**
     * 客户手机
     */
    private String customerMobile;
    /**
     * 0:没签收 1:已签收
     */
    private String signforStatus;
    /**
     * 1：待发运 2：已发货 3：已到达
     */
    private String status;
    /**
     * 是否付款
     */
    private String isPay;


    public String getWaybId() {
        return waybId;
    }

    public void setWaybId(String waybId) {
        this.waybId = waybId;
    }

    public String getWaybCode() {
        return waybCode;
    }

    public void setWaybCode(String waybCode) {
        this.waybCode = waybCode;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutletId() {
        return outletId;
    }

    public void setOutletId(String outletId) {
        this.outletId = outletId;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public Date getTransportTime() {
        return transportTime;
    }

    public void setTransportTime(Date transportTime) {
        this.transportTime = transportTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode;
    }

    public String getSenderIdentity() {
        return senderIdentity;
    }

    public void setSenderIdentity(String senderIdentity) {
        this.senderIdentity = senderIdentity;
    }

    public String getSenderArea() {
        return senderArea;
    }

    public void setSenderArea(String senderArea) {
        this.senderArea = senderArea;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getRecePostcode() {
        return recePostcode;
    }

    public void setRecePostcode(String recePostcode) {
        this.recePostcode = recePostcode;
    }

    public String getReceIdentity() {
        return receIdentity;
    }

    public void setReceIdentity(String receIdentity) {
        this.receIdentity = receIdentity;
    }

    public String getReceArea() {
        return receArea;
    }

    public void setReceArea(String receArea) {
        this.receArea = receArea;
    }

    public String getReceAddress() {
        return receAddress;
    }

    public void setReceAddress(String receAddress) {
        this.receAddress = receAddress;
    }

    public String getReceMobile() {
        return receMobile;
    }

    public void setReceMobile(String receMobile) {
        this.receMobile = receMobile;
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

    public Float getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Float goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Float getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Float goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public BigDecimal getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(BigDecimal goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsMarker() {
        return goodsMarker;
    }

    public void setGoodsMarker(String goodsMarker) {
        this.goodsMarker = goodsMarker;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getSignforStatus() {
        return signforStatus;
    }

    public void setSignforStatus(String signforStatus) {
        this.signforStatus = signforStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    @Override
    protected Serializable pkVal() {
        return this.waybId;
    }

    @Override
    public String toString() {
        return "Waybill{" +
        ", waybId=" + waybId +
        ", waybCode=" + waybCode +
        ", empId=" + empId +
        ", orderId=" + orderId +
        ", outletId=" + outletId +
        ", transportType=" + transportType +
        ", transportTime=" + transportTime +
        ", completeTime=" + completeTime +
        ", sender=" + sender +
        ", senderPostcode=" + senderPostcode +
        ", senderIdentity=" + senderIdentity +
        ", senderArea=" + senderArea +
        ", senderAddress=" + senderAddress +
        ", senderMobile=" + senderMobile +
        ", receiver=" + receiver +
        ", recePostcode=" + recePostcode +
        ", receIdentity=" + receIdentity +
        ", receArea=" + receArea +
        ", receAddress=" + receAddress +
        ", receMobile=" + receMobile +
        ", goodsName=" + goodsName +
        ", goodsCount=" + goodsCount +
        ", goodsWeight=" + goodsWeight +
        ", goodsVolume=" + goodsVolume +
        ", goodsTotalPrice=" + goodsTotalPrice +
        ", goodsType=" + goodsType +
        ", goodsMarker=" + goodsMarker +
        ", receipt=" + receipt +
        ", settlementType=" + settlementType +
        ", totalCost=" + totalCost +
        ", customer=" + customer +
        ", customerMobile=" + customerMobile +
        ", signforStatus=" + signforStatus +
        ", status=" + status +
        ", isPay=" + isPay +
        "}";
    }
}
