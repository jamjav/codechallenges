package challenges.codility.timecomplexity;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingG2W9VS-WFW/">...</a>
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {

        int total = 0;
        for (int i = 0; i < A.length; i++) total += A[i];

        int diff = Integer.MAX_VALUE;
        int leftSum = 0;
        int rightSum;

        for (int k = 1; k < A.length; k++) {
            leftSum += A[k - 1];
            rightSum = total - leftSum;
            diff = Math.min(diff, Math.abs(leftSum - rightSum));
        }
        return diff;


    }


    public static void main(String[] args) {
        int response = solution(new int[]{3, 1, 2, 4, 3});
        System.out.println(response);
        response = solution(new int[]{1, 1});
        System.out.println(response);
    }
}
