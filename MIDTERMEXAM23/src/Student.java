/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author kyrillos
 */
public class Student extends UserProfile{
    protected Map<String ,Integer> grades = new HashMap<String ,Integer>();

    public Student() {
    }
    public Student(Map<String, Integer> grades) {
        this.grades = grades;
    }
    public Student(Map<String, Integer> grades, int ID, String name, String email, int coursesCount, ArrayList<Course> courses) {
        super(ID, name, email, coursesCount, courses);
        this.grades = grades;
    }
    
    public Student( int ID, String name, String email) {
        super(ID, name, email);
    }
    
    public void  setGrades(Map<String ,Integer> g){
        this.grades = g;
    }
    public boolean addCourseGrade(String courseCode , int grade){
        for(Map.Entry<String,Integer> crs : grades.entrySet()){
            if(crs.getKey().equals(courseCode)){
                crs.setValue(grade);
                return true;
            }
        }
        return false;
    }
    // Method to calculate average grade
    public double calculateAverageGrade() {
        int totalGrade = 0;
        int count = 0;
        for (Map.Entry<String,Integer> crs : grades.entrySet()) {
            totalGrade +=(crs.getValue());
            count++;
        }
        return count > 0 ? (double) totalGrade / count : 0;
    }
    @Override
    public void setCoursesCount(int coursesCount) {
        if(coursesCount<=20)
            super.setCoursesCount(coursesCount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        else{
             super.setCoursesCount(20); 
             System.err.print("THE MAX COUNT IS 20 \n");
        }
    }

    
    public Map<String, Integer> getGrades() {
        return grades;
    }
   
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void display() {
        System.out.println("=====================STUDENT INFORMATION ==========================");
        System.out.println("Student ID : "+ super.getID());
        System.out.println("Student Name : "+ super.getName());
        System.out.println("Student Email : "+ super.getEmail());
        System.out.println("Student Courses Count : "+ super.getCoursesCount());
        System.out.println("Courses And Grades ::");
        for(Map.Entry<String, Integer>crs : grades.entrySet()){
             System.out.println("Course Code : "+ crs.getKey()+"==> Grade : "+ crs.getValue());
          }
        
        System.out.println("===================================================================");
    
    }
    
    
    
}
