package challenges.codility.timecomplexity;

import java.util.Arrays;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingKY8ZHG-6Z3/">...</a>
 */
public class PermMissingElem {

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) return 1;
        if (A[0] != 1) return 1;
        if (A.length < 2) return Integer.sum(A[0], 1);

        for (int i = 0; i < A.length; i++) {
            if (Integer.sum(i, 1) == A.length) return Integer.sum(A[i], 1);
            int s = A[i + 1] - A[i];
            if (s > 1) {
                return Integer.sum(A[i], 1);
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int response = solution(new int[]{});
        System.out.println(response);
        response = solution(new int[]{1, 2});
        System.out.println(response);
    }
}
