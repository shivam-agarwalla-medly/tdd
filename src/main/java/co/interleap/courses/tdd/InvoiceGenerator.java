package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {

    public Invoice create(List<Ride> rides)
    {
        double totalFare=0;
        for (Ride ride:rides)
        {
            totalFare+= ride.getTotalFare();
        }
        return new Invoice(totalFare,totalFare/rides.size(),rides.size());
    }


}
