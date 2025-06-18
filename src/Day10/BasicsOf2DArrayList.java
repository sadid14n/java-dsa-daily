package Day10;

import java.util.ArrayList;
import java.util.List;

public class BasicsOf2DArrayList {
    public static void main(String[] args) {
//        1D List
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);

//        2D List
//        Adding 1D List to 2D List
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(a); ls.add(b); ls.add(c); ls.add(d);

//        Printing a 2D List
        for (int i=0; i<ls.size(); i++){
//            Giving array list
//            System.out.println(ls.get(i) + " ");

//            giving elements of array list
            int size = ls.get(i).size();
            for (int j = 0; j < size; j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }

//        Printing a specific element
        System.out.println(ls.get(1).get(1));

    }
}
