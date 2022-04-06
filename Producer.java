public class Producer extends Songwriter {
    
    private int numTracksProduced;

    public Producer(int numTracksProduced, int numTracksWritten, String name, String genre, Royalties royalties, Location location) {
        super(numTracksWritten, name, genre, new ProducerRoyalties(), location);
        this.numTracksProduced = numTracksProduced;
    }

    public void setNumTracksProduced(int numTracksProduced) {
        if (numTracksProduced > 0) {
            this.numTracksProduced = numTracksProduced;
        } else {
            System.out.println("At least one track produced has to be entered.");
        }
    }

    public int getNumTracksProduced() {
        return numTracksProduced;
    }

    public int totalSongsContributed() {
        int totalSongsContributed = numTracksProduced + this.getNumTracksWritten();
       
        System.out.println(this.getName() + " contributed " 
        + totalSongsContributed + " songs to the album in total.");
        
        return totalSongsContributed;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return super.toString();
    }
}
