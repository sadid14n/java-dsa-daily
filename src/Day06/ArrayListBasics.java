package Day06;
// Array List

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);

        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);

        System.out.println(arr);
        System.out.println(arr.get(2));

        arr.set(2, 3000);
        System.out.println(arr);

        arr.removeFirst();

        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        System.out.println("Size: " + arr.size());
    }
}
