package com.william.film.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FilmPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmPersonExample() {
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

        public Criteria andPersonNameIsNull() {
            addCriterion("Person_Name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("Person_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("Person_Name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("Person_Name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("Person_Name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("Person_Name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("Person_Name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("Person_Name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("Person_Name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("Person_Name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("Person_Name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("Person_Name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("Person_Name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameIsNull() {
            addCriterion("Person_Other_Name is null");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameIsNotNull() {
            addCriterion("Person_Other_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameEqualTo(String value) {
            addCriterion("Person_Other_Name =", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameNotEqualTo(String value) {
            addCriterion("Person_Other_Name <>", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameGreaterThan(String value) {
            addCriterion("Person_Other_Name >", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Other_Name >=", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameLessThan(String value) {
            addCriterion("Person_Other_Name <", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameLessThanOrEqualTo(String value) {
            addCriterion("Person_Other_Name <=", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameLike(String value) {
            addCriterion("Person_Other_Name like", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameNotLike(String value) {
            addCriterion("Person_Other_Name not like", value, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameIn(List<String> values) {
            addCriterion("Person_Other_Name in", values, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameNotIn(List<String> values) {
            addCriterion("Person_Other_Name not in", values, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameBetween(String value1, String value2) {
            addCriterion("Person_Other_Name between", value1, value2, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonOtherNameNotBetween(String value1, String value2) {
            addCriterion("Person_Other_Name not between", value1, value2, "personOtherName");
            return (Criteria) this;
        }

        public Criteria andPersonNationIsNull() {
            addCriterion("Person_Nation is null");
            return (Criteria) this;
        }

        public Criteria andPersonNationIsNotNull() {
            addCriterion("Person_Nation is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNationEqualTo(String value) {
            addCriterion("Person_Nation =", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationNotEqualTo(String value) {
            addCriterion("Person_Nation <>", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationGreaterThan(String value) {
            addCriterion("Person_Nation >", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Nation >=", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationLessThan(String value) {
            addCriterion("Person_Nation <", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationLessThanOrEqualTo(String value) {
            addCriterion("Person_Nation <=", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationLike(String value) {
            addCriterion("Person_Nation like", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationNotLike(String value) {
            addCriterion("Person_Nation not like", value, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationIn(List<String> values) {
            addCriterion("Person_Nation in", values, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationNotIn(List<String> values) {
            addCriterion("Person_Nation not in", values, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationBetween(String value1, String value2) {
            addCriterion("Person_Nation between", value1, value2, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonNationNotBetween(String value1, String value2) {
            addCriterion("Person_Nation not between", value1, value2, "personNation");
            return (Criteria) this;
        }

        public Criteria andPersonBloodIsNull() {
            addCriterion("Person_Blood is null");
            return (Criteria) this;
        }

        public Criteria andPersonBloodIsNotNull() {
            addCriterion("Person_Blood is not null");
            return (Criteria) this;
        }

        public Criteria andPersonBloodEqualTo(String value) {
            addCriterion("Person_Blood =", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodNotEqualTo(String value) {
            addCriterion("Person_Blood <>", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodGreaterThan(String value) {
            addCriterion("Person_Blood >", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Blood >=", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodLessThan(String value) {
            addCriterion("Person_Blood <", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodLessThanOrEqualTo(String value) {
            addCriterion("Person_Blood <=", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodLike(String value) {
            addCriterion("Person_Blood like", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodNotLike(String value) {
            addCriterion("Person_Blood not like", value, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodIn(List<String> values) {
            addCriterion("Person_Blood in", values, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodNotIn(List<String> values) {
            addCriterion("Person_Blood not in", values, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodBetween(String value1, String value2) {
            addCriterion("Person_Blood between", value1, value2, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBloodNotBetween(String value1, String value2) {
            addCriterion("Person_Blood not between", value1, value2, "personBlood");
            return (Criteria) this;
        }

        public Criteria andPersonBirthIsNull() {
            addCriterion("Person_Birth is null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthIsNotNull() {
            addCriterion("Person_Birth is not null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthEqualTo(Date value) {
            addCriterionForJDBCDate("Person_Birth =", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("Person_Birth <>", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("Person_Birth >", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Person_Birth >=", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthLessThan(Date value) {
            addCriterionForJDBCDate("Person_Birth <", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Person_Birth <=", value, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthIn(List<Date> values) {
            addCriterionForJDBCDate("Person_Birth in", values, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("Person_Birth not in", values, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Person_Birth between", value1, value2, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Person_Birth not between", value1, value2, "personBirth");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceIsNull() {
            addCriterion("Person_Birth_Place is null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceIsNotNull() {
            addCriterion("Person_Birth_Place is not null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceEqualTo(String value) {
            addCriterion("Person_Birth_Place =", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceNotEqualTo(String value) {
            addCriterion("Person_Birth_Place <>", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceGreaterThan(String value) {
            addCriterion("Person_Birth_Place >", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Birth_Place >=", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceLessThan(String value) {
            addCriterion("Person_Birth_Place <", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("Person_Birth_Place <=", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceLike(String value) {
            addCriterion("Person_Birth_Place like", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceNotLike(String value) {
            addCriterion("Person_Birth_Place not like", value, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceIn(List<String> values) {
            addCriterion("Person_Birth_Place in", values, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceNotIn(List<String> values) {
            addCriterion("Person_Birth_Place not in", values, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceBetween(String value1, String value2) {
            addCriterion("Person_Birth_Place between", value1, value2, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("Person_Birth_Place not between", value1, value2, "personBirthPlace");
            return (Criteria) this;
        }

        public Criteria andPersonHeightIsNull() {
            addCriterion("Person_Height is null");
            return (Criteria) this;
        }

        public Criteria andPersonHeightIsNotNull() {
            addCriterion("Person_Height is not null");
            return (Criteria) this;
        }

        public Criteria andPersonHeightEqualTo(String value) {
            addCriterion("Person_Height =", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightNotEqualTo(String value) {
            addCriterion("Person_Height <>", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightGreaterThan(String value) {
            addCriterion("Person_Height >", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Height >=", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightLessThan(String value) {
            addCriterion("Person_Height <", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightLessThanOrEqualTo(String value) {
            addCriterion("Person_Height <=", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightLike(String value) {
            addCriterion("Person_Height like", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightNotLike(String value) {
            addCriterion("Person_Height not like", value, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightIn(List<String> values) {
            addCriterion("Person_Height in", values, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightNotIn(List<String> values) {
            addCriterion("Person_Height not in", values, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightBetween(String value1, String value2) {
            addCriterion("Person_Height between", value1, value2, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonHeightNotBetween(String value1, String value2) {
            addCriterion("Person_Height not between", value1, value2, "personHeight");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIsNull() {
            addCriterion("Person_Constellation is null");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIsNotNull() {
            addCriterion("Person_Constellation is not null");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationEqualTo(String value) {
            addCriterion("Person_Constellation =", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotEqualTo(String value) {
            addCriterion("Person_Constellation <>", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationGreaterThan(String value) {
            addCriterion("Person_Constellation >", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Constellation >=", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLessThan(String value) {
            addCriterion("Person_Constellation <", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLessThanOrEqualTo(String value) {
            addCriterion("Person_Constellation <=", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLike(String value) {
            addCriterion("Person_Constellation like", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotLike(String value) {
            addCriterion("Person_Constellation not like", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIn(List<String> values) {
            addCriterion("Person_Constellation in", values, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotIn(List<String> values) {
            addCriterion("Person_Constellation not in", values, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationBetween(String value1, String value2) {
            addCriterion("Person_Constellation between", value1, value2, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotBetween(String value1, String value2) {
            addCriterion("Person_Constellation not between", value1, value2, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityIsNull() {
            addCriterion("Person_Identity is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityIsNotNull() {
            addCriterion("Person_Identity is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityEqualTo(String value) {
            addCriterion("Person_Identity =", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityNotEqualTo(String value) {
            addCriterion("Person_Identity <>", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityGreaterThan(String value) {
            addCriterion("Person_Identity >", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Identity >=", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityLessThan(String value) {
            addCriterion("Person_Identity <", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityLessThanOrEqualTo(String value) {
            addCriterion("Person_Identity <=", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityLike(String value) {
            addCriterion("Person_Identity like", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityNotLike(String value) {
            addCriterion("Person_Identity not like", value, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityIn(List<String> values) {
            addCriterion("Person_Identity in", values, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityNotIn(List<String> values) {
            addCriterion("Person_Identity not in", values, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityBetween(String value1, String value2) {
            addCriterion("Person_Identity between", value1, value2, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonIdentityNotBetween(String value1, String value2) {
            addCriterion("Person_Identity not between", value1, value2, "personIdentity");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolIsNull() {
            addCriterion("Person_Graduate_School is null");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolIsNotNull() {
            addCriterion("Person_Graduate_School is not null");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolEqualTo(String value) {
            addCriterion("Person_Graduate_School =", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolNotEqualTo(String value) {
            addCriterion("Person_Graduate_School <>", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolGreaterThan(String value) {
            addCriterion("Person_Graduate_School >", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Graduate_School >=", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolLessThan(String value) {
            addCriterion("Person_Graduate_School <", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("Person_Graduate_School <=", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolLike(String value) {
            addCriterion("Person_Graduate_School like", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolNotLike(String value) {
            addCriterion("Person_Graduate_School not like", value, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolIn(List<String> values) {
            addCriterion("Person_Graduate_School in", values, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolNotIn(List<String> values) {
            addCriterion("Person_Graduate_School not in", values, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolBetween(String value1, String value2) {
            addCriterion("Person_Graduate_School between", value1, value2, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("Person_Graduate_School not between", value1, value2, "personGraduateSchool");
            return (Criteria) this;
        }

        public Criteria andPersonGenderIsNull() {
            addCriterion("Person_Gender is null");
            return (Criteria) this;
        }

        public Criteria andPersonGenderIsNotNull() {
            addCriterion("Person_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andPersonGenderEqualTo(String value) {
            addCriterion("Person_Gender =", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderNotEqualTo(String value) {
            addCriterion("Person_Gender <>", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderGreaterThan(String value) {
            addCriterion("Person_Gender >", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Gender >=", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderLessThan(String value) {
            addCriterion("Person_Gender <", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderLessThanOrEqualTo(String value) {
            addCriterion("Person_Gender <=", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderLike(String value) {
            addCriterion("Person_Gender like", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderNotLike(String value) {
            addCriterion("Person_Gender not like", value, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderIn(List<String> values) {
            addCriterion("Person_Gender in", values, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderNotIn(List<String> values) {
            addCriterion("Person_Gender not in", values, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderBetween(String value1, String value2) {
            addCriterion("Person_Gender between", value1, value2, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonGenderNotBetween(String value1, String value2) {
            addCriterion("Person_Gender not between", value1, value2, "personGender");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgIsNull() {
            addCriterion("Person_Main_Img is null");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgIsNotNull() {
            addCriterion("Person_Main_Img is not null");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgEqualTo(String value) {
            addCriterion("Person_Main_Img =", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgNotEqualTo(String value) {
            addCriterion("Person_Main_Img <>", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgGreaterThan(String value) {
            addCriterion("Person_Main_Img >", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgGreaterThanOrEqualTo(String value) {
            addCriterion("Person_Main_Img >=", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgLessThan(String value) {
            addCriterion("Person_Main_Img <", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgLessThanOrEqualTo(String value) {
            addCriterion("Person_Main_Img <=", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgLike(String value) {
            addCriterion("Person_Main_Img like", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgNotLike(String value) {
            addCriterion("Person_Main_Img not like", value, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgIn(List<String> values) {
            addCriterion("Person_Main_Img in", values, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgNotIn(List<String> values) {
            addCriterion("Person_Main_Img not in", values, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgBetween(String value1, String value2) {
            addCriterion("Person_Main_Img between", value1, value2, "personMainImg");
            return (Criteria) this;
        }

        public Criteria andPersonMainImgNotBetween(String value1, String value2) {
            addCriterion("Person_Main_Img not between", value1, value2, "personMainImg");
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