package challenges.codility.Iterations;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">...</a>
 * result: <a href="https://app.codility.com/demo/results/training3JRGM5-6B9/">...</a>
 */
public class BinaryGap {

    public static int solution(int N) {

        //Convert int to Binary
        String binary = Integer.toBinaryString(N);
        int maxBinaryGap = 0;
        int binaryGap = 0;

        System.out.println("binary chain: " + binary);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                binaryGap++;
            } else {
                maxBinaryGap = Math.max(binaryGap, maxBinaryGap);
                binaryGap = 0;
            }
        }

        return maxBinaryGap;


    }

    public static void main(String[] args) {
        int response = 0;
        response = solution(9);
        System.out.println("response: " + response);
        response = solution(1041);
        System.out.println("response: " + response);
        response = solution(32);
        System.out.println("response: " + response);
        response = solution(Integer.MAX_VALUE);
        System.out.println("response: " + response);
        response = solution(Integer.MIN_VALUE);
        System.out.println("response: " + response);
        response = solution(0);
        System.out.println("response: " + response);

    }
}
