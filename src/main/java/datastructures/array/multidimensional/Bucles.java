package src.main.java.datastructures.array.multidimensional;

public class Bucles {

    public static void iterateMultiArray(Integer[][] input) {


        for (int row = 0; row < input.length; row++) {
            System.out.println("Row: " + row + " {");
            for (int col = 0; col < input[row].length; col++) {
                System.out.println("Column " + col + input[row][col]);
            }
            System.out.println(" } ");
        }
    }
}
