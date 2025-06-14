package Day06.Problems;

// Given an array of marks of student. print roll number if marks is less then 35, here roll no refers index of the array


public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,44,66,54,36,23};

        System.out.println("Roll no of students whose marks is less then 35 - ");
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 35){
                System.out.println("Roll no: " + i + " - Marks: "+ arr[i]);
            }
        }
    }
}
