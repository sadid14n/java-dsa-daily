package Day13;

//  Q4. Write a program to find the largest element of a given 2D array of integers.

public class FindALargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,6},{2,4,5,7},{3,5,6,8},{4,6,7,9}};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
