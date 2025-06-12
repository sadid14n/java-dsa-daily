package Day04;

// Write a method that takes the radius of a circle as an argument and returns its area.

class CalculateArea {
    double area = 0;
    double calculateArea(double r){
        area += 3.14 * r * r;
        return area;
    }
}

public class AreaOfACircleUsingMethod {
    public static void main(String[] args) {
        CalculateArea calc = new CalculateArea();
        double res = calc.calculateArea(2);

        System.out.println("Area: " + res);
    }
}
