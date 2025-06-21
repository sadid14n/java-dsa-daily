package Day13;

//  Q5. Write a program to print the row number having the maximum sum in a given matrix.

public class PrintTheRowNumberHavingTheMaxiumSum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};

        int maxRow = 0;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
                maxRow = i;
            }
        }

        System.out.println(maxRow);
    }
}
