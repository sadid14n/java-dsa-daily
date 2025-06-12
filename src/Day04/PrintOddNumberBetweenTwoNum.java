package Day04;

// Given two numbers a and b, write a method to print all odd numbers between them.

class PrintOddNumber{
    void printOddNumberBetweenTwoNumber(int a, int b){
        for(int i=a; i<=b; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}

public class PrintOddNumberBetweenTwoNum {
    public static void main(String[] args) {
        PrintOddNumber oddNum = new PrintOddNumber();
        oddNum.printOddNumberBetweenTwoNumber(1,9);
    }
}
