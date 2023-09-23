package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i != input.length() && symbol == input.charAt(i)) {
                counter++;
            } else {
                result += symbol + "" + (counter == 1 ? "" : counter);
                symbol = input.charAt(i == input.length() ? 0 : i);
                counter = 1;
            }
        }
        return result;
    }
}
