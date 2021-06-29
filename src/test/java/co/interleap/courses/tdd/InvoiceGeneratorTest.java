package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class InvoiceGeneratorTest {
    @Test
    public void zeroKmAndMin()
    {
        InvoiceGenerator ig=new InvoiceGenerator();

        double expected=0;
        double result=ig.generateInvoice(0,0);

        assertEquals(expected,result,0.01);
    }
    @Test
    public void zeroKmButNonZeroMin()
    {
        InvoiceGenerator ig=new InvoiceGenerator();

        double expected=5;
        double result=ig.generateInvoice(0,5);

        assertEquals(expected,result,0.01);
    }
    @Test
    public void nonZeroKmButZeroMin()
    {
        InvoiceGenerator ig=new InvoiceGenerator();

        double expected=20;
        double result=ig.generateInvoice(2,0);

        assertEquals(expected,result,0.01);
    }
    @Test
    public void kmAndMin()
    {
        InvoiceGenerator ig=new InvoiceGenerator();

        double expected=70;
        double result=ig.generateInvoice(5,20);

        assertEquals(expected,result,0.01);
    }
}
