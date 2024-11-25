/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kyrillos
 */
public class Staff extends UserProfile {
    public Staff( int ID, String name, String email) {
        super(ID, name, email);
    }
         public void display() {
        System.out.println("===================== STAFF INFORMATION ==========================");
        System.out.println("STAFF ID : "+ super.getID());
        System.out.println("STAFF Name : "+ super.getName());
        System.out.println("STAFF Email : "+ super.getEmail());
        System.out.println("STAFF Courses Count : "+ super.getCoursesCount());
        System.out.println("Courses ::");
        for(Course crs : super.getCourses()){
             System.out.println("Course Code : " + crs.getCourseCode());
          }
        
        System.out.println("===================================================================");
    
    }
    
    public void setCoursesCount(int coursesCount) {
        if(coursesCount<=5)
            super.setCoursesCount(coursesCount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        else{
             super.setCoursesCount(5); 
             System.err.print("THE MAX COUNT IS 5 \n");
        }
    }
    public void addCourse(String course) {
        if (super.getCoursesCount() < 5) {
            super.courses.add(new Course(course));
            super.coursesCount++;
        } else {
            System.out.println("Course limit reached for this staff.");
        }
    }
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
