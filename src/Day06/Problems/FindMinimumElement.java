package Day06.Problems;

public class FindMinimumElement {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,44,66,54,36,23};

        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){

            min = Math.min(min, arr[i]);
        }
        System.out.println("Minimum: "+ min);
    }
}
