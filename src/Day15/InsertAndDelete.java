package Day15;

public class InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcxyzplm");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

//        Insert
        sb.insert(2, 's');
        System.out.println(sb);

    }
}
