package Day06;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,99,44,66,54,36,23};

//        for (int ele: arr){
//            System.out.print(ele + " ");
//        }

//        Making shallow copy - not real copy
//        int[] nums = arr;
//        nums[0] = 123;
//        System.out.println(arr[0]);

//        Array deep copy - real copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 1000;
        System.out.println(arr[0]);
        System.out.println(brr[0]);

    }
}
