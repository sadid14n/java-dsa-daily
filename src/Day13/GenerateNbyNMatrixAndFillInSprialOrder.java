package Day13;

public class GenerateNbyNMatrixAndFillInSprialOrder {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];

        int min_row = 0, max_row = n-1;
        int min_col = 0, max_col = n-1;

        int num = 1;

        while (min_row <= max_row && min_col <= max_col){

            for (int j= min_col; j<=max_col; j++){
                arr[min_row][j] = num++;
            }

            min_row++;
            if (min_row > max_row || min_col > max_col) break;

            for (int i = min_row; i <= max_row; i++) {
                arr[i][max_col] = num++;
            }

            max_col--;
            if (min_row > max_row || min_col > max_col) break;

            for(int j = max_col; j>=min_col; j--){
                arr[max_row][j] = num++;
            }

            max_row--;
            if (min_row > max_row || min_col > max_col) break;

            for (int i = max_row; i >= min_row; i--) {
                arr[i][min_col] = num++;
            }
            min_col++;

        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
    }
}
