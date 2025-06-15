package Day07;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length;

        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

//        Reverse the array - Using another Array
//
//        for (int i=0; i< n/2; i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

//        Two pointer - Without using another Array
        int i = 0;
        int j = n-1;
        while (i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            swapArrayEle(arr,i,j);
            i++;
            j--;
        }

//        Print the array
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

//        Swap array by passing array to a method
    }

    public static void swapArrayEle(int[] brr, int a, int b){
        int temp = brr[a];
        brr[a] = brr[b];
        brr[b] = temp;
    }
}
