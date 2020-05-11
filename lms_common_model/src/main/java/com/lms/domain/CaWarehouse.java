package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class CaWarehouse  implements Serializable {
    private String id;

    private String whCode;

    private String whName;

    private String whOutletId;

    private Float whAcreage;

    private Float whInventory;

    private String whPrincipal;

    private String principalMobile;

    private Float occupation;

    private String status;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode == null ? null : whCode.trim();
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName == null ? null : whName.trim();
    }

    public String getWhOutletId() {
        return whOutletId;
    }

    public void setWhOutletId(String whOutletId) {
        this.whOutletId = whOutletId == null ? null : whOutletId.trim();
    }

    public Float getWhAcreage() {
        return whAcreage;
    }

    public void setWhAcreage(Float whAcreage) {
        this.whAcreage = whAcreage;
    }

    public Float getWhInventory() {
        return whInventory;
    }

    public void setWhInventory(Float whInventory) {
        this.whInventory = whInventory;
    }

    public String getWhPrincipal() {
        return whPrincipal;
    }

    public void setWhPrincipal(String whPrincipal) {
        this.whPrincipal = whPrincipal == null ? null : whPrincipal.trim();
    }

    public String getPrincipalMobile() {
        return principalMobile;
    }

    public void setPrincipalMobile(String principalMobile) {
        this.principalMobile = principalMobile == null ? null : principalMobile.trim();
    }

    public Float getOccupation() {
        return occupation;
    }

    public void setOccupation(Float occupation) {
        this.occupation = occupation;
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
}