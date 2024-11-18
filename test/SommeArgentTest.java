package tp1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tp1.SommeArgent;
import tp1.UniteDistincteException;

public class SommeArgentTest {
    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    private SommeArgent m14USD;

    @Before
    public void setUp() {
        m12CHF = new SommeArgent(12, "CHF");
        m14CHF = new SommeArgent(14, "CHF");
        m14USD = new SommeArgent(14, "USD");
    }

    @Test
    public void testAdd() {
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
        Assert.assertTrue(expected.equals(result));
    }

    @Test
    public void testEquals() {
        Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF"));
        Assert.assertTrue(!m12CHF.equals(m14CHF));
        Assert.assertTrue(!m14USD.equals(m14CHF));
    }

    @Test(expected = UniteDistincteException.class)
    public void testAddWithDifferentUnits() throws UniteDistincteException {
        m12CHF.add(m14USD);
    }

}
