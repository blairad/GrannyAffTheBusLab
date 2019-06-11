import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busstop;
    Person person;


    @Before
    public void before(){
        person = new Person();
        busstop = new BusStop("princes st");
    }
    @Test
    public void canAddPerson(){
        busstop.addToQueue(person);
        assertEquals(1, busstop.passengerCount());
    }
    @Test
    public void canRemovePerson(){
        busstop.addToQueue(person);
        busstop.removePerson();
        assertEquals(0,busstop.passengerCount());
    }
//    @Test
//    public void
}
