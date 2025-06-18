package Day10;

public class PrintMatrixInSpiralForm {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        1   2   3  4
//        5   6   7  8
//        9   10  11  12
//        13  14  15  16
        int m = arr.length;
        int n = arr[0].length;
//        1 2 3
//        4 5 6
//        7 8 9

        int min_r = 0;
        int max_r = m-1;
        int min_c = 0;
        int max_c = n-1;

        while (min_r <= max_r && min_c<=max_c){

//            Left to right
            for (int j = min_c; j <=max_c ; j++) {
                System.out.print(arr[min_r][j] + " ");
            }
            min_r++;

//            Top to bottom
            if(min_r>max_r || min_c > max_c) break;
            for (int i = min_r; i <= max_r; i++) {
                System.out.print(arr[i][max_c] + " ");
            }
            max_c--;

//           Right to Left
            if(min_r>max_r || min_c > max_c) break;

            for (int i = max_c; i >= min_c; i--) {
                System.out.print(arr[max_r][i]+ " ");
            }
            max_r--;

//            Bottom to Top
            if(min_r>max_r || min_c > max_c) break;

            for (int i = max_r; i >=min_r ; i--) {
                System.out.print(arr[i][min_c] + " ");
            }
            min_c++;
        }
    }
}
