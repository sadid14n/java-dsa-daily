package Day19;

//Q9. Given an array of digits (values are from 0 to 9), the task is to find the minimum possible sum of two
//numbers formed from digits of the array. Please note that all digits of the given array must be used to form
//the two numbers.

public class MinimumSumOFTwoDigitOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,1,9,0};
        int n = arr.length;
        int minSum = Integer.MAX_VALUE;

        int[] digit = new int[2];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i] + arr[j]) < minSum){
                    minSum = arr[i] + arr[j];
                    digit[0] = arr[i];
                    digit [1] = arr[j];
                }
            }
        }
        System.out.println("Minimum sum: " + minSum);
        for (int ele:digit){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
