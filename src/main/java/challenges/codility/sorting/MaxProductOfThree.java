package challenges.codility.sorting;

import java.util.Arrays;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingCC2CRK-HYT/">...</a>
 */
public class MaxProductOfThree {

    public static int solution(int[] A) {

        Arrays.sort(A);
        return Math.max(A[0] * A[1] * A[A.length - 1],
                A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);

    }

    public static void main(String[] args) {
        int response;
        response = solution(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println("response: " + response);
        response = solution(new int[]{-5, 5, -5, 4});
        System.out.println("response: " + response);


    }
}
