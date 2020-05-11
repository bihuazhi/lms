package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("pe_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 启用状态 0是禁用，1是启用
     */
    private String enableState;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 所属网点id
     */
    private String outletsId;
    /**
     * 用户级别：1系统管理级别 2 管理层级别 3：员工级别
     */
    private String level;
    /**
     * 绑定员工： null没绑定  不为null就是绑定员工
     */
    private String empId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnableState() {
        return enableState;
    }

    public void setEnableState(String enableState) {
        this.enableState = enableState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(String outletsId) {
        this.outletsId = outletsId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", mobile=" + mobile +
        ", username=" + username +
        ", password=" + password +
        ", enableState=" + enableState +
        ", createTime=" + createTime +
        ", outletsId=" + outletsId +
        ", level=" + level +
        ", empId=" + empId +
        "}";
    }
}
