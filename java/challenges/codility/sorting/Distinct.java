package challenges.codility.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/6-sorting/distinct/">...</a>
 * result: <a href="https://app.codility.com/demo/results/training9FTU6Q-A5S/">...</a>
 */
public class Distinct {
    public static int solution(int[] A) {

        List<Integer> list = Arrays.stream(A).distinct().sorted().boxed().collect(Collectors.toList());
        return list.size();

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
