/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kyrillos
 * Subclass representing permanent employees.
 */
public class Permanent extends Employee {

    public Permanent() {}

    public Permanent(int id, String name, double salary) {
        super(id, name, salary, 0); // Bonus will be set after calculation.
        setBonus(payBonus());
    }

    @Override
    public double payBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + " [Permanent Employee]";
    }
}

