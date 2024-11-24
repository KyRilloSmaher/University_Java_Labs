/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kyrillos
 * Subclass representing contract-based employees.
 */
public class Contract extends Employee {
    private int yearOfService;

    public Contract() {}

    public Contract(int id, String name, double salary, int yearOfService) {
        super(id, name, salary, 0); // Bonus will be set after calculation.
        this.yearOfService = yearOfService;
        setBonus(payBonus());
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    @Override
    public double payBonus() {
        double bonus = getSalary() * 0.15;
        int increment = 100;
        for (int i = 1; i <= yearOfService; i++) {
            bonus += increment;
            increment += 30;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Years of Service: " + yearOfService;
    }
}

