package com.codebetter.hotelproxy;

public class Authorization {
    // some have to book/reserve hotel room before entering
    private boolean isBooked;

    public Authorization(boolean isBooked, int roomNum, String name) {
        this.isBooked = isBooked;
        this.roomNum = roomNum;
        this.name = name;
    }

    //booked room number
    private int roomNum;
    private String name;


    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
