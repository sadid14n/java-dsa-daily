package Day15;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toCharArray();

        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();

        Arrays.sort(ch);
        for(char ele: ch){
            System.out.print(ele);
        }
    }
}
