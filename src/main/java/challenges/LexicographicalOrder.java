package src.main.java.challenges;

import src.main.java.datastructures.collection.ConvertStringToList;

import java.util.Collections;
import java.util.List;

public class LexicographicalOrder {

    public static List<String> execute(String input, int chunk) {
        List<String> list = ConvertStringToList.call(input, chunk);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = execute("welcometojava", 3);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

    }
}
