package Day16;

public class FindLaregestStringOfNumberFromAnArray {
    public static void main(String[] args) {
        String[] arr = {"6453", "8275172", "02927202678", "0002187236"};

        String maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxNum = findMaxString(maxNum, arr[i]);
        }
        System.out.println(maxNum);

    }
    public static String findMaxString(String a, String b){
        String s = purifyString(a), t = purifyString(b);

        if (s.length() > t.length()) return a;
        if (s.length() < t.length()) return b;
//        for same length compare character by character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                if (s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if (a.length() >= b.length()) return a;
        else return b;
    }

    public static String purifyString(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }

}
