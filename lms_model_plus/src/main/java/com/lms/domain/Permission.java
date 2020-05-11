package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("pe_permission")
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * 权限描述
     */
    private String description;
    /**
     * 跳转路径
     */
    private String path;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限类型 1为菜单 2为功能 3为API
     */
    private Integer type;
    /**
     * 主键
     */
    private String pid;
    /**
     * 权限编码
     */
    private String code;
    /**
     * 企业可见性 0：不可见，1：可见
     */
    private Integer enVisible;
    /**
     * 访问url
     */
    private String url;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getEnVisible() {
        return enVisible;
    }

    public void setEnVisible(Integer enVisible) {
        this.enVisible = enVisible;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Permission{" +
        ", id=" + id +
        ", description=" + description +
        ", path=" + path +
        ", name=" + name +
        ", type=" + type +
        ", pid=" + pid +
        ", code=" + code +
        ", enVisible=" + enVisible +
        ", url=" + url +
        "}";
    }
}
