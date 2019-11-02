package com.william.film.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andSchedulePriceIsNull() {
            addCriterion("Schedule_Price is null");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceIsNotNull() {
            addCriterion("Schedule_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceEqualTo(Integer value) {
            addCriterion("Schedule_Price =", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotEqualTo(Integer value) {
            addCriterion("Schedule_Price <>", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceGreaterThan(Integer value) {
            addCriterion("Schedule_Price >", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Price >=", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceLessThan(Integer value) {
            addCriterion("Schedule_Price <", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceLessThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Price <=", value, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceIn(List<Integer> values) {
            addCriterion("Schedule_Price in", values, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotIn(List<Integer> values) {
            addCriterion("Schedule_Price not in", values, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Price between", value1, value2, "schedulePrice");
            return (Criteria) this;
        }

        public Criteria andSchedulePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Price not between", value1, value2, "schedulePrice");
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

        public Criteria andScheduleHolidayIsNull() {
            addCriterion("Schedule_Holiday is null");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayIsNotNull() {
            addCriterion("Schedule_Holiday is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayEqualTo(Integer value) {
            addCriterion("Schedule_Holiday =", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayNotEqualTo(Integer value) {
            addCriterion("Schedule_Holiday <>", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayGreaterThan(Integer value) {
            addCriterion("Schedule_Holiday >", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Holiday >=", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayLessThan(Integer value) {
            addCriterion("Schedule_Holiday <", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayLessThanOrEqualTo(Integer value) {
            addCriterion("Schedule_Holiday <=", value, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayIn(List<Integer> values) {
            addCriterion("Schedule_Holiday in", values, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayNotIn(List<Integer> values) {
            addCriterion("Schedule_Holiday not in", values, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Holiday between", value1, value2, "scheduleHoliday");
            return (Criteria) this;
        }

        public Criteria andScheduleHolidayNotBetween(Integer value1, Integer value2) {
            addCriterion("Schedule_Holiday not between", value1, value2, "scheduleHoliday");
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