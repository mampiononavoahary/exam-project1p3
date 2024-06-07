package org.example.ConnecteurLogiqueEtNegation;

import org.example.Conjoction;
import org.example.enums.VerityValeur;

public class Et extends Conjoction {
    @Override
    public VerityValeur evaluer(VerityValeur a, VerityValeur b) {
       if (a == VerityValeur.VRAI && b == VerityValeur.VRAI){
           return VerityValeur.VRAI;
       }
       return VerityValeur.FAUX;
    }
}
