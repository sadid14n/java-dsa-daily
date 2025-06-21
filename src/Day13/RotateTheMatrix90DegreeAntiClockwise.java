package Day13;

//Q9. Write a program to rotate the matrix by 90 degrees anti-clockwise.

public class RotateTheMatrix90DegreeAntiClockwise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//        90 degree anti clockwise = transpose + col reverese

//        Transpose by swaping non diagonal element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int j=0; j<arr[0].length; j++){
            int i = 0, k = arr.length-1;

            while (i<=k){
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
                i++;
                k--;
            }
        }

        printArray(arr);

    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
