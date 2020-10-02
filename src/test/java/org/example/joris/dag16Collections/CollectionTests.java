package org.example.joris.dag16Collections;

import org.example.joris.dag16TDDStringCalculator.app.utility.StringCalculator;
import org.example.joris.dag16TDDStringCalculator.app.utility.StringCalculatorTests;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionTests {

    @Test
    void eenKijkjeInDeCollectionAPI() {
        List verzameling = new ArrayList();

        verzameling.add(new Object());
        verzameling.add("Bo");
        verzameling.add(new StringCalculatorTests());
        verzameling.add(new StringCalculator());


        int aantalObjectenInVerzameling = 0;
        for(Object obj: verzameling) {
            aantalObjectenInVerzameling = aantalObjectenInVerzameling + 1;
        }

        System.out.println("Aantal objecten in verzameling = " + aantalObjectenInVerzameling );
    }

    @Test
    void eenVerzamelingDieWatKritischerMetWatJeErInStopt() {
        //De String tussen < en > wordt hier wel een type parameter
        List<String> verzameling = new ArrayList();

        verzameling.add("Bo");
        String s = verzameling.get(0);
        //Dit is een voorbeeld van Generics
        //Dat kun je herkennen aan de < en >

    }

    @Test
    void ietsGeAvanceerdereVerzamelingDeMap() {
        HashMap hashMap = new HashMap();
        Werknemer werknemer = new Werknemer(1, "Jan");
        String naam = werknemer.getNaam();
        hashMap.put(naam,werknemer);
        Object o = hashMap.get(naam);
        System.out.println(o);

        StringCalculator key = new StringCalculator();
        hashMap.put(key, new StringCalculatorTests());

        Werknemer werknemer1 = (Werknemer) hashMap.get(key);
        System.out.println(werknemer1);
    }
    @Test
    void ietsNogGeAvanceerdereVerzamelingDeMap() {
        HashMap<String,Werknemer> hashMap = new HashMap();
        Werknemer werknemer = new Werknemer(1, "Jan");
        String naam = werknemer.getNaam();
        hashMap.put(naam,werknemer);
        Object o = hashMap.get(naam);
        System.out.println(o);

        StringCalculator key = new StringCalculator();
        //hashMap.put(key, new StringCalculatorTests());

        Werknemer werknemer1 = (Werknemer) hashMap.get(key);
        System.out.println(werknemer1);
    }
}
