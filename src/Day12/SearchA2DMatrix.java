package Day12;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int m = arr.length, n = arr[0].length;
        int target = 50;
        boolean find = false;
        int i = 0, j = n-1;
        while (i<m && j>=0){
            if (arr[i][j] == target) {
                find = true;
                break;
            }
            else if(arr[i][j] > target) {
//                Go left
                j--;
            }else{
//                Go down
                i++;
            }
        }
        if (find){
            System.out.println("Present");
        }else {
            System.out.println("Not present");
        }

    }
}
