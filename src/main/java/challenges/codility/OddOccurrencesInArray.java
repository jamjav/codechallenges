package challenges.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class OddOccurrencesInArray {
    public static int solution(int[] A) throws RuntimeException {

        HashMap<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            if (occurrencesMap.containsKey(A[i])) {
                int occurrences = occurrencesMap.get(A[i]);
                occurrences++;
                occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
            } else {
                occurrencesMap.put(A[i], 1); //1st occurrences of this value
            }
        }

        for (Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            if (Integer.parseInt(entry.getValue().toString()) % 2 != 0)
                return Integer.parseInt(entry.getKey().toString());
        }
        throw new RuntimeException("should've return unpaired value by now");
    }

    public static void main(String[] args) {
        int[] response = new int[]{solution(new int[]{9, 3, 9, 3, 9, 7, 9})};
        System.out.println(Arrays.toString(response));
    }
}
