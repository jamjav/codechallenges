package src.main.java.challenges;

import src.main.java.datastructures.collection.ConvertStringToList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalOrder {

    public static List<String> execute(String input, int chunk) {
        List<String> list = ConvertStringToList.call(input, chunk);
        System.out.println("String in chunks: " + list);
        Collections.sort(list);
        System.out.println("String ordered: " + list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lexicographic Order " +
                "this Challenge we will divide a string in chunks a specific lenght and we will order Lexicographic and print the first and last chunk \n" +
                "e.g:\n" +
                "Input String: helloWorld, chunk Size: 3\n" +
                "chunks: [hel, ell, llo, loW, oWo, Wor, orl, rld]  \n" +
                "chunks Order Lexicographic: [Wor, ell, hel, llo, loW, oWo, orl, rld]  \n" +
                "First chunk: Wor Last Chunk: rld  \n"
        );
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        System.out.println("Enter a letter to find: ");
        int chunkSize = sc.nextInt();
        List<String> list = execute(word, chunkSize);
        System.out.println("First Chunk: " + list.get(0));
        System.out.println("Last Chunk: " + list.get(list.size() - 1));

    }
}
