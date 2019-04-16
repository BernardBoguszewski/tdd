package pl.sdacademy.tdd.katas;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu!";
        } else if (checkForDigits(name)) {
            return "Z liczbami się nie witam.";
        } else if (checkUppercase(name)) {
            return "WITAJ " + name + "!";
        }
        String[] names = name.split(",");
        if (name.split(",").length == 2) {
            return names[0] + " i " + names[1] + ", witajcie!";
        }
        if (name.split(",").length == 3) {
            return processThreeNames(names);
        }

        return "Witaj, " + name;
    }

    private String processThreeNames(String[] names) {
        if (checkUppercase(names[0])) {
            return names[1] + " i " + names[2] + ", witajcie! " + "WITAJ " + names[0] + "!";
        } else if (checkUppercase(names[1])) {
            return names[0] + " i " + names[2] + ", witajcie! " + "WITAJ " + names[1] + "!";
        } else if (checkUppercase(names[2])) {
            return names[0] + " i " + names[1] + ", witajcie! " + "WITAJ " + names[2] + "!";
        }

        return names[0] + ", " + names[1] + " i " + names[2] + ", witajcie!";
    }

    private boolean checkForDigits(String name) {
        for (Character ch : name.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkUppercase(String name) {
        for (Character ch : name.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return false;
            }
        }
        return true;
    }
}
