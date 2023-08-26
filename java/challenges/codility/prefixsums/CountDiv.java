package challenges.codility.prefixsums;

public class CountDiv {

    public static int solution(int A, int B, int K) {
        int response = 0;
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);

    }

    public static void main(String[] args) {
        int response = 0;

        response = solution(6, 11, 2);
        System.out.println("response: " + response);
        response = solution(0, 2000000000, 1);
        System.out.println("response: " + response);


    }
}
