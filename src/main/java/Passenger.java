public class Passenger extends Person {

    private long noOfBags;

    public Passenger(String name, long noOfBags){
        super(name);
        this.noOfBags = noOfBags;
    }

    public long getNoOfBags(){

        return noOfBags;
    }

}
