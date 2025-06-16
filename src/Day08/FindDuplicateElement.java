package Day08;

//      Q4. WAP to find the duplicate elements from the given array of elements.

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,4,6,7};
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate: "+ arr[i]);

                }
            }
        }

    }
}
