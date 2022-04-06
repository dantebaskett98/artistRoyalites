public class ArtistRoyalties implements Royalties {

    @Override
    public double royaltiesReceived(double songSales) {
        return songSales * 0.30;
    }
    
}
