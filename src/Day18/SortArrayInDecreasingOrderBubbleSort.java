package Day18;

public class SortArrayInDecreasingOrderBubbleSort {
    public static void swap(int[]arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void print(int[] arr){
        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,3,12,6,10};

        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }

        for (int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
