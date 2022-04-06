public class ProducerRoyalties implements Royalties {

    @Override
    public double royaltiesReceived(double songSales) {
        return songSales * 0.15;
    }
    
}
