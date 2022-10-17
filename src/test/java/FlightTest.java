import jdk.jfr.Recording;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp(){
        flight = new Flight("BA123",40, "LIS", "EDI", "14:00");
        pilot = new Pilot("dave", CrewMember.PILOT, "JA123", "come fly with me");
        cabinCrewMember = new CabinCrewMember("sarah", CrewMember.ATTENDANT, "buckle up, folks!");
        passenger1 = new Passenger("mike", 1);
        passenger2 = new Passenger("peter", 3);
        passenger3 = new Passenger("kate", 1);
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(40, flight.getCapacity());
    }

    @Test
    public void canBookPassenger(){
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        assertEquals( "sam", flight.bookPassenger());
    }

}
