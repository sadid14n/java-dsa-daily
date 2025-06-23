package Day15;

public class Equals {
    public static void main(String[] args) {
        String a = "abcxyz";
        String b = "abcxyz";
        String c = new String(a);

//        == operator is not used to check string in java. (== checks address of string. so it's give false if the address is diffrent)
        System.out.println(a==b);
        System.out.println(a==c);

//        equals() operator is used in java to check string. this operator checks strings character by character
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

    }
}
