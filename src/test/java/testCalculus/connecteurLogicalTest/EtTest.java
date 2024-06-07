package testCalculus.connecteurLogicalTest;

import org.example.ConnecteurLogiqueEtNegation.Et;
import org.example.enums.VerityValeur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtTest {
    @Test
    void etTest(){
            var et = new Et();
        assertEquals(VerityValeur.FAUX, et.evaluer(VerityValeur.FAUX,VerityValeur.FAUX) );
        assertEquals(VerityValeur.FAUX, et.evaluer(VerityValeur.FAUX, VerityValeur.VRAI));
        assertEquals(VerityValeur.VRAI, et.evaluer(VerityValeur.VRAI, VerityValeur.VRAI));
        assertEquals(VerityValeur.FAUX, et.evaluer(VerityValeur.FAUX, VerityValeur.FAUX));

    }
}
