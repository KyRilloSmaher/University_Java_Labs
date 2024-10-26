package Models;

public class Car {
    private String carModel  ,carName;
    private float carPrice;
    private int yearOfProduction;
    
    
    
    public Car(){
        this.carModel="NA";
        this.carName="NA";
        this.carPrice=0.0f;
        this.yearOfProduction=0;
    }
    public Car(String name , String model , float price , int year){
        this.carModel=model;
        this.carName=name;
        this.carPrice=price;
        this.yearOfProduction=year;
    }
    
    public void setCarModel(String model){this.carModel= model;}
    public void setCarName(String name){this.carName=name;}
    public void setCarprice(float price){this.carPrice=price;}
    public void setCarYearOFProduction(int year){this.yearOfProduction= year;}
    
    
    public String getCarModel(){return this.carModel;}
    public String getCarName(){return this.carName;}
    public float getCarprice(){return this.carPrice;}
    public int getCarYearOFProduction(){return this.yearOfProduction;}
    
    
    @Override
    public String toString(){
        return "\n ******************** Car Information *********************\nCar Name : "+carName+"\nCar Model : "+carModel+"\nYear Of Production : "+this.yearOfProduction+"\nCar Price : "+this.carPrice+"$\n********************************************************\n";
    }
    
    @Override
    public boolean equals(Object obj){
        Car second = (Car)obj;
        return(this.carModel.equals(second.carModel) && this.carName == second.carName)? true:false ;
    }
}
