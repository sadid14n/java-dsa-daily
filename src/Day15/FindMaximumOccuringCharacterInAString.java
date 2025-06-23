package Day15;

public class FindMaximumOccuringCharacterInAString {
    public static void main(String[] args) {
        String str = "acadbbabba";

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int asscii = (int)str.charAt(i);
            int val = asscii - 97;
            arr[val]++;
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();


//        int maxVal = Integer.MIN_VALUE;
//        int maxIndx = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxVal){
//                maxVal = arr[i];
//                maxIndx = i;
//            }
//        }
//        System.out.println("Character which occurring most: " + (char)(maxIndx+97));

        int maxFrequency = -1;
        for (int i = 0; i < arr.length; i++) {
            maxFrequency = Math.max(maxFrequency, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxFrequency){
                char ch = (char)(i+97);
                System.out.print( ch + " ");
            }
        }


    }
}
