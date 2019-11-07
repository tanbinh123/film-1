package com.william.film.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        public Criteria andMovieNameIsNull() {
            addCriterion("Movie_Name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("Movie_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("Movie_Name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("Movie_Name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("Movie_Name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("Movie_Name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("Movie_Name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("Movie_Name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("Movie_Name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("Movie_Name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("Movie_Name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("Movie_Name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("Movie_Name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameIsNull() {
            addCriterion("Movie_Other_Name is null");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameIsNotNull() {
            addCriterion("Movie_Other_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameEqualTo(String value) {
            addCriterion("Movie_Other_Name =", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameNotEqualTo(String value) {
            addCriterion("Movie_Other_Name <>", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameGreaterThan(String value) {
            addCriterion("Movie_Other_Name >", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Other_Name >=", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameLessThan(String value) {
            addCriterion("Movie_Other_Name <", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameLessThanOrEqualTo(String value) {
            addCriterion("Movie_Other_Name <=", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameLike(String value) {
            addCriterion("Movie_Other_Name like", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameNotLike(String value) {
            addCriterion("Movie_Other_Name not like", value, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameIn(List<String> values) {
            addCriterion("Movie_Other_Name in", values, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameNotIn(List<String> values) {
            addCriterion("Movie_Other_Name not in", values, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameBetween(String value1, String value2) {
            addCriterion("Movie_Other_Name between", value1, value2, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieOtherNameNotBetween(String value1, String value2) {
            addCriterion("Movie_Other_Name not between", value1, value2, "movieOtherName");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorIsNull() {
            addCriterion("Movie_Drictor is null");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorIsNotNull() {
            addCriterion("Movie_Drictor is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorEqualTo(String value) {
            addCriterion("Movie_Drictor =", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorNotEqualTo(String value) {
            addCriterion("Movie_Drictor <>", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorGreaterThan(String value) {
            addCriterion("Movie_Drictor >", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Drictor >=", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorLessThan(String value) {
            addCriterion("Movie_Drictor <", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorLessThanOrEqualTo(String value) {
            addCriterion("Movie_Drictor <=", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorLike(String value) {
            addCriterion("Movie_Drictor like", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorNotLike(String value) {
            addCriterion("Movie_Drictor not like", value, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorIn(List<String> values) {
            addCriterion("Movie_Drictor in", values, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorNotIn(List<String> values) {
            addCriterion("Movie_Drictor not in", values, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorBetween(String value1, String value2) {
            addCriterion("Movie_Drictor between", value1, value2, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDrictorNotBetween(String value1, String value2) {
            addCriterion("Movie_Drictor not between", value1, value2, "movieDrictor");
            return (Criteria) this;
        }

        public Criteria andMovieDurationIsNull() {
            addCriterion("Movie_Duration is null");
            return (Criteria) this;
        }

        public Criteria andMovieDurationIsNotNull() {
            addCriterion("Movie_Duration is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDurationEqualTo(Integer value) {
            addCriterion("Movie_Duration =", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationNotEqualTo(Integer value) {
            addCriterion("Movie_Duration <>", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationGreaterThan(Integer value) {
            addCriterion("Movie_Duration >", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Movie_Duration >=", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationLessThan(Integer value) {
            addCriterion("Movie_Duration <", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationLessThanOrEqualTo(Integer value) {
            addCriterion("Movie_Duration <=", value, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationIn(List<Integer> values) {
            addCriterion("Movie_Duration in", values, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationNotIn(List<Integer> values) {
            addCriterion("Movie_Duration not in", values, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Duration between", value1, value2, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Duration not between", value1, value2, "movieDuration");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionIsNull() {
            addCriterion("Movie_Description is null");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionIsNotNull() {
            addCriterion("Movie_Description is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionEqualTo(String value) {
            addCriterion("Movie_Description =", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionNotEqualTo(String value) {
            addCriterion("Movie_Description <>", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionGreaterThan(String value) {
            addCriterion("Movie_Description >", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Description >=", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionLessThan(String value) {
            addCriterion("Movie_Description <", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Movie_Description <=", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionLike(String value) {
            addCriterion("Movie_Description like", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionNotLike(String value) {
            addCriterion("Movie_Description not like", value, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionIn(List<String> values) {
            addCriterion("Movie_Description in", values, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionNotIn(List<String> values) {
            addCriterion("Movie_Description not in", values, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionBetween(String value1, String value2) {
            addCriterion("Movie_Description between", value1, value2, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieDescriptionNotBetween(String value1, String value2) {
            addCriterion("Movie_Description not between", value1, value2, "movieDescription");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgIsNull() {
            addCriterion("Movie_Main_Img is null");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgIsNotNull() {
            addCriterion("Movie_Main_Img is not null");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgEqualTo(String value) {
            addCriterion("Movie_Main_Img =", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgNotEqualTo(String value) {
            addCriterion("Movie_Main_Img <>", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgGreaterThan(String value) {
            addCriterion("Movie_Main_Img >", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Main_Img >=", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgLessThan(String value) {
            addCriterion("Movie_Main_Img <", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgLessThanOrEqualTo(String value) {
            addCriterion("Movie_Main_Img <=", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgLike(String value) {
            addCriterion("Movie_Main_Img like", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgNotLike(String value) {
            addCriterion("Movie_Main_Img not like", value, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgIn(List<String> values) {
            addCriterion("Movie_Main_Img in", values, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgNotIn(List<String> values) {
            addCriterion("Movie_Main_Img not in", values, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgBetween(String value1, String value2) {
            addCriterion("Movie_Main_Img between", value1, value2, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieMainImgNotBetween(String value1, String value2) {
            addCriterion("Movie_Main_Img not between", value1, value2, "movieMainImg");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNull() {
            addCriterion("Movie_Type is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNotNull() {
            addCriterion("Movie_Type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeEqualTo(String value) {
            addCriterion("Movie_Type =", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotEqualTo(String value) {
            addCriterion("Movie_Type <>", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThan(String value) {
            addCriterion("Movie_Type >", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Type >=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThan(String value) {
            addCriterion("Movie_Type <", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThanOrEqualTo(String value) {
            addCriterion("Movie_Type <=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLike(String value) {
            addCriterion("Movie_Type like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotLike(String value) {
            addCriterion("Movie_Type not like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIn(List<String> values) {
            addCriterion("Movie_Type in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotIn(List<String> values) {
            addCriterion("Movie_Type not in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeBetween(String value1, String value2) {
            addCriterion("Movie_Type between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotBetween(String value1, String value2) {
            addCriterion("Movie_Type not between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseIsNull() {
            addCriterion("Movie_Release is null");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseIsNotNull() {
            addCriterion("Movie_Release is not null");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_Release =", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseNotEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_Release <>", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseGreaterThan(Date value) {
            addCriterionForJDBCDate("Movie_Release >", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_Release >=", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseLessThan(Date value) {
            addCriterionForJDBCDate("Movie_Release <", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_Release <=", value, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseIn(List<Date> values) {
            addCriterionForJDBCDate("Movie_Release in", values, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseNotIn(List<Date> values) {
            addCriterionForJDBCDate("Movie_Release not in", values, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Movie_Release between", value1, value2, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieReleaseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Movie_Release not between", value1, value2, "movieRelease");
            return (Criteria) this;
        }

        public Criteria andMovieEndIsNull() {
            addCriterion("Movie_End is null");
            return (Criteria) this;
        }

        public Criteria andMovieEndIsNotNull() {
            addCriterion("Movie_End is not null");
            return (Criteria) this;
        }

        public Criteria andMovieEndEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_End =", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_End <>", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndGreaterThan(Date value) {
            addCriterionForJDBCDate("Movie_End >", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_End >=", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndLessThan(Date value) {
            addCriterionForJDBCDate("Movie_End <", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Movie_End <=", value, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndIn(List<Date> values) {
            addCriterionForJDBCDate("Movie_End in", values, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("Movie_End not in", values, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Movie_End between", value1, value2, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Movie_End not between", value1, value2, "movieEnd");
            return (Criteria) this;
        }

        public Criteria andMovieBoxIsNull() {
            addCriterion("Movie_Box is null");
            return (Criteria) this;
        }

        public Criteria andMovieBoxIsNotNull() {
            addCriterion("Movie_Box is not null");
            return (Criteria) this;
        }

        public Criteria andMovieBoxEqualTo(Double value) {
            addCriterion("Movie_Box =", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxNotEqualTo(Double value) {
            addCriterion("Movie_Box <>", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxGreaterThan(Double value) {
            addCriterion("Movie_Box >", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxGreaterThanOrEqualTo(Double value) {
            addCriterion("Movie_Box >=", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxLessThan(Double value) {
            addCriterion("Movie_Box <", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxLessThanOrEqualTo(Double value) {
            addCriterion("Movie_Box <=", value, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxIn(List<Double> values) {
            addCriterion("Movie_Box in", values, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxNotIn(List<Double> values) {
            addCriterion("Movie_Box not in", values, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxBetween(Double value1, Double value2) {
            addCriterion("Movie_Box between", value1, value2, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBoxNotBetween(Double value1, Double value2) {
            addCriterion("Movie_Box not between", value1, value2, "movieBox");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeIsNull() {
            addCriterion("Movie_Broadcast_Type is null");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeIsNotNull() {
            addCriterion("Movie_Broadcast_Type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeEqualTo(String value) {
            addCriterion("Movie_Broadcast_Type =", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeNotEqualTo(String value) {
            addCriterion("Movie_Broadcast_Type <>", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeGreaterThan(String value) {
            addCriterion("Movie_Broadcast_Type >", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Movie_Broadcast_Type >=", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeLessThan(String value) {
            addCriterion("Movie_Broadcast_Type <", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeLessThanOrEqualTo(String value) {
            addCriterion("Movie_Broadcast_Type <=", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeLike(String value) {
            addCriterion("Movie_Broadcast_Type like", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeNotLike(String value) {
            addCriterion("Movie_Broadcast_Type not like", value, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeIn(List<String> values) {
            addCriterion("Movie_Broadcast_Type in", values, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeNotIn(List<String> values) {
            addCriterion("Movie_Broadcast_Type not in", values, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeBetween(String value1, String value2) {
            addCriterion("Movie_Broadcast_Type between", value1, value2, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieBroadcastTypeNotBetween(String value1, String value2) {
            addCriterion("Movie_Broadcast_Type not between", value1, value2, "movieBroadcastType");
            return (Criteria) this;
        }

        public Criteria andMovieExceptIsNull() {
            addCriterion("Movie_Except is null");
            return (Criteria) this;
        }

        public Criteria andMovieExceptIsNotNull() {
            addCriterion("Movie_Except is not null");
            return (Criteria) this;
        }

        public Criteria andMovieExceptEqualTo(Integer value) {
            addCriterion("Movie_Except =", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptNotEqualTo(Integer value) {
            addCriterion("Movie_Except <>", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptGreaterThan(Integer value) {
            addCriterion("Movie_Except >", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptGreaterThanOrEqualTo(Integer value) {
            addCriterion("Movie_Except >=", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptLessThan(Integer value) {
            addCriterion("Movie_Except <", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptLessThanOrEqualTo(Integer value) {
            addCriterion("Movie_Except <=", value, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptIn(List<Integer> values) {
            addCriterion("Movie_Except in", values, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptNotIn(List<Integer> values) {
            addCriterion("Movie_Except not in", values, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Except between", value1, value2, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieExceptNotBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Except not between", value1, value2, "movieExcept");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsIsNull() {
            addCriterion("Movie_Average_Stars is null");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsIsNotNull() {
            addCriterion("Movie_Average_Stars is not null");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsEqualTo(Integer value) {
            addCriterion("Movie_Average_Stars =", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsNotEqualTo(Integer value) {
            addCriterion("Movie_Average_Stars <>", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsGreaterThan(Integer value) {
            addCriterion("Movie_Average_Stars >", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Movie_Average_Stars >=", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsLessThan(Integer value) {
            addCriterion("Movie_Average_Stars <", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsLessThanOrEqualTo(Integer value) {
            addCriterion("Movie_Average_Stars <=", value, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsIn(List<Integer> values) {
            addCriterion("Movie_Average_Stars in", values, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsNotIn(List<Integer> values) {
            addCriterion("Movie_Average_Stars not in", values, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Average_Stars between", value1, value2, "movieAverageStars");
            return (Criteria) this;
        }

        public Criteria andMovieAverageStarsNotBetween(Integer value1, Integer value2) {
            addCriterion("Movie_Average_Stars not between", value1, value2, "movieAverageStars");
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