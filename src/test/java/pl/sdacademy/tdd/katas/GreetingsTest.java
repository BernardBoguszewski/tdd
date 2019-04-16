package pl.sdacademy.tdd.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    @Test
    public void shouldReturnGreeteingForSingleName() {
        Greetings greetings = new Greetings();
        String name = "Adam";

        String result = greetings.greet(name);

        assertEquals("Witaj, Adam", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForNull() {
        Greetings greetings = new Greetings();

        String result = greetings.greet(null);

        assertEquals("Witaj, mój przyjacielu!", result);
    }

    @Test
    public void shouldReturnUppercaseGreetingForUppercaseName() {
        Greetings greetings = new Greetings();
        String name = "ADAM";

        String result = greetings.greet(name);

        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForTwoNames() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        String result = greetings.greet(name);

        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForThreeNames() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        String result = greetings.greet(name);

        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForThreeNamesWhichOneNameIsUppercase() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,ROBERT";

        String result = greetings.greet(name);

        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForThreeNamesWhichOneNameIsUppercaseMidCase() {
        Greetings greetings = new Greetings();
        String name = "Adam,IZA,Robert";

        String result = greetings.greet(name);

        assertEquals("Adam i Robert, witajcie! WITAJ IZA!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForThreeNamesWhichOneNameIsUppercaseLastOneCase() {
        Greetings greetings = new Greetings();
        String name = "ADAM,Iza,Robert";

        String result = greetings.greet(name);

        assertEquals("Iza i Robert, witajcie! WITAJ ADAM!", result);
    }

    @Test
    public void shouldReturnSpecialGreetingForDigits() {
        Greetings greetings = new Greetings();
        String name = "Ad4m";

        String result = greetings.greet(name);

        assertEquals("Z liczbami się nie witam.", result);
    }


}