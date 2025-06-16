package Day08;

import java.util.Arrays;

// Q8. WAP to find the largest three elements in the array.

public class LargestThreeElement {
    public static void main(String[] args) {
        int[] arr = {12,45,76,43,78,34,98,23};
        int n = arr.length;

        Arrays.sort(arr);
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] largestThree = new int[3];
        largestThree[0] = arr[n-1];
        largestThree[1] = arr[n-2];
        largestThree[2] = arr[n-3];

        System.out.println("Largest three element of the array: ");
        for (int ele: largestThree){
            System.out.print(ele + " ");
        }

//        int max = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        int max3 = Integer.MIN_VALUE;
//
//        for (int i=0; i<n; i++){
//            if (max <= arr[i]){
//                max = arr[i];
//            }
//        }
//        for (int i=0; i<n; i++){
//            if (arr[i] == max){
//                continue;
//            }
//            if (max2 <= arr[i]){
//                max2 = arr[i];
//            }
//        }
//        for (int i=0; i<n; i++){
//            if (arr[i] == max || arr[i] == max2){
//                continue;
//            }
//            if (max3 <= arr[i]){
//                max3 = arr[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(max2);
//        System.out.println(max3);


    }
}
