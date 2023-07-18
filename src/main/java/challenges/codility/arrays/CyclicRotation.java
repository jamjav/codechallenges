package challenges.codility.arrays;

import java.util.Arrays;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingNFK2BG-TU4/">...</a>
 */
public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int sizeArray = A.length;
        int[] newArray = new int[sizeArray];

        if (sizeArray == 1) return A;

        for (int i = 0; i < sizeArray; i++) {
            int index = (i + K) % sizeArray;
            newArray[index] = A[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] response = solution(new int[]{1, 1, 2, 3, 5}, 42);
        System.out.println(Arrays.toString(response));

    }
}