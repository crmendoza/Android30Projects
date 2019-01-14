package com.example.owemhgee.java.criminalintent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Boolean getSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {

        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getFormattedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(mDate);
    }
}
