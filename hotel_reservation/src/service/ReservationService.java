package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import model.Customer;
import model.IRoom;
import model.Reservation;

public class ReservationService {
// provide a static refence
// create a collection to store and retrieve reservations

public static ReservationService reservationService = null;
public static List<Reservation> reservations = new ArrayList<>();

public String checkInDate;
public String checkOutDate;
public String customerEmail;
public IRoom room;

// constructor
public ReservationService(String checkInDate, String checkOutDate, String customerEmail, IRoom room) {
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.customerEmail = customerEmail;
    this.room = room;
}

public void addRoom(IRoom room) {
    reservations.add(new Reservation(checkInDate, checkOutDate, customerEmail, room));

}

public IRoom getARoom(String roomNumber) {
    // this method returns the Room object of rooom with id = roomid
    for (Reservation reservation : reservations) {
        if (reservation.room.equals(roomNumber)) {
            return reservation.room;
        }
    }
    return room;


}

public Reservation reserveARoom(Customer customer, IRoom room, String checkInDate, String checkOutDate) {
    /*
     * This method is responsible for storing the details (which are received in the input argument) of reservation into the Collection (say list)
     *  that you will use to store the reservations
     * 
     * 
     * 
     */

     



}


public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
    /*
     * 
     * This function is the heart of the application. 
     * In this function you will find the rooms which are free based on the 2 dates you receive as the argument
     * 
     * 
     * You will need to loop through all the rooms and see which are reserved between 
     * these two dates to search for the available rooms
     * 
     * 
     */

}




public Collection<Reservation> getCustomersReservation(Customer customer) {
    
    // The function is responsible to print all the reservations by a particular customer. 
    // You will need to loop through all the reservations 
    // and search for the reservations made by the customer which is received as input parameter.



}

public void printAllReservation() {
    /// his function will print all the reservations made in the application ie. 
    // irrespective of which customer made the reservation.

}















    
}
