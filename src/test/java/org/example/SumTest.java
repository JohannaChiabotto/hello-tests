package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {

        // Was ist gegeben? "GIVEN" - Daten die uns vorliegen
        int a = 1;
        int b =1;
        int expectedResult = 2;

        // Wenn... "WHEN" - Hier lassen wir die Methode laufen
        int result = Sum.sum(a, b);

        //Läuft es wie es soll? "THEN"
        assertEquals(expectedResult, result);
    }

}