package com.codebetter.hotelproxy;

public class Tourist {
    public static void main(String[] args) {
        Accommodation hotel = new HotelProxyImpl( new Authorization(true,10,"Senior Pro Max"));
        hotel.enteringRoom();

    }
}
