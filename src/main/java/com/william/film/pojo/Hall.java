package com.william.film.pojo;

public class Hall {
    private Integer hallId;

    private String hallName;

    private Integer theaterId;

    private String hallType;

    private Double hallBasicPrice;

    private String hallDescription;

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    public double getHallBasicPrice() {
        return hallBasicPrice;
    }

    public void setHallBasicPrice(double hallBasicPrice) {
        this.hallBasicPrice = hallBasicPrice;
    }

    public String getHallDescription() {
        return hallDescription;
    }

    public void setHallDescription(String hallDescription) {
        this.hallDescription = hallDescription;
    }
}