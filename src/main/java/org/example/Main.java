package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder cleaned = new StringBuilder();

        // Harfleri al, küçük harfe çevir
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                cleaned.append(lower);
                stack.push(lower);
            }
        }

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }


    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}
