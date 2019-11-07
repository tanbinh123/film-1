package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andTheaterIdIsNull() {
            addCriterion("Theater_id is null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIsNotNull() {
            addCriterion("Theater_id is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdEqualTo(Integer value) {
            addCriterion("Theater_id =", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotEqualTo(Integer value) {
            addCriterion("Theater_id <>", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThan(Integer value) {
            addCriterion("Theater_id >", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Theater_id >=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThan(Integer value) {
            addCriterion("Theater_id <", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("Theater_id <=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIn(List<Integer> values) {
            addCriterion("Theater_id in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotIn(List<Integer> values) {
            addCriterion("Theater_id not in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdBetween(Integer value1, Integer value2) {
            addCriterion("Theater_id between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Theater_id not between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andHallIdIsNull() {
            addCriterion("Hall_Id is null");
            return (Criteria) this;
        }

        public Criteria andHallIdIsNotNull() {
            addCriterion("Hall_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHallIdEqualTo(Integer value) {
            addCriterion("Hall_Id =", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdNotEqualTo(Integer value) {
            addCriterion("Hall_Id <>", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdGreaterThan(Integer value) {
            addCriterion("Hall_Id >", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Hall_Id >=", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdLessThan(Integer value) {
            addCriterion("Hall_Id <", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdLessThanOrEqualTo(Integer value) {
            addCriterion("Hall_Id <=", value, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdIn(List<Integer> values) {
            addCriterion("Hall_Id in", values, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdNotIn(List<Integer> values) {
            addCriterion("Hall_Id not in", values, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdBetween(Integer value1, Integer value2) {
            addCriterion("Hall_Id between", value1, value2, "hallId");
            return (Criteria) this;
        }

        public Criteria andHallIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Hall_Id not between", value1, value2, "hallId");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNull() {
            addCriterion("Seat_Row is null");
            return (Criteria) this;
        }

        public Criteria andSeatRowIsNotNull() {
            addCriterion("Seat_Row is not null");
            return (Criteria) this;
        }

        public Criteria andSeatRowEqualTo(Integer value) {
            addCriterion("Seat_Row =", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotEqualTo(Integer value) {
            addCriterion("Seat_Row <>", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThan(Integer value) {
            addCriterion("Seat_Row >", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Row >=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThan(Integer value) {
            addCriterion("Seat_Row <", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Row <=", value, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowIn(List<Integer> values) {
            addCriterion("Seat_Row in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotIn(List<Integer> values) {
            addCriterion("Seat_Row not in", values, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Row between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatRowNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Row not between", value1, value2, "seatRow");
            return (Criteria) this;
        }

        public Criteria andSeatColIsNull() {
            addCriterion("Seat_Col is null");
            return (Criteria) this;
        }

        public Criteria andSeatColIsNotNull() {
            addCriterion("Seat_Col is not null");
            return (Criteria) this;
        }

        public Criteria andSeatColEqualTo(Integer value) {
            addCriterion("Seat_Col =", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotEqualTo(Integer value) {
            addCriterion("Seat_Col <>", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColGreaterThan(Integer value) {
            addCriterion("Seat_Col >", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Col >=", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColLessThan(Integer value) {
            addCriterion("Seat_Col <", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Col <=", value, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColIn(List<Integer> values) {
            addCriterion("Seat_Col in", values, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotIn(List<Integer> values) {
            addCriterion("Seat_Col not in", values, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Col between", value1, value2, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatColNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Col not between", value1, value2, "seatCol");
            return (Criteria) this;
        }

        public Criteria andSeatExistIsNull() {
            addCriterion("Seat_Exist is null");
            return (Criteria) this;
        }

        public Criteria andSeatExistIsNotNull() {
            addCriterion("Seat_Exist is not null");
            return (Criteria) this;
        }

        public Criteria andSeatExistEqualTo(Integer value) {
            addCriterion("Seat_Exist =", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistNotEqualTo(Integer value) {
            addCriterion("Seat_Exist <>", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistGreaterThan(Integer value) {
            addCriterion("Seat_Exist >", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Exist >=", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistLessThan(Integer value) {
            addCriterion("Seat_Exist <", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Exist <=", value, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistIn(List<Integer> values) {
            addCriterion("Seat_Exist in", values, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistNotIn(List<Integer> values) {
            addCriterion("Seat_Exist not in", values, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Exist between", value1, value2, "seatExist");
            return (Criteria) this;
        }

        public Criteria andSeatExistNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Exist not between", value1, value2, "seatExist");
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

        public Criteria andSeatLevelIsNull() {
            addCriterion("Seat_Level is null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIsNotNull() {
            addCriterion("Seat_Level is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelEqualTo(Integer value) {
            addCriterion("Seat_Level =", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotEqualTo(Integer value) {
            addCriterion("Seat_Level <>", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThan(Integer value) {
            addCriterion("Seat_Level >", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seat_Level >=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThan(Integer value) {
            addCriterion("Seat_Level <", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Seat_Level <=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIn(List<Integer> values) {
            addCriterion("Seat_Level in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotIn(List<Integer> values) {
            addCriterion("Seat_Level not in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Level between", value1, value2, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Seat_Level not between", value1, value2, "seatLevel");
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