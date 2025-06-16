package Day08;
// Q7. Count the number of elements strictly greater than x.
public class CountTheNumberOfElementStrictlyGreaterX {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,10,20};
        int n = arr.length;
        int target = 20;
        int count = 0;
        for (int i=0; i<n; i++){
            if (arr[i] > target) count++;
        }
        System.out.println("Number of element strictly greater then " + target + ": " + count);
    }
}
