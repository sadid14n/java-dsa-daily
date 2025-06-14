package Day06;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {12,56,89,76,54,34,89,99,99,44,66,54,36,23};

        System.out.println(arr[0]);

        changeArray(arr);
        System.out.println(arr[0]);
    }

//    Array are always passed by reference not by value
    public static void changeArray(int[] a){
        a[0] = 100;
    }

}
