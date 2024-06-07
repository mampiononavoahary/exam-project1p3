package org.example;

import org.example.enums.VerityValeur;

public class AffirmationMedium extends Affirmation{
    private final Affirmation rightAffirmation;
    private final Affirmation leftAffirmation;
    private final Conjoction conjoction;
    public AffirmationMedium(String affirmationBody, Affirmation rightAffirmation, Affirmation leftAffirmation, Conjoction conjoction) {
        super(affirmationBody);
        this.rightAffirmation = rightAffirmation;
        this.leftAffirmation = leftAffirmation;
        this.conjoction = conjoction;
    }

    @Override
    public VerityValeur valeur() {
        return conjoction.evaluer(rightAffirmation.valeur(), leftAffirmation.valeur());
    }
}
