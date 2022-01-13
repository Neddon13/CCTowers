import java.util.ArrayList;

public class Hotel {

    protected ArrayList<Bedroom> roomList;
    protected ArrayList<ConferenceRoom> conferenceRoomList;
    private Bedroom roomSelected;
    Booking booking;

    public Hotel(ArrayList<Bedroom> roomList, ArrayList<ConferenceRoom> conferenceRoomList) {
        this.roomList = roomList;
        this.conferenceRoomList = conferenceRoomList;
    }


    public int getRoomListSize() {
        return this.roomList.size();
    }

    public int getConfRoomListSize() {
        return this.conferenceRoomList.size();
    }

    public Booking createBooking(RoomType _rType, int _nights) {
        for(Bedroom r: this.roomList){
            if (r.getRoomType() == _rType){
                roomSelected = r;
            }
        }

        booking = new Booking(roomSelected,_nights);
        return booking;
    }

    public double getBill(Booking _booking) {
        return _booking.getNights()*_booking.getBookingRoom().getPrice();
    }
}
