package Prog2.TestenMitJunit;

import org.junit.Assert;
import org.junit.Test;

public class BerechnungenTest {

    @Test
    public void testAdd1() {
        Assert.assertEquals(3, Berechnungen.addiere(1, 2));
    }
    @Test
    public void testAdd2() {
        Assert.assertEquals(4, Berechnungen.addiere(-3, 7));
    }
    @Test
    public void testMultiply1() {
        Assert.assertEquals(12, Berechnungen.multipliziere(3, 4));
    }
    @Test
    public void testMultiply2() {
        Assert.assertEquals(0, Berechnungen.multipliziere(0,5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply3() {
        double result = Berechnungen.multipliziere(-3, 7);
    }
}
