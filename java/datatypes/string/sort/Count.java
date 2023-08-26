package src.main.java.datatypes.string.sort;

import java.util.Scanner;

public class Count {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a letter to find: ");
        String str2 = sc.nextLine();
        System.out.println("found " + call(str, str2.charAt(0)) + " coincidences");
    }

    public static long call(String word, char letter) {
        return word.chars().filter(ch -> ch == letter).count();
    }
}
