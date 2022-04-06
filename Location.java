public enum Location {

    LOS_ANGELES("LA"), NEW_YORK("NY"), STOCKHOLM("STHLM");

    private String location;
    private String outputString;

    private Location(String location) {
        this.location = location;
        this.outputString = location;
    }

    public String getLocation() {
        return location;
    }  

    public String toString() {
        return outputString;
    }

    public Location toLocation(Location location) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
