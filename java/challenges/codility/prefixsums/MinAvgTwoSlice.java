package challenges.codility.prefixsums;

public class MinAvgTwoSlice {

    public static int solution(int[] A) {
// https://app.codility.com/demo/results/trainingEYSP5Q-SQR/
        float minAvg = Integer.MAX_VALUE;
        int minAvgIndex = 0;
        float sliceTwo = 0;
        float sliceThree = 0;

        for (int i = 0; i < A.length - 2; i++) {
            sliceTwo = (float) (A[i] + A[i + 1]) / 2;
            sliceThree = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;
            if (minAvg > Math.min(sliceTwo, sliceThree)) {
                minAvg = Math.min(sliceTwo, sliceThree);
                minAvgIndex = i;
            }
        }


        if (minAvg > (A[A.length - 2] + A[A.length - 1]) / 2) minAvgIndex = A.length - 2;
        return minAvgIndex;

    }

    public static void main(String[] args) {
        int response;

        response = solution(new int[]{4, 2, 2, 2, 5, 1, 5, 8});
        System.out.println("response: " + response);
        response = solution(new int[]{4, 2, 2, 2, 5, 1, 5, 8, 0, 1, 1, 1});
        System.out.println("response: " + response);


    }


}
