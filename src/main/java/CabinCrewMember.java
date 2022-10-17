public class CabinCrewMember extends Person {

    public String message;

    public CabinCrewMember(String name, CrewMember rank, String message){
        super(rank.getRank());
        Person.name = name;
        this.message = message;
    }

    public String getMessage(){
        return "buckle up, folks!";
    }

}
