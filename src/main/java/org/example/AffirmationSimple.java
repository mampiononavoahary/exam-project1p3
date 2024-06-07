package org.example;

import lombok.Getter;
import org.example.enums.VerityValeur;

@Getter
public class AffirmationSimple extends Affirmation{
    private final VerityValeur verityValeur;

    public AffirmationSimple(String affiramtionBody, VerityValeur verityValeur) {
        super(affiramtionBody);
        this.verityValeur = verityValeur;
    }

    @Override
    public VerityValeur valeur() {
        return verityValeur;
    }
}
