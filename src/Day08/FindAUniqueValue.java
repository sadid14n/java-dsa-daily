package Day08;

// Q12. Find the unique number in a given Array where all the elements are being repeated twice with one value
//being unique.

public class FindAUniqueValue {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,2,-3,1,4,2};
        int n = arr.length;


        for (int i=0; i<n-1;i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]) {
                    arr[i] = Integer.MIN_VALUE;
                    arr[j] = Integer.MIN_VALUE;
                }
            }
        }

        for(int i=0; i<n; i++){
            if (arr[i] > Integer.MIN_VALUE){
                System.out.println("Unique: " + arr[i]);
            }
        }
    }
}
