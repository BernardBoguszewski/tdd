package pl.sdacademy.tdd.katas;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnZeroWhenParameterIsNull() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = null;

        int result = stringCalculator.add(parameters);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWhenParameterIsEmpty() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "";

        int result = stringCalculator.add(parameters);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "3,5";

        int result = stringCalculator.add(parameters);

        assertEquals(8, result);
    }

    @Test
    public void shouldReturnSumOfThreeNumbers() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "2,5,3";

        int result = stringCalculator.add(parameters);

        assertEquals(10, result);
    }

    @Test
    public void shouldReturnSumWhenParametersHaveNewLine() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "3\n5,3";

        int result = stringCalculator.add(parameters);

        assertEquals(11, result);
    }

    @Test
    public void shouldReturnSumWhenParametersHaveCustomSeparator() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "//;\n3;5;7";

        int result = stringCalculator.add(parameters);

        assertEquals(15, result);
    }

    @Test
    public void shouldThrowExceptionWhenFindNegativeNumbers() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "3,-5";

        //expected
        thrown.expect(NegativeNumberException.class);
        thrown.expectMessage("Liczby ujemne nie są obsługiwane");

        //when
        stringCalculator.add(parameters);
    }

    @Test
    public void shouldReturnSumWithSpecialLogicForNumbersGreaterThanThousand() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "1002,5";

        int result = stringCalculator.add(parameters);

        assertEquals(7, result);
    }

    @Test
    public void shouldReturnSumWhenParametersHaveCustomManyCharsSeparator() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "//[***]\n5***2***3";

        int result = stringCalculator.add(parameters);

        assertEquals(10, result);
    }

    @Test
    public void shouldReturnSumWhenParametersHaveCustomManySeparators() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "//[*][%]\n3*5%6";

        int result = stringCalculator.add(parameters);

        assertEquals(14, result);
    }

    @Test
    public void shouldReturnSumWhenParametersHaveCustomManySeparatorsWithManyChars() throws NegativeNumberException {
        StringCalculator stringCalculator = new StringCalculator();
        String parameters = "//[**][%]\n5**3%7";

        int result = stringCalculator.add(parameters);

        assertEquals(15, result);
    }


}