package Day19;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,4,20,-6,7};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
//            SWAP arr[i] with arr[mindx]
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
