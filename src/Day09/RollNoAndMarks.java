package Day09;

import java.util.Scanner;

public class RollNoAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students: ");
        int m = sc.nextInt();

        int[][] arr = new int[m][2];

        System.out.println("Enter the roll no and marks: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] ele : arr){
            for (int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
