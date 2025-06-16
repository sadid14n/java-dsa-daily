package Day08;

// Q9. Check if the given array is sorted or not

public class CheckSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int n = arr.length;

        System.out.println("Ascending Sorted: " + checkSortedAscending(arr, n));
        System.out.println("Decending Sorted: " + checkSortedDecending(arr, n));


    }
    public static boolean checkSortedAscending(int[] arr, int n){
        boolean sorted = true;
        for (int i=0; i<n-1; i++){
            if (arr[i] > arr[i+1]){
                sorted = false;
            }
        }
        return sorted;
    }
    public static boolean checkSortedDecending(int[] arr, int n){
        boolean sorted = true;
        for (int i=0; i<n-1; i++){
            if (arr[i] < arr[i+1]){
                sorted = false;
            }
        }
        return sorted;
    }

}
