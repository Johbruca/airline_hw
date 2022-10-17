import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("sarah", CrewMember.ATTENDANT, "buckle up, folks!");
    }

    @Test
    public void hasName(){
        assertEquals("sarah", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("attendant", CrewMember.ATTENDANT.getRank());
    }

    @Test
    public void hasMessage(){
        assertEquals("buckle up, folks!", cabinCrewMember.message);
    }

}
