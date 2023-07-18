package challenges.codility.prefixsums;

import java.util.Arrays;

public class PassingCars {

    public static int solution(int[] A) {
        // Implement your solution here
        long lista = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(A, i, A.length)));
                int[] newArray = Arrays.copyOfRange(A, i, A.length);
                int finalI = i;
                lista += Arrays.stream(newArray).filter(element -> element != A[finalI]).count();
                if (lista > 1000000000) return -1;
                System.out.println((lista));
            }


        }
        return (int) lista;


    }

    public static int solution2(int[] A) {
        // Implement your solution here
        var result = 0;

        var aLen = A.length;
        var zeroFactor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroFactor += 1;
            }

            if (A[i] == 1) {
                result += zeroFactor;

                if (result > 1000000000) {
                    result = -1;
                    break;
                }
            }


        }
        return result;


    }

    public static void main(String[] args) {
        int response = 0;
        //response = solution(new int[]{4, 1, 3, 2});
        //System.out.println("response: " + response);
        //response = solution(new int[]{1000000000});
        //System.out.println("response: " + response);
        //response = solution(new int[]{});
        //System.out.println("response: " + response);
        //response = solution(new int[]{3, 3, 1, 2});
        //System.out.println("response: " + response);
        //response = solution(new int[]{4, 1, 3});
        //System.out.println("response: " + response);
        response = solution2(new int[]{0, 1, 0, 1, 1});
        System.out.println("response: " + response);
        response = solution2(new int[]{0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1});
        System.out.println("response: " + response);
        response = solution2(new int[]{0});
        System.out.println("response: " + response);
        response = solution2(new int[]{1});
        System.out.println("response: " + response);


    }


}
