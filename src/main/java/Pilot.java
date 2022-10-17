public class Pilot extends Person{

    public String licenceNo;
    public String fly;

    public Pilot(String name, CrewMember rank, String licenceNo, String fly){
        super(rank.getRank());
        Person.name = name;
        this.licenceNo = licenceNo;
        this.fly = fly;
    }

    public String getLicenceNo(){
        return licenceNo;
    }

    public String getFly(){
        return "come fly with me";
    }

}
