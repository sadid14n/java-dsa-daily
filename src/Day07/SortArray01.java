package Day07;

public class SortArray01 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,0};

        int noOfZeors = 0;
        int noOfOnes = 0;
        int n = arr.length;

//        Method - 1: Two pass method

        for (int i=0; i<n; i++){
            if(arr[i] == 0){
                noOfZeors++;
            }else noOfOnes++;
        }

        for (int i=0; i<n; i++){
            if(i<noOfZeors) arr[i] = 0;
            else arr[i] = 1;
        }

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
