package challenges.codility.timecomplexity;

/**
 * @author jamjav
 * exercise: <a href="https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/">...</a>
 * result: <a href="https://app.codility.com/demo/results/training68TA7H-VKJ/">...</a>
 */
public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        // Implement your solution here
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
