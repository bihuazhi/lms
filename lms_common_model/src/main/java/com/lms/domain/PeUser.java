package com.lms.domain;

import java.io.Serializable;
import java.util.*;

public class PeUser implements Serializable {
    private String id;

    private String mobile;

    private String username;

    private String password;

    private String enableState;

    private Date createTime;

    private String outletsId;

    private String level;

    private String empId;

    //用户的角色信息
    private List<PeRole> roles = new ArrayList<>(0);

    public List<PeRole> getRoles() {
        return roles;
    }

    public void setRoles(List<PeRole> roles) {
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEnableState() {
        return enableState;
    }

    public void setEnableState(String enableState) {
        this.enableState = enableState == null ? null : enableState.trim();
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
        this.outletsId = outletsId == null ? null : outletsId.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    @Override
    public String toString() {
        return "PeUser{" +
                "id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enableState='" + enableState + '\'' +
                ", createTime=" + createTime +
                ", outletsId='" + outletsId + '\'' +
                ", level='" + level + '\'' +
                ", empId='" + empId + '\'' +
                ", roles=" + roles +
                '}';
    }
}