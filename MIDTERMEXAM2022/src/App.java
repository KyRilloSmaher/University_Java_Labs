import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Employee Management System");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        char continueChoice;
        
        do {
            System.out.println("Enter employee type (C for Contract, P for Permanent): ");
            char type = scanner.next().charAt(0);
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter Name: ");
            String name = scanner.next();
            System.out.println("Enter Salary: ");
            double salary = scanner.nextDouble();

            if (type == 'C' || type == 'c') {
                System.out.println("Enter Years of Service: ");
                int yearsOfService = scanner.nextInt();
                Contract contractEmployee = new Contract(id, name, salary, yearsOfService);
                contractEmployee.payBonus();
                employees.add(contractEmployee);
            } else if (type == 'P' || type == 'p') {
                Permanent permanentEmployee = new Permanent(id, name, salary);
                permanentEmployee.payBonus();
                employees.add(permanentEmployee);
            } else {
                System.out.println("Invalid employee type!");
            }

            System.out.println("Do you want to add another employee? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'Y' || continueChoice == 'y');
        
        double totalPermanentSalary = 0.0;
        double maxContractBonus = Double.MIN_VALUE;
        double minContractBonus = Double.MAX_VALUE;

        for (Employee emp : employees) {
            System.out.println(emp);
            if (emp instanceof Permanent) {
                totalPermanentSalary += emp.getSalary() + emp.getBonus();
            } else if (emp instanceof Contract) {
                if (emp.getBonus() > maxContractBonus) {
                    maxContractBonus = emp.getBonus();
                }
                if (emp.getBonus() < minContractBonus) {
                    minContractBonus = emp.getBonus();
                }
            }
        }

        System.out.println("Total final salary for all permanent employees: " + totalPermanentSalary);
        System.out.println("Maximum bonus for contract employees: " + maxContractBonus);
        System.out.println("Minimum bonus for contract employees: " + minContractBonus);
    }
}
