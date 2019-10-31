package com.william.film.pojo;

import java.util.ArrayList;
import java.util.List;

public class MovieActorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieActorExample() {
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

        public Criteria andPersonRoleIsNull() {
            addCriterion("Person_Role is null");
            return (Criteria) this;
        }

        public Criteria andPersonRoleIsNotNull() {
            addCriterion("Person_Role is not null");
            return (Criteria) this;
        }

        public Criteria andPersonRoleEqualTo(Integer value) {
            addCriterion("Person_Role =", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleNotEqualTo(Integer value) {
            addCriterion("Person_Role <>", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleGreaterThan(Integer value) {
            addCriterion("Person_Role >", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Person_Role >=", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleLessThan(Integer value) {
            addCriterion("Person_Role <", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleLessThanOrEqualTo(Integer value) {
            addCriterion("Person_Role <=", value, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleIn(List<Integer> values) {
            addCriterion("Person_Role in", values, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleNotIn(List<Integer> values) {
            addCriterion("Person_Role not in", values, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleBetween(Integer value1, Integer value2) {
            addCriterion("Person_Role between", value1, value2, "personRole");
            return (Criteria) this;
        }

        public Criteria andPersonRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("Person_Role not between", value1, value2, "personRole");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameIsNull() {
            addCriterion("Play_Role_Name is null");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameIsNotNull() {
            addCriterion("Play_Role_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameEqualTo(String value) {
            addCriterion("Play_Role_Name =", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameNotEqualTo(String value) {
            addCriterion("Play_Role_Name <>", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameGreaterThan(String value) {
            addCriterion("Play_Role_Name >", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("Play_Role_Name >=", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameLessThan(String value) {
            addCriterion("Play_Role_Name <", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameLessThanOrEqualTo(String value) {
            addCriterion("Play_Role_Name <=", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameLike(String value) {
            addCriterion("Play_Role_Name like", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameNotLike(String value) {
            addCriterion("Play_Role_Name not like", value, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameIn(List<String> values) {
            addCriterion("Play_Role_Name in", values, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameNotIn(List<String> values) {
            addCriterion("Play_Role_Name not in", values, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameBetween(String value1, String value2) {
            addCriterion("Play_Role_Name between", value1, value2, "playRoleName");
            return (Criteria) this;
        }

        public Criteria andPlayRoleNameNotBetween(String value1, String value2) {
            addCriterion("Play_Role_Name not between", value1, value2, "playRoleName");
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