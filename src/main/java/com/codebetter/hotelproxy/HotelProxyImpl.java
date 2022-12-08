package com.codebetter.hotelproxy;

public class HotelProxyImpl extends Hotel{
    /**
    * this class should be the same as Hotel class
     * that is why we must extend it.
     *
    * */

    public HotelProxyImpl(Authorization authorization) {
        super(authorization);
    }

    @Override
    public void enteringRoom() {
        if (super.authorization.isBooked()){
            System.out.println(super.authorization.getRoomNum() + " room is yours, have a nice rest");
            super.enteringRoom();
        } else {
            throw new RuntimeException(super.authorization.getName() + " was not booked any room we can" +
                    " not give him a permission to enter that requested room ");
        }
    }
}
