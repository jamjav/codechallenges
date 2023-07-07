package src.main.java.datatypes.string;

import src.main.java.challenges.Palindromo;
import src.main.java.datatypes.string.sort.Reverse;

import java.util.Scanner;

public class Main {

    public static void main(java.lang.String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String to reverse : ");
        java.lang.String input = sc.nextLine();
        Reverse.execute(input);
        Palindromo.execute(input);


    }
}
