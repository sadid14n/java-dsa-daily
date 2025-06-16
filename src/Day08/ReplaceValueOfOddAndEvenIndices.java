package Day08;

// Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and increment all even indexed values by 10.

public class ReplaceValueOfOddAndEvenIndices {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        int i =0;
        while (i<n){
            if ((i+1)%2 == 0){
                arr[i]+=10;
            }else {
                arr[i] *= 2;
            }
             i++;
        }


        for (int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
