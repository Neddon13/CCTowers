public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double price;


    public Bedroom(int capacity, int _roomNumber, RoomType _roomType, double _price) {
        super(capacity);
        this.roomNumber = _roomNumber;
        this.roomType = _roomType;
        this.price = _price;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getGuestListSize(){
        return this.guestList.size();
    }

    public void checkInGuest(Guest _guest){
        this.guestList.add(_guest);
    }

    public double getPrice() {
        return price;
    }


}
