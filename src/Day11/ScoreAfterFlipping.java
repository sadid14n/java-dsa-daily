package Day11;
// Leetcode  - 861
public class ScoreAfterFlipping {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};

        int m = arr.length, n = arr[0].length;

        //       Flips rows
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    }else arr[i][j] = 0;
                }
            }
        }
        // Flips colomns where no of 0 > no of 1
        for (int j = 1; j < n; j++) {
            int no0 = 0, no1 = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0)
                    no0++;
                else
                    no1++;
            }
            if (no0 > no1) {
                // Flip that col
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

//        Calculate maximum
        int score = 0;
        int x = 1;
        for(int j=n-1; j>=0; j--){
            for(int i=0; i<m; i++){
                score += arr[i][j]*x;
            }
            x *= 2;
        }

        System.out.println(score);
    }
}
