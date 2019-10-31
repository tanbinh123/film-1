package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilmImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmImgExample() {
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

        public Criteria andFilmImgIsNull() {
            addCriterion("Film_img is null");
            return (Criteria) this;
        }

        public Criteria andFilmImgIsNotNull() {
            addCriterion("Film_img is not null");
            return (Criteria) this;
        }

        public Criteria andFilmImgEqualTo(Integer value) {
            addCriterion("Film_img =", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgNotEqualTo(Integer value) {
            addCriterion("Film_img <>", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgGreaterThan(Integer value) {
            addCriterion("Film_img >", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgGreaterThanOrEqualTo(Integer value) {
            addCriterion("Film_img >=", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgLessThan(Integer value) {
            addCriterion("Film_img <", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgLessThanOrEqualTo(Integer value) {
            addCriterion("Film_img <=", value, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgIn(List<Integer> values) {
            addCriterion("Film_img in", values, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgNotIn(List<Integer> values) {
            addCriterion("Film_img not in", values, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgBetween(Integer value1, Integer value2) {
            addCriterion("Film_img between", value1, value2, "filmImg");
            return (Criteria) this;
        }

        public Criteria andFilmImgNotBetween(Integer value1, Integer value2) {
            addCriterion("Film_img not between", value1, value2, "filmImg");
            return (Criteria) this;
        }

        public Criteria andMovieIsNull() {
            addCriterion("Movie is null");
            return (Criteria) this;
        }

        public Criteria andMovieIsNotNull() {
            addCriterion("Movie is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEqualTo(Integer value) {
            addCriterion("Movie =", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieNotEqualTo(Integer value) {
            addCriterion("Movie <>", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieGreaterThan(Integer value) {
            addCriterion("Movie >", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieGreaterThanOrEqualTo(Integer value) {
            addCriterion("Movie >=", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieLessThan(Integer value) {
            addCriterion("Movie <", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieLessThanOrEqualTo(Integer value) {
            addCriterion("Movie <=", value, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieIn(List<Integer> values) {
            addCriterion("Movie in", values, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieNotIn(List<Integer> values) {
            addCriterion("Movie not in", values, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieBetween(Integer value1, Integer value2) {
            addCriterion("Movie between", value1, value2, "movie");
            return (Criteria) this;
        }

        public Criteria andMovieNotBetween(Integer value1, Integer value2) {
            addCriterion("Movie not between", value1, value2, "movie");
            return (Criteria) this;
        }

        public Criteria andImgLocationIsNull() {
            addCriterion("Img_Location is null");
            return (Criteria) this;
        }

        public Criteria andImgLocationIsNotNull() {
            addCriterion("Img_Location is not null");
            return (Criteria) this;
        }

        public Criteria andImgLocationEqualTo(String value) {
            addCriterion("Img_Location =", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotEqualTo(String value) {
            addCriterion("Img_Location <>", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationGreaterThan(String value) {
            addCriterion("Img_Location >", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Img_Location >=", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLessThan(String value) {
            addCriterion("Img_Location <", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLessThanOrEqualTo(String value) {
            addCriterion("Img_Location <=", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationLike(String value) {
            addCriterion("Img_Location like", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotLike(String value) {
            addCriterion("Img_Location not like", value, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationIn(List<String> values) {
            addCriterion("Img_Location in", values, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotIn(List<String> values) {
            addCriterion("Img_Location not in", values, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationBetween(String value1, String value2) {
            addCriterion("Img_Location between", value1, value2, "imgLocation");
            return (Criteria) this;
        }

        public Criteria andImgLocationNotBetween(String value1, String value2) {
            addCriterion("Img_Location not between", value1, value2, "imgLocation");
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