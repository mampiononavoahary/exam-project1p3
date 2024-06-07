package testCalculus;

import org.example.AffirmationMedium;
import org.example.AffirmationSimple;
import org.example.Calculus;
import org.example.ConnecteurLogiqueEtNegation.Et;
import org.example.enums.VerityValeur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculusTests {
    @Test
    void TestbodyAffirmationSimple(){
        var cl = new Calculus();
        var affirmation1 = new AffirmationSimple("Lou est beau", VerityValeur.VRAI);
        var affirmation2 = new AffirmationSimple("Lou est pauvre", VerityValeur.FAUX);

        cl.giveAffirmation(affirmation1);
        cl.giveAffirmation(affirmation2);

        assertEquals(2, cl.getStringAffirmationMap().size());
        assertTrue(cl.getStringAffirmationMap().containsKey("Lou est beau"));
        assertTrue(cl.getStringAffirmationMap().containsKey("Lou est pauvre"));
    }
    @Test
    void TestAffirmationSimple(){
        var cl = new Calculus();
        var affirmation1 = new AffirmationSimple("Lou est beau", VerityValeur.VRAI);
        var affirmation2 = new AffirmationSimple("Lou est pauvre", VerityValeur.FAUX);

        cl.giveAffirmation(affirmation1);
        cl.giveAffirmation(affirmation2);

        assertEquals(VerityValeur.VRAI, cl.evaluer(affirmation1));
        assertEquals(VerityValeur.FAUX, cl.evaluer(affirmation2));
    }
    @Test
    void MediumAffirmation(){
        var cls = new Calculus();
        var firstAffirmation = new AffirmationSimple("Lou est beau", VerityValeur.VRAI);
        var SecondAffirmation = new AffirmationSimple("Lou est pauvre", VerityValeur.FAUX);
        var MediumAffirmation = new AffirmationMedium("Lou est beau et Lou est pauvre", firstAffirmation,SecondAffirmation, new Et());
        cls.giveAffirmation(MediumAffirmation);
        assertEquals(VerityValeur.FAUX, cls.evaluer(MediumAffirmation));
    }
}
