import Models.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------Question One------------------------------");
           Point2D [] points = new Point2D[5];
           points[0] = new Point2D();
           points[0].setX(0);
           points[0].setY(0);
           points[1] = new Point2D(1,1);
           double [] xy ={0,0};
           points[2]=new Point2D();
           points[2].setXY(xy);
           System.out.println("Distance between first and second points :"+points[0].distance(points[1]));
           System.out.println("Distance between first and second points :"+points[0].distance(points[2]));
           System.out.println("Distance between second and third points :"+points[1].distance(points[2]));
           points[3]=new Point3D(0,1,2);
           points[4]=new Point3D(2,10,2);
           System.out.println("Distance between fifth and fourth points :"+points[3].distance(points[4]));


           System.out.println("If the first and second points equals ?"+points[0].equals(points[1]));
           System.out.println("If the first and second points ?"+points[0].equals(points[2]));
           System.out.println("If the second and third points ?"+points[1].equals(points[2]));
           System.out.println("If the fifth and fourth points ?"+points[3].equals(points[4]));
        System.out.println("----------------------------------------------------------------");



        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------Question Two------------------------------");
         System.out.println("----------------------------------------------------------------");
      
            Figure [] figuers = {
                new ClosedFigure(10, 20, false),
                new ClosedFigure(20, 20, true),
                new Rectangle(new Point2D(10,20), new Point2D(30,40), "red", false),
                new Rectangle(new Point2D(15,20), new Point2D(20,40), "Black", true),
            };

         System.out.println("----------------------------------------------------------------");
         System.out.println("----------------------Question Three------------------------------");
         Vehicle [] viechles = {
            new Car("Tesla", "Black", 40000, 8, 5),
            new Car("Aston martin", "white", 240000, 8, 2),
            new Car("Audi", "Blue", 60000, 8, 5),
            new Truck("Merceeds", "Red", 120000, 12, 6000),
            new Truck("chfrolaut", "White", 120000, 12, 4000),
         };
         double carsTotalPrice = 0.0;
         double trucksTotalPrice = 0.0;
         for (Vehicle vehicle : viechles) {
            if(vehicle instanceof Car )
                  carsTotalPrice +=vehicle.getPrice();
            else trucksTotalPrice+=vehicle.getPrice();
         }
         System.out.println("Average Cars Price: " + carsTotalPrice/Car.getNumber_Of_Vehicles());
         System.out.println("Average Truck Price: " + trucksTotalPrice/Truck.getNumber_Of_Vehicles());
         System.out.println("----------------------------------------------------------------");
    }
}
