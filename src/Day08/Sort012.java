package Day08;

public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {0,2,1,1,0,2,1,0};
        int n = arr.length;

//        Method 1: Double pass solution
//        int no0 = 0;
//        int no1 = 0;
//        int no2 = 0;
//
//        for (int i=0; i<arr.length; i++){
//            if (arr[i] == 0) no0++;
//            else if (arr[i] == 1) no1++;
//            else no2++;
//        }
//        System.out.println(no0 + " " + no1 + " " + no2);
//
//        for (int i=0; i<arr.length; i++){
//            if(i<no0) arr[i] = 0;
//            else if(i<no0+no1) arr[i] = 1;
//            else arr[i] = 2;
//        }


//        Method 2: Dutch Flag Algorithm (Single pass)
        int low = 0, mid = 0, high = n-1;

////        4 Step to solve the problem -
//        Before Low - all zeros
//        Before mid - all ones
//        After high - all twos


        while (mid<=high){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
