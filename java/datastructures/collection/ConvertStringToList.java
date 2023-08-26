package src.main.java.datastructures.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToList {

    public static void main(String args[]) {
        System.out.println(call("welcometojava", 3));
    }

    public static List<String> call(String input, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i + chunkSize <= input.length(); i++) {
            chunks.add(input.substring(i, Integer.sum(i, chunkSize)));
        }
        return chunks;
    }
}
