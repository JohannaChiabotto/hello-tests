package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanSmallerThanOneTest {

    @Test
    void booleanSmallerThanOne() {

        //        "GIVEN"
        // WAS IST GEGEBEN?- Daten die uns vorliegen
        float value = 0.2f;
        boolean expectedResult = true;

        //        "WHEN"
        // WENN ...  - Was wir testen wollen, rufen wir hier auf
        boolean result = BooleanSmallerThanOne.booleanSmallerThanOne(value);

        //        THEN
        // LÄUFT ES WIE ES SOLL? - "THEN"
        assertEquals(expectedResult, result);
    }
}



