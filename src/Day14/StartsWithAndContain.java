package Day14;

public class StartsWithAndContain {
    public static void main(String[] args) {
        String str = "Sadid Alam";

//        Starts With
        System.out.println(str.startsWith("Sa"));
        System.out.println(str.startsWith("Aa"));

//        Contains
        System.out.println(str.contains("did"));
        System.out.println(str.contains("did a"));
    }
}
