package com.lms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeScanningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeScanningExample() {
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

        public Criteria andScanCodeIsNull() {
            addCriterion("scan_code is null");
            return (Criteria) this;
        }

        public Criteria andScanCodeIsNotNull() {
            addCriterion("scan_code is not null");
            return (Criteria) this;
        }

        public Criteria andScanCodeEqualTo(String value) {
            addCriterion("scan_code =", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeNotEqualTo(String value) {
            addCriterion("scan_code <>", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeGreaterThan(String value) {
            addCriterion("scan_code >", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scan_code >=", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeLessThan(String value) {
            addCriterion("scan_code <", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeLessThanOrEqualTo(String value) {
            addCriterion("scan_code <=", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeLike(String value) {
            addCriterion("scan_code like", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeNotLike(String value) {
            addCriterion("scan_code not like", value, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeIn(List<String> values) {
            addCriterion("scan_code in", values, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeNotIn(List<String> values) {
            addCriterion("scan_code not in", values, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeBetween(String value1, String value2) {
            addCriterion("scan_code between", value1, value2, "scanCode");
            return (Criteria) this;
        }

        public Criteria andScanCodeNotBetween(String value1, String value2) {
            addCriterion("scan_code not between", value1, value2, "scanCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeIsNull() {
            addCriterion("wayb_code is null");
            return (Criteria) this;
        }

        public Criteria andWaybCodeIsNotNull() {
            addCriterion("wayb_code is not null");
            return (Criteria) this;
        }

        public Criteria andWaybCodeEqualTo(String value) {
            addCriterion("wayb_code =", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeNotEqualTo(String value) {
            addCriterion("wayb_code <>", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeGreaterThan(String value) {
            addCriterion("wayb_code >", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wayb_code >=", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeLessThan(String value) {
            addCriterion("wayb_code <", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeLessThanOrEqualTo(String value) {
            addCriterion("wayb_code <=", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeLike(String value) {
            addCriterion("wayb_code like", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeNotLike(String value) {
            addCriterion("wayb_code not like", value, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeIn(List<String> values) {
            addCriterion("wayb_code in", values, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeNotIn(List<String> values) {
            addCriterion("wayb_code not in", values, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeBetween(String value1, String value2) {
            addCriterion("wayb_code between", value1, value2, "waybCode");
            return (Criteria) this;
        }

        public Criteria andWaybCodeNotBetween(String value1, String value2) {
            addCriterion("wayb_code not between", value1, value2, "waybCode");
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

        public Criteria andScanTypeIsNull() {
            addCriterion("scan_type is null");
            return (Criteria) this;
        }

        public Criteria andScanTypeIsNotNull() {
            addCriterion("scan_type is not null");
            return (Criteria) this;
        }

        public Criteria andScanTypeEqualTo(String value) {
            addCriterion("scan_type =", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeNotEqualTo(String value) {
            addCriterion("scan_type <>", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeGreaterThan(String value) {
            addCriterion("scan_type >", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scan_type >=", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeLessThan(String value) {
            addCriterion("scan_type <", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeLessThanOrEqualTo(String value) {
            addCriterion("scan_type <=", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeLike(String value) {
            addCriterion("scan_type like", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeNotLike(String value) {
            addCriterion("scan_type not like", value, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeIn(List<String> values) {
            addCriterion("scan_type in", values, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeNotIn(List<String> values) {
            addCriterion("scan_type not in", values, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeBetween(String value1, String value2) {
            addCriterion("scan_type between", value1, value2, "scanType");
            return (Criteria) this;
        }

        public Criteria andScanTypeNotBetween(String value1, String value2) {
            addCriterion("scan_type not between", value1, value2, "scanType");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
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

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andFleetIsNull() {
            addCriterion("fleet is null");
            return (Criteria) this;
        }

        public Criteria andFleetIsNotNull() {
            addCriterion("fleet is not null");
            return (Criteria) this;
        }

        public Criteria andFleetEqualTo(String value) {
            addCriterion("fleet =", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotEqualTo(String value) {
            addCriterion("fleet <>", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThan(String value) {
            addCriterion("fleet >", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThanOrEqualTo(String value) {
            addCriterion("fleet >=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThan(String value) {
            addCriterion("fleet <", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThanOrEqualTo(String value) {
            addCriterion("fleet <=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLike(String value) {
            addCriterion("fleet like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotLike(String value) {
            addCriterion("fleet not like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetIn(List<String> values) {
            addCriterion("fleet in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotIn(List<String> values) {
            addCriterion("fleet not in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetBetween(String value1, String value2) {
            addCriterion("fleet between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotBetween(String value1, String value2) {
            addCriterion("fleet not between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andNextOutletIsNull() {
            addCriterion("next_outlet is null");
            return (Criteria) this;
        }

        public Criteria andNextOutletIsNotNull() {
            addCriterion("next_outlet is not null");
            return (Criteria) this;
        }

        public Criteria andNextOutletEqualTo(String value) {
            addCriterion("next_outlet =", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletNotEqualTo(String value) {
            addCriterion("next_outlet <>", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletGreaterThan(String value) {
            addCriterion("next_outlet >", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletGreaterThanOrEqualTo(String value) {
            addCriterion("next_outlet >=", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletLessThan(String value) {
            addCriterion("next_outlet <", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletLessThanOrEqualTo(String value) {
            addCriterion("next_outlet <=", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletLike(String value) {
            addCriterion("next_outlet like", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletNotLike(String value) {
            addCriterion("next_outlet not like", value, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletIn(List<String> values) {
            addCriterion("next_outlet in", values, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletNotIn(List<String> values) {
            addCriterion("next_outlet not in", values, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletBetween(String value1, String value2) {
            addCriterion("next_outlet between", value1, value2, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNextOutletNotBetween(String value1, String value2) {
            addCriterion("next_outlet not between", value1, value2, "nextOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletIsNull() {
            addCriterion("now_outlet is null");
            return (Criteria) this;
        }

        public Criteria andNowOutletIsNotNull() {
            addCriterion("now_outlet is not null");
            return (Criteria) this;
        }

        public Criteria andNowOutletEqualTo(String value) {
            addCriterion("now_outlet =", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletNotEqualTo(String value) {
            addCriterion("now_outlet <>", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletGreaterThan(String value) {
            addCriterion("now_outlet >", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletGreaterThanOrEqualTo(String value) {
            addCriterion("now_outlet >=", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletLessThan(String value) {
            addCriterion("now_outlet <", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletLessThanOrEqualTo(String value) {
            addCriterion("now_outlet <=", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletLike(String value) {
            addCriterion("now_outlet like", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletNotLike(String value) {
            addCriterion("now_outlet not like", value, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletIn(List<String> values) {
            addCriterion("now_outlet in", values, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletNotIn(List<String> values) {
            addCriterion("now_outlet not in", values, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletBetween(String value1, String value2) {
            addCriterion("now_outlet between", value1, value2, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andNowOutletNotBetween(String value1, String value2) {
            addCriterion("now_outlet not between", value1, value2, "nowOutlet");
            return (Criteria) this;
        }

        public Criteria andSignforTimeIsNull() {
            addCriterion("signfor_time is null");
            return (Criteria) this;
        }

        public Criteria andSignforTimeIsNotNull() {
            addCriterion("signfor_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignforTimeEqualTo(Date value) {
            addCriterion("signfor_time =", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeNotEqualTo(Date value) {
            addCriterion("signfor_time <>", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeGreaterThan(Date value) {
            addCriterion("signfor_time >", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signfor_time >=", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeLessThan(Date value) {
            addCriterion("signfor_time <", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeLessThanOrEqualTo(Date value) {
            addCriterion("signfor_time <=", value, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeIn(List<Date> values) {
            addCriterion("signfor_time in", values, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeNotIn(List<Date> values) {
            addCriterion("signfor_time not in", values, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeBetween(Date value1, Date value2) {
            addCriterion("signfor_time between", value1, value2, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforTimeNotBetween(Date value1, Date value2) {
            addCriterion("signfor_time not between", value1, value2, "signforTime");
            return (Criteria) this;
        }

        public Criteria andSignforIconIsNull() {
            addCriterion("signfor_icon is null");
            return (Criteria) this;
        }

        public Criteria andSignforIconIsNotNull() {
            addCriterion("signfor_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSignforIconEqualTo(String value) {
            addCriterion("signfor_icon =", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconNotEqualTo(String value) {
            addCriterion("signfor_icon <>", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconGreaterThan(String value) {
            addCriterion("signfor_icon >", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconGreaterThanOrEqualTo(String value) {
            addCriterion("signfor_icon >=", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconLessThan(String value) {
            addCriterion("signfor_icon <", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconLessThanOrEqualTo(String value) {
            addCriterion("signfor_icon <=", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconLike(String value) {
            addCriterion("signfor_icon like", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconNotLike(String value) {
            addCriterion("signfor_icon not like", value, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconIn(List<String> values) {
            addCriterion("signfor_icon in", values, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconNotIn(List<String> values) {
            addCriterion("signfor_icon not in", values, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconBetween(String value1, String value2) {
            addCriterion("signfor_icon between", value1, value2, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforIconNotBetween(String value1, String value2) {
            addCriterion("signfor_icon not between", value1, value2, "signforIcon");
            return (Criteria) this;
        }

        public Criteria andSignforMobileIsNull() {
            addCriterion("signfor_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSignforMobileIsNotNull() {
            addCriterion("signfor_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSignforMobileEqualTo(String value) {
            addCriterion("signfor_mobile =", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileNotEqualTo(String value) {
            addCriterion("signfor_mobile <>", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileGreaterThan(String value) {
            addCriterion("signfor_mobile >", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileGreaterThanOrEqualTo(String value) {
            addCriterion("signfor_mobile >=", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileLessThan(String value) {
            addCriterion("signfor_mobile <", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileLessThanOrEqualTo(String value) {
            addCriterion("signfor_mobile <=", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileLike(String value) {
            addCriterion("signfor_mobile like", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileNotLike(String value) {
            addCriterion("signfor_mobile not like", value, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileIn(List<String> values) {
            addCriterion("signfor_mobile in", values, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileNotIn(List<String> values) {
            addCriterion("signfor_mobile not in", values, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileBetween(String value1, String value2) {
            addCriterion("signfor_mobile between", value1, value2, "signforMobile");
            return (Criteria) this;
        }

        public Criteria andSignforMobileNotBetween(String value1, String value2) {
            addCriterion("signfor_mobile not between", value1, value2, "signforMobile");
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