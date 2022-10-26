import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    //Test= Annotation= Testmethode(Sie testet)
    @Test
    void compare() {

        //        "GIVEN"
        // WAS IST GEGEBEN?- Daten die uns vorliegen
        int value = 128;
        boolean expectedResult = true;

        //        "WHEN"
        // WENN ...  - Was wir testen wollen, rufen wir hier auf
        boolean result = Compare.compare(value);

        //        THEN
        // LÄUFT ES WIE ES SOLL? - "THEN"
        assertEquals(expectedResult, result);
    }
}