package com.example.android.quakereport;

/**
 * Created by tammy on 9/25/2017.
 */

public class Earthquake {
    private double mag;
    private String place;
    private Long mTimeInMilliseconds;


    public Earthquake(double mag, String place, Long date) {
        this.mag = mag;
        this.place = place;
        this.mTimeInMilliseconds = date;
    }

    public double getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
