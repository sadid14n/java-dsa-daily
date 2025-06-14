package Day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,99,44,66,54,36,23};

        for (int ele: arr){
            System.out.print(ele + " ");
        }

        System.out.println();
        Arrays.sort(arr);
        for (int ele: arr) System.out.print(ele + " ");
    }
}
