package Day06.Problems;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,99,44,66,54,36,23};

        int max = arr[0];
        int prevMax = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                prevMax = max;
                max = arr[i];
            }
        }
        System.out.println("Maximum: "+ max);
        System.out.println("2nd largest: "+ prevMax);
    }
}
