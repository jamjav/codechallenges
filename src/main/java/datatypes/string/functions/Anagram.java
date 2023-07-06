package src.main.java.datatypes.string.functions;

import src.main.java.datatypes.string.sort.Count;
import src.main.java.datatypes.string.sort.Distinct;
import src.main.java.datatypes.string.sort.SortAlphabetically;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String firstInput, String secondInput) {
        String inputSorted = SortAlphabetically.call(firstInput + secondInput);
        String inputDistinct = Distinct.call(inputSorted);
        char[] gfg = inputDistinct.toCharArray();

        for (char c : gfg) {
            if (Count.call(firstInput, c) != Count.call(secondInput, c)) {
                return false;
            }
        }
        return true;

    }

    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First word: ");
        String firstString = sc.nextLine();
        System.out.println("Enter Second word: ");
        String secondString = sc.nextLine();
        System.out.println(isAnagram(firstString, secondString) ? "Anagrams" : "Not Anagrams");

    }
}
