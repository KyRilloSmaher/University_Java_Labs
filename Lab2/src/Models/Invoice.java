package Models;


public class Invoice {
   private int Id;
   private String Description;
   private int  Quantity; 
   private float Price;
   private static int InvoicesCount =0;


public Invoice(int _id, String _desc , int _quantity , float _price ){
        this.Id  = _id ;
        this.Description= _desc;
        this.Price= (_price <= 0) ? 0.0f : _price;
        this.Quantity = (_quantity <= 0) ? 0 : _quantity;
        InvoicesCount++;
   }
public Invoice(){ InvoicesCount++;}
   public void setId(int id){this.Id = id;}
   public void setDescription(String desc){this.Description = desc;}
   public void setprice(float price){this.Price = (price<=0)?0.0f :price;}
   public void setQuantity(int quantity){this.Quantity = (quantity<=0)?0 :quantity;}


   public int getId(){return this.Id;}
   public String getDescription(){return this.Description;}
   public int getQuantity(){return this.Quantity;}
   public float getPrice (){return this.Price;}

  
   public float subtotal() {
       return this.Price * this.Quantity;
    }

     
   public float Total(){
      float t = (float)this.Price*this.Quantity;
      return (t+t*0.05f);
   }
  

   public void Display(){
    System.out.println("------------------------------------------------------------------");
    System.out.println("-------------"+"Invoice Number : "+InvoicesCount+"---------------------");
    System.out.println("Item ID :"+ this.Id);
    System.out.println("Description :"+ this.Description);
    System.out.println("Item Price :"+ this.Price);
    System.out.println("Quantity :"+ this.Quantity);
    System.out.println("Total Price :"+ this.Total());
    System.out.println("-----------------------------------------------------------");
   }

   /**
    * InnerClass
    * 
    */
   public static class Cashier{
      public String Name ;
      public int  invoicesIssued ;
    public Cashier (String _name){
            this.Name = _name ;
            this.invoicesIssued=0;
      }
     public int Invoices(){
        return this.invoicesIssued;
     }
     public void incremmentInvoicesIssued(){
         this.invoicesIssued++;
         
     }
   }
}
