package src.main.java.loops.forloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) throws IOException {

        System.out.println("Multiplication Table");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int N = sc.nextInt();

        bufferedReader.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", N, i, N * i);
        }
    }
}
