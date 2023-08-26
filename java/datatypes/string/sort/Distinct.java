package src.main.java.datatypes.string.sort;

import java.util.Scanner;

public class Distinct {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value to remove duplicate characters: ");
        String str = sc.nextLine();
        System.out.println(call(str));
    }

    public static String call(String input) {
        StringBuilder sb = new StringBuilder();
        input.chars().distinct().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
