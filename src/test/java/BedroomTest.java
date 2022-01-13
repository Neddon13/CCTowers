import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    RoomType roomType;
    Bedroom room101;
    Guest guest1;

    @Before
    public void before(){
        room101 = new Bedroom(roomType.SINGLE.getValue(), 101, RoomType.SINGLE, 70);
        guest1 = new Guest("Bob");
    }

    @Test
    public void singleHasCapacity1(){
        assertEquals(RoomType.SINGLE.getValue(), room101.getCapacity());
    }

    @Test
    public void singleHasRoomNumber(){
        assertEquals(101, room101.getRoomNumber());
    }

    @Test
    public void singleHasRoomType(){
        assertEquals(RoomType.SINGLE, room101.getRoomType());
    }

    @Test
    public void singleStartsEmpty(){
        assertEquals(0, room101.getGuestListSize());
    }

    @Test
    public void singleCanAddGuest(){
        room101.checkInGuest(guest1);
        assertEquals(1, room101.getGuestListSize());

    }

    @Test
    public void singleCanCheckOutGuest(){
        room101.checkInGuest(guest1);
        room101.checkOutGuest(guest1);
        assertEquals(0, room101.getGuestListSize());
    }
}
