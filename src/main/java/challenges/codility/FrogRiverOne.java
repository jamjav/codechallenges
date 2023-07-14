package challenges.codility;

import java.lang.reflect.Array;

public class FrogRiverOne {


    //https:app.codility.com/demo/results/trainingB37MZ2-2RW/

    public static int solution(int X, int[] A) {

        int sum = 0;
        int[] path = new int[X];
        for (int i = 1; i <= X; i++) sum += i;

        for (int l = 0; l < A.length; l++) {
            if (A[l] <= X && path[A[l] - 1] == 0) {
                Array.set(path, A[l] - 1, 1);
                sum -= A[l];
            }

            if (sum == 0) return l;
        }
        return -1;
    }

    public static void main(String[] args) {

        int response = solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        System.out.println(response);

        response = solution(8, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
        System.out.println(response);

        response = solution(1, new int[]{2});
        System.out.println(response);

        response = solution(1, new int[]{});
        System.out.println(response);

    }
}
