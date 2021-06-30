package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InvoiceGeneratorTest {
    @Test
    public void multipleRides()
    {
        List<Ride> rides=new ArrayList<Ride>();
        rides.add(new Ride(3,20));
        rides.add(new Ride(20,5));
        rides.add(new Ride(2,10));

        Invoice invoice=new Invoice(rides,0,0,0);

        double resultTotalFare=invoice.getTotalFare();
        double resultAverageFare=invoice.getAverageFare();
        double resultNumberOfRides=invoice.getNumberOfRides();


        assertEquals(285,resultTotalFare,0.01);
        assertEquals(95,resultAverageFare,0.01);
        assertEquals(3,resultNumberOfRides,0.01);
    }

}
