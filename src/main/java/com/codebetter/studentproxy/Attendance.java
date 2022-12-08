package com.codebetter.studentproxy;

import java.util.Date;

public class Attendance {

    public Attendance(Date date, boolean isPresent) {
        this.date = date;
        this.isPresent = isPresent;
    }
    private Date date;
    private boolean isPresent;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}

