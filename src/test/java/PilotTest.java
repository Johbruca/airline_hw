import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("dave", CrewMember.PILOT, "JA123", "come fly with me");
    }

    @Test
    public void hasName(){

        assertEquals("dave", Person.name);
    }

    @Test
    public void hasRank(){
        assertEquals("captain", CrewMember.PILOT.getRank());
    }

    @Test
    public void hasLicenceNo(){
        assertEquals("JA123", pilot.licenceNo);
    }

    @Test
    public void canFly(){
        assertEquals("come fly with me", pilot.fly);
    }

}
