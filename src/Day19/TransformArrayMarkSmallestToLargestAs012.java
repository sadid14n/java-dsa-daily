package Day19;

public class TransformArrayMarkSmallestToLargestAs012 {
    public static void main(String[] args) {
        int[] arr = {21,78,3,12,32,78};
        int n = arr.length;
        int x= 0;


        for (int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int minEle = Integer.MAX_VALUE;
            int minIdx = -1;

            for (int j = 0; j < n; j++) {

                if(arr[j]<minEle && arr[j] >0){
                    minEle = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = x;
            x--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] *= -1;
        }

        for (int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
