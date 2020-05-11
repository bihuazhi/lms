package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 员工表信息
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("in_employee")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 所属网点
     */
    private String outletId;
    /**
     * 员工编码
     */
    private String empCode;
    /**
     * 员工姓名
     */
    private String empName;
    /**
     * 仓库id
     */
    private String whId;
    /**
     * 员工手机
     */
    private String empMobile;
    /**
     * 岗位
     */
    private String empWorking;
    /**
     * 员工地址
     */
    private String empAddress;
    /**
     * 是否绑定用户
     */
    private String bindUser;
    /**
     * 身份证
     */
    private String identity;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 1:在职  2:已派出
     */
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOutletId() {
        return outletId;
    }

    public void setOutletId(String outletId) {
        this.outletId = outletId;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public String getEmpWorking() {
        return empWorking;
    }

    public void setEmpWorking(String empWorking) {
        this.empWorking = empWorking;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getBindUser() {
        return bindUser;
    }

    public void setBindUser(String bindUser) {
        this.bindUser = bindUser;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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
        return "Employee{" +
        ", id=" + id +
        ", outletId=" + outletId +
        ", empCode=" + empCode +
        ", empName=" + empName +
        ", whId=" + whId +
        ", empMobile=" + empMobile +
        ", empWorking=" + empWorking +
        ", empAddress=" + empAddress +
        ", bindUser=" + bindUser +
        ", identity=" + identity +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
