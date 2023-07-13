package challenges.codility;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        // Implement your solution here
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
