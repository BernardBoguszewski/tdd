package pl.sdacademy.tdd.katas;

public class FizzBuzzWhizz {

    public String fizzBuzzWhizz(Integer number) {
        if (number == null) {
            return "Nie dla null!";
        }
        if (number == 3) {
            return "FizzWhizz";
        }
        if (number == 5) {
            return "BuzzWhizz";
        }
        if (isPrime(number)) {
            return "Whizz";
        }
        if (isDivisibleByThree(number) && isDivisibleByFive(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (isDivisibleByFive(number)) {
            return "Buzz";
        }
        return null;

    }

    private boolean isDivisibleByThree(Integer number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(Integer number) {
        return number % 5 == 0;
    }

    private boolean isPrime(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
