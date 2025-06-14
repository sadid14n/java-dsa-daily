package Day06.Problems;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,44,66,54,36,23};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();

        boolean flag = false;

        for (int i=0; i< arr.length; i++){
            if (n == arr[i]){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Yes, it's present");
        }else System.out.println("No, it's not present");
    }
}
