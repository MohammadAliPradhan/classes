import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private List<Roomm> rooms;
    private List<Guest> guests;

    public Hotel() {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public void addRoom(Roomm room) {
        rooms.add(room);
    }

    public void checkIn(Guest guest, Roomm room) {
        guest.checkIn(room);
        guests.add(guest);
    }

    public void checkOut(Guest guest) {
        guest.checkOut();
        guests.remove(guest);
    }
}

class Roomm {
    private int number;
    private RoomType type;
    private double price;
    private boolean isOccupied;

    public Roomm(int number, RoomType type, double price) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.isOccupied = false;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}

class Guest {
    private String name;
    private Roomm room;

    public Guest(String name) {
        this.name = name;
    }

    public void checkIn(Roomm room) {
        this.room = room;
        room.setOccupied(true);
    }

    public void checkOut() {
        room.setOccupied(false);
        room = null;
    }
}

enum RoomType {
    SINGLE, DOUBLE, SUITE
}

public class HotelManagementProject {
    public static void main(String[] args) {
        // Create an instance of the Hotel class
        Hotel hotel = new Hotel();

        // Create instances of Room
        Roomm room1 = new Roomm(101, RoomType.SINGLE, 100.0);
        Roomm room2 = new Roomm(102, RoomType.DOUBLE, 150.0);
        Roomm room3 = new Roomm(201, RoomType.SUITE, 250.0);

        // Add rooms to the hotel
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // Create instances of Guest
        Guest guest1 = new Guest("Alice");
        Guest guest2 = new Guest("Bob");

        // Check-in guests to specific rooms
        hotel.checkIn(guest1, room1);
        hotel.checkIn(guest2, room2);

        // Check-out a guest
        hotel.checkOut(guest1);
    }
}
