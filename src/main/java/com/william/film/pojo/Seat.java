package com.william.film.pojo;

public class Seat extends SeatKey {
    private Integer hallId;

    private Integer seatExist;

    private Integer seatState;

    private Integer seatLevel;

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public Integer getSeatExist() {
        return seatExist;
    }

    public void setSeatExist(Integer seatExist) {
        this.seatExist = seatExist;
    }

    public Integer getSeatState() {
        return seatState;
    }

    public void setSeatState(Integer seatState) {
        this.seatState = seatState;
    }

    public Integer getSeatLevel() {
        return seatLevel;
    }

    public void setSeatLevel(Integer seatLevel) {
        this.seatLevel = seatLevel;
    }
}