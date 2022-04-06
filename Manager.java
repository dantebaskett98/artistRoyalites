import java.text.DecimalFormat;

public class Manager { //builder

    private String name, company;
    private int numClients = 0, numYearsWorked = 0;
    private double percent = 0;

    private Manager(ManagerBuilder builder) {
        this.name = builder.name;
        this.company = builder.company;
        this.numClients = builder.numClients;
        this.numYearsWorked = builder.numYearsWorked;
        this.percent = builder.percent;
    }

    public static class ManagerBuilder {
        private String name, company;
        private int numClients = 0, numYearsWorked = 0;
        private double percent = 0;

        public ManagerBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public ManagerBuilder numClients(int var) {
            this.numClients = var;
            return this;
        }
        
        public ManagerBuilder numYearsWorked(int var) {
            this.numYearsWorked = var;
            return this;
        }
       
        public ManagerBuilder percent(double var) {
            this.percent = var;
            return this;
        }

        public Manager build() {
            return new Manager(this); 
        } 
    }

    DecimalFormat df = new DecimalFormat("#%");

    public String toString() {
        return " Name: " + name + ", Company: " + company + ", Number of clients: " + numClients 
        + ", Years worked: " +numYearsWorked + ", Percent of client's revenue: " + df.format(percent);
    }
}