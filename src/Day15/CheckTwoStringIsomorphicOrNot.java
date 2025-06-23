package Day15;

public class CheckTwoStringIsomorphicOrNot {
    public static void main(String[] args) {
        String a = "mood";
        String b = "race";

        System.out.println(checkIsomorphic(a,b));

    }
    public static boolean checkIsomorphic(String a, String b){
        char[] arr = new char[128];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            char dh = b.charAt(i);
            int idx = (int)ch;
            if(arr[idx] == '\0') arr[i] = dh;
            else{
                if (arr[idx] != dh) return false;
            }
        }

        char[] brr = new char[128];

        for (int i = 0; i < b.length(); i++) {
            char ch = a.charAt(i);
            char dh = b.charAt(i);
            int idx = (int)dh;
            if(brr[idx] == '\0') brr[i] = ch;
            else{
                if (brr[idx] != ch) return false;
            }
        }
        return  true;
    }
}
