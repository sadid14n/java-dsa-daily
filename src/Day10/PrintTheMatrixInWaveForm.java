package Day10;

public class PrintTheMatrixInWaveForm {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;

//        1 2 3
//        4 5 6
//        7 8 9
        for (int[] a:arr){
            for (int ele: a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        for (int i=0; i<m; i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();

        for (int i=0; i<m; i++){
            if (i%2==1){
                for (int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();

        for (int j = 0; j < n; j++) {
            if (j%2==0){
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for (int i = m-1; i >=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int j = 0; j < n; j++) {
            if (j%2==1){
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for (int i = m-1; i >=0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }



//        for (int i=0;i<m;i++){
//            if ((i+1)%2 == 0){
//                int j = n-1;
//                while (j>=0){
//                    System.out.print(arr[i][j] + " ");
//                    j--;
//                }
//                System.out.println();
//            }else {
//                int j = 0;
//                while (j<n){
//                    System.out.print(arr[i][j] + " ");
//                    j++;
//                }
//                System.out.println();
//            }
//
//        }

    }
}
