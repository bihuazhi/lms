package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 仓库表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("ca_warehouse")
public class Warehouse extends Model<Warehouse> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 仓库编码
     */
    private String whCode;
    /**
     * 仓库名称
     */
    private String whName;
    /**
     * 所属网点
     */
    private String whOutletId;
    /**
     * 仓库面积
     */
    private Float whAcreage;
    /**
     * 库存
     */
    private Float whInventory;
    /**
     * 占用量
     */
    private Float occupation;
    /**
     * 负责人
     */
    private String whPrincipal;
    /**
     * 负责人手机
     */
    private String principalMobile;
    /**
     * 状态
     */
    private String status;
    /**
     * 投入时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName;
    }

    public String getWhOutletId() {
        return whOutletId;
    }

    public void setWhOutletId(String whOutletId) {
        this.whOutletId = whOutletId;
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

    public Float getOccupation() {
        return occupation;
    }

    public void setOccupation(Float occupation) {
        this.occupation = occupation;
    }

    public String getWhPrincipal() {
        return whPrincipal;
    }

    public void setWhPrincipal(String whPrincipal) {
        this.whPrincipal = whPrincipal;
    }

    public String getPrincipalMobile() {
        return principalMobile;
    }

    public void setPrincipalMobile(String principalMobile) {
        this.principalMobile = principalMobile;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        ", id=" + id +
        ", whCode=" + whCode +
        ", whName=" + whName +
        ", whOutletId=" + whOutletId +
        ", whAcreage=" + whAcreage +
        ", whInventory=" + whInventory +
        ", occupation=" + occupation +
        ", whPrincipal=" + whPrincipal +
        ", principalMobile=" + principalMobile +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
