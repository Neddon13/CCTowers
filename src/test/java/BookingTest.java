import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    Booking booking1;
    Booking booking2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.SINGLE.getValue(), 1, RoomType.SINGLE, 70);
        bedroom2 = new Bedroom(RoomType.SINGLE.getValue(), 2, RoomType.SINGLE, 90);
        bedroom3 = new Bedroom(RoomType.SINGLE.getValue(), 3, RoomType.SINGLE, 70);

        booking1 = new Booking(bedroom1,2);
        booking2 = new Booking(bedroom2, 4);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(bedroom1, booking1.getBookingRoom());
    }

    @Test
    public void bookingHasNights(){
        assertEquals(2, booking1.getNights());

    }
}
