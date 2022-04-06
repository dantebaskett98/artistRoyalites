public class AssistantEngineer extends Engineer {

    public AssistantEngineer(String engineerName, String studio) {
        super(engineerName, studio);
    }
    
    public void setAssistantEngineerName(String engineerName) {
        super.setEngineerName(engineerName);
    }

    public String getAssistantEngineerName() {
        return super.getEngineerName();
    }

    public void setStudio(String studio) {
        super.setStudio(studio);
    }

    public String getStudio() { 
        return super.getStudio();
    }

    @Override
    public String toString() {
        return super.toString();
    }   
}
