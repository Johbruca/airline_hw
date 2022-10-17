public enum CrewMember {

    PILOT("captain"),
    ATTENDANT("attendant");

    private final String rank;

    CrewMember( String rank){

        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
