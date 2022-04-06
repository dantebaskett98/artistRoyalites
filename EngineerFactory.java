public class EngineerFactory {

    public static Engineer newEngineer(String engineerName, String studio) {
        Engineer e;

        if (studio.equals("A") || studio.equals("B") || studio.equals("C")) {
            e = new Engineer(engineerName, studio);
        } else {
            e = new AssistantEngineer(engineerName, studio);
        }

        return e;
    }
}
