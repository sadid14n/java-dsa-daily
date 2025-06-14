package Day06.Problems;


public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,44,66,54,36,23};

        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum: "+ max);
    }
}
