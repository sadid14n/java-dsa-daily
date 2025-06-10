package Day02;

import java.util.Scanner;

public class findPositionOfPoint {
    public static void main(String[] args) {
//        Find position of a point in x-y plane

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println("Origin");
        else if (x==0 && y!=0) System.out.println("Y-axis");
        else if(x!=0 && y==0) System.out.println("X-axis");
        else if (x>0 && y>0) System.out.println("1st-Quadrant");
        else if(x<0 && y>0) System.out.println("2nd-Quadrant");
        else if(x<0 && y<0) System.out.println("3rd-Quadrant");
        else if (x>0 && y<0) System.out.println("4th-Quadrant");
    }
}
