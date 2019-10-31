package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class TheaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TheaterExample() {
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

        public Criteria andTheaterProvinceIsNull() {
            addCriterion("Theater_Province is null");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceIsNotNull() {
            addCriterion("Theater_Province is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceEqualTo(String value) {
            addCriterion("Theater_Province =", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceNotEqualTo(String value) {
            addCriterion("Theater_Province <>", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceGreaterThan(String value) {
            addCriterion("Theater_Province >", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Province >=", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceLessThan(String value) {
            addCriterion("Theater_Province <", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceLessThanOrEqualTo(String value) {
            addCriterion("Theater_Province <=", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceLike(String value) {
            addCriterion("Theater_Province like", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceNotLike(String value) {
            addCriterion("Theater_Province not like", value, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceIn(List<String> values) {
            addCriterion("Theater_Province in", values, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceNotIn(List<String> values) {
            addCriterion("Theater_Province not in", values, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceBetween(String value1, String value2) {
            addCriterion("Theater_Province between", value1, value2, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterProvinceNotBetween(String value1, String value2) {
            addCriterion("Theater_Province not between", value1, value2, "theaterProvince");
            return (Criteria) this;
        }

        public Criteria andTheaterCityIsNull() {
            addCriterion("Theater_City is null");
            return (Criteria) this;
        }

        public Criteria andTheaterCityIsNotNull() {
            addCriterion("Theater_City is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterCityEqualTo(String value) {
            addCriterion("Theater_City =", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityNotEqualTo(String value) {
            addCriterion("Theater_City <>", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityGreaterThan(String value) {
            addCriterion("Theater_City >", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_City >=", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityLessThan(String value) {
            addCriterion("Theater_City <", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityLessThanOrEqualTo(String value) {
            addCriterion("Theater_City <=", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityLike(String value) {
            addCriterion("Theater_City like", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityNotLike(String value) {
            addCriterion("Theater_City not like", value, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityIn(List<String> values) {
            addCriterion("Theater_City in", values, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityNotIn(List<String> values) {
            addCriterion("Theater_City not in", values, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityBetween(String value1, String value2) {
            addCriterion("Theater_City between", value1, value2, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterCityNotBetween(String value1, String value2) {
            addCriterion("Theater_City not between", value1, value2, "theaterCity");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaIsNull() {
            addCriterion("Theater_Area is null");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaIsNotNull() {
            addCriterion("Theater_Area is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaEqualTo(String value) {
            addCriterion("Theater_Area =", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaNotEqualTo(String value) {
            addCriterion("Theater_Area <>", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaGreaterThan(String value) {
            addCriterion("Theater_Area >", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Area >=", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaLessThan(String value) {
            addCriterion("Theater_Area <", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaLessThanOrEqualTo(String value) {
            addCriterion("Theater_Area <=", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaLike(String value) {
            addCriterion("Theater_Area like", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaNotLike(String value) {
            addCriterion("Theater_Area not like", value, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaIn(List<String> values) {
            addCriterion("Theater_Area in", values, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaNotIn(List<String> values) {
            addCriterion("Theater_Area not in", values, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaBetween(String value1, String value2) {
            addCriterion("Theater_Area between", value1, value2, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterAreaNotBetween(String value1, String value2) {
            addCriterion("Theater_Area not between", value1, value2, "theaterArea");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandIsNull() {
            addCriterion("Theater_Brand is null");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandIsNotNull() {
            addCriterion("Theater_Brand is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandEqualTo(String value) {
            addCriterion("Theater_Brand =", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandNotEqualTo(String value) {
            addCriterion("Theater_Brand <>", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandGreaterThan(String value) {
            addCriterion("Theater_Brand >", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Brand >=", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandLessThan(String value) {
            addCriterion("Theater_Brand <", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandLessThanOrEqualTo(String value) {
            addCriterion("Theater_Brand <=", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandLike(String value) {
            addCriterion("Theater_Brand like", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandNotLike(String value) {
            addCriterion("Theater_Brand not like", value, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandIn(List<String> values) {
            addCriterion("Theater_Brand in", values, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandNotIn(List<String> values) {
            addCriterion("Theater_Brand not in", values, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandBetween(String value1, String value2) {
            addCriterion("Theater_Brand between", value1, value2, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andTheaterBrandNotBetween(String value1, String value2) {
            addCriterion("Theater_Brand not between", value1, value2, "theaterBrand");
            return (Criteria) this;
        }

        public Criteria andThraterStateIsNull() {
            addCriterion("Thrater_State is null");
            return (Criteria) this;
        }

        public Criteria andThraterStateIsNotNull() {
            addCriterion("Thrater_State is not null");
            return (Criteria) this;
        }

        public Criteria andThraterStateEqualTo(Integer value) {
            addCriterion("Thrater_State =", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateNotEqualTo(Integer value) {
            addCriterion("Thrater_State <>", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateGreaterThan(Integer value) {
            addCriterion("Thrater_State >", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Thrater_State >=", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateLessThan(Integer value) {
            addCriterion("Thrater_State <", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateLessThanOrEqualTo(Integer value) {
            addCriterion("Thrater_State <=", value, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateIn(List<Integer> values) {
            addCriterion("Thrater_State in", values, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateNotIn(List<Integer> values) {
            addCriterion("Thrater_State not in", values, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateBetween(Integer value1, Integer value2) {
            addCriterion("Thrater_State between", value1, value2, "thraterState");
            return (Criteria) this;
        }

        public Criteria andThraterStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Thrater_State not between", value1, value2, "thraterState");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationIsNull() {
            addCriterion("Theater_Specfic_Location is null");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationIsNotNull() {
            addCriterion("Theater_Specfic_Location is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationEqualTo(String value) {
            addCriterion("Theater_Specfic_Location =", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationNotEqualTo(String value) {
            addCriterion("Theater_Specfic_Location <>", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationGreaterThan(String value) {
            addCriterion("Theater_Specfic_Location >", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Specfic_Location >=", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationLessThan(String value) {
            addCriterion("Theater_Specfic_Location <", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationLessThanOrEqualTo(String value) {
            addCriterion("Theater_Specfic_Location <=", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationLike(String value) {
            addCriterion("Theater_Specfic_Location like", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationNotLike(String value) {
            addCriterion("Theater_Specfic_Location not like", value, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationIn(List<String> values) {
            addCriterion("Theater_Specfic_Location in", values, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationNotIn(List<String> values) {
            addCriterion("Theater_Specfic_Location not in", values, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationBetween(String value1, String value2) {
            addCriterion("Theater_Specfic_Location between", value1, value2, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterSpecficLocationNotBetween(String value1, String value2) {
            addCriterion("Theater_Specfic_Location not between", value1, value2, "theaterSpecficLocation");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneIsNull() {
            addCriterion("Theater_Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneIsNotNull() {
            addCriterion("Theater_Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneEqualTo(String value) {
            addCriterion("Theater_Telephone =", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneNotEqualTo(String value) {
            addCriterion("Theater_Telephone <>", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneGreaterThan(String value) {
            addCriterion("Theater_Telephone >", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Telephone >=", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneLessThan(String value) {
            addCriterion("Theater_Telephone <", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Theater_Telephone <=", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneLike(String value) {
            addCriterion("Theater_Telephone like", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneNotLike(String value) {
            addCriterion("Theater_Telephone not like", value, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneIn(List<String> values) {
            addCriterion("Theater_Telephone in", values, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneNotIn(List<String> values) {
            addCriterion("Theater_Telephone not in", values, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneBetween(String value1, String value2) {
            addCriterion("Theater_Telephone between", value1, value2, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterTelephoneNotBetween(String value1, String value2) {
            addCriterion("Theater_Telephone not between", value1, value2, "theaterTelephone");
            return (Criteria) this;
        }

        public Criteria andTheaterImgIsNull() {
            addCriterion("Theater_Img is null");
            return (Criteria) this;
        }

        public Criteria andTheaterImgIsNotNull() {
            addCriterion("Theater_Img is not null");
            return (Criteria) this;
        }

        public Criteria andTheaterImgEqualTo(String value) {
            addCriterion("Theater_Img =", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgNotEqualTo(String value) {
            addCriterion("Theater_Img <>", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgGreaterThan(String value) {
            addCriterion("Theater_Img >", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgGreaterThanOrEqualTo(String value) {
            addCriterion("Theater_Img >=", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgLessThan(String value) {
            addCriterion("Theater_Img <", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgLessThanOrEqualTo(String value) {
            addCriterion("Theater_Img <=", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgLike(String value) {
            addCriterion("Theater_Img like", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgNotLike(String value) {
            addCriterion("Theater_Img not like", value, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgIn(List<String> values) {
            addCriterion("Theater_Img in", values, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgNotIn(List<String> values) {
            addCriterion("Theater_Img not in", values, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgBetween(String value1, String value2) {
            addCriterion("Theater_Img between", value1, value2, "theaterImg");
            return (Criteria) this;
        }

        public Criteria andTheaterImgNotBetween(String value1, String value2) {
            addCriterion("Theater_Img not between", value1, value2, "theaterImg");
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