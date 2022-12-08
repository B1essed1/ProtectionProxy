package com.codebetter.husbandproxy;

import java.time.LocalTime;
import java.util.Date;

public class Food {

    public Food(LocalTime date, String name) {
        this.date = date;
        this.name = name;
    }

    //this date represents the time of cooked food
    private LocalTime date;

    //foods name
    private String name;

    public LocalTime getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
