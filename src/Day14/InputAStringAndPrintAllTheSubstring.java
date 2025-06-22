package Day14;

import java.util.Scanner;

public class InputAStringAndPrintAllTheSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

//        System.out.println(str.substring(0,1));

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
