package Day03;

public class divisibleBy3or5 {
    public static void main(String[] args) {
//        Print all numbers between 1 to 100 which is divisible by 3 or 5
        for (int i=1; i<=100; i++){
            if ((i%3 == 0) || (i%5 == 0)){
                System.out.println(i);
            }
        }
    }
}
