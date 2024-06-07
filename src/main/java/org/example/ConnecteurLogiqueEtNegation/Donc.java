package org.example.ConnecteurLogiqueEtNegation;

import org.example.Conjoction;
import org.example.enums.VerityValeur;

public class Donc extends Conjoction {
    @Override
    protected VerityValeur evaluer(VerityValeur a, VerityValeur b) {
       if (a == VerityValeur.VRAI || b == VerityValeur.FAUX){
           return VerityValeur.FAUX;
       }
       return VerityValeur.VRAI;
    }
}
