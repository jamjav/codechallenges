package src.main.java.datastructure.array.multidimensional;

public class Initialize {

    public static Integer[][] initMultiDimensionalIntegerArray() {

        // Create a new Multidimensional Integer Array
        System.out.println("[INFO] Multi Array Initialize");

        return new Integer[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},
        };
    }
}
