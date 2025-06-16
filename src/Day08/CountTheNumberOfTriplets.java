package Day08;

// Q16. Count the number of triplets whose sum is equal to the given value x.

public class CountTheNumberOfTriplets {
    public static void main(String[] args) {
        int[] arr = {40,10,20,50,30};
        int n = arr.length;
        int target = 80;

        for (int i=0; i<n-2;i++){
            for (int j=i+1; j<n-1; j++){
                for (int k =i+2; k<n; k++){
                    if ((arr[i] + arr[j] + arr[k]) == target)
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                }
            }
        }
    }
}
