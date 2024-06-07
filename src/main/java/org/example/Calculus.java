package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.VerityValeur;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@EqualsAndHashCode
public class Calculus {
    private final Map<String, Affirmation> stringAffirmationMap;

    public Calculus() {
        this.stringAffirmationMap = new HashMap<>();
    }

    public void giveAffirmation(Affirmation affirmation){
        stringAffirmationMap.put(affirmation.getAffirmatiobBody(), affirmation);
    }
public VerityValeur evaluer(Affirmation affirmation){
        if (stringAffirmationMap.containsKey(affirmation.getAffirmatiobBody())){
            return affirmation.valeur();
        }else {
            return VerityValeur.JENESAISPAS;
        }
}

}
