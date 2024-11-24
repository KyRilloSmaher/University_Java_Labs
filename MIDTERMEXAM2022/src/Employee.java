

/**@author kyrillos
 * Abstract base class for employees.
 */
 abstract class Employee {
    private int id;
    private String name;
    private double salary;
    private double bonus;

    public Employee() {}

    public Employee(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public abstract double payBonus();

    @Override
    public String toString() {
        return "[Employee => ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Bonus: " + bonus + "]";
    }
}
