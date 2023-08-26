package src.main.java.loops.whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) throws IOException {

        System.out.println("Multiplication Table");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number to Multiply: ");
        int x = sc.nextInt();
        System.out.print("Enter A Number to Iterations: ");
        int n = sc.nextInt();

        bufferedReader.close();

        int i = 0;
        while (i < n) {
            i++;
            System.out.printf("%d x %d = %d %n", x, i, x * i);
        }
    }
}
