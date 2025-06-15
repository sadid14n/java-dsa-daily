package Day07;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 6;
        k %= n;
        int[] res = new int[n];


//        Method 1: Using Extra Array
//        int j = 0;
//        for (int i=n-k; i<n; i++){
//            res[j++] = arr[i];
//        }
//        for (int i=0; i<n-k; i++){
//            res[j++] = arr[i];
//        }

 //        for (int ele:res){
//            System.out.print(ele + " ");
//        }


//        Method 2: Without using extra Array - Two Pointer Approach

        rotateArray(arr, 0, n-k-1);
        rotateArray(arr, n-k, n-1);
        rotateArray(arr, 0, n-1);

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
    public static void rotateArray(int[] arr, int i, int j){
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
