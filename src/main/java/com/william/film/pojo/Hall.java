package com.william.film.pojo;

public class Hall {
    private Integer hallId;

    private Integer theaterId;

    private String hallType;

    private Integer hallBasicPrice;

    private String hallDescription;

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
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

    public Integer getHallBasicPrice() {
        return hallBasicPrice;
    }

    public void setHallBasicPrice(Integer hallBasicPrice) {
        this.hallBasicPrice = hallBasicPrice;
    }

    public String getHallDescription() {
        return hallDescription;
    }

    public void setHallDescription(String hallDescription) {
        this.hallDescription = hallDescription;
    }
}