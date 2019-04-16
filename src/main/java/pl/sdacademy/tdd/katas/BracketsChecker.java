package pl.sdacademy.tdd.katas;

public class BracketsChecker {

    public boolean hasBalancedBrackets(String bracketsString) {
        int brackets = 0;
        for (char ch : bracketsString.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            } else {
                return false;
            }
            if (brackets < 0) {
                return false;
            }
        }
        return brackets == 0;
    }

}
