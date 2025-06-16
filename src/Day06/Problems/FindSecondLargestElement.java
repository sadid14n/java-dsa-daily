package Day06.Problems;
//  Q2. Find the second largest element in the given Array in one pass.

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,99,44,66,54,36,23};


        int secondLarge = findSecondLargest(arr);
        System.out.println("Second Largest element: " + secondLarge);
    }
    private static int findSecondLargest(int[] arr){
        if (arr.length < 2){
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
