package Day08;

//Q9. Find the difference between the sum of elements at even indices to the sum of elements at odd indices.

public class DifferenceBetweenSumOfEvenIndicesAndOddIndices {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,30};
        int n = arr.length;

        int sumEvenIndices = 0;
        int sumOddIndices = 0;

        int i =0;
        while (i<n){
            if ((i+1)%2 == 0){
                sumEvenIndices += arr[i];
            }else sumOddIndices += arr[i];
            i++;
        }
        System.out.println("Difference = " + (sumEvenIndices - sumOddIndices));

    }
}
