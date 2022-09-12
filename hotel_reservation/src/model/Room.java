package model;

public class Room implements IRoom {
    private String roomNumber;
    private Double price;
    // add enum RoomType
    private RoomType roomType;

    public Room(String roomNumber, Double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
    }

    @Override
    public String getRoomNumber() {
        // TODO Auto-generated method stub
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public RoomType getRoomType() {
        // TODO Auto-generated method stub
        return roomType;
    }

    @Override
    public boolean isFree() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + " Room Price: " + price + " Room Type: " + roomType;
    }


    
}
