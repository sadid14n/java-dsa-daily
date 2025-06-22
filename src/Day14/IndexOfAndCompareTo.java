package Day14;

public class IndexOfAndCompareTo {
    public static void main(String[] args) {
        String str = "Sadid Alam";

//        indexOf()
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('A'));

//        compareTo()
        String a = "abc";
        String b = "aac";
        String c = "abcdfg";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
    }
}
