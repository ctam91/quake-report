package com.example.android.quakereport;

/**
 * Created by tammy on 9/25/2017.
 */

public class Earthquake {
    private String mag;
    private String city;
    private Long mTimeInMilliseconds;


    public Earthquake(String mag, String city, Long date) {
        this.mag = mag;
        this.city = city;
        this.mTimeInMilliseconds = date;
    }

    public String getMag() {
        return mag;
    }

    public String getCity() {
        return city;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
