package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilmPersonImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmPersonImgExample() {
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

        public Criteria andPersonImgIsNull() {
            addCriterion("Person-Img is null");
            return (Criteria) this;
        }

        public Criteria andPersonImgIsNotNull() {
            addCriterion("Person-Img is not null");
            return (Criteria) this;
        }

        public Criteria andPersonImgEqualTo(Integer value) {
            addCriterion("Person-Img =", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgNotEqualTo(Integer value) {
            addCriterion("Person-Img <>", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgGreaterThan(Integer value) {
            addCriterion("Person-Img >", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgGreaterThanOrEqualTo(Integer value) {
            addCriterion("Person-Img >=", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgLessThan(Integer value) {
            addCriterion("Person-Img <", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgLessThanOrEqualTo(Integer value) {
            addCriterion("Person-Img <=", value, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgIn(List<Integer> values) {
            addCriterion("Person-Img in", values, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgNotIn(List<Integer> values) {
            addCriterion("Person-Img not in", values, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgBetween(Integer value1, Integer value2) {
            addCriterion("Person-Img between", value1, value2, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonImgNotBetween(Integer value1, Integer value2) {
            addCriterion("Person-Img not between", value1, value2, "personImg");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("Person_Id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("Person_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("Person_Id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("Person_Id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("Person_Id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Person_Id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("Person_Id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("Person_Id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("Person_Id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("Person_Id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("Person_Id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Person_Id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationIsNull() {
            addCriterion("Person_Img_Location is null");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationIsNotNull() {
            addCriterion("Person_Img_Location is not null");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationEqualTo(String value) {
            addCriterion("Person_Img_Location =", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationNotEqualTo(String value) {
            addCriterion("Person_Img_Location <>", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationGreaterThan(String value) {
            addCriterion("Person_Img_Location >", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Img_Location >=", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationLessThan(String value) {
            addCriterion("Person_Img_Location <", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationLessThanOrEqualTo(String value) {
            addCriterion("Person_Img_Location <=", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationLike(String value) {
            addCriterion("Person_Img_Location like", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationNotLike(String value) {
            addCriterion("Person_Img_Location not like", value, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationIn(List<String> values) {
            addCriterion("Person_Img_Location in", values, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationNotIn(List<String> values) {
            addCriterion("Person_Img_Location not in", values, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationBetween(String value1, String value2) {
            addCriterion("Person_Img_Location between", value1, value2, "personImgLocation");
            return (Criteria) this;
        }

        public Criteria andPersonImgLocationNotBetween(String value1, String value2) {
            addCriterion("Person_Img_Location not between", value1, value2, "personImgLocation");
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