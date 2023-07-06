package src.main.java.datastructures.array.dimensional;

import java.util.Arrays;
import java.util.Collections;

public class Sort {


    // function reverses the elements of the src.main.java.datastructure.array
    public static Integer[] reverse(Integer[] arr) {
        System.out.println("array before reverse: " + Arrays.asList(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("array after reverse: " + Arrays.asList(arr));
        return arr;
    }

    public static Integer[] swapZeroToOne(Integer[] arr) {
        System.out.println("Array before swap: " + Arrays.asList(arr));
        for (int col = 0; col < arr.length; col++) {
            arr[col] = 1 - arr[col];
        }
        System.out.println("Array after swap: " + Arrays.asList(arr));
        return arr;
    }


    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);

        Integer[] arr2 = {0, 1, 0};
        swapZeroToOne(arr2);
    }
}
