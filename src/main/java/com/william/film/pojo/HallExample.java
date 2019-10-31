package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class HallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HallExample() {
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

        public Criteria andTheaterIdIsNull() {
            addCriterion("Theater_Id is null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIsNotNull() {
            addCriterion("Theater_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterIdEqualTo(Integer value) {
            addCriterion("Theater_Id =", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotEqualTo(Integer value) {
            addCriterion("Theater_Id <>", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThan(Integer value) {
            addCriterion("Theater_Id >", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Theater_Id >=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThan(Integer value) {
            addCriterion("Theater_Id <", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("Theater_Id <=", value, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdIn(List<Integer> values) {
            addCriterion("Theater_Id in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotIn(List<Integer> values) {
            addCriterion("Theater_Id not in", values, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdBetween(Integer value1, Integer value2) {
            addCriterion("Theater_Id between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andTheaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Theater_Id not between", value1, value2, "theaterId");
            return (Criteria) this;
        }

        public Criteria andHallTypeIsNull() {
            addCriterion("Hall_Type is null");
            return (Criteria) this;
        }

        public Criteria andHallTypeIsNotNull() {
            addCriterion("Hall_Type is not null");
            return (Criteria) this;
        }

        public Criteria andHallTypeEqualTo(String value) {
            addCriterion("Hall_Type =", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeNotEqualTo(String value) {
            addCriterion("Hall_Type <>", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeGreaterThan(String value) {
            addCriterion("Hall_Type >", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Hall_Type >=", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeLessThan(String value) {
            addCriterion("Hall_Type <", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeLessThanOrEqualTo(String value) {
            addCriterion("Hall_Type <=", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeLike(String value) {
            addCriterion("Hall_Type like", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeNotLike(String value) {
            addCriterion("Hall_Type not like", value, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeIn(List<String> values) {
            addCriterion("Hall_Type in", values, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeNotIn(List<String> values) {
            addCriterion("Hall_Type not in", values, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeBetween(String value1, String value2) {
            addCriterion("Hall_Type between", value1, value2, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallTypeNotBetween(String value1, String value2) {
            addCriterion("Hall_Type not between", value1, value2, "hallType");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceIsNull() {
            addCriterion("Hall_Basic_Price is null");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceIsNotNull() {
            addCriterion("Hall_Basic_Price is not null");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceEqualTo(Integer value) {
            addCriterion("Hall_Basic_Price =", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceNotEqualTo(Integer value) {
            addCriterion("Hall_Basic_Price <>", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceGreaterThan(Integer value) {
            addCriterion("Hall_Basic_Price >", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Hall_Basic_Price >=", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceLessThan(Integer value) {
            addCriterion("Hall_Basic_Price <", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceLessThanOrEqualTo(Integer value) {
            addCriterion("Hall_Basic_Price <=", value, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceIn(List<Integer> values) {
            addCriterion("Hall_Basic_Price in", values, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceNotIn(List<Integer> values) {
            addCriterion("Hall_Basic_Price not in", values, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceBetween(Integer value1, Integer value2) {
            addCriterion("Hall_Basic_Price between", value1, value2, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallBasicPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("Hall_Basic_Price not between", value1, value2, "hallBasicPrice");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionIsNull() {
            addCriterion("Hall_Description is null");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionIsNotNull() {
            addCriterion("Hall_Description is not null");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionEqualTo(String value) {
            addCriterion("Hall_Description =", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionNotEqualTo(String value) {
            addCriterion("Hall_Description <>", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionGreaterThan(String value) {
            addCriterion("Hall_Description >", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Hall_Description >=", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionLessThan(String value) {
            addCriterion("Hall_Description <", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Hall_Description <=", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionLike(String value) {
            addCriterion("Hall_Description like", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionNotLike(String value) {
            addCriterion("Hall_Description not like", value, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionIn(List<String> values) {
            addCriterion("Hall_Description in", values, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionNotIn(List<String> values) {
            addCriterion("Hall_Description not in", values, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionBetween(String value1, String value2) {
            addCriterion("Hall_Description between", value1, value2, "hallDescription");
            return (Criteria) this;
        }

        public Criteria andHallDescriptionNotBetween(String value1, String value2) {
            addCriterion("Hall_Description not between", value1, value2, "hallDescription");
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