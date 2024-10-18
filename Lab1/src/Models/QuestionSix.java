package Models;
import java.util.Scanner;
public class QuestionSix {
    static void GetprimesinInterval(){
        Scanner scan = new Scanner(System.in);
        int start,end,flag;
        System.out.print("Please Enter of The Start Interval: ");
        start = scan.nextInt();
        System.out.print("Please Enter The End Interval: ");
        end = scan.nextInt();
        System.out.print("The Prime Numbers: ");
        if(start == 1) 
            start++;
         for (int i = start; i < end; i++)
            {
               boolean IsPrime = false;
                for (int j = 2; j <= Math.sqrt(i); j++) 
                {
                    if(i%j==0)
                    {
                        IsPrime= true;
                        break;
                    }
                }
                if(!IsPrime)
                {
                    System.out.print(" " + i);
                }
               IsPrime =false ;
            }
    }
    public static void Display(){
        GetprimesinInterval();
    }
}
