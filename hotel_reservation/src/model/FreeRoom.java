package model;

public class FreeRoom extends Room{
    public FreeRoom(String roomNumber, Double price, RoomType roomType) {
        // set price to 0.0
        super(roomNumber, 0.0, roomType);
       
    }
    // override toString() method
    @Override
    public String toString() {
        return "Room Number: " + getRoomNumber() + " Room Price: " + getRoomPrice() + " Room Type: " + getRoomType();
    }

  
}
