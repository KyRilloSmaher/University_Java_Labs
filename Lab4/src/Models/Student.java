package Models;

import java.util.Arrays;

public class Student {
 private int RollingNumber;
    private String Name;
    private Date BirthDate;
    private int MaxDegree;
    private int[] Degrees = new int[3];
    private double[] CGPA = new double[5];
    private static int count = 0;

    public Student() 
    {
        this.BirthDate = new Date();
    }
    
    public Student(String name, Date birthDate, int maxDegree)
    {
        this.Name = name;
        this.BirthDate = birthDate;
        this.MaxDegree = maxDegree;
        this.RollingNumber = ++count;
    }

    public void setRollingNumber(int rollingNumber) 
    {
        this.RollingNumber = rollingNumber;
    }

    public void setName(String name) 
    {
        this.Name = name;
    }

    public void setBirthDate(int d, int m, int y) 
    {
        this.BirthDate.setDay(d);
        this.BirthDate.setMonth(m);
        this.BirthDate.setYear(y);
    }

    public void setMaxDegree(int maxDegree) 
    {
        this.MaxDegree = maxDegree;
    }
    
    public void set_Degress(int [] degree)
    {
        for (int i = 0; i < 3; i++) 
        {
            if(degree[i] >= 0 && degree[i] <= this.MaxDegree)
                this.Degrees[i] = degree[i];
            else
                 System.out.println("Invalid degree value for subject " + (i + 1));
        }
    }
    
    public void set_CGPA(int semester, double CGPA)
    {
        if(semester >= 1 && semester <= 5)
            this.CGPA[semester - 1] = CGPA;
        else
            System.out.println("Invalid semester value");
    }

    public int getRollingNumber() 
    {
        return RollingNumber;
    }

    public String getName() 
    {
        return Name;
    }

    public Date getBirthDate() 
    {
        return BirthDate;
    }

    public int getMaxDegree()
    {
        return MaxDegree;
    }

    public int[] getDegrees()
    {
        return Degrees;
    }

    public double[] getCGPA() 
    {
        return CGPA;
    }
    
    public int total_Degrees()
    {   
        return Degrees[0] + Degrees[1] + Degrees[2];
    }
    public String grade()
    {
        double totaldegree = Degrees[0] + Degrees[1] + Degrees[2];
        double average = (totaldegree / (this.MaxDegree * 3) )*100;
        if(average >= 90)
            return "A";
        else if(average >= 85)
            return "A-";
        else if(average >= 80)
            return "B+";
        else if(average >= 75)
            return "B";
        else if(average >= 70)
            return "C+";
        else if(average >= 65)
            return "C";
        else if(average >= 60)
            return "D";
        else 
            return "F";
    }
    
    public void display()
    {
        System.out.println("Name: " + this.Name);
        this.BirthDate.toString();
        System.out.println("MaxDegree: " + this.MaxDegree);
        System.out.println("Degrees: " + Arrays.toString(Degrees));
        System.out.println("CGPA: " + Arrays.toString(CGPA));
        System.out.println("Totaldegree: " + total_Degrees());
        System.out.println("Calculated Grade: " + grade()); 
        System.out.println("Rolling number: " + this.RollingNumber);
    }
    
    public boolean Bad_CGPA()
    {
        for (int i = 1; i < 5; i++)
        {
            if(this.CGPA[i - 1] < 2 && this.CGPA[i] < 2)
                return true;
        }
        return false;
    }
}
