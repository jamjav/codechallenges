package src.main.java.datastructure.array.multidimensional;

public class MultiArray {

    public static void main(String[] args) {

        Integer[][] multiArray = Initialize.initMultiDimensionalIntegerArray();
        Console.toString(multiArray);
        Bucles.iterateMultiArray(multiArray);
    }
}
