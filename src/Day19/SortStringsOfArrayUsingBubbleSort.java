package Day19;

//Q10. Given an array of strings arr[] with all strings in lowercase. Sort given strings using Bubble Sort and
//display the sorted array.

public class SortStringsOfArrayUsingBubbleSort {
    public static void main(String[] args) {
        String[] arr= {"sadid", "alam","cse","mern","react"};
        int n = arr.length;
        System.out.println(n);

        for (String ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }

            if(sorted) break;
        }

        for (String ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();



//        String str1 = "sadid";
//        String str2 = "alam";
//        String str3 = "sadid";
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str2.compareTo(str3));
//        System.out.println(str1.compareTo(str3));
    }
}
