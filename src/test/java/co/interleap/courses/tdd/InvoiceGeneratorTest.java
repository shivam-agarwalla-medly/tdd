package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class InvoiceGeneratorTest {
    @Test
    public void zeroKmMin()
    {
        InvoiceGenerator ig=new InvoiceGenerator();

        int expected=0;
        int result=ig.generateInvoice(0,0);

        assertEquals(expected,result);
    }
}
