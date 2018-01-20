package org.whitesource.demo;

/**
 * @author tom.shapira
 */
public class Main {

    public static void main(String[] args) {
        String input = args[0];

        System.out.println(mySwapCase(input));

//        System.out.println(StringUtils.swapCase(input));

//        new ExtensionFileCounter().countFilesInDirectoryByExtension(args[0], args[1]);
    }

    private static String mySwapCase(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            String letter = String.valueOf(string.charAt(i));
            if (letter.matches("[a-z]")) {
                result.append(letter.toUpperCase());
            } else if (letter.matches("[A-Z]")) {
                result.append(letter.toLowerCase());
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }

}
