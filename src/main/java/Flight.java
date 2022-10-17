import java.util.ArrayList;

public class Flight {

    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private long capacity;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(String flightNo,long capacity, String destination, String departure, String departureTime){
        this.crewMembers = new ArrayList<CrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.capacity = capacity;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public String getFlightNo(){
        return flightNo;
    }

    public long getCapacity(){
        return capacity;
    }

    public String getDestination(){

        return destination;
    }

    public String getDeparture(){

        return departure;
    }

    public String getDepartureTime(){

        return departureTime;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void bookPassenger(){
        Passenger passenger = new Passenger("sam", 2);
        if(passengerCount() < this.capacity){
            this.passengers.add(passenger);
        }
    }

}
