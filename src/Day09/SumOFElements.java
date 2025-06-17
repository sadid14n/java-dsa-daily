package Day09;

public class SumOFElements {
    public static void main(String[] args) {
        int[][] arr = {{3,6,1},{8,9,2}};

        int sum = 0;
        for (int[] a: arr){
            for (int ele: a){
                sum += ele;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
