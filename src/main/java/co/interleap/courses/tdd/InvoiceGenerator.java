package co.interleap.courses.tdd;

public class InvoiceGenerator {

    public  static  final  int FARE_PER_KM=10;
    public static final int FARE_PER_MIN=1;

    public double generateInvoice(double km, double min)
    {
        return (km*FARE_PER_KM + min*FARE_PER_MIN);
    }
}
