package src.main.java.challenges;

import src.main.java.datastructures.array.dimensional.sort.SortInt;
import src.main.java.datastructures.array.multidimensional.Initialize;

import java.util.Arrays;


public class ArrayMultidimensionalReverseAndSwitch {

    public static void main(String[] args) {

        //How Initialize src.main.java.datastructure.array Multidimensional
        Integer[][] input = Initialize.initMultiDimensionalIntegerArray();
        System.out.println(Arrays.deepToString(new String[]{"Starting src.main.java.datastructure.array MultiDimensional: " + Arrays.deepToString(input)}));

        for (int row = 0; row < input.length; row++) {
            System.out.println("Row: " + row);
            input[row] = SortInt.reverse(input[row]);
            input[row] = SortInt.swapZeroToOne(input[row]);

        }
        System.out.println(Arrays.deepToString(new String[]{"Finishing src.main.java.datastructure.array MultiDimensional: " + Arrays.deepToString(input)}));
    }
}
