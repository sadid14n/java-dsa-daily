package Day08;

// Q5. WAP to find the smallest missing positive element in the sorted Array.

public class FindSmallestMissingPositiveInt {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = arr.length;

        for (int i=0; i<n-1;i++){
            arr[i] = i+1;
        }

        int missingVal = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] != i+1){
                missingVal = i+1;
                break;
            }
        }
        System.out.println("Missing value: " + missingVal);

    }
}
