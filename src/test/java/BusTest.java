import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Dunbar");
        person = new Person();
        busstop = new BusStop("princes st");
        busstop.addToQueue(person);

    }
    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void busCanAddPerson(){
        bus.pickupFromQueue(busstop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busstop.removePerson());
    }
    @Test
    public void shoveGrannyOffBus(){
        bus.pickupFromQueue(busstop);
        bus.shoveGranny();
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void busHasDestination(){
        assertEquals("Dunbar", bus.getDestination());
    }
    @Test
    public void busHasCapacity(){
        assertEquals(50, bus.hasCapacity());
    }
}
