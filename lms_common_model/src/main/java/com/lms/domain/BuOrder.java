package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class BuOrder implements Serializable {
    private String id;

    private String orderCode;

    private String orderSource;

    private String customerMobile;

    private String customer;

    private Integer goodsCount;

    private Float goodsWeight;

    private Float goodsPrice;

    private String goodsName;

    private Float goodsVolume;

    private String goodsMarker;

    private String goodsType;

    private String settlementType;

    private String sender;

    private String senderMobile;

    private String senderProvince;

    private String senderCity;

    private String senderArea;

    private String senderAddress;

    private String receiver;

    private String receiverMobile;

    private String receiverCity;

    private String receiverAddress;

    private String receiverArea;

    private String receiverProvince;

    private Float totalCost;

    private String isPay;

    private String employOutletId;

    private String employWhId;

    private String employEmpId;

    private String employVehId;

    private String status;

    private Date createTime;

    private Date completeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
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
        this.goodsName = goodsName == null ? null : goodsName.trim();
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
        this.goodsMarker = goodsMarker == null ? null : goodsMarker.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile == null ? null : senderMobile.trim();
    }

    public String getSenderProvince() {
        return senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince == null ? null : senderProvince.trim();
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity == null ? null : senderCity.trim();
    }

    public String getSenderArea() {
        return senderArea;
    }

    public void setSenderArea(String senderArea) {
        this.senderArea = senderArea == null ? null : senderArea.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverArea() {
        return receiverArea;
    }

    public void setReceiverArea(String receiverArea) {
        this.receiverArea = receiverArea == null ? null : receiverArea.trim();
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
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
        this.isPay = isPay == null ? null : isPay.trim();
    }

    public String getEmployOutletId() {
        return employOutletId;
    }

    public void setEmployOutletId(String employOutletId) {
        this.employOutletId = employOutletId == null ? null : employOutletId.trim();
    }

    public String getEmployWhId() {
        return employWhId;
    }

    public void setEmployWhId(String employWhId) {
        this.employWhId = employWhId == null ? null : employWhId.trim();
    }

    public String getEmployEmpId() {
        return employEmpId;
    }

    public void setEmployEmpId(String employEmpId) {
        this.employEmpId = employEmpId == null ? null : employEmpId.trim();
    }

    public String getEmployVehId() {
        return employVehId;
    }

    public void setEmployVehId(String employVehId) {
        this.employVehId = employVehId == null ? null : employVehId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}