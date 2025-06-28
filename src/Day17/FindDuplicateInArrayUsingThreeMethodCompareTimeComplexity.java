package Day17;

// Q9. Given an array of size n+1 consisting of integers from 1 to n. One of the elements is duplicate in the array.
//Find that duplicate element.

import java.util.Arrays;

public class FindDuplicateInArrayUsingThreeMethodCompareTimeComplexity {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4};

//        method 1 Use two nested loops. The outer loop traverses
//        through all elements and the inner loop checks if the
//        element picked by the outer loop appears anywhere else.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
//        Time Complexity: O(n^2)
//        Space Complexity: O(1)

        //method 2 sorting
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] == arr[i+1]){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//        Time Complexity: O(nlogn)
//        Space Complexity: O(1)

        //method 3 using math - best in this code
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum - (n*(n-1))/2);

//        Time Complexity: O(n)
//        Space Complexity: O(1)


    }
}
