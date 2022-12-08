package com.codebetter.hotelproxy;

public class Hotel implements Accommodation{

    Authorization authorization;


    public Hotel(Authorization authorization) {
        this.authorization = authorization;
    }

    @Override
    public void enteringRoom(){
        System.out.printf("%d room reserved by %s",authorization.getRoomNum(),authorization.getName());
    }
}
