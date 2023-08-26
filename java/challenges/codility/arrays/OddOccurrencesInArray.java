package challenges.codility.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;


/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingWAZE94-YEY/">...</a>
 */
public class OddOccurrencesInArray {
    public static int solution(int[] A) {

        HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();

        //populate HashMap using int Array
        for (int j : A) {
            if (occurrencesMap.containsKey(j)) {
                int occurrences = occurrencesMap.get(j);
                occurrences++;
                occurrencesMap.put(j, occurrences);
            } else {
                occurrencesMap.put(j, 1);
            }
        }

        for (Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            if (Integer.parseInt(entry.getValue().toString()) % 2 != 0)
                return Integer.parseInt(entry.getKey().toString());
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] response = new int[]{solution(new int[]{9, 3, 9, 3, 9, 7, 9})};
        System.out.println(Arrays.toString(response));
    }
}
