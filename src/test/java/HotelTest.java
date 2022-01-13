import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    private ArrayList<Bedroom> roomList;
    private ArrayList<ConferenceRoom> confRoomList;

    Booking booking1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.SINGLE.getValue(), 1, RoomType.SINGLE, 70);
        bedroom2 = new Bedroom(RoomType.DOUBLE.getValue(), 102, RoomType.DOUBLE, 90);
        bedroom3 = new Bedroom(RoomType.SINGLE.getValue(), 3, RoomType.SINGLE, 70);
        conferenceRoom1 = new ConferenceRoom(10, "CF1");
        conferenceRoom2 = new ConferenceRoom(20, "CF2");
        conferenceRoom3 = new ConferenceRoom(30, "CF3");

        roomList = new ArrayList<Bedroom>();
        roomList.add(bedroom1);
        roomList.add(bedroom2);
        roomList.add(bedroom3);

        confRoomList = new ArrayList<ConferenceRoom>();
        confRoomList.add(conferenceRoom1);
        confRoomList.add(conferenceRoom2);
        confRoomList.add(conferenceRoom3);

        guest1 = new Guest("Tom");
        guest2 = new Guest("Sam");
        guest3 = new Guest("John");


        hotel = new Hotel(roomList, confRoomList);

//        booking1 = new Booking(bedroom1,2);
    }

    @Test
    public void hotelHasRooms(){
        assertEquals(3, hotel.getRoomListSize());
        assertEquals(3, hotel.getConfRoomListSize());
    }

    @Test
    public void hotelCanCheckInGuests() {
        hotel.roomList.get(0).checkInGuest(guest1);
        hotel.conferenceRoomList.get(0).checkInGuest(guest2);
        assertEquals(1, hotel.roomList.get(0).getGuestListSize());
        assertEquals(1, hotel.conferenceRoomList.get(0).getGuestListSize());
    }

    @Test
    public void hotelCanCheckOutGuests() {
        hotel.roomList.get(0).checkInGuest(guest1);
        hotel.roomList.get(0).checkOutGuest(guest1);
        hotel.conferenceRoomList.get(0).checkInGuest(guest2);
        hotel.conferenceRoomList.get(0).checkOutGuest(guest2);
        assertEquals(0, hotel.roomList.get(0).getGuestListSize());
        assertEquals(0, hotel.conferenceRoomList.get(0).getGuestListSize());
    }

    @Test
    public void hotelCanCreateBooking(){
        assertEquals(102, hotel.createBooking(RoomType.DOUBLE,2).roomBooked.getRoomNumber());
    }

    @Test
    public void hotelCanProvideBill(){
        booking1 = hotel.createBooking(RoomType.DOUBLE,2);
        assertEquals(180.00, hotel.getBill(booking1),0);
    }
}
