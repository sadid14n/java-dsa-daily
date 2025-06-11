package Day03;

import java.util.Scanner;

public class generateAP {
    public static void main(String[] args) {
//        Generate the AP: 1 3 5 7 ... upto N terms

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms you want to print: ");
        int n = sc.nextInt();
        int nth = 2*n - 1;

        for (int i=1; i<=nth; i+=2){
            System.out.println(i);
        }
    }
}
