import java.util.ArrayList;
import java.util.Collections;

/*
Dante Baskett
2/7/22
*/

public class Driver {

    public static void main(String[] args) {

        /*
        This Driver is based off a real life EP that I produced a 
        couple of years ago.
        */

        double amountPerStream = 0.005;
        
        // Name of songs on project
        int numStreamsSTD = 21000;
        int numStreamsDrastic = 8000;
        int numStreamsBadBh = 11000; 
        int numStreamsSkinnyGirls = 16000;

        double totalNumofStreams = numStreamsSTD + numStreamsDrastic 
        + numStreamsBadBh + numStreamsSkinnyGirls;

        double totalSongSales = amountPerStream * totalNumofStreams;

        ArrayList<Artist> artistList = new ArrayList<Artist>();

        artistList.add(new Artist("Dante", "pop", new ArtistRoyalties(), Location.LOS_ANGELES));
        artistList.add(new Songwriter(4, "Helen", "Death metal", new SongwriterRoyalties(), Location.NEW_YORK));
        artistList.add(new Songwriter(8, "Helen", "sad emo punk", new SongwriterRoyalties(), Location.NEW_YORK));
        artistList.add(new Songwriter(4, "Allie", "pop", new SongwriterRoyalties(), Location.NEW_YORK));
        artistList.add(new Songwriter(3, "Libbey", "pop", new SongwriterRoyalties(), Location.NEW_YORK));
        artistList.add(new Producer(4, 1, "Mike", "EDM", new ProducerRoyalties(), Location.STOCKHOLM));
        artistList.add(new Producer(3, 2, "Adam", "jazz", new ProducerRoyalties(), Location.STOCKHOLM));
        artistList.add(new Instrumentalist("Abby", "jazz", "trombone", new InstrumentalRoyalties(), 5, 3, Location.NEW_YORK));
        
        System.out.println("This is a list of contributer's to " + artistList.get(0).getName() + "'s album." +
            " It details their royalties or fees, number of contributions in one or more roles," + 
            " their location, and whether the collaboraters are logically equaivalent to each other.");
        System.out.println();

        for (Artist a : artistList) {

            System.out.println(a.getClass().toString());

            if (a instanceof Instrumentalist) {
                ((Instrumentalist)a).getTotalFee();
            }

            a.royaltiesReceived(totalSongSales); // M3 USING STRATEGY

            a.equals(artistList.get(1));

            if (a instanceof Producer) {
                ((Producer)a).totalSongsContributed();
            }

            a.isArtistinUS();
            System.out.println();
        }

        System.out.println("Before sorting alphabetically: ");
        System.out.println();
        System.out.println(artistList); 
        System.out.println();
        Collections.sort(artistList, Artist.NAME_TYPE_COMPARATOR); // M3 USING COMPARATOR
        System.out.println();
        System.out.println("After sorting alphabetically: ");
        System.out.println();
        System.out.println(artistList);
        System.out.println();

        System.out.println(artistList.get(1).getName() + "'s Manager: ");
        Manager m1 = new Manager.ManagerBuilder("Troy", "1800 Artists") //M3 USING BUILDER
            .numClients(8)
            .numYearsWorked(5)
            .percent(0.10)
            .build();

        System.out.println(m1);
        System.out.println();

       ArrayList<Engineer> engineerlist = new ArrayList<>();

       System.out.println("Examples of studio engineers: "); // M3 USING FACTORY
       engineerlist.add(EngineerFactory.newEngineer("Dan", "A"));
       engineerlist.add(EngineerFactory.newEngineer("Tommy", "N/A"));

       for (Engineer e: engineerlist) {
           System.out.println(e);
       }
    }
}
