package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("Order_Detail_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("Order_Detail_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(Integer value) {
            addCriterion("Order_Detail_Id =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("Order_Detail_Id <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(Integer value) {
            addCriterion("Order_Detail_Id >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Detail_Id >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(Integer value) {
            addCriterion("Order_Detail_Id <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Detail_Id <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<Integer> values) {
            addCriterion("Order_Detail_Id in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("Order_Detail_Id not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("Order_Detail_Id between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Detail_Id not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("Order_Id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("Order_Id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("Order_Id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("Order_Id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("Order_Id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("Order_Id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNull() {
            addCriterion("Schedule_Id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("Schedule_Id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("Schedule_Id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("Schedule_Id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("Schedule_Id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("Schedule_Id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("Schedule_Id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("Schedule_Id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceIsNull() {
            addCriterion("Order_Detail_AdjustedPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceIsNotNull() {
            addCriterion("Order_Detail_AdjustedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceEqualTo(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice =", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceNotEqualTo(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice <>", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceGreaterThan(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice >", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice >=", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceLessThan(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice <", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceLessThanOrEqualTo(Integer value) {
            addCriterion("Order_Detail_AdjustedPrice <=", value, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceIn(List<Integer> values) {
            addCriterion("Order_Detail_AdjustedPrice in", values, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceNotIn(List<Integer> values) {
            addCriterion("Order_Detail_AdjustedPrice not in", values, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceBetween(Integer value1, Integer value2) {
            addCriterion("Order_Detail_AdjustedPrice between", value1, value2, "orderDetailAdjustedprice");
            return (Criteria) this;
        }

        public Criteria andOrderDetailAdjustedpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("Order_Detail_AdjustedPrice not between", value1, value2, "orderDetailAdjustedprice");
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