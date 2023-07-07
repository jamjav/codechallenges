package src.main.java.datastructures.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListAlphabetically {

    public static List<String> call(List<String> list) {
        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {
        List<String> movieNames = Arrays.asList("amazing SpiderMan", "godzilla", "sing", "minions");
        System.out.println(movieNames);
        call(movieNames);
        System.out.println(movieNames);

    }
}
