package Day13;
// Q8. Write a program to print the elements of both the diagonals in a square matrix.

//  Output
//        1   3
//          5
//        7   9

public class PrintTheBothDiagonalElementOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i==j || i+j == arr.length-1){
                    System.out.print(arr[i][j] + " ");
                }else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
