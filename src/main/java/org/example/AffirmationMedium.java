package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.example.enums.VerityValeur;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
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
