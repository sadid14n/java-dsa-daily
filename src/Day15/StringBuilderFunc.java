package Day15;

import java.util.Scanner;

public class StringBuilderFunc {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("Sadid");
        System.out.println(a.length());
        System.out.println(a.capacity());
        System.out.println(a);

        StringBuilder b = new StringBuilder();
        System.out.println(b.length());
        System.out.println(b.capacity());

        StringBuilder c = new StringBuilder(2);
        System.out.println(c.length());
        System.out.println(c.capacity());

        //        Change char of StringBuilder
        StringBuilder s = new StringBuilder("Sadid");
        System.out.println(s);
        s.setCharAt(1,'N');
        System.out.println(s);

//        Taking input in StringBuilder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);




    }
}
