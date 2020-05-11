package com.lms.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PeRole implements Serializable {
    private String id;

    private String code;

    private String name;

    private String description;

    //查询权限信息
    private List<PePermission> perms = new ArrayList<>(0);

    public List<PePermission> getPerms() {
        return perms;
    }

    public void setPerms(List<PePermission> perms) {
        this.perms = perms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}