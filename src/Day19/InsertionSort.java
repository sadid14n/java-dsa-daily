package Day19;

public class InsertionSort {
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
        int[] arr = {10,4,20,-6,7};
        int n = arr.length;
        print(arr);

        for (int i = 1; i < n; i++) {

            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else break;
            }

//            int j = i;
//            while (j>=1 && arr[j]<arr[j-1]){
//                swap(arr, j, j-1);
//                j--;
//            }
        }

        print(arr);
    }
}
