public class InstrumentalRoyalties implements Royalties {

    @Override
    public double royaltiesReceived(double songSales) {
        System.out.println("Instrumentalists do not receive royalties.");
        return 0;
    }
    
}
