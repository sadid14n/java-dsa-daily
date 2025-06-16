package Day08;

// Q19. Check if an array is a subset of another. (Use a simple approach ).

public class CheckIfAAraayIsSubsetOfAnother {
    public static void main(String[] args) {
        int[] a = {1,2,5,7,8};
        int[] b = {2};

        boolean isSubset = isSubset(a,b);
        System.out.println(isSubset);

    }

    public static boolean isSubset(int[] a, int[] b){
        boolean subset = false;
        for (int j:b){
            for (int i:a){
                if (j == i ){
                    subset = true;
                    break;
                }else{
                    subset = false;
                }
            }
        }
        return subset;
    }
}
