package com.william.film.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMovieIdIsNull() {
            addCriterion("Movie_Id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("Movie_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("Movie_Id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("Movie_Id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("Movie_Id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Movie_Id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("Movie_Id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("Movie_Id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("Movie_Id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("Movie_Id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Id not between", value1, value2, "movieId");
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

        public Criteria andBroadcastTypeIsNull() {
            addCriterion("Broadcast_Type is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeIsNotNull() {
            addCriterion("Broadcast_Type is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeEqualTo(String value) {
            addCriterion("Broadcast_Type =", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotEqualTo(String value) {
            addCriterion("Broadcast_Type <>", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeGreaterThan(String value) {
            addCriterion("Broadcast_Type >", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Broadcast_Type >=", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeLessThan(String value) {
            addCriterion("Broadcast_Type <", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeLessThanOrEqualTo(String value) {
            addCriterion("Broadcast_Type <=", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeLike(String value) {
            addCriterion("Broadcast_Type like", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotLike(String value) {
            addCriterion("Broadcast_Type not like", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeIn(List<String> values) {
            addCriterion("Broadcast_Type in", values, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotIn(List<String> values) {
            addCriterion("Broadcast_Type not in", values, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeBetween(String value1, String value2) {
            addCriterion("Broadcast_Type between", value1, value2, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotBetween(String value1, String value2) {
            addCriterion("Broadcast_Type not between", value1, value2, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceIsNull() {
            addCriterion("Schedule_Price is null");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceIsNotNull() {
            addCriterion("Schedule_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceEqualTo(Double value) {
            addCriterion("Schedule_Price =", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotEqualTo(Double value) {
            addCriterion("Schedule_Price <>", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceGreaterThan(Double value) {
            addCriterion("Schedule_Price >", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Schedule_Price >=", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceLessThan(Double value) {
            addCriterion("Schedule_Price <", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceLessThanOrEqualTo(Double value) {
            addCriterion("Schedule_Price <=", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceIn(List<Double> values) {
            addCriterion("Schedule_Price in", values, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotIn(List<Double> values) {
            addCriterion("Schedule_Price not in", values, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceBetween(Double value1, Double value2) {
            addCriterion("Schedule_Price between", value1, value2, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotBetween(Double value1, Double value2) {
            addCriterion("Schedule_Price not between", value1, value2, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIsNull() {
            addCriterion("Schedule_Date is null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIsNotNull() {
            addCriterion("Schedule_Date is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateEqualTo(Date value) {
            addCriterionForJDBCDate("Schedule_Date =", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Schedule_Date <>", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Schedule_Date >", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Schedule_Date >=", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateLessThan(Date value) {
            addCriterionForJDBCDate("Schedule_Date <", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Schedule_Date <=", value, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateIn(List<Date> values) {
            addCriterionForJDBCDate("Schedule_Date in", values, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Schedule_Date not in", values, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Schedule_Date between", value1, value2, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Schedule_Date not between", value1, value2, "scheduleDate");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeIsNull() {
            addCriterion("Schedule_Begin_Date_Time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeIsNotNull() {
            addCriterion("Schedule_Begin_Date_Time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeEqualTo(Date value) {
            addCriterion("Schedule_Begin_Date_Time =", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeNotEqualTo(Date value) {
            addCriterion("Schedule_Begin_Date_Time <>", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeGreaterThan(Date value) {
            addCriterion("Schedule_Begin_Date_Time >", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Schedule_Begin_Date_Time >=", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeLessThan(Date value) {
            addCriterion("Schedule_Begin_Date_Time <", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Schedule_Begin_Date_Time <=", value, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeIn(List<Date> values) {
            addCriterion("Schedule_Begin_Date_Time in", values, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeNotIn(List<Date> values) {
            addCriterion("Schedule_Begin_Date_Time not in", values, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeBetween(Date value1, Date value2) {
            addCriterion("Schedule_Begin_Date_Time between", value1, value2, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleBeginDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Schedule_Begin_Date_Time not between", value1, value2, "scheduleBeginDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeIsNull() {
            addCriterion("Schedule_End_Date_Time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeIsNotNull() {
            addCriterion("Schedule_End_Date_Time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeEqualTo(Date value) {
            addCriterion("Schedule_End_Date_Time =", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeNotEqualTo(Date value) {
            addCriterion("Schedule_End_Date_Time <>", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeGreaterThan(Date value) {
            addCriterion("Schedule_End_Date_Time >", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Schedule_End_Date_Time >=", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeLessThan(Date value) {
            addCriterion("Schedule_End_Date_Time <", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Schedule_End_Date_Time <=", value, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeIn(List<Date> values) {
            addCriterion("Schedule_End_Date_Time in", values, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeNotIn(List<Date> values) {
            addCriterion("Schedule_End_Date_Time not in", values, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeBetween(Date value1, Date value2) {
            addCriterion("Schedule_End_Date_Time between", value1, value2, "scheduleEndDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleEndDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Schedule_End_Date_Time not between", value1, value2, "scheduleEndDateTime");
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