public class Room extends Hotel{
    private int number;
    private RoomType type;
    private double price;
    private boolean isOccupied;

    public Room(int number, RoomType type, double price) {
        super();
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
