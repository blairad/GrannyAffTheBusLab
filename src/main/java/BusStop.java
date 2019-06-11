import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name){
        this.queue = new ArrayList<Person>();
        this.name = name;
    }
    public int passengerCount(){
        return this.queue.size();
    }
    public void addToQueue(Person person){
        this.queue.add(person);
    }
    public Person removePerson(){
        return this.queue.remove(0);
    }

}
