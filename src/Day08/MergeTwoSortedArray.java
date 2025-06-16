package Day08;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {12,23,54,67,72,77,88};
        int[] b = {48,77,93,97};
        int[] c = new int[a.length + b.length];

//        Method 1 - taking smallest element and insert into final array

//        int i = 0;
//        int j = 0;
//        int k = 0;
//// Merging
//        while (i<a.length && j<b.length){
//            if (a[i] <= b[j]) {
//                c[k] = a[i];
//                i++;
//                k++;
//            }else {
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
//
////        a finished - take element from b and insert c
//        if (i==a.length){
//            while (j<b.length){
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
////        b finished - take element from a and insert into c
//        else{
//            while (i<a.length){
//                c[k] = a[i];
//                i++;
//                k++;
//            }
//        }


//        Method 2 - taking largest element and push into final array
        int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;

        while (i>=0 && j>=0){
            if (a[i] >= b[j]){
                c[k] = a[i];
                i--;
                k--;
            }else {
                c[k] = b[j];
                j--;
                k--;
            }
        }

        if (i<0){
            while (j>=0){
                c[k] = b[j];
                j--;
                k--;
            }
        }else {
            while (i>=0){
                c[k] = a[i];
                i--;
                k--;
            }
        }

        for (int ele: c){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
