package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuOrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("order_source like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("order_source not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIsNull() {
            addCriterion("customer_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIsNotNull() {
            addCriterion("customer_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileEqualTo(String value) {
            addCriterion("customer_mobile =", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotEqualTo(String value) {
            addCriterion("customer_mobile <>", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileGreaterThan(String value) {
            addCriterion("customer_mobile >", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("customer_mobile >=", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLessThan(String value) {
            addCriterion("customer_mobile <", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLessThanOrEqualTo(String value) {
            addCriterion("customer_mobile <=", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLike(String value) {
            addCriterion("customer_mobile like", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotLike(String value) {
            addCriterion("customer_mobile not like", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIn(List<String> values) {
            addCriterion("customer_mobile in", values, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotIn(List<String> values) {
            addCriterion("customer_mobile not in", values, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileBetween(String value1, String value2) {
            addCriterion("customer_mobile between", value1, value2, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotBetween(String value1, String value2) {
            addCriterion("customer_mobile not between", value1, value2, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNull() {
            addCriterion("goods_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIsNotNull() {
            addCriterion("goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCountEqualTo(Integer value) {
            addCriterion("goods_count =", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotEqualTo(Integer value) {
            addCriterion("goods_count <>", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThan(Integer value) {
            addCriterion("goods_count >", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_count >=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThan(Integer value) {
            addCriterion("goods_count <", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_count <=", value, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountIn(List<Integer> values) {
            addCriterion("goods_count in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotIn(List<Integer> values) {
            addCriterion("goods_count not in", values, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_count between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_count not between", value1, value2, "goodsCount");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Float value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Float value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Float value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Float value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Float value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Float> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Float> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Float value1, Float value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Float value1, Float value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Float value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Float value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Float value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Float value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Float value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Float> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Float> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Float value1, Float value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Float value1, Float value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNull() {
            addCriterion("goods_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIsNotNull() {
            addCriterion("goods_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeEqualTo(Float value) {
            addCriterion("goods_volume =", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotEqualTo(Float value) {
            addCriterion("goods_volume <>", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThan(Float value) {
            addCriterion("goods_volume >", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_volume >=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThan(Float value) {
            addCriterion("goods_volume <", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeLessThanOrEqualTo(Float value) {
            addCriterion("goods_volume <=", value, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeIn(List<Float> values) {
            addCriterion("goods_volume in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotIn(List<Float> values) {
            addCriterion("goods_volume not in", values, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeBetween(Float value1, Float value2) {
            addCriterion("goods_volume between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsVolumeNotBetween(Float value1, Float value2) {
            addCriterion("goods_volume not between", value1, value2, "goodsVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerIsNull() {
            addCriterion("goods_marker is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerIsNotNull() {
            addCriterion("goods_marker is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerEqualTo(String value) {
            addCriterion("goods_marker =", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerNotEqualTo(String value) {
            addCriterion("goods_marker <>", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerGreaterThan(String value) {
            addCriterion("goods_marker >", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerGreaterThanOrEqualTo(String value) {
            addCriterion("goods_marker >=", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerLessThan(String value) {
            addCriterion("goods_marker <", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerLessThanOrEqualTo(String value) {
            addCriterion("goods_marker <=", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerLike(String value) {
            addCriterion("goods_marker like", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerNotLike(String value) {
            addCriterion("goods_marker not like", value, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerIn(List<String> values) {
            addCriterion("goods_marker in", values, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerNotIn(List<String> values) {
            addCriterion("goods_marker not in", values, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerBetween(String value1, String value2) {
            addCriterion("goods_marker between", value1, value2, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsMarkerNotBetween(String value1, String value2) {
            addCriterion("goods_marker not between", value1, value2, "goodsMarker");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("settlement_type like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIsNull() {
            addCriterion("sender_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIsNotNull() {
            addCriterion("sender_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileEqualTo(String value) {
            addCriterion("sender_mobile =", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotEqualTo(String value) {
            addCriterion("sender_mobile <>", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileGreaterThan(String value) {
            addCriterion("sender_mobile >", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mobile >=", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLessThan(String value) {
            addCriterion("sender_mobile <", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLessThanOrEqualTo(String value) {
            addCriterion("sender_mobile <=", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLike(String value) {
            addCriterion("sender_mobile like", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotLike(String value) {
            addCriterion("sender_mobile not like", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIn(List<String> values) {
            addCriterion("sender_mobile in", values, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotIn(List<String> values) {
            addCriterion("sender_mobile not in", values, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileBetween(String value1, String value2) {
            addCriterion("sender_mobile between", value1, value2, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotBetween(String value1, String value2) {
            addCriterion("sender_mobile not between", value1, value2, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIsNull() {
            addCriterion("sender_province is null");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIsNotNull() {
            addCriterion("sender_province is not null");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceEqualTo(String value) {
            addCriterion("sender_province =", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotEqualTo(String value) {
            addCriterion("sender_province <>", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceGreaterThan(String value) {
            addCriterion("sender_province >", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("sender_province >=", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLessThan(String value) {
            addCriterion("sender_province <", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLessThanOrEqualTo(String value) {
            addCriterion("sender_province <=", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceLike(String value) {
            addCriterion("sender_province like", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotLike(String value) {
            addCriterion("sender_province not like", value, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceIn(List<String> values) {
            addCriterion("sender_province in", values, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotIn(List<String> values) {
            addCriterion("sender_province not in", values, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceBetween(String value1, String value2) {
            addCriterion("sender_province between", value1, value2, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderProvinceNotBetween(String value1, String value2) {
            addCriterion("sender_province not between", value1, value2, "senderProvince");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNull() {
            addCriterion("sender_city is null");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNotNull() {
            addCriterion("sender_city is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCityEqualTo(String value) {
            addCriterion("sender_city =", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotEqualTo(String value) {
            addCriterion("sender_city <>", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThan(String value) {
            addCriterion("sender_city >", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThanOrEqualTo(String value) {
            addCriterion("sender_city >=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThan(String value) {
            addCriterion("sender_city <", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThanOrEqualTo(String value) {
            addCriterion("sender_city <=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLike(String value) {
            addCriterion("sender_city like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotLike(String value) {
            addCriterion("sender_city not like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityIn(List<String> values) {
            addCriterion("sender_city in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotIn(List<String> values) {
            addCriterion("sender_city not in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityBetween(String value1, String value2) {
            addCriterion("sender_city between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotBetween(String value1, String value2) {
            addCriterion("sender_city not between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderAreaIsNull() {
            addCriterion("sender_area is null");
            return (Criteria) this;
        }

        public Criteria andSenderAreaIsNotNull() {
            addCriterion("sender_area is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAreaEqualTo(String value) {
            addCriterion("sender_area =", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaNotEqualTo(String value) {
            addCriterion("sender_area <>", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaGreaterThan(String value) {
            addCriterion("sender_area >", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaGreaterThanOrEqualTo(String value) {
            addCriterion("sender_area >=", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaLessThan(String value) {
            addCriterion("sender_area <", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaLessThanOrEqualTo(String value) {
            addCriterion("sender_area <=", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaLike(String value) {
            addCriterion("sender_area like", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaNotLike(String value) {
            addCriterion("sender_area not like", value, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaIn(List<String> values) {
            addCriterion("sender_area in", values, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaNotIn(List<String> values) {
            addCriterion("sender_area not in", values, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaBetween(String value1, String value2) {
            addCriterion("sender_area between", value1, value2, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAreaNotBetween(String value1, String value2) {
            addCriterion("sender_area not between", value1, value2, "senderArea");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLike(String value) {
            addCriterion("receiver_city like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaIsNull() {
            addCriterion("receiver_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaIsNotNull() {
            addCriterion("receiver_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaEqualTo(String value) {
            addCriterion("receiver_area =", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNotEqualTo(String value) {
            addCriterion("receiver_area <>", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaGreaterThan(String value) {
            addCriterion("receiver_area >", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_area >=", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaLessThan(String value) {
            addCriterion("receiver_area <", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaLessThanOrEqualTo(String value) {
            addCriterion("receiver_area <=", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaLike(String value) {
            addCriterion("receiver_area like", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNotLike(String value) {
            addCriterion("receiver_area not like", value, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaIn(List<String> values) {
            addCriterion("receiver_area in", values, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNotIn(List<String> values) {
            addCriterion("receiver_area not in", values, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaBetween(String value1, String value2) {
            addCriterion("receiver_area between", value1, value2, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverAreaNotBetween(String value1, String value2) {
            addCriterion("receiver_area not between", value1, value2, "receiverArea");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNull() {
            addCriterion("receiver_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNotNull() {
            addCriterion("receiver_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceEqualTo(String value) {
            addCriterion("receiver_province =", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotEqualTo(String value) {
            addCriterion("receiver_province <>", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThan(String value) {
            addCriterion("receiver_province >", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_province >=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThan(String value) {
            addCriterion("receiver_province <", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThanOrEqualTo(String value) {
            addCriterion("receiver_province <=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLike(String value) {
            addCriterion("receiver_province like", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotLike(String value) {
            addCriterion("receiver_province not like", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIn(List<String> values) {
            addCriterion("receiver_province in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotIn(List<String> values) {
            addCriterion("receiver_province not in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceBetween(String value1, String value2) {
            addCriterion("receiver_province between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotBetween(String value1, String value2) {
            addCriterion("receiver_province not between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Float value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Float value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Float value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Float value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Float value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Float value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Float> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Float> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Float value1, Float value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Float value1, Float value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(String value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(String value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(String value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(String value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(String value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(String value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLike(String value) {
            addCriterion("is_pay like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotLike(String value) {
            addCriterion("is_pay not like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<String> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<String> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(String value1, String value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(String value1, String value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdIsNull() {
            addCriterion("employ_outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdIsNotNull() {
            addCriterion("employ_outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdEqualTo(String value) {
            addCriterion("employ_outlet_id =", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdNotEqualTo(String value) {
            addCriterion("employ_outlet_id <>", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdGreaterThan(String value) {
            addCriterion("employ_outlet_id >", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("employ_outlet_id >=", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdLessThan(String value) {
            addCriterion("employ_outlet_id <", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdLessThanOrEqualTo(String value) {
            addCriterion("employ_outlet_id <=", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdLike(String value) {
            addCriterion("employ_outlet_id like", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdNotLike(String value) {
            addCriterion("employ_outlet_id not like", value, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdIn(List<String> values) {
            addCriterion("employ_outlet_id in", values, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdNotIn(List<String> values) {
            addCriterion("employ_outlet_id not in", values, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdBetween(String value1, String value2) {
            addCriterion("employ_outlet_id between", value1, value2, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployOutletIdNotBetween(String value1, String value2) {
            addCriterion("employ_outlet_id not between", value1, value2, "employOutletId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdIsNull() {
            addCriterion("employ_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdIsNotNull() {
            addCriterion("employ_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdEqualTo(String value) {
            addCriterion("employ_wh_id =", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdNotEqualTo(String value) {
            addCriterion("employ_wh_id <>", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdGreaterThan(String value) {
            addCriterion("employ_wh_id >", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("employ_wh_id >=", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdLessThan(String value) {
            addCriterion("employ_wh_id <", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdLessThanOrEqualTo(String value) {
            addCriterion("employ_wh_id <=", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdLike(String value) {
            addCriterion("employ_wh_id like", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdNotLike(String value) {
            addCriterion("employ_wh_id not like", value, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdIn(List<String> values) {
            addCriterion("employ_wh_id in", values, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdNotIn(List<String> values) {
            addCriterion("employ_wh_id not in", values, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdBetween(String value1, String value2) {
            addCriterion("employ_wh_id between", value1, value2, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployWhIdNotBetween(String value1, String value2) {
            addCriterion("employ_wh_id not between", value1, value2, "employWhId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdIsNull() {
            addCriterion("employ_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdIsNotNull() {
            addCriterion("employ_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdEqualTo(String value) {
            addCriterion("employ_emp_id =", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdNotEqualTo(String value) {
            addCriterion("employ_emp_id <>", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdGreaterThan(String value) {
            addCriterion("employ_emp_id >", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("employ_emp_id >=", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdLessThan(String value) {
            addCriterion("employ_emp_id <", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdLessThanOrEqualTo(String value) {
            addCriterion("employ_emp_id <=", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdLike(String value) {
            addCriterion("employ_emp_id like", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdNotLike(String value) {
            addCriterion("employ_emp_id not like", value, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdIn(List<String> values) {
            addCriterion("employ_emp_id in", values, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdNotIn(List<String> values) {
            addCriterion("employ_emp_id not in", values, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdBetween(String value1, String value2) {
            addCriterion("employ_emp_id between", value1, value2, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployEmpIdNotBetween(String value1, String value2) {
            addCriterion("employ_emp_id not between", value1, value2, "employEmpId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdIsNull() {
            addCriterion("employ_veh_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdIsNotNull() {
            addCriterion("employ_veh_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdEqualTo(String value) {
            addCriterion("employ_veh_id =", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdNotEqualTo(String value) {
            addCriterion("employ_veh_id <>", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdGreaterThan(String value) {
            addCriterion("employ_veh_id >", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdGreaterThanOrEqualTo(String value) {
            addCriterion("employ_veh_id >=", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdLessThan(String value) {
            addCriterion("employ_veh_id <", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdLessThanOrEqualTo(String value) {
            addCriterion("employ_veh_id <=", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdLike(String value) {
            addCriterion("employ_veh_id like", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdNotLike(String value) {
            addCriterion("employ_veh_id not like", value, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdIn(List<String> values) {
            addCriterion("employ_veh_id in", values, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdNotIn(List<String> values) {
            addCriterion("employ_veh_id not in", values, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdBetween(String value1, String value2) {
            addCriterion("employ_veh_id between", value1, value2, "employVehId");
            return (Criteria) this;
        }

        public Criteria andEmployVehIdNotBetween(String value1, String value2) {
            addCriterion("employ_veh_id not between", value1, value2, "employVehId");
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

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
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