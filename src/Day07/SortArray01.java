package Day07;

public class SortArray01 {
    public static void sort0(int[] arr, int a, int b){
        for (int i=a; i<=b; i++){
            arr[i] = 0;
        }

    }public static void sort1(int[] arr, int a, int b){
        for (int i=a; i<=b; i++){
            arr[i] = 1;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,0};

        int noOfOnes = 0;
        int noOfZeors = 0;
        int n = arr.length;

        for (int i=0; i<n; i++){
            if(arr[i] == 0){
                noOfZeors++;
            }else noOfOnes++;
        }
        sort0(arr, 0, noOfZeors-1);
        sort1(arr, noOfZeors, n-1);

for (int ele: arr){
    System.out.print(ele + " ");
}
    }
}
