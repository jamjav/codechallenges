package challenges.codility.countingelements;

import java.util.Arrays;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingUGB3JF-Y5H/">...</a>
 */
public class MaxCounters {

    public static int[] solution(int N, int[] A) {

        int[] response = new int[N];

        int maxNumber = 0;
        int newIndex;
        int lastMax = 0;
        for (int i = 0; i < A.length; i++) {
            newIndex = A[i] - 1;
            if (A[i] >= N + 1 || 1 > A[i]) {
                lastMax = maxNumber;
            } else {
                response[newIndex] = Math.max(response[newIndex], lastMax);
                response[newIndex] += 1;
                maxNumber = Math.max(response[newIndex], maxNumber);
            }
        }

        for (int i = 0; i < response.length; i++) {
            response[i] = Math.max(response[i], lastMax);
        }

        return response;

    }

    public static void main(String[] args) {
        int[] response;
        response = solution(5, new int[]{4, 1, 3, 2});
        System.out.println("response: " + response);
        response = solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        System.out.println("response: " + Arrays.toString(response));
        response = solution(5, new int[]{});
        System.out.println("response: " + Arrays.toString(response));
        response = solution(5, new int[]{1, 100000000});
        System.out.println("response: " + Arrays.toString(response));


    }
}
