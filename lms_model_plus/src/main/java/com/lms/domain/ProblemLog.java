package com.lms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 问题日志表
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-16
 */
@TableName("se_problem_log")
public class ProblemLog extends Model<ProblemLog> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String proOutletId;
    private String proReason;
    private String responsibleParty;
    private String callMobile;
    private String proDesc;
    private String isDeal;
    private String dealRemark;
    private Date createTime;


    public String getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(String isDeal) {
        this.isDeal = isDeal;
    }

    public String getDealRemark() {
        return dealRemark;
    }

    public void setDealRemark(String dealRemark) {
        this.dealRemark = dealRemark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProOutletId() {
        return proOutletId;
    }

    public void setProOutletId(String proOutletId) {
        this.proOutletId = proOutletId;
    }

    public String getProReason() {
        return proReason;
    }

    public void setProReason(String proReason) {
        this.proReason = proReason;
    }

    public String getResponsibleParty() {
        return responsibleParty;
    }

    public void setResponsibleParty(String responsibleParty) {
        this.responsibleParty = responsibleParty;
    }

    public String getCallMobile() {
        return callMobile;
    }

    public void setCallMobile(String callMobile) {
        this.callMobile = callMobile;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
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
        return "ProblemLog{" +
        ", id=" + id +
        ", proOutletId=" + proOutletId +
        ", proReason=" + proReason +
        ", responsibleParty=" + responsibleParty +
        ", callMobile=" + callMobile +
        ", proDesc=" + proDesc +
        ", createTime=" + createTime +
        "}";
    }
}
