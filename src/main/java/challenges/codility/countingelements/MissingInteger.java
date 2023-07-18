package challenges.codility.countingelements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/">...</a>
 * result: <a href="https://app.codility.com/demo/results/trainingZZSV9K-BAY/">...</a>
 */
public class MissingInteger {


    public static int solution(int[] A) {

        List<Integer> list = Arrays.stream(A).distinct().sorted().boxed().collect(Collectors.toList());
        int maxPositiveValue = 0;
        for (Integer integer : list) {
            if (Math.abs(maxPositiveValue - integer) != 1) return maxPositiveValue + 1;
            maxPositiveValue++;
        }

        return maxPositiveValue + 1;

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
        response = solution(new int[]{-1, 2});
        System.out.println("response: " + response);
        response = solution(new int[]{1, 2, 3});
        System.out.println("response: " + response);
        response = solution(new int[]{1, 2, 3, 4, 5});
        System.out.println("response: " + response);
        response = solution(new int[]{1, -2});
        System.out.println("response: " + response);
        response = solution(new int[]{0});
        System.out.println("response: " + response);
        response = solution(new int[]{99});
        System.out.println("response: " + response);
        response = solution(new int[]{-1, -3});
        System.out.println("response: " + response);
        response = solution(new int[]{2, -2});
        System.out.println("response: " + response);
    }
}
