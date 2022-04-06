import java.util.Comparator;

public class Artist implements Comparable<Artist> {
    
    private String name;
    private String genre;
    private Royalties royalties; // M3 USING STRATEGY
    private Location location;

    public static int numberOfArtists = 0; //M2 HOMEWORK STATIC

    public final static Comparator<Artist> NAME_TYPE_COMPARATOR = new ArtistNameTypeComparator();

    private static class ArtistNameTypeComparator implements Comparator<Artist> {

        @Override
        public int compare(Artist a1, Artist a2) {
    
            if (a1.getName().compareToIgnoreCase(a2.getName()) == 0) {
                return a1.getGenre().compareTo(a2.getGenre());
            } else {
                return a1.getName().compareTo(a2.getName());
            }
        }
    }

    public Artist(String name, String genre, Royalties royalties, Location location) {
        this.name = name;
        this.genre = genre;
        this.royalties = royalties;
        this.location = location;
        numberOfArtists++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public double royaltiesReceived(double songSales) {
        double artistRoyaltiesReceived = royalties.royaltiesReceived(songSales);
        System.out.println(this.getName() + "'s royalties: $" + artistRoyaltiesReceived);
        return artistRoyaltiesReceived;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Artist) {
            Artist other = (Artist) obj;

            System.out.print(this.name + " is " + other.name + ": ");
            
            boolean a = this.name.equals(other.name);
            boolean b = this.genre.equals(other.genre);
            boolean c = location.getLocation().equals(location.getLocation()); //M2 HOMEWORK ENUM USE

            if (a && b && c) {
                System.out.println("true");
                return true;
            }
            System.out.println("false");
            return false;
        }
        return false;
    }

    public static void setNumberOfArtists(int numberOfArtists) { //M2 HOMEWORK STATIC
        Artist.numberOfArtists = numberOfArtists;
    }

    public static int getNumberOfArtists() { //M2 HOMEWORK STATIC
        return numberOfArtists;
    }

    @Override
    public int compareTo(Artist artist) {
        if (artist.name.compareTo(name) < 0) {
            System.out.println(this.getName() + " is billed lower than " + artist.getName());
            return 1;
        } else {
            System.out.println(this.getName() + " is billed higher than " + artist.getName());
            return -1;
        }
    }

    public boolean isArtistinUS() { //M2 HOMEWORK ENUM
        System.out.println(this.name + " is in " + location.getLocation()); 
        
        if (location.getLocation() == Location.NEW_YORK.toString()
        || location.getLocation() == Location.LOS_ANGELES.toString()) {
            System.out.println(this.name + " is in the US.");
            return true;
        } else {
            System.out.println(this.name + " is not in the US.");
            return false;
        }
    } 
}