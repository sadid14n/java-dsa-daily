package Day17;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};

        boolean sorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }

        if (sorted){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
}
