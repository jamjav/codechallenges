package src.main.java.datatypes.string.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlphabetically {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value to sort alphabetically: ");
        String str = sc.nextLine();
        System.out.println(call(str));

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);
    }

    public static String call(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        return new String(inputArray);
    }


}
