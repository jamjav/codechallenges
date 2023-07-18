package challenges.codility.sorting;

import java.util.Arrays;

/**
 * @autor: jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/6-sorting/triangle/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingVU8TCK-H3Z/">...</a>
 */
public class Triangle {


    /**
     * @param A
     * @return
     */
    public static int solution(int[] A) {

        int lenArray = A.length;

        if (lenArray < 3) return 0;
        Arrays.sort(A);
        for (int i = 0; i < lenArray - 3; i++) {
            if (isTriangular(A[i], A[i + 1], A[i + 2])) return 1;
        }
        return (isTriangular(A[lenArray - 3], A[lenArray - 2], A[lenArray - 1])) ? 1 : 0;
    }

    /**
     * @param P
     * @param Q
     * @param R
     * @return
     */
    public static boolean isTriangular(long P, long Q, long R) {
        return (P + Q > R && Q + R > P && R + P > Q);
    }


    public static void main(String[] args) {
        int response = 0;
        response = solution(new int[]{10, 2, 5, 1, 8, 20});
        System.out.println("response: " + response);
        response = solution(new int[]{10, 50, 5, 1});
        System.out.println("response: " + response);
        response = solution(new int[]{10, 2, 5, 1, 4, 20});
        System.out.println("response: " + response);
        response = solution(new int[]{10, 50, 5, 1, 40});
        System.out.println("response: " + response);
        response = solution(new int[]{-99, 50, 5, 1, 40});
        System.out.println("response: " + response);
        response = solution(new int[]{});
        System.out.println("response: " + response);
        response = solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE});
        System.out.println("response: " + response);

    }
}
