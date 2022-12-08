package com.codebetter.husbandproxy;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AuntyProxy extends Wife {

    public AuntyProxy(Food food) {
        super(food);
    }

    @Override
    public void canYouCookFofMe() {
        if (LocalTime.now().until(super.getFood().getDate(), ChronoUnit.HOURS) < 2L) {
            super.canYouCookFofMe();
        } else {
            throw new RuntimeException("No sorry!! She cannot cook this food in this time");
        }
    }
}
