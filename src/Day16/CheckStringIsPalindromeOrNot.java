package Day16;

public class CheckStringIsPalindromeOrNot {
    public static void main(String[] args) {
        String str = "abccbba";

        int i = 0, j = str.length()-1;
        boolean palindrome = true;

        while (i<=j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
