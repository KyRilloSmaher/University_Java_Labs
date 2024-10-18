package Models;
import java.util.Scanner;
public class QuestionSeven {
     static void RigthTriangle(int level){
        char c = 65 ;
        for(int i =0 ;i< level ;i++){
            for (int j = 0 ; j< i+1 ;j++){
               System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
    static void Pyramid(int n){
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

           
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }

           
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num-- + " ");
            }

            
            System.out.println();
        }
    }

    public static void Display(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Level:");
        int x2 = scan.nextInt();
        RigthTriangle(x2);
        System.out.println("-------------------------------");
        Pyramid(x2);
    }
}
