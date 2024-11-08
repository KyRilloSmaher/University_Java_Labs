/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kyrillos
 */
public class Truck extends Vehicle
{
    int load_capacity;
    static int number_Of_Vehicles = 0;

    public Truck(String name, String color, double price, int number_Of_Cylinders, int load_capacity)
    {
        super(name, color, price, number_Of_Cylinders);
        this.load_capacity = load_capacity;
        number_Of_Vehicles++;
    }
    
    public void setLoad_capacity(int load_capacity) 
    {
        this.load_capacity = load_capacity;
    }

    public int getLoad_capacity() 
    {
        return load_capacity;
    }

    @Override
    public void display()
    {
        System.out.println("name : "+this.getName());
        System.out.println("color : "+this.getColor());
        System.out.println("price : "+this.getPrice());
        System.out.println("cylinders : "+this.getNumberOfCylinders());
        System.out.println("load_capacity : "+this.getLoad_capacity());
        System.out.println("number of Vehicles : " + Truck.number_Of_Vehicles);
    }
    
    @Override
    public double getPrice() 
    {
        if(this.getNumberOfCylinders() <= 6 && this.getLoad_capacity() < 3500)
            return this.price * 1.1;
        else
            return this.price * 1.2;
    }
}