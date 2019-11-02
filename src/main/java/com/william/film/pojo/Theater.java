package com.william.film.pojo;

public class Theater {
    private Integer theaterId;

    private String theaterName;

    private String theaterProvince;

    private String theaterCity;

    private String theaterArea;

    private String theaterBrand;

    private Integer thraterState;

    private String theaterSpecficLocation;

    private String theaterTelephone;

    private String theaterImg;

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterProvince() {
        return theaterProvince;
    }

    public void setTheaterProvince(String theaterProvince) {
        this.theaterProvince = theaterProvince;
    }

    public String getTheaterCity() {
        return theaterCity;
    }

    public void setTheaterCity(String theaterCity) {
        this.theaterCity = theaterCity;
    }

    public String getTheaterArea() {
        return theaterArea;
    }

    public void setTheaterArea(String theaterArea) {
        this.theaterArea = theaterArea;
    }

    public String getTheaterBrand() {
        return theaterBrand;
    }

    public void setTheaterBrand(String theaterBrand) {
        this.theaterBrand = theaterBrand;
    }

    public Integer getThraterState() {
        return thraterState;
    }

    public void setThraterState(Integer thraterState) {
        this.thraterState = thraterState;
    }

    public String getTheaterSpecficLocation() {
        return theaterSpecficLocation;
    }

    public void setTheaterSpecficLocation(String theaterSpecficLocation) {
        this.theaterSpecficLocation = theaterSpecficLocation;
    }

    public String getTheaterTelephone() {
        return theaterTelephone;
    }

    public void setTheaterTelephone(String theaterTelephone) {
        this.theaterTelephone = theaterTelephone;
    }

    public String getTheaterImg() {
        return theaterImg;
    }

    public void setTheaterImg(String theaterImg) {
        this.theaterImg = theaterImg;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterId=" + theaterId +
                ", theaterName='" + theaterName + '\'' +
                ", theaterProvince='" + theaterProvince + '\'' +
                ", theaterCity='" + theaterCity + '\'' +
                ", theaterArea='" + theaterArea + '\'' +
                ", theaterBrand='" + theaterBrand + '\'' +
                ", thraterState=" + thraterState +
                ", theaterSpecficLocation='" + theaterSpecficLocation + '\'' +
                ", theaterTelephone='" + theaterTelephone + '\'' +
                ", theaterImg='" + theaterImg + '\'' +
                '}';
    }
}