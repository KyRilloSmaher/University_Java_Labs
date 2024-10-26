package Models;

public class Date {
    private int year;
    private int month;
    private int day ;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
         Date newdate = (Date) obj;
         
        if(this.day == newdate.day && this.month == newdate.month && this.year == newdate.year)
          return true ;
        return false;
    }

    @Override
    public String toString() {
        return "["+ this.day+"/"+this.month+"/"+this.year +"]";
    }
}
