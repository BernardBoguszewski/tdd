package pl.sdacademy.tdd.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
    public void shouldReturnSpecialTextWhenNumberIsNull() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = null;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("Nie dla null!", result);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsDivisibleByThree() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 9;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsDivisibleByFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 25;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsDivisibleByThreeAndFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 15;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnWhizzWhenNumberIsPrime() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 7;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("Whizz", result);
    }

    @Test
    public void shouldReturnFizzWhizzWhenNumberIsThree() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 3;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("FizzWhizz", result);
    }

    @Test
    public void shouldReturnBuzzWhizzWhenNumberIsFive() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        Integer number = 5;

        String result = fizzBuzzWhizz.fizzBuzzWhizz(number);

        assertEquals("BuzzWhizz", result);
    }

}