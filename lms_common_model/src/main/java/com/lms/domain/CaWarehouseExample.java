package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaWarehouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWhCodeIsNull() {
            addCriterion("wh_code is null");
            return (Criteria) this;
        }

        public Criteria andWhCodeIsNotNull() {
            addCriterion("wh_code is not null");
            return (Criteria) this;
        }

        public Criteria andWhCodeEqualTo(String value) {
            addCriterion("wh_code =", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeNotEqualTo(String value) {
            addCriterion("wh_code <>", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeGreaterThan(String value) {
            addCriterion("wh_code >", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wh_code >=", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeLessThan(String value) {
            addCriterion("wh_code <", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeLessThanOrEqualTo(String value) {
            addCriterion("wh_code <=", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeLike(String value) {
            addCriterion("wh_code like", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeNotLike(String value) {
            addCriterion("wh_code not like", value, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeIn(List<String> values) {
            addCriterion("wh_code in", values, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeNotIn(List<String> values) {
            addCriterion("wh_code not in", values, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeBetween(String value1, String value2) {
            addCriterion("wh_code between", value1, value2, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhCodeNotBetween(String value1, String value2) {
            addCriterion("wh_code not between", value1, value2, "whCode");
            return (Criteria) this;
        }

        public Criteria andWhNameIsNull() {
            addCriterion("wh_name is null");
            return (Criteria) this;
        }

        public Criteria andWhNameIsNotNull() {
            addCriterion("wh_name is not null");
            return (Criteria) this;
        }

        public Criteria andWhNameEqualTo(String value) {
            addCriterion("wh_name =", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotEqualTo(String value) {
            addCriterion("wh_name <>", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameGreaterThan(String value) {
            addCriterion("wh_name >", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameGreaterThanOrEqualTo(String value) {
            addCriterion("wh_name >=", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameLessThan(String value) {
            addCriterion("wh_name <", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameLessThanOrEqualTo(String value) {
            addCriterion("wh_name <=", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameLike(String value) {
            addCriterion("wh_name like", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotLike(String value) {
            addCriterion("wh_name not like", value, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameIn(List<String> values) {
            addCriterion("wh_name in", values, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotIn(List<String> values) {
            addCriterion("wh_name not in", values, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameBetween(String value1, String value2) {
            addCriterion("wh_name between", value1, value2, "whName");
            return (Criteria) this;
        }

        public Criteria andWhNameNotBetween(String value1, String value2) {
            addCriterion("wh_name not between", value1, value2, "whName");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdIsNull() {
            addCriterion("wh_outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdIsNotNull() {
            addCriterion("wh_outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdEqualTo(String value) {
            addCriterion("wh_outlet_id =", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdNotEqualTo(String value) {
            addCriterion("wh_outlet_id <>", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdGreaterThan(String value) {
            addCriterion("wh_outlet_id >", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("wh_outlet_id >=", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdLessThan(String value) {
            addCriterion("wh_outlet_id <", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdLessThanOrEqualTo(String value) {
            addCriterion("wh_outlet_id <=", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdLike(String value) {
            addCriterion("wh_outlet_id like", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdNotLike(String value) {
            addCriterion("wh_outlet_id not like", value, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdIn(List<String> values) {
            addCriterion("wh_outlet_id in", values, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdNotIn(List<String> values) {
            addCriterion("wh_outlet_id not in", values, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdBetween(String value1, String value2) {
            addCriterion("wh_outlet_id between", value1, value2, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhOutletIdNotBetween(String value1, String value2) {
            addCriterion("wh_outlet_id not between", value1, value2, "whOutletId");
            return (Criteria) this;
        }

        public Criteria andWhAcreageIsNull() {
            addCriterion("wh_acreage is null");
            return (Criteria) this;
        }

        public Criteria andWhAcreageIsNotNull() {
            addCriterion("wh_acreage is not null");
            return (Criteria) this;
        }

        public Criteria andWhAcreageEqualTo(Float value) {
            addCriterion("wh_acreage =", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageNotEqualTo(Float value) {
            addCriterion("wh_acreage <>", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageGreaterThan(Float value) {
            addCriterion("wh_acreage >", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageGreaterThanOrEqualTo(Float value) {
            addCriterion("wh_acreage >=", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageLessThan(Float value) {
            addCriterion("wh_acreage <", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageLessThanOrEqualTo(Float value) {
            addCriterion("wh_acreage <=", value, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageIn(List<Float> values) {
            addCriterion("wh_acreage in", values, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageNotIn(List<Float> values) {
            addCriterion("wh_acreage not in", values, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageBetween(Float value1, Float value2) {
            addCriterion("wh_acreage between", value1, value2, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhAcreageNotBetween(Float value1, Float value2) {
            addCriterion("wh_acreage not between", value1, value2, "whAcreage");
            return (Criteria) this;
        }

        public Criteria andWhInventoryIsNull() {
            addCriterion("wh_inventory is null");
            return (Criteria) this;
        }

        public Criteria andWhInventoryIsNotNull() {
            addCriterion("wh_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andWhInventoryEqualTo(Float value) {
            addCriterion("wh_inventory =", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryNotEqualTo(Float value) {
            addCriterion("wh_inventory <>", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryGreaterThan(Float value) {
            addCriterion("wh_inventory >", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryGreaterThanOrEqualTo(Float value) {
            addCriterion("wh_inventory >=", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryLessThan(Float value) {
            addCriterion("wh_inventory <", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryLessThanOrEqualTo(Float value) {
            addCriterion("wh_inventory <=", value, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryIn(List<Float> values) {
            addCriterion("wh_inventory in", values, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryNotIn(List<Float> values) {
            addCriterion("wh_inventory not in", values, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryBetween(Float value1, Float value2) {
            addCriterion("wh_inventory between", value1, value2, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhInventoryNotBetween(Float value1, Float value2) {
            addCriterion("wh_inventory not between", value1, value2, "whInventory");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalIsNull() {
            addCriterion("wh_principal is null");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalIsNotNull() {
            addCriterion("wh_principal is not null");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalEqualTo(String value) {
            addCriterion("wh_principal =", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalNotEqualTo(String value) {
            addCriterion("wh_principal <>", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalGreaterThan(String value) {
            addCriterion("wh_principal >", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("wh_principal >=", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalLessThan(String value) {
            addCriterion("wh_principal <", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalLessThanOrEqualTo(String value) {
            addCriterion("wh_principal <=", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalLike(String value) {
            addCriterion("wh_principal like", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalNotLike(String value) {
            addCriterion("wh_principal not like", value, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalIn(List<String> values) {
            addCriterion("wh_principal in", values, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalNotIn(List<String> values) {
            addCriterion("wh_principal not in", values, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalBetween(String value1, String value2) {
            addCriterion("wh_principal between", value1, value2, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andWhPrincipalNotBetween(String value1, String value2) {
            addCriterion("wh_principal not between", value1, value2, "whPrincipal");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNull() {
            addCriterion("principal_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIsNotNull() {
            addCriterion("principal_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileEqualTo(String value) {
            addCriterion("principal_mobile =", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotEqualTo(String value) {
            addCriterion("principal_mobile <>", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThan(String value) {
            addCriterion("principal_mobile >", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileGreaterThanOrEqualTo(String value) {
            addCriterion("principal_mobile >=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThan(String value) {
            addCriterion("principal_mobile <", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLessThanOrEqualTo(String value) {
            addCriterion("principal_mobile <=", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileLike(String value) {
            addCriterion("principal_mobile like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotLike(String value) {
            addCriterion("principal_mobile not like", value, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileIn(List<String> values) {
            addCriterion("principal_mobile in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotIn(List<String> values) {
            addCriterion("principal_mobile not in", values, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileBetween(String value1, String value2) {
            addCriterion("principal_mobile between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipalMobileNotBetween(String value1, String value2) {
            addCriterion("principal_mobile not between", value1, value2, "principalMobile");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(Float value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(Float value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(Float value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(Float value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(Float value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(Float value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<Float> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<Float> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(Float value1, Float value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(Float value1, Float value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}