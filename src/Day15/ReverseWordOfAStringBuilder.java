package Day15;

public class ReverseWordOfAStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am Sadid");

        int n = sb.length();
        int i = 0, j = 0;
        while (j<n){
            if (sb.charAt(j) != ' ') j++;
            else {
                reverseWord(sb,i,j-1);
                i = j + 1;
                j = i;
            }
        }
//        One last time for reverse the last word
        reverseWord(sb, i, j-1);
        System.out.println(sb);
    }
    public static void reverseWord(StringBuilder sb,int i, int j){
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
