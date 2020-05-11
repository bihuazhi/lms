package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaInterWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaInterWarehouseExample() {
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

        public Criteria andInterCodeIsNull() {
            addCriterion("inter_code is null");
            return (Criteria) this;
        }

        public Criteria andInterCodeIsNotNull() {
            addCriterion("inter_code is not null");
            return (Criteria) this;
        }

        public Criteria andInterCodeEqualTo(String value) {
            addCriterion("inter_code =", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotEqualTo(String value) {
            addCriterion("inter_code <>", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeGreaterThan(String value) {
            addCriterion("inter_code >", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inter_code >=", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLessThan(String value) {
            addCriterion("inter_code <", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLessThanOrEqualTo(String value) {
            addCriterion("inter_code <=", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeLike(String value) {
            addCriterion("inter_code like", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotLike(String value) {
            addCriterion("inter_code not like", value, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeIn(List<String> values) {
            addCriterion("inter_code in", values, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotIn(List<String> values) {
            addCriterion("inter_code not in", values, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeBetween(String value1, String value2) {
            addCriterion("inter_code between", value1, value2, "interCode");
            return (Criteria) this;
        }

        public Criteria andInterCodeNotBetween(String value1, String value2) {
            addCriterion("inter_code not between", value1, value2, "interCode");
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

        public Criteria andInterCustomerIsNull() {
            addCriterion("inter_customer is null");
            return (Criteria) this;
        }

        public Criteria andInterCustomerIsNotNull() {
            addCriterion("inter_customer is not null");
            return (Criteria) this;
        }

        public Criteria andInterCustomerEqualTo(String value) {
            addCriterion("inter_customer =", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerNotEqualTo(String value) {
            addCriterion("inter_customer <>", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerGreaterThan(String value) {
            addCriterion("inter_customer >", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("inter_customer >=", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerLessThan(String value) {
            addCriterion("inter_customer <", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerLessThanOrEqualTo(String value) {
            addCriterion("inter_customer <=", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerLike(String value) {
            addCriterion("inter_customer like", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerNotLike(String value) {
            addCriterion("inter_customer not like", value, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerIn(List<String> values) {
            addCriterion("inter_customer in", values, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerNotIn(List<String> values) {
            addCriterion("inter_customer not in", values, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerBetween(String value1, String value2) {
            addCriterion("inter_customer between", value1, value2, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterCustomerNotBetween(String value1, String value2) {
            addCriterion("inter_customer not between", value1, value2, "interCustomer");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdIsNull() {
            addCriterion("inter_outlet_id is null");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdIsNotNull() {
            addCriterion("inter_outlet_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdEqualTo(String value) {
            addCriterion("inter_outlet_id =", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdNotEqualTo(String value) {
            addCriterion("inter_outlet_id <>", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdGreaterThan(String value) {
            addCriterion("inter_outlet_id >", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdGreaterThanOrEqualTo(String value) {
            addCriterion("inter_outlet_id >=", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdLessThan(String value) {
            addCriterion("inter_outlet_id <", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdLessThanOrEqualTo(String value) {
            addCriterion("inter_outlet_id <=", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdLike(String value) {
            addCriterion("inter_outlet_id like", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdNotLike(String value) {
            addCriterion("inter_outlet_id not like", value, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdIn(List<String> values) {
            addCriterion("inter_outlet_id in", values, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdNotIn(List<String> values) {
            addCriterion("inter_outlet_id not in", values, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdBetween(String value1, String value2) {
            addCriterion("inter_outlet_id between", value1, value2, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterOutletIdNotBetween(String value1, String value2) {
            addCriterion("inter_outlet_id not between", value1, value2, "interOutletId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdIsNull() {
            addCriterion("inter_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andInterWhIdIsNotNull() {
            addCriterion("inter_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterWhIdEqualTo(String value) {
            addCriterion("inter_wh_id =", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdNotEqualTo(String value) {
            addCriterion("inter_wh_id <>", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdGreaterThan(String value) {
            addCriterion("inter_wh_id >", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("inter_wh_id >=", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdLessThan(String value) {
            addCriterion("inter_wh_id <", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdLessThanOrEqualTo(String value) {
            addCriterion("inter_wh_id <=", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdLike(String value) {
            addCriterion("inter_wh_id like", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdNotLike(String value) {
            addCriterion("inter_wh_id not like", value, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdIn(List<String> values) {
            addCriterion("inter_wh_id in", values, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdNotIn(List<String> values) {
            addCriterion("inter_wh_id not in", values, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdBetween(String value1, String value2) {
            addCriterion("inter_wh_id between", value1, value2, "interWhId");
            return (Criteria) this;
        }

        public Criteria andInterWhIdNotBetween(String value1, String value2) {
            addCriterion("inter_wh_id not between", value1, value2, "interWhId");
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