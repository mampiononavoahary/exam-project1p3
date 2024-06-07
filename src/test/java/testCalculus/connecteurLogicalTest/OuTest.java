package testCalculus.connecteurLogicalTest;

import org.example.ConnecteurLogiqueEtNegation.Ou;
import org.example.enums.VerityValeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuTest {
    @Test
    void ouTest(){
        var ou = new Ou();
        assertEquals(VerityValeur.FAUX, ou.evaluer(VerityValeur.FAUX, VerityValeur.FAUX));
        assertEquals(VerityValeur.VRAI, ou.evaluer(VerityValeur.FAUX, VerityValeur.VRAI));
        assertEquals(VerityValeur.VRAI, ou.evaluer(VerityValeur.VRAI, VerityValeur.VRAI));
        assertEquals(VerityValeur.VRAI, ou.evaluer(VerityValeur.VRAI, VerityValeur.FAUX));
    }
}
