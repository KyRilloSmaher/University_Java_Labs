package Models;

import java.util.Scanner;
public class QuestionFour {
    static void solveQuadratic(int a, int b, int c) {
        if (a == 0) { 
            System.out.println("Solution Doesn't Exist. 'a' must not be zero.");
            return;
        }

      
        double discriminant = b * b - 4 * a * c;

        
        if (discriminant < 0) {
            System.out.println("The equation has complex roots.");
            return;
        }

        
        double s1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double s2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        
        System.out.println("First Root = " + s1);
        System.out.println("Second Root = " + s2);
    }

    public static void Display(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Coff of X^2 :");
        int x2 = scan.nextInt();
        System.out.print("Enter Coff of X^1 :");
        int x1 = scan.nextInt();
        System.out.print("Enter Coff of X^0 :");
        int x0 = scan.nextInt();
        solveQuadratic(x2, x1, x0);
    }
}
