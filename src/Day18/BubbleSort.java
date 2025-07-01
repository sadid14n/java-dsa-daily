package Day18;

public class BubbleSort {
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        
        int n = arr.length;

        print(arr);
//      Bubble Sort I
//        for (int x = 0; x < n - 1; x++) { // n-1 pass
//            for (int i = 0; i < n - 1; i++) {
//                if(arr[i] > arr[i+1]){
//                    int temp = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        Time Complexity: O(n^2)
//        Space Complexity: O(n)
//        Auxilary Space: O(1)

//      Bubble Sort II - Little Optimized
//        for (int x = 0; x < n - 1; x++) { // n-1 pass
//            for (int i = 0; i < n - 1 - x; i++) {
//                if(arr[i] > arr[i+1]){
//                    int temp = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        Time Complexity: O(n^2)
//        Space Complexity: O(n)
//        Auxilary Space: O(1)

//        Bubble Sort - Optimized
        for (int x = 0; x < n - 1; x++) { // n-1 pass
            boolean sorted = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
//        Time Complexity: O(n^2)
//        Space Complexity: O(n)
//        Auxilary Space: O(1)
        print(arr);


    }
}
