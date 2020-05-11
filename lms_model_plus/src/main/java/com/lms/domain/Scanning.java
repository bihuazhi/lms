package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 扫描信息表
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("se_scanning")
public class Scanning extends Model<Scanning> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 扫描编号
     */
    private String scanCode;
    /**
     * 运单编号
     */
    private String waybCode;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 1:接货扫描 2：发货扫描 3：到货扫描 4：货物签收
     */
    private String scanType;
    /**
     * 操作员工
     */
    private String empId;
    /**
     * 货物名称
     */
    private String goodsName;
    /**
     * 支付方式
     */
    private String settlementType;
    /**
     * 货物重量
     */
    private Float goodsWeight;
    /**
     * 目的地
     */
    private String destination;
    /**
     * 发货时 填写车队
     */
    private String fleet;
    /**
     * 下一站
     */
    private String nextOutlet;
    /**
     * 当前站点
     */
    private String nowOutlet;
    /**
     * 签收时间
     */
    private Date signforTime;
    /**
     * 签收图标
     */
    private String signforIcon;
    /**
     * 签收手机
     */
    private String signforMobile;

    //网点信息
    @TableField(exist = false)
    private Outlet outlet;

    //员工信息
    @TableField(exist = false)
    private Employee employee;

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScanCode() {
        return scanCode;
    }

    public void setScanCode(String scanCode) {
        this.scanCode = scanCode;
    }

    public String getWaybCode() {
        return waybCode;
    }

    public void setWaybCode(String waybCode) {
        this.waybCode = waybCode;
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
        this.scanType = scanType;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
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
        this.destination = destination;
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    public String getNextOutlet() {
        return nextOutlet;
    }

    public void setNextOutlet(String nextOutlet) {
        this.nextOutlet = nextOutlet;
    }

    public String getNowOutlet() {
        return nowOutlet;
    }

    public void setNowOutlet(String nowOutlet) {
        this.nowOutlet = nowOutlet;
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
        this.signforIcon = signforIcon;
    }

    public String getSignforMobile() {
        return signforMobile;
    }

    public void setSignforMobile(String signforMobile) {
        this.signforMobile = signforMobile;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Scanning{" +
        ", id=" + id +
        ", scanCode=" + scanCode +
        ", waybCode=" + waybCode +
        ", createTime=" + createTime +
        ", scanType=" + scanType +
        ", empId=" + empId +
        ", goodsName=" + goodsName +
        ", settlementType=" + settlementType +
        ", goodsWeight=" + goodsWeight +
        ", destination=" + destination +
        ", fleet=" + fleet +
        ", nextOutlet=" + nextOutlet +
        ", nowOutlet=" + nowOutlet +
        ", signforTime=" + signforTime +
        ", signforIcon=" + signforIcon +
        ", signforMobile=" + signforMobile +
        "}";
    }
}
