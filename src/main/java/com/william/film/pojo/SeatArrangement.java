package com.william.film.pojo;

public class SeatArrangement {
    private Integer seatArrangementId;

    private Integer seatId;

    private Integer scheduleId;

    private Integer customerId;

    private Integer seatState;

    public Integer getSeatArrangementId() {
        return seatArrangementId;
    }

    public void setSeatArrangementId(Integer seatArrangementId) {
        this.seatArrangementId = seatArrangementId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSeatState() {
        return seatState;
    }

    public void setSeatState(Integer seatState) {
        this.seatState = seatState;
    }

    @Override
    public String toString() {
        return "SeatArrangement{" +
                "seatArrangementId=" + seatArrangementId +
                ", seatId=" + seatId +
                ", scheduleId=" + scheduleId +
                ", customerId=" + customerId +
                ", seatState=" + seatState +
                '}';
    }
}