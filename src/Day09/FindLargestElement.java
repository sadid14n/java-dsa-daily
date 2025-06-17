package Day09;

public class FindLargestElement {
    public static void main(String[] args) {
        int[][] arr = {{3,6,1},{8,9,2}};

        int largest = Integer.MIN_VALUE;
        for (int[] a: arr){
            for (int ele: a){
                if(ele >= largest){
                    largest = ele;
                }
            }
        }
        System.out.println("Largest: " + largest);
    }
}
