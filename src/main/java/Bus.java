import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity = 50;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }
    public void pickupFromQueue(BusStop busstop){
        Person person = busstop.removePerson();
        passengers.add(person);
    }
    public void shoveGranny(){
        this.passengers.remove(0);
    }
    public String getDestination(){
        return this.destination;
    }
    public int hasCapacity(){
        return this.capacity;
    }


}
