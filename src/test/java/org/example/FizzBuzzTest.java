package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void tetsFunction(){
        //Given
        int zahl = 4;
        String expected = "4";

        //When
        String result = FizzBuzz.fizzBuzz(zahl);

        //Then
        assertEquals(expected, result);
    }
}
