package challenges.codility;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        // Implement your solution here
        int[] newArray = new int[A.length];
        if (A.length == 1) {
            return A;
        } else {
            for (int i = 0; i < A.length; i++) {
                int index = (i + K) % A.length;
                newArray[index] = A[i];
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] response = solution(new int[]{1, 1, 2, 3, 5}, 42);
        System.out.println(Arrays.toString(response));

    }
}