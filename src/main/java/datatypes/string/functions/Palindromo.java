package src.main.java.datatypes.string.functions;

import src.main.java.datatypes.string.sort.Reverse;

public class Palindromo {

    public static void execute(String input) {
        System.out.println((input.equalsIgnoreCase(Reverse.execute(input))) ? "is palindrome" : "no palindrome");
    }
}
