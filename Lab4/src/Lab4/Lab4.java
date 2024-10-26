/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4;
import Models.*;

import java.util.*;
/**
 *
 * @author kyrillos
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             
       
       
     //-------------------------------First Question tests -----------------------------------------
                   
         // Insert
    //        Scanner in = new Scanner (System.in); 
    //        Student [] s = new Student[3] ;
           
    //           for (int i = 0; i < s.length; i++) {s[i] = new Student();}
              
        
    //             for (int i = 0; i < s.length; i++) 
    //             {
    //                     System.out.println("Enter Student " + (i + 1));
    //                     s[i].setRollingNumber(s.length);
    //                     System.out.print("name: ");
    //                     s[i].setName(in.next());
    //                     System.out.print("Enter Day of Birth: ");
    //                     int d = in.nextInt();
    //                     System.out.print("Enter month of Birth: ");
    //                     int m = in.nextInt();
    //                     System.out.print("Enter Year of Birth: ");
    //                     int y = in.nextInt();
    //                     s[i].setBirthDate(d,m,y);
    //                     System.out.print("Enter Max degree Of Cource: ");
    //                     s[i].setMaxDegree(in.nextInt());
    //                     int []degrees = new int[3];
    //                     System.out.print("Enter The degree Of Cource 1 between 0 and Max Degree: ");
    //                     degrees[0] = in.nextInt();
    //                     System.out.print("Enter The degree Of Cource 2 between 0 and Max Degree: ");
    //                     degrees[1] = in.nextInt();
    //                     System.out.print("Enter The degree Of Cource 3 between 0 and Max Degree: ");
    //                     degrees[2] = in.nextInt();
    //                     s[i].set_Degress(degrees);
    //                     System.out.print("Enter The Cgpa Of Semester 1: ");
    //                     double sem1 = in.nextDouble();
    //                     s[i].set_CGPA(1, sem1);
    //                     System.out.print("Enter The Cgpa Of Semester 2: ");
    //                     double sem2 = in.nextDouble();
    //                     s[i].set_CGPA(2, sem2);
    //                     System.out.print("Enter The Cgpa Of Semester 3: ");
    //                     double sem3 = in.nextDouble();
    //                     s[i].set_CGPA(3, sem3);
    //                     System.out.print("Enter The Cgpa Of Semester 4: ");
    //                     double sem4 = in.nextDouble();
    //                     s[i].set_CGPA(4, sem4);
    //                     System.out.print("Enter The Cgpa Of Semester 5: ");
    //                     double sem5 = in.nextDouble();
    //                     s[i].set_CGPA(5, sem5);
    //            }       
                
                
    //      //  Highest_Total_Degree
    //     Student result = s[0];
    //     for(int i = 1; i < s.length; i++ )
    //     {
    //         if(s[i].total_Degrees()> result.total_Degrees())
    //             result = s[i];
    //     }
    //     System.out.println("Highest_Total_Degree is : " +result);
    
    //    // Bad CGPA 
    //      System.out.println("------------------------ Students With Bad CGPA Are ------------------------------- ");
    
    //     for (int i = 0; i < s.length; i++)
    //     {
    //         if(s[i].Bad_CGPA())
    //             s[i].display();
    //     }
    //   System.out.println("------------------------ ------------------------------------------------- ");
      
      
     //---------------------------------------------------------------------------------------------
     
     
        
        //-------------------------------Second Question tests -----------------------------------------
        
                  ArrayList<Car> MyCars = new ArrayList<Car>();
                  
                        MyCars.add(new Car("Aston Martin", "Vantage", 150000.0f, 2022));
                        MyCars.add(new Car("Aston Martin", "DB11", 200000.0f, 2023));
                        MyCars.add(new Car("Aston Martin", "DBX", 180000.0f, 2021));
                        MyCars.add(new Car("Mercedes", "S-Class", 120000.0f, 2023));
                        MyCars.add(new Car("Mercedes", "G-Class", 130000.0f, 2022));
                        MyCars.add(new Car("Mercedes", "C-Class", 50000.0f, 2021));
                        MyCars.add(new Car("Audi", "A6", 60000.0f, 2022));
                        MyCars.add(new Car("Audi", "Q7", 75000.0f, 2021));
                        MyCars.add(new Car("Audi", "A8", 90000.0f, 2023));
                        MyCars.add(new Car("BMW", "X5", 60000.0f, 2022));
                        MyCars.add(new Car("BMW", "X5", 70000.0f, 2018));
                        MyCars.add(new Car("BMW", "M3", 80000.0f, 2023));
                        MyCars.add(new Car("Toyota", "Camry", 30000.0f, 2010));
                        MyCars.add(new Car("Toyota", "Corolla", 25000.0f, 2022));
                        MyCars.add(new Car("Toyota", "Highlander", 40000.0f, 2012));
                        MyCars.add(new Car("Tesla", "Model S", 80000.0f, 2022));
                        MyCars.add(new Car("Tesla", "Model 3", 50000.0f, 2023));
                        MyCars.add(new Car("Tesla", "Model X", 90000.0f, 2021));
                        MyCars.add(new Car("Tesla", "Model Y", 70000.0f, 2023));
                        MyCars.add(new Car("Tesla", "Cybertruck", 100000.0f, 2024));
                        
                        for(int i= 0 ; i< MyCars.size();i++){
                            Car temp = MyCars.get(i);
                            if(temp.getCarName()=="Toyota" && temp.getCarYearOFProduction()<=2012)MyCars.remove(i);
                            else if(temp.getCarModel()== "X5") MyCars.get(i).setCarModel("x6");
                        }
        
                for (Car car : MyCars) {
                    System.out.println(car);
                }
       //----------------------------------------------------------------------------------------------
       
   
     //-------------------------------Third Question tests -----------------------------------------
     
              StringMethods stringFunctions = new StringMethods();
                    String x = ("xyzmyx");
                    System.out.println(stringFunctions.isPalindrome(x));

                    String x2 = "    hello";
                    String x3 = stringFunctions.Removeleadingwhitespaces(x2);
                    System.out.println(x3);

                    System.out.println("Ocuurance of char l in hello is : "+stringFunctions.countTheOccurrences(x3,'l'));

                    String x4 = "xxxxyy";
                    System.out.println("After Remove Dublicated : "+ stringFunctions.RemoveDublicated(x4));

                    String x5 ="  she he she is gom is are is she a a a ";
                    String[] all = stringFunctions.getDublicatedwords(x5);
                        for(String b: all)
                        { System.out.println(b);

                        }

                   String x6 ="vcvcffgghjjkkkkk";
                   stringFunctions.getMinandMaxOcurr(x6);
      
      
      
      
      
      //---------------------------------------------------------------------------------------------
      
      
      
          
       
       
     //-------------------------------Fourth Question tests -----------------------------------------
                   
     System.out.println("---------------------------------------------------------");
     
        String []s1 = {"Apple","java" , "Pizza" , "javaScript" , "c#", "Kyrillos"};
        String longest =StringArrayMethods.longestStringInArray(s1);
        System.out.println("Longest String is :"+ longest);
        
        String []s2 = {"karas","java" , "karas" , "c++" , "karas", "c++" , "karas#" , "java" , "karas"};
        System.out.println("The most frequent String is : " +StringArrayMethods.findMostFrequentString(s2));
        
        
        
        String []s3 = {"Even","java" , "Noteven" , "even" , "notEven", "c" , "Longeven" , "karas" , "notexi"};
         s3 = StringArrayMethods.reverseEvenStrings(s3);
         System.out.println("Array After reverse Even Words");
         for(String xi : s3) System.out.println(xi);
        
        String []s4 = {"A.c++", "B.css", "C.java", "D.html", "E.java"};
        System.out.println("The count of file extension .java : " + StringArrayMethods.countFilesWithExtension(s4, ".java"));
        
        System.out.println("---------------------------------------------------------");
        
           
     
     //---------------------------------------------------------------------------------------------
     
     
      
     
    }
    
}
