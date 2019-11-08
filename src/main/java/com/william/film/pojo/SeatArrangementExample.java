package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeatArrangementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatArrangementExample() {
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

        public Criteria andSeatArrangementIdIsNull() {
            addCriterion("Seat_Arrangement_Id is null");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdIsNotNull() {
            addCriterion("Seat_Arrangement_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdEqualTo(Integer value) {
            addCriterion("Seat_Arrangement_Id =", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdNotEqualTo(Integer value) {
            addCriterion("Seat_Arrangement_Id <>", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdGreaterThan(Integer value) {
            addCriterion("Seat_Arrangement_Id >", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Arrangement_Id >=", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdLessThan(Integer value) {
            addCriterion("Seat_Arrangement_Id <", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Arrangement_Id <=", value, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdIn(List<Integer> values) {
            addCriterion("Seat_Arrangement_Id in", values, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdNotIn(List<Integer> values) {
            addCriterion("Seat_Arrangement_Id not in", values, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Arrangement_Id between", value1, value2, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatArrangementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Arrangement_Id not between", value1, value2, "seatArrangementId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("Seat_Id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("Seat_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("Seat_Id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("Seat_Id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("Seat_Id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("Seat_Id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("Seat_Id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("Seat_Id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Id not between", value1, value2, "seatId");
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("Customer_Id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("Customer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("Customer_Id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("Customer_Id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("Customer_Id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_Id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("Customer_Id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_Id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("Customer_Id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("Customer_Id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andSeatStateIsNull() {
            addCriterion("Seat_State is null");
            return (Criteria) this;
        }

        public Criteria andSeatStateIsNotNull() {
            addCriterion("Seat_State is not null");
            return (Criteria) this;
        }

        public Criteria andSeatStateEqualTo(Integer value) {
            addCriterion("Seat_State =", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotEqualTo(Integer value) {
            addCriterion("Seat_State <>", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateGreaterThan(Integer value) {
            addCriterion("Seat_State >", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_State >=", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateLessThan(Integer value) {
            addCriterion("Seat_State <", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_State <=", value, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateIn(List<Integer> values) {
            addCriterion("Seat_State in", values, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotIn(List<Integer> values) {
            addCriterion("Seat_State not in", values, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateBetween(Integer value1, Integer value2) {
            addCriterion("Seat_State between", value1, value2, "seatState");
            return (Criteria) this;
        }

        public Criteria andSeatStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_State not between", value1, value2, "seatState");
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