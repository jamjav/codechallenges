package src.main.java.datastructure.array.multidimensional;

import java.util.Arrays;

public class Console {

    public static void toString (Integer[][] arr ){

        System.out.println(Arrays.deepToString(new String[]{"[INFO]: Printing MultiDimensional Array" + Arrays.deepToString(arr)}));
    }
}
