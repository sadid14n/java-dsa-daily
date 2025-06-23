package Day15;

public class UpdateAllEvenIdiciesToa {
    public static void main(String[] args) {
        String str = "I am Sadid";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                newStr += 'a';
            }else{
                newStr += str.charAt(i);
            }
        }
        System.out.println(str);
        System.out.println(newStr);
    }
}
