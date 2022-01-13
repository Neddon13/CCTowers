import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom1;
    Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(10, "Shetland");
        guest1 = new Guest("Bob");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Shetland", conferenceRoom1.getConfRoomName());
    }

    @Test
    public void confRoomStartsEmpty(){
        assertEquals(0, conferenceRoom1.getGuestListSize());
    }

    @Test
    public void confRoomCanAddGuest() {
        conferenceRoom1.checkInGuest(guest1);
        assertEquals(1, conferenceRoom1.getGuestListSize());
    }

    @Test
    public void confRoomCanCheckOutGuest(){
        conferenceRoom1.checkInGuest(guest1);
        conferenceRoom1.checkOutGuest(guest1);
        assertEquals(0, conferenceRoom1.getGuestListSize());
    }

}
