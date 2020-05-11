package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InEmployeeExample() {
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

        public Criteria andOutletIdIsNull() {
            addCriterion("outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andOutletIdIsNotNull() {
            addCriterion("outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutletIdEqualTo(String value) {
            addCriterion("outlet_id =", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdNotEqualTo(String value) {
            addCriterion("outlet_id <>", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdGreaterThan(String value) {
            addCriterion("outlet_id >", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("outlet_id >=", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdLessThan(String value) {
            addCriterion("outlet_id <", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdLessThanOrEqualTo(String value) {
            addCriterion("outlet_id <=", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdLike(String value) {
            addCriterion("outlet_id like", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdNotLike(String value) {
            addCriterion("outlet_id not like", value, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdIn(List<String> values) {
            addCriterion("outlet_id in", values, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdNotIn(List<String> values) {
            addCriterion("outlet_id not in", values, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdBetween(String value1, String value2) {
            addCriterion("outlet_id between", value1, value2, "outletId");
            return (Criteria) this;
        }

        public Criteria andOutletIdNotBetween(String value1, String value2) {
            addCriterion("outlet_id not between", value1, value2, "outletId");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIsNull() {
            addCriterion("emp_code is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIsNotNull() {
            addCriterion("emp_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeEqualTo(String value) {
            addCriterion("emp_code =", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotEqualTo(String value) {
            addCriterion("emp_code <>", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThan(String value) {
            addCriterion("emp_code >", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_code >=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThan(String value) {
            addCriterion("emp_code <", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThanOrEqualTo(String value) {
            addCriterion("emp_code <=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLike(String value) {
            addCriterion("emp_code like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotLike(String value) {
            addCriterion("emp_code not like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIn(List<String> values) {
            addCriterion("emp_code in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotIn(List<String> values) {
            addCriterion("emp_code not in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeBetween(String value1, String value2) {
            addCriterion("emp_code between", value1, value2, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotBetween(String value1, String value2) {
            addCriterion("emp_code not between", value1, value2, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNull() {
            addCriterion("wh_id is null");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNotNull() {
            addCriterion("wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhIdEqualTo(String value) {
            addCriterion("wh_id =", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotEqualTo(String value) {
            addCriterion("wh_id <>", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThan(String value) {
            addCriterion("wh_id >", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("wh_id >=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThan(String value) {
            addCriterion("wh_id <", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThanOrEqualTo(String value) {
            addCriterion("wh_id <=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLike(String value) {
            addCriterion("wh_id like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotLike(String value) {
            addCriterion("wh_id not like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdIn(List<String> values) {
            addCriterion("wh_id in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotIn(List<String> values) {
            addCriterion("wh_id not in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdBetween(String value1, String value2) {
            addCriterion("wh_id between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotBetween(String value1, String value2) {
            addCriterion("wh_id not between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andEmpMobileIsNull() {
            addCriterion("emp_mobile is null");
            return (Criteria) this;
        }

        public Criteria andEmpMobileIsNotNull() {
            addCriterion("emp_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andEmpMobileEqualTo(String value) {
            addCriterion("emp_mobile =", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileNotEqualTo(String value) {
            addCriterion("emp_mobile <>", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileGreaterThan(String value) {
            addCriterion("emp_mobile >", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileGreaterThanOrEqualTo(String value) {
            addCriterion("emp_mobile >=", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileLessThan(String value) {
            addCriterion("emp_mobile <", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileLessThanOrEqualTo(String value) {
            addCriterion("emp_mobile <=", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileLike(String value) {
            addCriterion("emp_mobile like", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileNotLike(String value) {
            addCriterion("emp_mobile not like", value, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileIn(List<String> values) {
            addCriterion("emp_mobile in", values, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileNotIn(List<String> values) {
            addCriterion("emp_mobile not in", values, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileBetween(String value1, String value2) {
            addCriterion("emp_mobile between", value1, value2, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpMobileNotBetween(String value1, String value2) {
            addCriterion("emp_mobile not between", value1, value2, "empMobile");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingIsNull() {
            addCriterion("emp_working is null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingIsNotNull() {
            addCriterion("emp_working is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingEqualTo(String value) {
            addCriterion("emp_working =", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingNotEqualTo(String value) {
            addCriterion("emp_working <>", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingGreaterThan(String value) {
            addCriterion("emp_working >", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingGreaterThanOrEqualTo(String value) {
            addCriterion("emp_working >=", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingLessThan(String value) {
            addCriterion("emp_working <", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingLessThanOrEqualTo(String value) {
            addCriterion("emp_working <=", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingLike(String value) {
            addCriterion("emp_working like", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingNotLike(String value) {
            addCriterion("emp_working not like", value, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingIn(List<String> values) {
            addCriterion("emp_working in", values, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingNotIn(List<String> values) {
            addCriterion("emp_working not in", values, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingBetween(String value1, String value2) {
            addCriterion("emp_working between", value1, value2, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpWorkingNotBetween(String value1, String value2) {
            addCriterion("emp_working not between", value1, value2, "empWorking");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("emp_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("emp_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("emp_address =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("emp_address <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("emp_address >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_address >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("emp_address <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_address <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("emp_address like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("emp_address not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("emp_address in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("emp_address not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("emp_address between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("emp_address not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
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