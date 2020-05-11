package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class SeScanning implements Serializable {
    private String id;

    private String scanCode;

    private String waybCode;

    private Date createTime;

    private String scanType;

    private String empId;

    private String goodsName;

    private String settlementType;

    private Float goodsWeight;

    private String destination;

    private String fleet;

    private String nextOutlet;

    private String nowOutlet;

    private Date signforTime;

    private String signforIcon;

    private String signforMobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getScanCode() {
        return scanCode;
    }

    public void setScanCode(String scanCode) {
        this.scanCode = scanCode == null ? null : scanCode.trim();
    }

    public String getWaybCode() {
        return waybCode;
    }

    public void setWaybCode(String waybCode) {
        this.waybCode = waybCode == null ? null : waybCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType == null ? null : scanType.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public Float getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Float goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet == null ? null : fleet.trim();
    }

    public String getNextOutlet() {
        return nextOutlet;
    }

    public void setNextOutlet(String nextOutlet) {
        this.nextOutlet = nextOutlet == null ? null : nextOutlet.trim();
    }

    public String getNowOutlet() {
        return nowOutlet;
    }

    public void setNowOutlet(String nowOutlet) {
        this.nowOutlet = nowOutlet == null ? null : nowOutlet.trim();
    }

    public Date getSignforTime() {
        return signforTime;
    }

    public void setSignforTime(Date signforTime) {
        this.signforTime = signforTime;
    }

    public String getSignforIcon() {
        return signforIcon;
    }

    public void setSignforIcon(String signforIcon) {
        this.signforIcon = signforIcon == null ? null : signforIcon.trim();
    }

    public String getSignforMobile() {
        return signforMobile;
    }

    public void setSignforMobile(String signforMobile) {
        this.signforMobile = signforMobile == null ? null : signforMobile.trim();
    }
}