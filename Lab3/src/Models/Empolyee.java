package Models;

/**
 *
 * @author kyrillos
 */

public class Empolyee
{
    private String Name,Department;
    private int Hours;
    private double Salary;

    public Empolyee(String name, String department, int hours, double salary) 
    {
        this.Name = name;
        this.Department = department;
        this.Hours = hours;
        this.Salary = salary;
    }
    public Empolyee()
    {
        this.Name = "NA";
        this.Department = "NA";
        this.Hours = 0;
        this.Salary = 0.0;
    }

    public void setName(String name) 
    {
        this.Name = name;
    }

    public void setDepartment(String department)
    {
        this.Department = department;
    }

    public void setHours(int hours)
    {
        this.Hours = hours;
    }

    public void setSalary(double salary)
    {
        this.Salary = salary;
    }

    public String getName()
    {
        return Name;
    }

    public String getDepartment() 
    {
        return Department;
    }

    public int getHours()
    {
        return Hours;
    }

    public double getSalary()
    {
        return Salary;
    }
    
    public void addSalary()
    {
        if(this.Salary < 1000)
            this.Salary += 500;
    }
    
    public void addWork()
    {
        if(this.Hours > 8)
            this.Salary += 100;
    }

    @Override
    public String toString() 
    {
        return "Employee{" + "name=" + Name + ", department=" + Department + ", hours=" + Hours + ", salary=" + Salary + '}';
    }
}