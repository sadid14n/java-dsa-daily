package Day09;

public class TransformIntoTranspose {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{7,6,5},{3,6,9}};
//        2 3 4
//        7 6 5
//        3 6 9

        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
