public class SongwriterRoyalties implements Royalties {

    @Override
    public double royaltiesReceived(double songSales) {
        return songSales * 0.10;
    }  
}
