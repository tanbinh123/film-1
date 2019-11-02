package com.william.film.pojo;

import java.util.Date;

public class Schedule {
    private Integer scheduleId;

    private Integer movieId;

    private Integer hallId;

    private Integer schedulePrice;

    private Date scheduleBeginDateTime;

    private Date scheduleEndDateTime;

    private Integer scheduleHoliday;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getSchedulePrice() {
        return schedulePrice;
    }

    public void setSchedulePrice(Integer schedulePrice) {
        this.schedulePrice = schedulePrice;
    }

    public Date getScheduleBeginDateTime() {
        return scheduleBeginDateTime;
    }

    public void setScheduleBeginDateTime(Date scheduleBeginDateTime) {
        this.scheduleBeginDateTime = scheduleBeginDateTime;
    }

    public Date getScheduleEndDateTime() {
        return scheduleEndDateTime;
    }

    public void setScheduleEndDateTime(Date scheduleEndDateTime) {
        this.scheduleEndDateTime = scheduleEndDateTime;
    }

    public Integer getScheduleHoliday() {
        return scheduleHoliday;
    }

    public void setScheduleHoliday(Integer scheduleHoliday) {
        this.scheduleHoliday = scheduleHoliday;
    }
}