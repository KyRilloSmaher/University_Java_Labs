import Models.*;
import java.util.Arrays;
public class App {
    /** 
     *
     * @author kyrillos
     */
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
           System.out.println("------------------------------------------------------------------------------");
           System.out.println("-------------------------Question One-------------------------------\n");
           System.out.println("------------------------------------------------------------------------------");
           int []tst1 = {1,2,3,4,6};
            tst1 =ArrayMethods.insertAt(tst1,5,4);
            System.out.println(Arrays.toString(tst1));
            
            System.out.println("=====================================");
            
            int []tst2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            tst2 = ArrayMethods.getPrimes(tst2);
            System.out.println(Arrays.toString(tst2));
            
            System.out.println("=====================================");
            
            int []tst3 = {3,6,9};
            int[][][]display = ArrayMethods.getFactors(tst3);
            for (int i = 0; i < display.length; i++)
            { 
                 System.out.println("["+tst3[i] + "]");
                for (int j = 0; j < display[i].length; j++)
                {
                    for (int k = 0; k < display[i][j].length; k++) 
                    {
                        System.out.print("  "+display[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
           
           System.out.println("------------------------------------------------------------------------------");
           
           
           
           
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("--------------------- Question TWO ---------------------------------");
            System.out.println("-----------------------------------------------------------------------------");
            
              Author author1 = new Author("John Doe", "john.doe@example.com");
              Author author2 = new Author("Jack king", "Jack.doe@example.com");
              Author author3 = new Author("Leo Doe", "Leo.doe@example.com");
              Author author4 = new Author("smith maccaurty ", "smith.doe@example.com");
              Author auth1[] = {author1,author2};
              Author auth2[] = {author3,author4};
            Book book1 = new Book("123456789", "Java Programming", auth1, "Tech Books Publishing", 49.99);
            Book book2 = new Book("123456789", "Advanced Java", auth2,"Tech Books Publishing", 59.99);
    
            System.out.println(book1);
            System.out.println(book2);
    
            System.out.println("Are the books the same? " + book1.equals(book2));
            System.out.println("-----------------------------------------------------------------------------");
            
            
            
            
             System.out.println("-----------------------------------------------------------------------------");
             System.out.println("--------------------- Question Three---------------------------------");
             System.out.println("-----------------------------------------------------------------------------");
            
             Rectangle Recs [] = new Rectangle[4];
             for (int i = 0; i < Recs.length; i++) {
                Recs[i] = new Rectangle();
            }
             Recs[0].setLength(90.5f);Recs[0].setWidth(4.5f);
             Recs[1].setLength(70.5f);Recs[1].setWidth(5f);
             Recs[2].setLength(19.0f);Recs[2].setWidth(39f);
             Recs[3].setLength(19.0f);Recs[3].setWidth(47f);
             
             for(Rectangle r : Recs){
               if(r.getArea()>1500) System.out.println(r);
            }
             // Exchange Rectangles with Same length but difference Width
              System.out.println("---------------------------------------");
              System.out.println("Rectangles Before Exchange ");
              for(Rectangle r : Recs){
                  System.out.println(r);
                }
              System.out.println("---------------------------------------");
             for (int i = 0; i < Recs.length; i++) {
                for (int j = i+1; j < Recs.length; j++){
                    if(Recs[i].getLength() == Recs[j].getLength() && Recs[i].getWidth()!= Recs[j].getWidth()){
                        Rectangle temp = Recs[i];
                        Recs[i]=Recs[j];
                        Recs[j]=temp;
                    }
                } 
            }
            System.out.println("---------------------------------------");
            System.out.println("Rectangles After Exchange ");
            for(Rectangle r : Recs){
                System.out.println(r);
              }
            System.out.println("---------------------------------------");
             System.out.println("------------------------------------------------------------------------------");

            
            
            
              
             System.out.println("-----------------------------------------------------------------------------");
             System.out.println("--------------------- Question Four---------------------------------");
             System.out.println("-----------------------------------------------------------------------------");
            
             Empolyee Emps [] = new Empolyee[4];
             for (int i = 0; i < Emps.length; i++) {
                Emps[i] = new Empolyee();
            }
            
            Emps[0].setDepartment("HR");Emps[0].setName("Jack");Emps[0].setHours(8);Emps[0].setSalary(3000);
            Emps[1].setDepartment("Accounting");Emps[1].setName("David");Emps[1].setHours(8);Emps[1].setSalary(1000);
            Emps[2].setDepartment("Markting");Emps[2].setName("Emily");Emps[2].setHours(12);Emps[2].setSalary(1900);
            Emps[3].setDepartment("Sales");Emps[3].setName("Yue");Emps[3].setHours(8);Emps[3].setSalary(300);
            
             System.err.println("*************Empolyees with Salary Less than 1000*************");
             for(Empolyee emp : Emps){
               if (emp.getSalary()<1000) {
                System.err.println(emp);
               }
               emp.addSalary();
            }

            System.err.println("*************Empolyees with Hours More than 8 *************");
            for(Empolyee emp : Emps){
              if (emp.getHours()>8) {
               System.err.println(emp);
               emp.addWork();
              }
           } 

             System.out.println("------------------------------------------------------------------------------");
            
             
            
            
        }
        
    }
    

