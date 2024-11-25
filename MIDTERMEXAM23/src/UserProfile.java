/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author kyrillos
 */
public abstract class UserProfile{
    
    protected int ID ;
    protected String name ;
    protected String email ; 
    protected int coursesCount;
    protected ArrayList<Course> courses = new ArrayList<Course>();

    public UserProfile() {
    }

    public UserProfile(int ID, String name, String email, int coursesCount, ArrayList<Course> courses) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.coursesCount = coursesCount;
        this.courses = courses;
    }
    public UserProfile(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
       
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCoursesCount(int coursesCount) {
        this.coursesCount = coursesCount;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getCoursesCount() {
        return coursesCount;
    }
    public void addCourse(Course course) {
    this.courses.add(course);
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public abstract void display();
    @Override
    public String toString() {
        return "[\n USER INFORMATION \n"+
                 "ID:"+this.getID()+
                "Name :"+this.getName()+
                "Email : "+this.getEmail()+
                "Course Count : "+this.getCoursesCount()+
                "COURSES : "+ this.getCourses()
                + "]";// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
