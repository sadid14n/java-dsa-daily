package Day19;

//Q13. Given an integer array and an integer k where k<=size of array, We need to return the kth smallest
//        element of the array.

import java.util.Arrays;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,7,2};
        int n = arr.length;
        int k = 5;

        Arrays.sort(arr);

        for (int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        System.out.println(k +"th smallest element = " + arr[k-1]);


    }
}
