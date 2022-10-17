import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("frank", 2);
    }

    @Test
    public void hasName(){

        assertEquals("frank", Person.name);
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getNoOfBags());
    }

}
