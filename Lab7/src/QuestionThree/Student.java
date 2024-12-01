package QuestionThree;

import java.util.ArrayList;

public class Student {
    protected String name ;
    protected int age ;
    protected ArrayList<String> courses ;

    public Student(String name, int age , ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return  name +" \t" + age + " \t[" +String.join(",", courses)+"]"; 
    }
}
