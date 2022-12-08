package com.codebetter.husbandproxy;

import java.time.LocalTime;

public class Husband {
    public static void main(String[] args) {
        Family request =  new AuntyProxy(new Food(LocalTime.of(3,0,0), "Palov"));
        request.canYouCookFofMe();
    }
}
