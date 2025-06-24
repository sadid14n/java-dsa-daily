package Day16;

import java.util.Scanner;

//  Q4. Input a string of even length and reverse the second half of the string.

public class Reverse2ndHalfOfAEvenLengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int halfLen = sb.length() / 2;

        reverseString(sb,halfLen,sb.length()-1);
        System.out.println(sb);

    }
    public static StringBuilder reverseString(StringBuilder sb, int i, int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb;
    }
}
