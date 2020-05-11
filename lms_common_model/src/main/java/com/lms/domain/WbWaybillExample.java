package com.lms.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WbWaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WbWaybillExample() {
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

        public Criteria andWaybIdIsNull() {
            addCriterion("wayb_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybIdIsNotNull() {
            addCriterion("wayb_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybIdEqualTo(String value) {
            addCriterion("wayb_id =", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdNotEqualTo(String value) {
            addCriterion("wayb_id <>", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdGreaterThan(String value) {
            addCriterion("wayb_id >", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdGreaterThanOrEqualTo(String value) {
            addCriterion("wayb_id >=", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdLessThan(String value) {
            addCriterion("wayb_id <", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdLessThanOrEqualTo(String value) {
            addCriterion("wayb_id <=", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdLike(String value) {
            addCriterion("wayb_id like", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdNotLike(String value) {
            addCriterion("wayb_id not like", value, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdIn(List<String> values) {
            addCriterion("wayb_id in", values, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdNotIn(List<String> values) {
            addCriterion("wayb_id not in", values, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdBetween(String value1, String value2) {
            addCriterion("wayb_id between", value1, value2, "waybId");
            return (Criteria) this;
        }

        public Criteria andWaybIdNotBetween(String value1, String value2) {
            addCriterion("wayb_id not between", value1, value2, "waybId");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIsNull() {
            addCriterion("transport_time is null");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIsNotNull() {
            addCriterion("transport_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTimeEqualTo(Date value) {
            addCriterion("transport_time =", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotEqualTo(Date value) {
            addCriterion("transport_time <>", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeGreaterThan(Date value) {
            addCriterion("transport_time >", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transport_time >=", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeLessThan(Date value) {
            addCriterion("transport_time <", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeLessThanOrEqualTo(Date value) {
            addCriterion("transport_time <=", value, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeIn(List<Date> values) {
            addCriterion("transport_time in", values, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotIn(List<Date> values) {
            addCriterion("transport_time not in", values, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeBetween(Date value1, Date value2) {
            addCriterion("transport_time between", value1, value2, "transportTime");
            return (Criteria) this;
        }

        public Criteria andTransportTimeNotBetween(Date value1, Date value2) {
            addCriterion("transport_time not between", value1, value2, "transportTime");
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

        public Criteria andSenderPostcodeIsNull() {
            addCriterion("sender_postcode is null");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeIsNotNull() {
            addCriterion("sender_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeEqualTo(String value) {
            addCriterion("sender_postcode =", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotEqualTo(String value) {
            addCriterion("sender_postcode <>", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeGreaterThan(String value) {
            addCriterion("sender_postcode >", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sender_postcode >=", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLessThan(String value) {
            addCriterion("sender_postcode <", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLessThanOrEqualTo(String value) {
            addCriterion("sender_postcode <=", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeLike(String value) {
            addCriterion("sender_postcode like", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotLike(String value) {
            addCriterion("sender_postcode not like", value, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeIn(List<String> values) {
            addCriterion("sender_postcode in", values, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotIn(List<String> values) {
            addCriterion("sender_postcode not in", values, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeBetween(String value1, String value2) {
            addCriterion("sender_postcode between", value1, value2, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderPostcodeNotBetween(String value1, String value2) {
            addCriterion("sender_postcode not between", value1, value2, "senderPostcode");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityIsNull() {
            addCriterion("sender_identity is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityIsNotNull() {
            addCriterion("sender_identity is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityEqualTo(String value) {
            addCriterion("sender_identity =", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityNotEqualTo(String value) {
            addCriterion("sender_identity <>", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityGreaterThan(String value) {
            addCriterion("sender_identity >", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("sender_identity >=", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityLessThan(String value) {
            addCriterion("sender_identity <", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityLessThanOrEqualTo(String value) {
            addCriterion("sender_identity <=", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityLike(String value) {
            addCriterion("sender_identity like", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityNotLike(String value) {
            addCriterion("sender_identity not like", value, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityIn(List<String> values) {
            addCriterion("sender_identity in", values, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityNotIn(List<String> values) {
            addCriterion("sender_identity not in", values, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityBetween(String value1, String value2) {
            addCriterion("sender_identity between", value1, value2, "senderIdentity");
            return (Criteria) this;
        }

        public Criteria andSenderIdentityNotBetween(String value1, String value2) {
            addCriterion("sender_identity not between", value1, value2, "senderIdentity");
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

        public Criteria andRecePostcodeIsNull() {
            addCriterion("rece_postcode is null");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeIsNotNull() {
            addCriterion("rece_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeEqualTo(String value) {
            addCriterion("rece_postcode =", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeNotEqualTo(String value) {
            addCriterion("rece_postcode <>", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeGreaterThan(String value) {
            addCriterion("rece_postcode >", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("rece_postcode >=", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeLessThan(String value) {
            addCriterion("rece_postcode <", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeLessThanOrEqualTo(String value) {
            addCriterion("rece_postcode <=", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeLike(String value) {
            addCriterion("rece_postcode like", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeNotLike(String value) {
            addCriterion("rece_postcode not like", value, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeIn(List<String> values) {
            addCriterion("rece_postcode in", values, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeNotIn(List<String> values) {
            addCriterion("rece_postcode not in", values, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeBetween(String value1, String value2) {
            addCriterion("rece_postcode between", value1, value2, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andRecePostcodeNotBetween(String value1, String value2) {
            addCriterion("rece_postcode not between", value1, value2, "recePostcode");
            return (Criteria) this;
        }

        public Criteria andReceIdentityIsNull() {
            addCriterion("rece_identity is null");
            return (Criteria) this;
        }

        public Criteria andReceIdentityIsNotNull() {
            addCriterion("rece_identity is not null");
            return (Criteria) this;
        }

        public Criteria andReceIdentityEqualTo(String value) {
            addCriterion("rece_identity =", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityNotEqualTo(String value) {
            addCriterion("rece_identity <>", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityGreaterThan(String value) {
            addCriterion("rece_identity >", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("rece_identity >=", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityLessThan(String value) {
            addCriterion("rece_identity <", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityLessThanOrEqualTo(String value) {
            addCriterion("rece_identity <=", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityLike(String value) {
            addCriterion("rece_identity like", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityNotLike(String value) {
            addCriterion("rece_identity not like", value, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityIn(List<String> values) {
            addCriterion("rece_identity in", values, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityNotIn(List<String> values) {
            addCriterion("rece_identity not in", values, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityBetween(String value1, String value2) {
            addCriterion("rece_identity between", value1, value2, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceIdentityNotBetween(String value1, String value2) {
            addCriterion("rece_identity not between", value1, value2, "receIdentity");
            return (Criteria) this;
        }

        public Criteria andReceAreaIsNull() {
            addCriterion("rece_area is null");
            return (Criteria) this;
        }

        public Criteria andReceAreaIsNotNull() {
            addCriterion("rece_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceAreaEqualTo(String value) {
            addCriterion("rece_area =", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaNotEqualTo(String value) {
            addCriterion("rece_area <>", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaGreaterThan(String value) {
            addCriterion("rece_area >", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("rece_area >=", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaLessThan(String value) {
            addCriterion("rece_area <", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaLessThanOrEqualTo(String value) {
            addCriterion("rece_area <=", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaLike(String value) {
            addCriterion("rece_area like", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaNotLike(String value) {
            addCriterion("rece_area not like", value, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaIn(List<String> values) {
            addCriterion("rece_area in", values, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaNotIn(List<String> values) {
            addCriterion("rece_area not in", values, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaBetween(String value1, String value2) {
            addCriterion("rece_area between", value1, value2, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAreaNotBetween(String value1, String value2) {
            addCriterion("rece_area not between", value1, value2, "receArea");
            return (Criteria) this;
        }

        public Criteria andReceAddressIsNull() {
            addCriterion("rece_address is null");
            return (Criteria) this;
        }

        public Criteria andReceAddressIsNotNull() {
            addCriterion("rece_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceAddressEqualTo(String value) {
            addCriterion("rece_address =", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotEqualTo(String value) {
            addCriterion("rece_address <>", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressGreaterThan(String value) {
            addCriterion("rece_address >", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("rece_address >=", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLessThan(String value) {
            addCriterion("rece_address <", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLessThanOrEqualTo(String value) {
            addCriterion("rece_address <=", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLike(String value) {
            addCriterion("rece_address like", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotLike(String value) {
            addCriterion("rece_address not like", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressIn(List<String> values) {
            addCriterion("rece_address in", values, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotIn(List<String> values) {
            addCriterion("rece_address not in", values, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressBetween(String value1, String value2) {
            addCriterion("rece_address between", value1, value2, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotBetween(String value1, String value2) {
            addCriterion("rece_address not between", value1, value2, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceMobileIsNull() {
            addCriterion("rece_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceMobileIsNotNull() {
            addCriterion("rece_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceMobileEqualTo(String value) {
            addCriterion("rece_mobile =", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileNotEqualTo(String value) {
            addCriterion("rece_mobile <>", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileGreaterThan(String value) {
            addCriterion("rece_mobile >", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileGreaterThanOrEqualTo(String value) {
            addCriterion("rece_mobile >=", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileLessThan(String value) {
            addCriterion("rece_mobile <", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileLessThanOrEqualTo(String value) {
            addCriterion("rece_mobile <=", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileLike(String value) {
            addCriterion("rece_mobile like", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileNotLike(String value) {
            addCriterion("rece_mobile not like", value, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileIn(List<String> values) {
            addCriterion("rece_mobile in", values, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileNotIn(List<String> values) {
            addCriterion("rece_mobile not in", values, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileBetween(String value1, String value2) {
            addCriterion("rece_mobile between", value1, value2, "receMobile");
            return (Criteria) this;
        }

        public Criteria andReceMobileNotBetween(String value1, String value2) {
            addCriterion("rece_mobile not between", value1, value2, "receMobile");
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

        public Criteria andGoodsTotalPriceIsNull() {
            addCriterion("goods_total_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceIsNotNull() {
            addCriterion("goods_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceEqualTo(BigDecimal value) {
            addCriterion("goods_total_price =", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_total_price <>", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_total_price >", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_total_price >=", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceLessThan(BigDecimal value) {
            addCriterion("goods_total_price <", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_total_price <=", value, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceIn(List<BigDecimal> values) {
            addCriterion("goods_total_price in", values, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_total_price not in", values, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_total_price between", value1, value2, "goodsTotalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_total_price not between", value1, value2, "goodsTotalPrice");
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

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(String value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(String value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(String value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(String value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(String value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(String value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLike(String value) {
            addCriterion("receipt like", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotLike(String value) {
            addCriterion("receipt not like", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<String> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<String> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(String value1, String value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(String value1, String value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
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

        public Criteria andSignforStatusIsNull() {
            addCriterion("signfor_status is null");
            return (Criteria) this;
        }

        public Criteria andSignforStatusIsNotNull() {
            addCriterion("signfor_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignforStatusEqualTo(String value) {
            addCriterion("signfor_status =", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusNotEqualTo(String value) {
            addCriterion("signfor_status <>", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusGreaterThan(String value) {
            addCriterion("signfor_status >", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusGreaterThanOrEqualTo(String value) {
            addCriterion("signfor_status >=", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusLessThan(String value) {
            addCriterion("signfor_status <", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusLessThanOrEqualTo(String value) {
            addCriterion("signfor_status <=", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusLike(String value) {
            addCriterion("signfor_status like", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusNotLike(String value) {
            addCriterion("signfor_status not like", value, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusIn(List<String> values) {
            addCriterion("signfor_status in", values, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusNotIn(List<String> values) {
            addCriterion("signfor_status not in", values, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusBetween(String value1, String value2) {
            addCriterion("signfor_status between", value1, value2, "signforStatus");
            return (Criteria) this;
        }

        public Criteria andSignforStatusNotBetween(String value1, String value2) {
            addCriterion("signfor_status not between", value1, value2, "signforStatus");
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