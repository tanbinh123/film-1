package com.william.film.pojo;

public class OrderDetail {
    private Integer orderDetailId;

    private Integer orderId;

    private Integer scheduleId;

    private Integer orderDetailAdjustedprice;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getOrderDetailAdjustedprice() {
        return orderDetailAdjustedprice;
    }

    public void setOrderDetailAdjustedprice(Integer orderDetailAdjustedprice) {
        this.orderDetailAdjustedprice = orderDetailAdjustedprice;
    }
}