package Day16;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbggjkvvsnaa";
        char[] arr = str.toCharArray();
        String ans = "";

        int i = 0, j = 0;
        while (j<arr.length){
            if (arr[j]==arr[i]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if (len>1) ans += len;
                i = j;
                j++;
            }
        }
//        For the last character
        ans += arr[i];
        int len = j-i;
        if (len>1) ans += len;
        System.out.println(ans);
    }
}

//      Used StringBuilder instead of using String
//========== ********* ==========
//        LeetCode Solution
//
//class Solution {
//    public int compress(char[] arr) {
//        StringBuilder ans = new StringBuilder("");
//
//        int i = 0, j = 0;
//        while (j<arr.length){
//            if (arr[j]==arr[i]) j++;
//            else{
//                ans.append(arr[i]);
//                int len = j-i;
//                if (len>1) ans.append(len) ;
//                i = j;
//                j++;
//            }
//        }
////        For the last character
//        ans.append(arr[i]);
//        int len = j-i;
//        if (len>1) ans.append(len) ;
//        for(i=0; i<ans.length();i++){
//            arr[i] = ans.charAt(i);
//        }
//        return ans.length();
//    }
//}
//========== ********* ==========
