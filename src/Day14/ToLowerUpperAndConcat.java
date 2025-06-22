package Day14;

public class ToLowerUpperAndConcat {
    public static void main(String[] args) {
        String str = "SadId AlAm iS a MeRN STack DEvelOper";

//        toLowerCase()
        str.toLowerCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        str = str.toLowerCase();
        System.out.println(str);

//        toUpperCase()
        System.out.println(str.toUpperCase());

//        concat()
        String a = "abc";
        String b = "xyz";

        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);
        System.out.println(b);

    }
}
