package com.lms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WbWaybill implements Serializable {
    private String waybId;

    private String waybCode;

    private String empId;

    private String orderId;

    private String outletId;

    private String transportType;

    private Date transportTime;

    private Date completeTime;

    private String sender;

    private String senderPostcode;

    private String senderIdentity;

    private String senderArea;

    private String senderAddress;

    private String senderMobile;

    private String receiver;

    private String recePostcode;

    private String receIdentity;

    private String receArea;

    private String receAddress;

    private String receMobile;

    private String goodsName;

    private Integer goodsCount;

    private Float goodsWeight;

    private Float goodsVolume;

    private BigDecimal goodsTotalPrice;

    private String goodsType;

    private String goodsMarker;

    private String receipt;

    private String settlementType;

    private Float totalCost;

    private String customer;

    private String customerMobile;

    private String signforStatus;

    private String status;

    private String isPay;

    public String getWaybId() {
        return waybId;
    }

    public void setWaybId(String waybId) {
        this.waybId = waybId == null ? null : waybId.trim();
    }

    public String getWaybCode() {
        return waybCode;
    }

    public void setWaybCode(String waybCode) {
        this.waybCode = waybCode == null ? null : waybCode.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOutletId() {
        return outletId;
    }

    public void setOutletId(String outletId) {
        this.outletId = outletId == null ? null : outletId.trim();
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType == null ? null : transportType.trim();
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
        this.sender = sender == null ? null : sender.trim();
    }

    public String getSenderPostcode() {
        return senderPostcode;
    }

    public void setSenderPostcode(String senderPostcode) {
        this.senderPostcode = senderPostcode == null ? null : senderPostcode.trim();
    }

    public String getSenderIdentity() {
        return senderIdentity;
    }

    public void setSenderIdentity(String senderIdentity) {
        this.senderIdentity = senderIdentity == null ? null : senderIdentity.trim();
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

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile == null ? null : senderMobile.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getRecePostcode() {
        return recePostcode;
    }

    public void setRecePostcode(String recePostcode) {
        this.recePostcode = recePostcode == null ? null : recePostcode.trim();
    }

    public String getReceIdentity() {
        return receIdentity;
    }

    public void setReceIdentity(String receIdentity) {
        this.receIdentity = receIdentity == null ? null : receIdentity.trim();
    }

    public String getReceArea() {
        return receArea;
    }

    public void setReceArea(String receArea) {
        this.receArea = receArea == null ? null : receArea.trim();
    }

    public String getReceAddress() {
        return receAddress;
    }

    public void setReceAddress(String receAddress) {
        this.receAddress = receAddress == null ? null : receAddress.trim();
    }

    public String getReceMobile() {
        return receMobile;
    }

    public void setReceMobile(String receMobile) {
        this.receMobile = receMobile == null ? null : receMobile.trim();
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
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsMarker() {
        return goodsMarker;
    }

    public void setGoodsMarker(String goodsMarker) {
        this.goodsMarker = goodsMarker == null ? null : goodsMarker.trim();
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt == null ? null : receipt.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
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
        this.customer = customer == null ? null : customer.trim();
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    public String getSignforStatus() {
        return signforStatus;
    }

    public void setSignforStatus(String signforStatus) {
        this.signforStatus = signforStatus == null ? null : signforStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay == null ? null : isPay.trim();
    }
}