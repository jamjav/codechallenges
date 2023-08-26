package challenges.codility.countingelements;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/">...</a>
 * result: <a href="https://app.codility.com/demo/results/training6TPSVX-XHE/">...</a>
 */
public class PermCheck {

    public static int solution(int[] A) {
        HashMap<Integer, Integer> checkPerm = new HashMap<Integer, Integer>();
        int total = 0;

        if (A.length == 0) return 0;
        if (A[A.length - 1] > A.length) return 0;

        Arrays.sort(A);

        for (int i = 1; i <= A[A.length - 1]; i++) total += i;

        for (int j : A) {
            if (checkPerm.containsKey(j)) {
                return 0;
            } else {
                total -= j;
                checkPerm.put(j, 1);
            }
        }

        return (total > 0) ? 0 : 1;
    }

    public static void main(String[] args) {
        int response = 0;
        response = solution(new int[]{4, 1, 3, 2});
        System.out.println("response: " + response);
        response = solution(new int[]{1000000000});
        System.out.println("response: " + response);
        response = solution(new int[]{});
        System.out.println("response: " + response);
        response = solution(new int[]{3, 3, 1, 2});
        System.out.println("response: " + response);
        response = solution(new int[]{4, 1, 3});
        System.out.println("response: " + response);
        response = solution(new int[]{1000000000});
        System.out.println("response: " + response);


    }

}
