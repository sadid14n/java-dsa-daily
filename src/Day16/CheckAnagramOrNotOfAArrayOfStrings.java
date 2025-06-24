package Day16;

// Q9. Given an array of strings. Check whether they are anagram or not.

import java.util.ArrayList;
import java.util.Arrays;

public class CheckAnagramOrNotOfAArrayOfStrings {
    public static void main(String[] args) {
        String[] arr = {"anagram","nagaram", "nagrama", "ganaram"};

        String first = arr[0];


        int[] ref = new  int[26];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            ref[((int)ch) -97]++;
        }

        for (int ele: ref){
            System.out.print(ele + " ");
        }

        int[] check = new int[26];
        for (int i = 1; i < arr.length; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int idx = ((int)ch)-97;
                check[idx]++;
            }
            System.out.println("");
            for (int ele: check){
                System.out.print(ele + " ");
            }

            if (!Arrays.equals(ref,check)){
                System.out.println("Not anagram");
                return;
            }
            Arrays.fill(check, 0);

        }


    }

}
