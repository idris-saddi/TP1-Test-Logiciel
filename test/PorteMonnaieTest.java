package tp1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tp1.PorteMonnaie;
import tp1.SommeArgent;

public class PorteMonnaieTest {
    private PorteMonnaie porteMonnaie1;
    private PorteMonnaie porteMonnaie2;

    @Before
    public void setUp() {
        porteMonnaie1 = new PorteMonnaie();
        porteMonnaie2 = new PorteMonnaie();
    }

    @Test
    public void testAjouteSomme() {
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));
        porteMonnaie2.ajouteSomme(new SommeArgent(10, "EUR"));

        Assert.assertEquals(porteMonnaie1, porteMonnaie2);
    }

    @Test
    public void testAjouteSommeDifferentDevises() {
        porteMonnaie1.ajouteSomme(new SommeArgent(10, "USD"));
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));

        porteMonnaie2.ajouteSomme(new SommeArgent(10, "USD"));
        porteMonnaie2.ajouteSomme(new SommeArgent(5, "EUR"));

        Assert.assertEquals(porteMonnaie1, porteMonnaie2);
    }

    @Test
    public void testToString() {
        porteMonnaie1.ajouteSomme(new SommeArgent(15, "CHF"));
        String expected = "Contenu du porte-monnaie :\n15 CHF\n";
        Assert.assertEquals(expected, porteMonnaie1.toString());
    }
}
