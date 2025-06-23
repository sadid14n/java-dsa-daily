package Day15;

import java.util.Arrays;

public class CheckIfTwoStringAnagramOrNot {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";

        char[] ach = a.toCharArray();
        char[] bch = b.toCharArray();
        Arrays.sort(ach);
        Arrays.sort(bch);

        String c = new String(ach);
        String d = new String(bch);

        System.out.println(c.compareTo(d));
        System.out.println(c.equals(d));

    }
}
