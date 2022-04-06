public class Instrumentalist extends Artist {
    
    private String instrument;
    private int fee;
    private int numSessions;
    
    public Instrumentalist(String name, String genre, String instrument, Royalties royalties, int fee, 
    int numSessions, Location location) {
        super(name, genre, new InstrumentalRoyalties(), location);
        this.instrument = instrument;
        this.fee = fee;
        this.numSessions = numSessions;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setNumSessions(int numSessions) {
        if (numSessions > 0) {
            this.numSessions = numSessions;
        } else {
            System.out.print("The session number you entered is below 0. At least one session must exist.");
        }
    }

    public int getNumSessions() {
        return numSessions;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return super.toString();
    }

    public double getTotalFee() {
        this.setFee(fee * numSessions);
        System.out.println(this.getName() + "'s total fee: $" + fee);
        return fee;
    }
}
