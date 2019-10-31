package com.william.film.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("Customer_Id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("Customer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("Customer_Id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("Customer_Id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("Customer_Id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_Id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("Customer_Id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_Id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("Customer_Id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("Customer_Id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("Customer_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("Customer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("Customer_Name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("Customer_Name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("Customer_Name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("Customer_Name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("Customer_Name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("Customer_Name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("Customer_Name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("Customer_Name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("Customer_Name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("Customer_Name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("Customer_Name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("Customer_Email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("Customer_Email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("Customer_Email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("Customer_Email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("Customer_Email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("Customer_Email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("Customer_Email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("Customer_Email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("Customer_Email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("Customer_Email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("Customer_Email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("Customer_Email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("Customer_Email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("Customer_Phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("Customer_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("Customer_Phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("Customer_Phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("Customer_Phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("Customer_Phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("Customer_Phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("Customer_Phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("Customer_Phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("Customer_Phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("Customer_Phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("Customer_Phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("Customer_Phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIsNull() {
            addCriterion("Customer_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIsNotNull() {
            addCriterion("Customer_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdEqualTo(String value) {
            addCriterion("Customer_Pwd =", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotEqualTo(String value) {
            addCriterion("Customer_Pwd <>", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdGreaterThan(String value) {
            addCriterion("Customer_Pwd >", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Pwd >=", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLessThan(String value) {
            addCriterion("Customer_Pwd <", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLessThanOrEqualTo(String value) {
            addCriterion("Customer_Pwd <=", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdLike(String value) {
            addCriterion("Customer_Pwd like", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotLike(String value) {
            addCriterion("Customer_Pwd not like", value, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdIn(List<String> values) {
            addCriterion("Customer_Pwd in", values, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotIn(List<String> values) {
            addCriterion("Customer_Pwd not in", values, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdBetween(String value1, String value2) {
            addCriterion("Customer_Pwd between", value1, value2, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerPwdNotBetween(String value1, String value2) {
            addCriterion("Customer_Pwd not between", value1, value2, "customerPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeIsNull() {
            addCriterion("Customer_Creat_Time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeIsNotNull() {
            addCriterion("Customer_Creat_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeEqualTo(Date value) {
            addCriterion("Customer_Creat_Time =", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeNotEqualTo(Date value) {
            addCriterion("Customer_Creat_Time <>", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeGreaterThan(Date value) {
            addCriterion("Customer_Creat_Time >", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Customer_Creat_Time >=", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeLessThan(Date value) {
            addCriterion("Customer_Creat_Time <", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("Customer_Creat_Time <=", value, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeIn(List<Date> values) {
            addCriterion("Customer_Creat_Time in", values, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeNotIn(List<Date> values) {
            addCriterion("Customer_Creat_Time not in", values, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeBetween(Date value1, Date value2) {
            addCriterion("Customer_Creat_Time between", value1, value2, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("Customer_Creat_Time not between", value1, value2, "customerCreatTime");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("Customer_Level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("Customer_Level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(Integer value) {
            addCriterion("Customer_Level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(Integer value) {
            addCriterion("Customer_Level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(Integer value) {
            addCriterion("Customer_Level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_Level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(Integer value) {
            addCriterion("Customer_Level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_Level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<Integer> values) {
            addCriterion("Customer_Level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<Integer> values) {
            addCriterion("Customer_Level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Level not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitIsNull() {
            addCriterion("Customer_Portrait is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitIsNotNull() {
            addCriterion("Customer_Portrait is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitEqualTo(String value) {
            addCriterion("Customer_Portrait =", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitNotEqualTo(String value) {
            addCriterion("Customer_Portrait <>", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitGreaterThan(String value) {
            addCriterion("Customer_Portrait >", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Portrait >=", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitLessThan(String value) {
            addCriterion("Customer_Portrait <", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitLessThanOrEqualTo(String value) {
            addCriterion("Customer_Portrait <=", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitLike(String value) {
            addCriterion("Customer_Portrait like", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitNotLike(String value) {
            addCriterion("Customer_Portrait not like", value, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitIn(List<String> values) {
            addCriterion("Customer_Portrait in", values, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitNotIn(List<String> values) {
            addCriterion("Customer_Portrait not in", values, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitBetween(String value1, String value2) {
            addCriterion("Customer_Portrait between", value1, value2, "customerPortrait");
            return (Criteria) this;
        }

        public Criteria andCustomerPortraitNotBetween(String value1, String value2) {
            addCriterion("Customer_Portrait not between", value1, value2, "customerPortrait");
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