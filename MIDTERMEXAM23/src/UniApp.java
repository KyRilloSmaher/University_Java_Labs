import java.util.ArrayList;
import java.util.Scanner;

public class UniApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserProfile[] users = new UserProfile[10];

        // Create 6 students and 4 staff
        users[0] = new Student(001, "Alice", "alice@example.com");
        users[1] = new Student(002, "Bob", "bob@example.com");
        users[2] = new Student(003, "Charlie", "charlie@example.com");
        users[3] = new Student(004, "David", "david@example.com");
        users[4] = new Student(005, "Eva", "eva@example.com");
        users[5] = new Student(006, "Frank", "frank@example.com");
        users[6] = new Staff(1001, "Dr. Smith", "smith@example.com");
        users[7] = new Staff(1002, "Dr. Johnson", "johnson@example.com");
        users[8] = new Staff(1003, "Mr. Lee", "lee@example.com");
        users[9] = new Staff(1004, "Ms. Brown", "brown@example.com");

       
        for (int i = 0; i < users.length; i++) {
            UserProfile user = users[i];
            String c ;
            if (user instanceof Student) {
                Student student = (Student) user;
                do {
                    System.out.println("Enter course for " + student.name + " (or 'N' to stop): ");
                    String course = scanner.nextLine();
                    if (course.equalsIgnoreCase("N"))
                        break;
                    System.out.println("Enter grade for " + course + ": ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline
                    student.addCourse(new Course(course));
                    student.addCourseGrade(course, grade);
                    System.out.println("Do you want to add another course for " + student.name + "? (Y/N)");
                    c = scanner.nextLine();
                } while (student.getCoursesCount() < 20 && c.equalsIgnoreCase("Y"));
            } else if (user instanceof Staff) {
                Staff staff = (Staff) user;
                do {
                    System.out.println("Enter course for " + staff.getName() + " (or 'N' to stop): ");
                    String course = scanner.nextLine();
                    if (course.equalsIgnoreCase("N"))
                        break;
                    staff.addCourse(course);
                    System.out.println("Do you want to add another course for " + staff.name + "? (Y/N)");
                    c = scanner.nextLine();
                } while (staff.getCoursesCount() < 5 && c.equalsIgnoreCase("Y"));
            }
            
        }

        int comp301Count = 0;
        for (UserProfile user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.courses.contains("COMP301")) {
                    comp301Count++;
                }
            }
        }
        System.out.println("Number of students registered in COMP301: " + comp301Count);

        // Find the student with the highest average grade
        double highestAvg = 0;
        Student topStudent = null;
        for (UserProfile user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                double avgGrade = student.calculateAverageGrade();
                if (avgGrade > highestAvg) {
                    highestAvg = avgGrade;
                    topStudent = student;
                }
            }
        }
        System.out.println("Student with the highest average grade:");
        if (topStudent != null) topStudent.display();

        // Display staff with more than 4 courses
        System.out.println("Staff with more than 4 courses:");
        for (UserProfile user : users) {
            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                if (staff.getCoursesCount() > 4) {
                    staff.display();
                }
            }
        }
    }
}
