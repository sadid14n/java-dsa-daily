package Day08;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,34,56,34,23,54};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

//      Method 1: Brute Force
//        for (int i=0; i<n-1; i++){
//            int max = arr[i+1];
//            for (int j=i+1; j<n; j++){
//                if (max <= arr[j]){
//                    max = arr[j];
//                }
//            }
//            ans[i] = max;
//        }

//        Method 2: Optimized
        int max = arr[n-1];
        for (int i=n-2; i>=0; i--){
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }

        for (int ele: ans){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
