package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 车辆信息表
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("ca_vehicle")
public class Vehicle extends Model<Vehicle> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 车辆编码
     */
    private String vhCode;
    /**
     * 车牌号
     */
    private String license;
    /**
     * 车辆类型
     */
    private String vhType;
    /**
     * 车净重
     */
    private Integer vhWeight;
    /**
     * 耗油量
     */
    private Integer consume;
    /**
     * 承载量
     */
    private Float carrying;
    /**
     * 车主
     */
    private String vhHost;
    /**
     * 车主手机
     */
    private String hostMobile;
    /**
     * 代理司机
     */
    private String driver;
    /**
     * 车辆所属网点
     */
    private String vhOutletId;
    /**
     * 所属仓库
     */
    private String vhWhId;
    /**
     * 投入时间
     */
    private Date createTime;
    /**
     * 1：空闲  2：已安排 3：已出车
     */
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVhCode() {
        return vhCode;
    }

    public void setVhCode(String vhCode) {
        this.vhCode = vhCode;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVhType() {
        return vhType;
    }

    public void setVhType(String vhType) {
        this.vhType = vhType;
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
        this.vhHost = vhHost;
    }

    public String getHostMobile() {
        return hostMobile;
    }

    public void setHostMobile(String hostMobile) {
        this.hostMobile = hostMobile;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVhOutletId() {
        return vhOutletId;
    }

    public void setVhOutletId(String vhOutletId) {
        this.vhOutletId = vhOutletId;
    }

    public String getVhWhId() {
        return vhWhId;
    }

    public void setVhWhId(String vhWhId) {
        this.vhWhId = vhWhId;
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
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
        ", id=" + id +
        ", vhCode=" + vhCode +
        ", license=" + license +
        ", vhType=" + vhType +
        ", vhWeight=" + vhWeight +
        ", consume=" + consume +
        ", carrying=" + carrying +
        ", vhHost=" + vhHost +
        ", hostMobile=" + hostMobile +
        ", driver=" + driver +
        ", vhOutletId=" + vhOutletId +
        ", vhWhId=" + vhWhId +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
