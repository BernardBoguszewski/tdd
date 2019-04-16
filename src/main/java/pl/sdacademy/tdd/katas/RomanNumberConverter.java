package pl.sdacademy.tdd.katas;

public class RomanNumberConverter {

    public int romanToDecimal(String romanNumber) {
        int result = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            String currentSymbol = String.valueOf(romanNumber.charAt(i));
            int currentSymbolValue = RomanLiteral.valueOf(currentSymbol).getValue();

            if (i + 1 < romanNumber.length()) {
                String nextSymbol = String.valueOf(romanNumber.charAt(i + 1));
                int nextSymbolValue = RomanLiteral.valueOf(nextSymbol).getValue();

                if (currentSymbolValue >= nextSymbolValue) {
                    result += currentSymbolValue;
                } else {
                    result += (nextSymbolValue - currentSymbolValue);
                    i++;
                }
            } else {
                result = result + currentSymbolValue;
                i++;
            }
        }

        return result;
    }

}
