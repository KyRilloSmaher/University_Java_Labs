
import QuestionThree.Circle;
import QuestionThree.GeometricObject;
import QuestionThree.Rectangle;
import QuestionThree.Square;
import QuestionTwo.Movable;
import QuestionTwo.MovablePoint;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("----------------------------------------------------");
        System.out.println("---------------------- Question ONE & Three --------------------");
        GeometricObject [] arr = new GeometricObject [3];
        
        arr[0] = new Circle("RED" , true , 5);
        arr[1] = new Rectangle("Black" , true , 5 , 4);
        arr[2] = new Square("Yellow" , false , 6);
        
        for(int i = 0; i < 3 ; i++)
        {
            if(arr[i].getArea() > 20)
            {
                System.out.println("The information of geometric objects: " + arr[i]);
                System.out.println("\n================================================\n");
            }
        }
        System.out.println("----------------------------------------------------");


        System.out.println("----------------------------------------------------");
        System.out.println("---------------------- Question TWo --------------------");
            Movable test = new MovablePoint(2.5f, 2.5f, 3.0f, 2.0f);
            System.out.println("The Display: " + test);
            test.moveRight();
            test.moveUp();
            System.out.println("The Display After move : " + test);
        System.out.println("----------------------------------------------------");

    }
}
