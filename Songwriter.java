public class Songwriter extends Artist {
    
    private int numTracksWritten;

    public Songwriter(int numTracksWritten, String name, String genre, Royalties royalties, Location location) {
        super(name, genre, new SongwriterRoyalties(), location);
        this.numTracksWritten = numTracksWritten;
    }

    public void setNumTracksWritten(int numTracksWritten) {
        if (numTracksWritten > 0) {
            this.numTracksWritten = numTracksWritten;
        } else {
            System.out.println("At least one track has to be entered.");
        }
    }

    public int getNumTracksWritten() {
        return numTracksWritten;
    }

    public String toString() {
        return super.toString();
    }

    public boolean equals(Object obj) {
       return super.equals(obj);
    }
}

