public class Booking {
    protected Bedroom roomBooked;
    private int nights;

    public Booking(Bedroom _roomBooked, int _nights) {
        this.roomBooked = _roomBooked;
        this.nights = _nights;
    }

    public Bedroom getBookingRoom() {
        return this.roomBooked;
    }

    public int getNights() {
        return this.nights;
    }

//    public Booking createBooking(){
//    }
}
