/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Car extends Models.Vehicle {
      int Passengers;
    static int number_Of_Vehicles = 0;

    public Car(String name, String color, double price, int number_Of_Cylinders, int Passengers)
    {
        super(name, color, price, number_Of_Cylinders);
        this.Passengers = Passengers;
        number_Of_Vehicles++;
    }

    public void setPassengers(int Passengers)
    {
        this.Passengers = Passengers;
    }

    public int getPassengers() 
    {
        return Passengers;
    }

    public static int getNumber_Of_Vehicles() 
    {
        return number_Of_Vehicles;
    }
    
    @Override
    public void display()
    {
        System.out.println("name : "+this.getName());
        System.out.println("color : "+this.getColor());
        System.out.println("price : "+this.getPrice());
        System.out.println("cylinders : "+this.getNumberOfCylinders());
        System.out.println("Passengers : "+this.getPassengers());
        System.out.println("number of Vehicles : " + Car.number_Of_Vehicles);
    }
    
    @Override
    public double getPrice() 
    {
        if(this.getNumberOfCylinders() <= 4)
            return this.price * 1.15;
        else
            return this.price * 1.3;
    }
}
