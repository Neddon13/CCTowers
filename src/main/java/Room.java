import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    protected ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public void checkInGuest(Guest _guest){
        this.guestList.add(_guest);
    }

    public void checkOutGuest(Guest _guest){
        this.guestList.remove(_guest);
    }

    public int getCapacity(){
        return this.capacity;
    }

}
