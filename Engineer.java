public class Engineer {

    private String engineerName;
    private String studio;

    public Engineer(String engineerName, String studio) {
        this.engineerName = engineerName;
        this.studio = studio;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getStudio() { 
        return studio;
    }

    @Override
    public String toString() {
        return this.getClass() + " Name: " + engineerName + " Studio: " + studio;
    }


}



