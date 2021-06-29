package co.interleap.courses.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelCounterTest {

    @Test
    public void emptyString(){
        VowelCounter vc=new VowelCounter();

        int expected=0;
        int result=vc.vowelCount("");

        assertEquals(expected,result);
    }
    @Test
    public  void  onlySingleVowel(){
        VowelCounter vc=new VowelCounter();

        int expected=1;
        int result=vc.vowelCount("a");

        assertEquals(expected,result);
    }
    @Test
    public  void  onlyMultipleVowel(){
        VowelCounter vc=new VowelCounter();

        int expected=4;
        int result=vc.vowelCount("aeiu");

        assertEquals(expected,result);
    }
    @Test
    public void multipleVowelConsonant(){
        VowelCounter vc=new VowelCounter();

        int expected=6;
        int result=vc.vowelCount("shivam agarwalla");

        assertEquals(expected,result);
    }
    @Test
    public void upperLowerCase(){
        VowelCounter vc=new VowelCounter();

        int expected=7;
        int result=vc.vowelCount("Hello EveryOne Guys");

        assertEquals(expected,result);
    }
}