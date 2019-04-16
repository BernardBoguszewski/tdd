package pl.sdacademy.tdd.katas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

    public int add(String numbers) throws NegativeNumberException {
        if (numbers == null || numbers.equals("")) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            return customSeparatorCase(numbers);
        }
        return simpleCase(numbers);
    }

    private int customSeparatorCase(String numbers) throws NegativeNumberException {
        if (numbers.charAt(2) == '[') {
            return manySeparatorsLogic(numbers);
        } else {
            return singleSeparatorLogic(numbers);
        }
    }

    private int simpleCase(String numbers) throws NegativeNumberException {
        String separatorRegex = "[,\n]";
        return makeSumWithSpecificSeparator(numbers, separatorRegex);
    }

    private int makeSumWithSpecificSeparator(String numbers, String separatorRegex) throws NegativeNumberException {
        String[] splittedNumbers = numbers.split(separatorRegex);
        List<String> numbersList = removeEmptyElements(splittedNumbers);
        checkNumbersForNegatives(numbersList);

        int sum = 0;
        for (String number : numbersList) {
            sum = makeSum(sum, number);
        }

        return sum;
    }

    private int makeSum(int sum, String number) {
        if (checkNumberIsLargerThanThousand(number)) {
            sum += (Integer.valueOf(number) - 1000);
        } else {
            sum += Integer.valueOf(number);
        }

        return sum;
    }

    private List<String> removeEmptyElements(String[] splittedNumbers) {
        return Stream.of(splittedNumbers).filter(number -> !number.isEmpty()).collect(Collectors.toList());
    }

    private boolean checkNumberIsLargerThanThousand(String number) {
        int numberValue = Integer.valueOf(number);
        return numberValue > 1000;
    }


    private void checkNumbersForNegatives(List<String> splittedNumbers) throws NegativeNumberException {
        for (String number : splittedNumbers) {
            throwExceptionWhenNegative(number);
        }
    }

    private void throwExceptionWhenNegative(String number) throws NegativeNumberException {
        if (Integer.valueOf(number) < 0) {
            throw new NegativeNumberException("Liczby ujemne nie są obsługiwane");
        }
    }

    private int singleSeparatorLogic(String numbers) throws NegativeNumberException {
        String separator = numbers.substring(2, 3);
        String numbersToCalc = numbers.substring(4);

        return makeSumWithSpecificSeparator(numbersToCalc, separator);
    }

    private int manySeparatorsLogic(String numbers) throws NegativeNumberException {
        int endIndex = numbers.indexOf('\n');
        if (endIndex == -1) {
            return 0;
        }

        String separators = numbers.substring(2, endIndex);
        separators = createRegexSeparators(separators);

        String numbersValues = numbers.substring(endIndex + 1);
        return makeSumWithSpecificSeparator(numbersValues, separators);
    }

    private String createRegexSeparators(String separators) {
        separators = "[" + separators.replaceAll("\\[|\\]", "") + "]";
        return separators;
    }


}
