package Day12;

// Set matrix zero - Leetcode problem

public class SetMatrixZeroLeetcode {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

//        input     output
//        1 1 1     1 0 1
//        1 0 1     0 0 0
//        1 1 1     1 0 1


        int m = arr.length, n = arr[0].length;

        // Method 3 - Best
        boolean zeroRow = false;
        boolean zeroCol = false;
        // Chect the 0th row
        for(int j=0; j<n; j++){
            if(arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }
        // Check 0th col
        for(int i=0; i<m; i++){
            if(arr[i][0] == 0){
                zeroCol = true;
                break;
            }
        }
        // Traverse the submatrix without 0th row and 0th col
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // Traverse in the 0th row
        for(int j=1; j<n; j++){
            if(arr[0][j] == 0){
                for(int i=1; i<m; i++){
                    arr[i][j] = 0;
                }
            }
        }
        // Traverse in the 0th col
        for(int i=0; i<m; i++){
            if(arr[i][0] == 0){
                for(int j=0; j<n; j++){
                    arr[i][j] = 0;
                }
            }
        }
        if(zeroRow == true){
            for(int j=0; j<n; j++){
                arr[0][j] = 0;
            }
        }
        if(zeroCol == true){
            for(int i=0; i<m; i++){
                arr[i][0] = 0;
            }
        }


        // // method 2 - Good
        // boolean[] row = new boolean[m];
        // boolean[] col = new boolean[n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(arr[i][j] == 0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }
        // // set the 'true' rows to 0
        // for(int i=0; i<m; i++){
        //     if(row[i] == true){
        //         for(int j=0; j<n; j++){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }
        // // set the 'true' cols to 0
        // for(int j=0; j<n; j++){
        //     if(col[j] == true){
        //         for(int i=0; i<m; i++){
        //             arr[i][j] = 0;
        //         }
        //     }
        // }


        // Method 1 - worst
        // int[][] helper = new int[m][n];
        // // Copy of the array
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         helper[i][j] = arr[i][j];
        //     }
        // }
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(helper[i][j] == 0){
        //             // set ith row and jth colom to 0
        //             for(int b=0; b<n; b++){ // ith row
        //                 arr[i][b] = 0;
        //             }
        //             for(int a=0; a<m; a++){ // jth col
        //                 arr[a][j] = 0;
        //             }
        //         }
        //     }
        // }
    }
}
