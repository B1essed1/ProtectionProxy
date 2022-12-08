package com.codebetter.husbandproxy;

public class Wife implements Family{
    private Food food;

    public Wife(Food food) {
        this.food = food;
    }

    @Override
    public void canYouCookFofMe() {
            System.out.printf("Yes! I can cook this %s for you in this time ", food.getName());
    }

    public Food getFood() {
        return food;
    }
}
