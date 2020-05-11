package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaVehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaVehicleExample() {
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

        public Criteria andVhCodeIsNull() {
            addCriterion("vh_code is null");
            return (Criteria) this;
        }

        public Criteria andVhCodeIsNotNull() {
            addCriterion("vh_code is not null");
            return (Criteria) this;
        }

        public Criteria andVhCodeEqualTo(String value) {
            addCriterion("vh_code =", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeNotEqualTo(String value) {
            addCriterion("vh_code <>", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeGreaterThan(String value) {
            addCriterion("vh_code >", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vh_code >=", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeLessThan(String value) {
            addCriterion("vh_code <", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeLessThanOrEqualTo(String value) {
            addCriterion("vh_code <=", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeLike(String value) {
            addCriterion("vh_code like", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeNotLike(String value) {
            addCriterion("vh_code not like", value, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeIn(List<String> values) {
            addCriterion("vh_code in", values, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeNotIn(List<String> values) {
            addCriterion("vh_code not in", values, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeBetween(String value1, String value2) {
            addCriterion("vh_code between", value1, value2, "vhCode");
            return (Criteria) this;
        }

        public Criteria andVhCodeNotBetween(String value1, String value2) {
            addCriterion("vh_code not between", value1, value2, "vhCode");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andVhTypeIsNull() {
            addCriterion("vh_type is null");
            return (Criteria) this;
        }

        public Criteria andVhTypeIsNotNull() {
            addCriterion("vh_type is not null");
            return (Criteria) this;
        }

        public Criteria andVhTypeEqualTo(String value) {
            addCriterion("vh_type =", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeNotEqualTo(String value) {
            addCriterion("vh_type <>", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeGreaterThan(String value) {
            addCriterion("vh_type >", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vh_type >=", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeLessThan(String value) {
            addCriterion("vh_type <", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeLessThanOrEqualTo(String value) {
            addCriterion("vh_type <=", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeLike(String value) {
            addCriterion("vh_type like", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeNotLike(String value) {
            addCriterion("vh_type not like", value, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeIn(List<String> values) {
            addCriterion("vh_type in", values, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeNotIn(List<String> values) {
            addCriterion("vh_type not in", values, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeBetween(String value1, String value2) {
            addCriterion("vh_type between", value1, value2, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhTypeNotBetween(String value1, String value2) {
            addCriterion("vh_type not between", value1, value2, "vhType");
            return (Criteria) this;
        }

        public Criteria andVhWeightIsNull() {
            addCriterion("vh_weight is null");
            return (Criteria) this;
        }

        public Criteria andVhWeightIsNotNull() {
            addCriterion("vh_weight is not null");
            return (Criteria) this;
        }

        public Criteria andVhWeightEqualTo(Integer value) {
            addCriterion("vh_weight =", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightNotEqualTo(Integer value) {
            addCriterion("vh_weight <>", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightGreaterThan(Integer value) {
            addCriterion("vh_weight >", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("vh_weight >=", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightLessThan(Integer value) {
            addCriterion("vh_weight <", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightLessThanOrEqualTo(Integer value) {
            addCriterion("vh_weight <=", value, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightIn(List<Integer> values) {
            addCriterion("vh_weight in", values, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightNotIn(List<Integer> values) {
            addCriterion("vh_weight not in", values, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightBetween(Integer value1, Integer value2) {
            addCriterion("vh_weight between", value1, value2, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andVhWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("vh_weight not between", value1, value2, "vhWeight");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNull() {
            addCriterion("consume is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIsNotNull() {
            addCriterion("consume is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeEqualTo(Integer value) {
            addCriterion("consume =", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotEqualTo(Integer value) {
            addCriterion("consume <>", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThan(Integer value) {
            addCriterion("consume >", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume >=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThan(Integer value) {
            addCriterion("consume <", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeLessThanOrEqualTo(Integer value) {
            addCriterion("consume <=", value, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeIn(List<Integer> values) {
            addCriterion("consume in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotIn(List<Integer> values) {
            addCriterion("consume not in", values, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeBetween(Integer value1, Integer value2) {
            addCriterion("consume between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andConsumeNotBetween(Integer value1, Integer value2) {
            addCriterion("consume not between", value1, value2, "consume");
            return (Criteria) this;
        }

        public Criteria andCarryingIsNull() {
            addCriterion("carrying is null");
            return (Criteria) this;
        }

        public Criteria andCarryingIsNotNull() {
            addCriterion("carrying is not null");
            return (Criteria) this;
        }

        public Criteria andCarryingEqualTo(Float value) {
            addCriterion("carrying =", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotEqualTo(Float value) {
            addCriterion("carrying <>", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingGreaterThan(Float value) {
            addCriterion("carrying >", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingGreaterThanOrEqualTo(Float value) {
            addCriterion("carrying >=", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingLessThan(Float value) {
            addCriterion("carrying <", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingLessThanOrEqualTo(Float value) {
            addCriterion("carrying <=", value, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingIn(List<Float> values) {
            addCriterion("carrying in", values, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotIn(List<Float> values) {
            addCriterion("carrying not in", values, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingBetween(Float value1, Float value2) {
            addCriterion("carrying between", value1, value2, "carrying");
            return (Criteria) this;
        }

        public Criteria andCarryingNotBetween(Float value1, Float value2) {
            addCriterion("carrying not between", value1, value2, "carrying");
            return (Criteria) this;
        }

        public Criteria andVhHostIsNull() {
            addCriterion("vh_host is null");
            return (Criteria) this;
        }

        public Criteria andVhHostIsNotNull() {
            addCriterion("vh_host is not null");
            return (Criteria) this;
        }

        public Criteria andVhHostEqualTo(String value) {
            addCriterion("vh_host =", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostNotEqualTo(String value) {
            addCriterion("vh_host <>", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostGreaterThan(String value) {
            addCriterion("vh_host >", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostGreaterThanOrEqualTo(String value) {
            addCriterion("vh_host >=", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostLessThan(String value) {
            addCriterion("vh_host <", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostLessThanOrEqualTo(String value) {
            addCriterion("vh_host <=", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostLike(String value) {
            addCriterion("vh_host like", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostNotLike(String value) {
            addCriterion("vh_host not like", value, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostIn(List<String> values) {
            addCriterion("vh_host in", values, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostNotIn(List<String> values) {
            addCriterion("vh_host not in", values, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostBetween(String value1, String value2) {
            addCriterion("vh_host between", value1, value2, "vhHost");
            return (Criteria) this;
        }

        public Criteria andVhHostNotBetween(String value1, String value2) {
            addCriterion("vh_host not between", value1, value2, "vhHost");
            return (Criteria) this;
        }

        public Criteria andHostMobileIsNull() {
            addCriterion("host_mobile is null");
            return (Criteria) this;
        }

        public Criteria andHostMobileIsNotNull() {
            addCriterion("host_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andHostMobileEqualTo(String value) {
            addCriterion("host_mobile =", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileNotEqualTo(String value) {
            addCriterion("host_mobile <>", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileGreaterThan(String value) {
            addCriterion("host_mobile >", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileGreaterThanOrEqualTo(String value) {
            addCriterion("host_mobile >=", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileLessThan(String value) {
            addCriterion("host_mobile <", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileLessThanOrEqualTo(String value) {
            addCriterion("host_mobile <=", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileLike(String value) {
            addCriterion("host_mobile like", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileNotLike(String value) {
            addCriterion("host_mobile not like", value, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileIn(List<String> values) {
            addCriterion("host_mobile in", values, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileNotIn(List<String> values) {
            addCriterion("host_mobile not in", values, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileBetween(String value1, String value2) {
            addCriterion("host_mobile between", value1, value2, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andHostMobileNotBetween(String value1, String value2) {
            addCriterion("host_mobile not between", value1, value2, "hostMobile");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdIsNull() {
            addCriterion("vh_outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdIsNotNull() {
            addCriterion("vh_outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdEqualTo(String value) {
            addCriterion("vh_outlet_id =", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdNotEqualTo(String value) {
            addCriterion("vh_outlet_id <>", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdGreaterThan(String value) {
            addCriterion("vh_outlet_id >", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("vh_outlet_id >=", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdLessThan(String value) {
            addCriterion("vh_outlet_id <", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdLessThanOrEqualTo(String value) {
            addCriterion("vh_outlet_id <=", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdLike(String value) {
            addCriterion("vh_outlet_id like", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdNotLike(String value) {
            addCriterion("vh_outlet_id not like", value, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdIn(List<String> values) {
            addCriterion("vh_outlet_id in", values, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdNotIn(List<String> values) {
            addCriterion("vh_outlet_id not in", values, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdBetween(String value1, String value2) {
            addCriterion("vh_outlet_id between", value1, value2, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhOutletIdNotBetween(String value1, String value2) {
            addCriterion("vh_outlet_id not between", value1, value2, "vhOutletId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdIsNull() {
            addCriterion("vh_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andVhWhIdIsNotNull() {
            addCriterion("vh_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andVhWhIdEqualTo(String value) {
            addCriterion("vh_wh_id =", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdNotEqualTo(String value) {
            addCriterion("vh_wh_id <>", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdGreaterThan(String value) {
            addCriterion("vh_wh_id >", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("vh_wh_id >=", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdLessThan(String value) {
            addCriterion("vh_wh_id <", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdLessThanOrEqualTo(String value) {
            addCriterion("vh_wh_id <=", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdLike(String value) {
            addCriterion("vh_wh_id like", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdNotLike(String value) {
            addCriterion("vh_wh_id not like", value, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdIn(List<String> values) {
            addCriterion("vh_wh_id in", values, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdNotIn(List<String> values) {
            addCriterion("vh_wh_id not in", values, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdBetween(String value1, String value2) {
            addCriterion("vh_wh_id between", value1, value2, "vhWhId");
            return (Criteria) this;
        }

        public Criteria andVhWhIdNotBetween(String value1, String value2) {
            addCriterion("vh_wh_id not between", value1, value2, "vhWhId");
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