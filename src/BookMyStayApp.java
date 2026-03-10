/**
 * HotelRoomApp
 *
 * <p>This application demonstrates object-oriented modeling using
 * abstraction, inheritance, and polymorphism. Different room types
 * are created and their availability is displayed in the console.</p>
 *
 * @author YourName
 * @version 1.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        // Creating room objects using polymorphism
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("===== HOTEL ROOM AVAILABILITY =====");

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailable);
        System.out.println();

        System.out.println("===================================");
    }
}

/**
 * Abstract class representing a generic hotel room.
 * Defines common attributes shared by all room types.
 */
abstract class Room {

    protected String roomType;
    protected int numberOfBeds;
    protected int size;
    protected double price;

    /**
     * Constructor for initializing room attributes.
     */
    public Room(String roomType, int numberOfBeds, int size, double price) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.price = price;
    }

    /**
     * Displays room details.
     */
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price per Night: $" + price);
    }
}

/**
 * Represents a Single Room type.
 */
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 100.0);
    }
}

/**
 * Represents a Double Room type.
 */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 180.0);
    }
}

/**
 * Represents a Suite Room type.
 */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 350.0);
    }
}