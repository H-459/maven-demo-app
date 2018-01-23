package org.whitesource.demo;

/**
 * @author tom.shapira
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        String input = args[0];
        System.out.println(swapCase(input));
    }

    private static String swapCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));
            if (letter.matches("[a-z]")) {
                // swap each lowercase letter to uppercase
                result.append(letter.toUpperCase());
            } else if (letter.matches("[A-Z]")) {
                // swap each uppercase letter to lowercase
                result.append(letter.toLowerCase());
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }

}
