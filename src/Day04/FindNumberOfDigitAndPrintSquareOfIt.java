package Day04;

// Write a method to count the number of digits in a number and then print the square of this number.

class NumberOfDigitAndSquareOfIt{
    void numberOfDigitAndSquareOfIt(int n){
        int num = n;
        int count = 0;
        do{
            n /= 10;
            count++;
        }while (n!=0);

        System.out.println("Number of digit in "+ num + ": " + count);
        System.out.println("Square of number of digit: "+ count*count);
    }

}
public class FindNumberOfDigitAndPrintSquareOfIt {
    public static void main(String[] args) {
        NumberOfDigitAndSquareOfIt calc = new NumberOfDigitAndSquareOfIt();

        calc.numberOfDigitAndSquareOfIt(1000);
    }
}
