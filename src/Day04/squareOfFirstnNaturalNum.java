package Day04;

// Write a method to print squares of the first n natural numbers, taking n as an argument to the method.


class SquareOfNum {
    void printSquare(int n){
        System.out.print("Square of first "+ n + " natural number: ");
        for (int i=1; i<=n; i++){
            System.out.print(i*i + " ");
        }
    }
}

public class squareOfFirstnNaturalNum {
    public static void main(String[] args) {
        SquareOfNum sq = new SquareOfNum();

        sq.printSquare(10);
    }
}
