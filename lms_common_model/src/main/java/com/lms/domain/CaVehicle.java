package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class CaVehicle  implements Serializable {
    private String id;

    private String vhCode;

    private String license;

    private String vhType;

    private Integer vhWeight;

    private Integer consume;

    private Float carrying;

    private String vhHost;

    private String hostMobile;

    private String driver;

    private String vhOutletId;

    private String vhWhId;

    private Date createTime;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVhCode() {
        return vhCode;
    }

    public void setVhCode(String vhCode) {
        this.vhCode = vhCode == null ? null : vhCode.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getVhType() {
        return vhType;
    }

    public void setVhType(String vhType) {
        this.vhType = vhType == null ? null : vhType.trim();
    }

    public Integer getVhWeight() {
        return vhWeight;
    }

    public void setVhWeight(Integer vhWeight) {
        this.vhWeight = vhWeight;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public Float getCarrying() {
        return carrying;
    }

    public void setCarrying(Float carrying) {
        this.carrying = carrying;
    }

    public String getVhHost() {
        return vhHost;
    }

    public void setVhHost(String vhHost) {
        this.vhHost = vhHost == null ? null : vhHost.trim();
    }

    public String getHostMobile() {
        return hostMobile;
    }

    public void setHostMobile(String hostMobile) {
        this.hostMobile = hostMobile == null ? null : hostMobile.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getVhOutletId() {
        return vhOutletId;
    }

    public void setVhOutletId(String vhOutletId) {
        this.vhOutletId = vhOutletId == null ? null : vhOutletId.trim();
    }

    public String getVhWhId() {
        return vhWhId;
    }

    public void setVhWhId(String vhWhId) {
        this.vhWhId = vhWhId == null ? null : vhWhId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}