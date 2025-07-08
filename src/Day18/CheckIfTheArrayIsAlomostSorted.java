package Day18;
//  Q5. Check if the given array is almost sorted. (elements are at-most one position away)

public class CheckIfTheArrayIsAlomostSorted {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,8};
        int n = arr.length;
        int itr = 0;
        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    sorted = false;
                    itr ++;
                }
            }
            if(sorted) break;
        }
        System.out.println(itr);
        if(itr == 1){
            System.out.println("Almost sorted. (elements are at-most one position away)");
        }else{
            System.out.println("Not almost sorted");
        }
    }
}
