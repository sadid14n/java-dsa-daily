package Day16;

import java.util.Scanner;

public class InputAnStringAndReturnSubstringContainignOnlyVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

//        h g a b v a e i k h
//        h k a e d j o
//                    i
//                      j




        int i = 0, j = 0;
        while (i<str.length() && j<str.length()){
            if (!isVowel(str.charAt(i))){
                i++;
            }else{
                j = i;
                while (j<str.length() && isVowel(str.charAt(j))){
                    j++;
                }
                printSubstring(str, i, j);
                i = j;
            }
        }

    }
    public static boolean isVowel(char ch){

        if(ch == 'a' || ch == 'A') return true;
        if(ch == 'e' || ch == 'E') return true;
        if(ch == 'i' || ch == 'I') return true;
        if(ch == 'o' || ch == 'O') return true;
        if(ch == 'u' || ch == 'U') return true;
        return false;
    }
    public static void printSubstring(String str, int i, int j){
        System.out.println(str.substring(i,j));
    }
}
