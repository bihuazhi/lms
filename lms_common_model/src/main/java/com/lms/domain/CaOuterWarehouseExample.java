package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaOuterWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaOuterWarehouseExample() {
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

        public Criteria andOuterCodeIsNull() {
            addCriterion("outer_code is null");
            return (Criteria) this;
        }

        public Criteria andOuterCodeIsNotNull() {
            addCriterion("outer_code is not null");
            return (Criteria) this;
        }

        public Criteria andOuterCodeEqualTo(String value) {
            addCriterion("outer_code =", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeNotEqualTo(String value) {
            addCriterion("outer_code <>", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeGreaterThan(String value) {
            addCriterion("outer_code >", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("outer_code >=", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeLessThan(String value) {
            addCriterion("outer_code <", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeLessThanOrEqualTo(String value) {
            addCriterion("outer_code <=", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeLike(String value) {
            addCriterion("outer_code like", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeNotLike(String value) {
            addCriterion("outer_code not like", value, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeIn(List<String> values) {
            addCriterion("outer_code in", values, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeNotIn(List<String> values) {
            addCriterion("outer_code not in", values, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeBetween(String value1, String value2) {
            addCriterion("outer_code between", value1, value2, "outerCode");
            return (Criteria) this;
        }

        public Criteria andOuterCodeNotBetween(String value1, String value2) {
            addCriterion("outer_code not between", value1, value2, "outerCode");
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

        public Criteria andGoodsTotalVolumeIsNull() {
            addCriterion("goods_total_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeIsNotNull() {
            addCriterion("goods_total_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeEqualTo(Float value) {
            addCriterion("goods_total_volume =", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotEqualTo(Float value) {
            addCriterion("goods_total_volume <>", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeGreaterThan(Float value) {
            addCriterion("goods_total_volume >", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_total_volume >=", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeLessThan(Float value) {
            addCriterion("goods_total_volume <", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeLessThanOrEqualTo(Float value) {
            addCriterion("goods_total_volume <=", value, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeIn(List<Float> values) {
            addCriterion("goods_total_volume in", values, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotIn(List<Float> values) {
            addCriterion("goods_total_volume not in", values, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeBetween(Float value1, Float value2) {
            addCriterion("goods_total_volume between", value1, value2, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalVolumeNotBetween(Float value1, Float value2) {
            addCriterion("goods_total_volume not between", value1, value2, "goodsTotalVolume");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceIsNull() {
            addCriterion("goods_total_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceIsNotNull() {
            addCriterion("goods_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceEqualTo(Float value) {
            addCriterion("goods_total_price =", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotEqualTo(Float value) {
            addCriterion("goods_total_price <>", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceGreaterThan(Float value) {
            addCriterion("goods_total_price >", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_total_price >=", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceLessThan(Float value) {
            addCriterion("goods_total_price <", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceLessThanOrEqualTo(Float value) {
            addCriterion("goods_total_price <=", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceIn(List<Float> values) {
            addCriterion("goods_total_price in", values, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotIn(List<Float> values) {
            addCriterion("goods_total_price not in", values, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceBetween(Float value1, Float value2) {
            addCriterion("goods_total_price between", value1, value2, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotBetween(Float value1, Float value2) {
            addCriterion("goods_total_price not between", value1, value2, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIsNull() {
            addCriterion("goods_total_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIsNotNull() {
            addCriterion("goods_total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightEqualTo(Float value) {
            addCriterion("goods_total_weight =", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotEqualTo(Float value) {
            addCriterion("goods_total_weight <>", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightGreaterThan(Float value) {
            addCriterion("goods_total_weight >", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_total_weight >=", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightLessThan(Float value) {
            addCriterion("goods_total_weight <", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightLessThanOrEqualTo(Float value) {
            addCriterion("goods_total_weight <=", value, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightIn(List<Float> values) {
            addCriterion("goods_total_weight in", values, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotIn(List<Float> values) {
            addCriterion("goods_total_weight not in", values, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightBetween(Float value1, Float value2) {
            addCriterion("goods_total_weight between", value1, value2, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalWeightNotBetween(Float value1, Float value2) {
            addCriterion("goods_total_weight not between", value1, value2, "goodsTotalWeight");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerIsNull() {
            addCriterion("outer_customer is null");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerIsNotNull() {
            addCriterion("outer_customer is not null");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerEqualTo(String value) {
            addCriterion("outer_customer =", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerNotEqualTo(String value) {
            addCriterion("outer_customer <>", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerGreaterThan(String value) {
            addCriterion("outer_customer >", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("outer_customer >=", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerLessThan(String value) {
            addCriterion("outer_customer <", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerLessThanOrEqualTo(String value) {
            addCriterion("outer_customer <=", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerLike(String value) {
            addCriterion("outer_customer like", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerNotLike(String value) {
            addCriterion("outer_customer not like", value, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerIn(List<String> values) {
            addCriterion("outer_customer in", values, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerNotIn(List<String> values) {
            addCriterion("outer_customer not in", values, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerBetween(String value1, String value2) {
            addCriterion("outer_customer between", value1, value2, "outerCustomer");
            return (Criteria) this;
        }

        public Criteria andOuterCustomerNotBetween(String value1, String value2) {
            addCriterion("outer_customer not between", value1, value2, "outerCustomer");
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

        public Criteria andOuterOutletIdIsNull() {
            addCriterion("outer_outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdIsNotNull() {
            addCriterion("outer_outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdEqualTo(String value) {
            addCriterion("outer_outlet_id =", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdNotEqualTo(String value) {
            addCriterion("outer_outlet_id <>", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdGreaterThan(String value) {
            addCriterion("outer_outlet_id >", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_outlet_id >=", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdLessThan(String value) {
            addCriterion("outer_outlet_id <", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdLessThanOrEqualTo(String value) {
            addCriterion("outer_outlet_id <=", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdLike(String value) {
            addCriterion("outer_outlet_id like", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdNotLike(String value) {
            addCriterion("outer_outlet_id not like", value, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdIn(List<String> values) {
            addCriterion("outer_outlet_id in", values, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdNotIn(List<String> values) {
            addCriterion("outer_outlet_id not in", values, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdBetween(String value1, String value2) {
            addCriterion("outer_outlet_id between", value1, value2, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterOutletIdNotBetween(String value1, String value2) {
            addCriterion("outer_outlet_id not between", value1, value2, "outerOutletId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdIsNull() {
            addCriterion("outer_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdIsNotNull() {
            addCriterion("outer_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdEqualTo(String value) {
            addCriterion("outer_wh_id =", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdNotEqualTo(String value) {
            addCriterion("outer_wh_id <>", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdGreaterThan(String value) {
            addCriterion("outer_wh_id >", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_wh_id >=", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdLessThan(String value) {
            addCriterion("outer_wh_id <", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdLessThanOrEqualTo(String value) {
            addCriterion("outer_wh_id <=", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdLike(String value) {
            addCriterion("outer_wh_id like", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdNotLike(String value) {
            addCriterion("outer_wh_id not like", value, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdIn(List<String> values) {
            addCriterion("outer_wh_id in", values, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdNotIn(List<String> values) {
            addCriterion("outer_wh_id not in", values, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdBetween(String value1, String value2) {
            addCriterion("outer_wh_id between", value1, value2, "outerWhId");
            return (Criteria) this;
        }

        public Criteria andOuterWhIdNotBetween(String value1, String value2) {
            addCriterion("outer_wh_id not between", value1, value2, "outerWhId");
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