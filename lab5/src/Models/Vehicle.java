/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Vehicle
{
    String name , color;
    double price;
    int numberOfCylinders;
    static int number_Of_Vehicles = 0;

    public Vehicle(String name, String color, double price, int _numberOfCylinders)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.numberOfCylinders = _numberOfCylinders;
        Vehicle.number_Of_Vehicles++;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setNumberOfCylinders(int numberOfCylinders)
    {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getName() 
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getNumberOfCylinders() 
    {
        return numberOfCylinders;
    }

    public static int getNumber_Of_Vehicles()
    {
        return number_Of_Vehicles;
    }
    
    public void display()
    {
        System.out.println("name : "+this.name);
        System.out.println("color : "+this.color);
        System.out.println("price : "+this.price);
        System.out.println("cylinders : "+this.numberOfCylinders);
        System.out.println("number of Vehicles : " + Vehicle.number_Of_Vehicles);
    }
}
