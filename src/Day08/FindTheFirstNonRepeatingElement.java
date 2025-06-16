package Day08;

public class FindTheFirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {40,10,20,50,30};
        int n = arr.length;

        int i = 0;
        int j = 1;
        while (i<n){
            if (arr[i] != arr[j]){
                j++;
            }
            if (arr[i] == arr[j]){
                
            }
        }
    }
}
