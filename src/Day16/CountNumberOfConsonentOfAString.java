package Day16;

public class CountNumberOfConsonentOfAString {
    public static void main(String[] args) {
        String str = "aabasklei";

        int count  = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) continue;
            else count++;
        }
        System.out.println(count);
    }
}
