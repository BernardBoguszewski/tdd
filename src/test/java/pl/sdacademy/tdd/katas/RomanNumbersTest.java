package pl.sdacademy.tdd.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {

    @Test
    public void shouldConverRomanToDecimalFirstCase() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        String romanNumber = "MMVI";

        int result = romanNumberConverter.romanToDecimal(romanNumber);

        assertEquals(2006, result);
    }

    @Test
    public void shouldConverRomanToDecimalSecondCase() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        String romanNumber = "MCMXLIV";

        int result = romanNumberConverter.romanToDecimal(romanNumber);

        assertEquals(1944, result);
    }

}