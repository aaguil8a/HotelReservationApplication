package model;

import java.sql.Date;

public class Reservation {
    // Customer customer;
    // IRoom room;
    // Date checkInDate;
    // Date checkOutDate;
    private Customer customer;
    public IRoom room;
    private Date checkInDate;
    private Date checkOutDate;
    public Object reservations;

    public Reservation(String checkInDate2, String checkOutDate2, String customerEmail, IRoom room2) {
        this.customer = checkInDate2;
        this.room = checkOutDate2;
        this.checkInDate = customerEmail;
        this.checkOutDate = room2;
    }

    @Override
    public String toString() {
        return "Reservation [checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", customer=" + customer
                + ", room=" + room + "]";
    }

    
}
