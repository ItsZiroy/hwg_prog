package Prog2.Aufgabe5;

import org.junit.Assert;
import org.junit.Test;

public class PreisrechnerTest {
    @Test
    public void testAdult() {
        Person adult = new Person("Peter", 18);
        Assert.assertEquals(10, Preisrechner.berechnePreis(adult), 0.0);
    }
    @Test
    public void testMinor() {
        Person minor = new Person("Tim", 17);
        Assert.assertEquals( 7.5, Preisrechner.berechnePreis(minor), 0.0);
    }
    @Test(expected = NullPointerException.class)
    public void testNull() {
        Preisrechner.berechnePreis(null);
    }
}
