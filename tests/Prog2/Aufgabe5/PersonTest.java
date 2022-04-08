package Prog2.Aufgabe5;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test(expected = NullPointerException.class)
    public void testPerson1() {
        new Person(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPerson2() {
        new Person("Test", -1);
    }

    @Test(expected = NullPointerException.class)
    public void testPerson3() {
        new Person(null, -1);
    }

    @Test
    public void testIsAdult() {
        Person pers = new Person("Test", 18);
        Assert.assertTrue(pers.isAdult());
    }
    @Test
    public void testIsNotAdult() {
        Person pers = new Person("Test", 17);
        Assert.assertFalse(pers.isAdult());
    }
}
