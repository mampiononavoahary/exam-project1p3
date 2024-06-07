package org.example.ConnecteurLogiqueEtNegation;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.enums.VerityValeur;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public abstract class Affirmation {
    private final String affirmatiobBody;

    public abstract VerityValeur valeur();
}
