package Models;
import java.util.Scanner;;
public class QuestionFive {
    static int Fab (int n){
        if (n <= 1) return n; 
        else return Fab(n-1)+Fab(n-2);
    }

    public static void Dispaly(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number :");
        int x2 = scan.nextInt();
        System.out.println("The Fabnoucci Result : "+Fab(x2));
    }
}
