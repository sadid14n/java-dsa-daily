package Day08;

// Q13. If an array arr contains n elements, then check if the given array is a palindrome or not .

public class CheckPalindromeOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int n = arr.length;

        int i = 0;
        int j = arr.length-1;

        boolean palindrome = true;
        while (i<=j){
            if (arr[i] == arr[j]){
                i++;
                j--;
            }else {
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");
    }
}
