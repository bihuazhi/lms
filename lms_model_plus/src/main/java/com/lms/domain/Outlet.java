package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.ArrayList;
import java.util.Date;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 网点表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("in_outlet")
public class Outlet extends Model<Outlet> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 网点编码
     */
    private String outletCode;
    /**
     * 网点名称
     */
    private String outletName;
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
     * 详细地址
     */
    private String address;
    /**
     * 负责人
     */
    private String principal;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 备注
     */
    private String remark;
    /**
     * 投入时间
     */
    private Date createTime;
    /**
     * 0:未启用 1:正常运行
     */
    private String status;

    //仓库信息
    @TableField(exist = false)
    private List<Warehouse> warehouses = new ArrayList<Warehouse>(0);

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
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

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "Outlets{" +
        ", id=" + id +
        ", outletCode=" + outletCode +
        ", outletName=" + outletName +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", address=" + address +
        ", principal=" + principal +
        ", mobile=" + mobile +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
