package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassLevelIsNull() {
            addCriterion("Class_level is null");
            return (Criteria) this;
        }

        public Criteria andClassLevelIsNotNull() {
            addCriterion("Class_level is not null");
            return (Criteria) this;
        }

        public Criteria andClassLevelEqualTo(Integer value) {
            addCriterion("Class_level =", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelNotEqualTo(Integer value) {
            addCriterion("Class_level <>", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelGreaterThan(Integer value) {
            addCriterion("Class_level >", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Class_level >=", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelLessThan(Integer value) {
            addCriterion("Class_level <", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Class_level <=", value, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelIn(List<Integer> values) {
            addCriterion("Class_level in", values, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelNotIn(List<Integer> values) {
            addCriterion("Class_level not in", values, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelBetween(Integer value1, Integer value2) {
            addCriterion("Class_level between", value1, value2, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Class_level not between", value1, value2, "classLevel");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("Class_Name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("Class_Name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("Class_Name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("Class_Name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("Class_Name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("Class_Name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("Class_Name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("Class_Name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("Class_Name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("Class_Name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("Class_Name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("Class_Name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("Class_Name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("Class_Name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassDiscountIsNull() {
            addCriterion("Class_Discount is null");
            return (Criteria) this;
        }

        public Criteria andClassDiscountIsNotNull() {
            addCriterion("Class_Discount is not null");
            return (Criteria) this;
        }

        public Criteria andClassDiscountEqualTo(Double value) {
            addCriterion("Class_Discount =", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountNotEqualTo(Double value) {
            addCriterion("Class_Discount <>", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountGreaterThan(Double value) {
            addCriterion("Class_Discount >", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("Class_Discount >=", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountLessThan(Double value) {
            addCriterion("Class_Discount <", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountLessThanOrEqualTo(Double value) {
            addCriterion("Class_Discount <=", value, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountIn(List<Double> values) {
            addCriterion("Class_Discount in", values, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountNotIn(List<Double> values) {
            addCriterion("Class_Discount not in", values, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountBetween(Double value1, Double value2) {
            addCriterion("Class_Discount between", value1, value2, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassDiscountNotBetween(Double value1, Double value2) {
            addCriterion("Class_Discount not between", value1, value2, "classDiscount");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNull() {
            addCriterion("Class_State is null");
            return (Criteria) this;
        }

        public Criteria andClassStateIsNotNull() {
            addCriterion("Class_State is not null");
            return (Criteria) this;
        }

        public Criteria andClassStateEqualTo(Integer value) {
            addCriterion("Class_State =", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotEqualTo(Integer value) {
            addCriterion("Class_State <>", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThan(Integer value) {
            addCriterion("Class_State >", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Class_State >=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThan(Integer value) {
            addCriterion("Class_State <", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateLessThanOrEqualTo(Integer value) {
            addCriterion("Class_State <=", value, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateIn(List<Integer> values) {
            addCriterion("Class_State in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotIn(List<Integer> values) {
            addCriterion("Class_State not in", values, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateBetween(Integer value1, Integer value2) {
            addCriterion("Class_State between", value1, value2, "classState");
            return (Criteria) this;
        }

        public Criteria andClassStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Class_State not between", value1, value2, "classState");
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