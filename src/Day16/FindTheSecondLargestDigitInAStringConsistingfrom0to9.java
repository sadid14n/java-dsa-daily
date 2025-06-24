package Day16;

//Q7. Find the second largest digit in the string consisting of digits from ‘0’ to ‘9’.

public class FindTheSecondLargestDigitInAStringConsistingfrom0to9 {
    public static void main(String[] args) {
        String str = "7520225673";
        int max = 48; // ASCII value of 0
        int sec_Max = 48;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int chVal = (int)ch;
            if (chVal >= max){
                sec_Max = max;
                max = chVal;
            }
        }
        max = max-48;
        sec_Max = sec_Max - 48;
        System.out.println(max);
        System.out.println(sec_Max);

    }
}
