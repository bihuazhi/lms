package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 客户表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("bu_customer")
public class Customer extends Model<Customer> {

    private static final long serialVersionUID = 1L;

    /**
     * id编号
     */
    private String id;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 客户编码
     */
    private String customerCode;
    /**
     * 支付方式
     */
    private String settlementMethod;
    /**
     * 合作次数
     */
    private Integer cooperationTimes;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 地区
     */
    private String area;
    /**
     * 地址
     */
    private String address;
    /**
     * 网点
     */
    private String outletsId;
    /**
     * 添加时间
     */
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public Integer getCooperationTimes() {
        return cooperationTimes;
    }

    public void setCooperationTimes(Integer cooperationTimes) {
        this.cooperationTimes = cooperationTimes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(String outletsId) {
        this.outletsId = outletsId;
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
        return "Customer{" +
        ", id=" + id +
        ", name=" + name +
        ", customerCode=" + customerCode +
        ", settlementMethod=" + settlementMethod +
        ", cooperationTimes=" + cooperationTimes +
        ", email=" + email +
        ", mobile=" + mobile +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", address=" + address +
        ", outletsId=" + outletsId +
        ", createTime=" + createTime +
        "}";
    }
}
