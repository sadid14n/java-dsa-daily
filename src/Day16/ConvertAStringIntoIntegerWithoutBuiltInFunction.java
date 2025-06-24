package Day16;

//   Q5. Input a string of length less than 10 and convert it into integer without using built-in function.

import java.util.Scanner;

public class ConvertAStringIntoIntegerWithoutBuiltInFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 10) {
            System.out.println("Enter a string of length < 10");
            return;
        }

        int sum = 0;
        int multiply = 1;
        for (int i = str.length()-1; i >= 0 ; i--) {
            int num = (int)str.charAt(i) - 48;
            sum += num * multiply;
            multiply *= 10;
        }

        System.out.println(sum);


    }
}
