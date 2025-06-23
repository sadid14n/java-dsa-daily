package Day15;

public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);

        sb.append("xyz");
        System.out.println(sb);

        sb.append(23);
        System.out.println(sb);

        char[] ch = {'f','g','h'};
        sb.append(ch);
        System.out.println(sb);

        StringBuilder tb = new StringBuilder("HJL");
        sb.append(tb);
        System.out.println(sb);
    }
}
