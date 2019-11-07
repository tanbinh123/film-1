package com.william.film.pojo;

import java.util.Date;

public class Movie {
    private Integer movieId;

    private String movieName;

    private String movieOtherName;

    private String movieDrictor;

    private Integer movieDuration;

    private String movieDescription;

    private String movieMainImg;

    private String movieType;

    private Date movieRelease;

    private Date movieEnd;

    private Double movieBox;

    private String movieBroadcastType;

    private Integer movieExcept;

    private Integer movieAverageStars;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieOtherName() {
        return movieOtherName;
    }

    public void setMovieOtherName(String movieOtherName) {
        this.movieOtherName = movieOtherName;
    }

    public String getMovieDrictor() {
        return movieDrictor;
    }

    public void setMovieDrictor(String movieDrictor) {
        this.movieDrictor = movieDrictor;
    }

    public Integer getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieMainImg() {
        return movieMainImg;
    }

    public void setMovieMainImg(String movieMainImg) {
        this.movieMainImg = movieMainImg;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public Date getMovieRelease() {
        return movieRelease;
    }

    public void setMovieRelease(Date movieRelease) {
        this.movieRelease = movieRelease;
    }

    public Date getMovieEnd() {
        return movieEnd;
    }

    public void setMovieEnd(Date movieEnd) {
        this.movieEnd = movieEnd;
    }

    public Double getMovieBox() {
        return movieBox;
    }

    public void setMovieBox(Double movieBox) {
        this.movieBox = movieBox;
    }

    public String getMovieBroadcastType() {
        return movieBroadcastType;
    }

    public void setMovieBroadcastType(String movieBroadcastType) {
        this.movieBroadcastType = movieBroadcastType;
    }

    public Integer getMovieExcept() {
        return movieExcept;
    }

    public void setMovieExcept(Integer movieExcept) {
        this.movieExcept = movieExcept;
    }

    public Integer getMovieAverageStars() {
        return movieAverageStars;
    }

    public void setMovieAverageStars(Integer movieAverageStars) {
        this.movieAverageStars = movieAverageStars;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieOtherName='" + movieOtherName + '\'' +
                ", movieDrictor='" + movieDrictor + '\'' +
                ", movieDuration=" + movieDuration +
                ", movieDescription='" + movieDescription + '\'' +
                ", movieMainImg='" + movieMainImg + '\'' +
                ", movieType='" + movieType + '\'' +
                ", movieRelease=" + movieRelease +
                ", movieEnd=" + movieEnd +
                ", movieBox=" + movieBox +
                ", movieBroadcastType='" + movieBroadcastType + '\'' +
                ", movieExcept=" + movieExcept +
                ", movieAverageStars=" + movieAverageStars +
                '}';
    }
}