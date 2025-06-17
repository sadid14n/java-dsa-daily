package Day09;

public class RotateMatricBy90ClockWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        2 3 4
//        7 6 5
//        3 6 9

//        first step - transpose
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }
//        second step - row reverse
        for (int i=0; i<arr.length; i++){
            int j = 0;
            int k = arr[0].length-1;
            while (j<=k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
//        Printing the array
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    }

