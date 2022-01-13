public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(int capacity, String _name) {
        super(capacity);
        this.name = _name;
    }

    public String getConfRoomName(){
        return this.name;
    }

    public int getGuestListSize(){
        return this.guestList.size();
    }

    public void checkInGuest(Guest _guest){
        this.guestList.add(_guest);
    }

}