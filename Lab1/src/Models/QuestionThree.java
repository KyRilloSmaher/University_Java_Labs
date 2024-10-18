package Models;
import java.util.Scanner;
public class QuestionThree {
    static int GetExpo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int x = scan.nextInt();
        System.out.print("Enter Second Number :");
        int y = scan.nextInt();
        if (y==0) {
            return 1;
        }
        int t= x;
        for(int i =1 ; i<y ;i++){
            t*=x;
        }
        return y<0? 1/t: t;
     }

     public static void Display(){
        System.out.println("The Result is :"+GetExpo());
     }
}
