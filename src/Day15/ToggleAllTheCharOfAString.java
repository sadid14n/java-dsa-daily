package Day15;

import java.util.Scanner;

public class ToggleAllTheCharOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
//
//        System.out.println((int)sb.charAt(1) );
//        System.out.println((char)65);

        for (int i = 0; i < sb.length(); i++) {
            if((int)sb.charAt(i) >= 65 && (int)sb.charAt(i) <=90){
                sb.setCharAt(i, (char)((int)sb.charAt(i) + 32));
            }
            else if((int)sb.charAt(i) >= 97 && (int)sb.charAt(i) <=122){
                sb.setCharAt(i, (char)((int)sb.charAt(i) - 32));
            }
        }
        System.out.println(sb);

    }
}
