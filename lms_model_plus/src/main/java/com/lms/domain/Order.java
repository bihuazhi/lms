package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("bu_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 订单编码
     */
    private String orderCode;
    /**
     * 订单来源
     */
    private String orderSource;
    /**
     * 客户手机
     */
    private String customerMobile;
    /**
     * 客户姓名
     */
    private String customer;
    /**
     * 货物数量
     */
    private Integer goodsCount;
    /**
     * 货物重量
     */
    private Float goodsWeight;
    /**
     * 货物总价格
     */
    private Float goodsPrice;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 货物体积
     */
    private Float goodsVolume;
    /**
     * 货物备注
     */
    private String goodsMarker;
    /**
     * 货物类型
     */
    private String goodsType;
    /**
     * 支付方式
     */
    private String settlementType;
    /**
     * 寄货人
     */
    private String sender;
    /**
     * 寄货人手机
     */
    private String senderMobile;
    /**
     * 寄出省份
     */
    private String senderProvince;
    /**
     * 寄出城市
     */
    private String senderCity;
    /**
     * 寄出地区
     */
    private String senderArea;
    /**
     * 寄出地址
     */
    private String senderAddress;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货人手机
     */
    private String receiverMobile;
    /**
     * 收货城市
     */
    private String receiverCity;
    /**
     * 收货地址
     */
    private String receiverAddress;
    /**
     * 收货地区
     */
    private String receiverArea;
    /**
     * 收货省份
     */
    private String receiverProvince;
    /**
     * 总费用
     */
    private Float totalCost;
    /**
     * 是否付款
     */
    private String isPay;
    /**
     * 分配网点
     */
    private String employOutletId;
    /**
     * 分配车辆
     */
    private String employWhId;
    /**
     * 显示车牌列表
     */
    private String employEmpId;
    /**
     * 显示员工姓名
     */
    private String employVehId;
    /**
     * 0:待分配 1:待发货 2:已发货 3:已到货 4、已完成
     */
    private String status;
    /**
     * 状态
     */
    private Date createTime;
    /**
     * 完成时间
     */
    private Date completeTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Float getGoodsVolume() {
        return goodsVolume;
    }

    public void setGoodsVolume(Float goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    public String getGoodsMarker() {
        return goodsMarker;
    }

    public void setGoodsMarker(String goodsMarker) {
        this.goodsMarker = goodsMarker;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderProvince() {
        return senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
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

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverArea() {
        return receiverArea;
    }

    public void setReceiverArea(String receiverArea) {
        this.receiverArea = receiverArea;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    public String getEmployOutletId() {
        return employOutletId;
    }

    public void setEmployOutletId(String employOutletId) {
        this.employOutletId = employOutletId;
    }

    public String getEmployWhId() {
        return employWhId;
    }

    public void setEmployWhId(String employWhId) {
        this.employWhId = employWhId;
    }

    public String getEmployEmpId() {
        return employEmpId;
    }

    public void setEmployEmpId(String employEmpId) {
        this.employEmpId = employEmpId;
    }

    public String getEmployVehId() {
        return employVehId;
    }

    public void setEmployVehId(String employVehId) {
        this.employVehId = employVehId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Order{" +
        ", id=" + id +
        ", orderCode=" + orderCode +
        ", orderSource=" + orderSource +
        ", customerMobile=" + customerMobile +
        ", customer=" + customer +
        ", goodsCount=" + goodsCount +
        ", goodsWeight=" + goodsWeight +
        ", goodsPrice=" + goodsPrice +
        ", goodsName=" + goodsName +
        ", goodsVolume=" + goodsVolume +
        ", goodsMarker=" + goodsMarker +
        ", goodsType=" + goodsType +
        ", settlementType=" + settlementType +
        ", sender=" + sender +
        ", senderMobile=" + senderMobile +
        ", senderProvince=" + senderProvince +
        ", senderCity=" + senderCity +
        ", senderArea=" + senderArea +
        ", senderAddress=" + senderAddress +
        ", receiver=" + receiver +
        ", receiverMobile=" + receiverMobile +
        ", receiverCity=" + receiverCity +
        ", receiverAddress=" + receiverAddress +
        ", receiverArea=" + receiverArea +
        ", receiverProvince=" + receiverProvince +
        ", totalCost=" + totalCost +
        ", isPay=" + isPay +
        ", employOutletId=" + employOutletId +
        ", employWhId=" + employWhId +
        ", employEmpId=" + employEmpId +
        ", employVehId=" + employVehId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", completeTime=" + completeTime +
        "}";
    }
}
