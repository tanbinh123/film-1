package com.william.film.pojo;

import java.util.Date;

public class Customer {
    private Integer customerId;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String customerPwd;

    private Date customerCreatTime;

    private Integer customerLevel;

    private String customerPortrait;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
    }

    public Date getCustomerCreatTime() {
        return customerCreatTime;
    }

    public void setCustomerCreatTime(Date customerCreatTime) {
        this.customerCreatTime = customerCreatTime;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerPortrait() {
        return customerPortrait;
    }

    public void setCustomerPortrait(String customerPortrait) {
        this.customerPortrait = customerPortrait;
    }
}