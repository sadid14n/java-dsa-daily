//package Day16;
//
//import java.util.Arrays;
// Incomplete
//
//public class FindTheLexographicallyMaximumWordFromASentence {
//    public static void main(String[] args) {
//        String str = "I am a Java Coder";
//        System.out.println(str);
//
//        int i = 0, j = 0;
//        int maxIdx = 0;
//        int maxVal = -1;
//
//        while (j<str.length()){
//            if (str.charAt(j) != ' ') j++;
//            else{
//                if(maxVal < (int)str.charAt(i)){
//                    maxVal = (int)(str.charAt(i));
//                    maxIdx = i;
//                }
//                j++;
//                i=j+1;
//            }
//        }
//        System.out.println(maxIdx);
//        System.out.println(maxVal);
//
//
//    }
//}
