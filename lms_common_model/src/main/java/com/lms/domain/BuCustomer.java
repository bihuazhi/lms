package com.lms.domain;

import java.io.Serializable;
import java.util.Date;

public class BuCustomer implements Serializable {
    private String id;

    private String name;

    private String customerCode;

    private String settlementMethod;

    private Integer cooperationTimes;

    private String email;

    private String mobile;

    private String province;

    private String city;

    private String area;

    private String address;

    private String outletsId;

    private Date createTime;

    @Override
    public String toString() {
        return "BuCustomer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", settlementMethod='" + settlementMethod + '\'' +
                ", cooperationTimes=" + cooperationTimes +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", outletsId='" + outletsId + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod == null ? null : settlementMethod.trim();
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
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(String outletsId) {
        this.outletsId = outletsId == null ? null : outletsId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}