package Day19;

// After each pass put the kth maximum element at the right place

public class PutTheKthElementAtTheRightPositionInEachPass {
    public static void main(String[] args) {
        int[]  arr = {12,5,2,8,9,4,3};

        int n = arr.length;

        for (int i = 0; i< n-1; i++) {
            int max = Integer.MIN_VALUE;
            int mxindx = -1;
            for (int j = 0; j < n - i; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    mxindx = j;
                }
            }
//            Swap arr[mxindx] with arr[n-1-i]
            int temp = arr[mxindx];
            arr[mxindx] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
