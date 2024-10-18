
import Models.*;

public class Lab2 {
    public static void main(String[] args){

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("--------------------- Question One ---------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        Invoice.Cashier cashier1 = new Invoice.Cashier("Fake");
        Invoice.Cashier cashier2 = new Invoice.Cashier("Zizo");
        
    
        Invoice V1 = new Invoice(11, "Burger", 5, 10.0f);
        cashier1.incremmentInvoicesIssued();
        V1.Display();

        Invoice V2 = new Invoice(2, "Pizza", 3, 15.0f);
        cashier1.incremmentInvoicesIssued();
        V2.Display();

        Invoice V3 = new Invoice();
        cashier2.incremmentInvoicesIssued();
        V3.Display();

        
        System.out.println("Invoices Count issued by Cashier Fake: " + cashier1.Invoices());
        System.out.println("Invoices Count issued by Cashier Zenhom: " + cashier2.Invoices());
       
        System.out.println("-----------------------------------------------------------------------------");





        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("--------------------- Question TWo ---------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        Complex a = new Complex(2, 4);
        Complex b = new Complex(0, -4);
        System.out.println(a);
        b.display();
        Complex sum = a.addTo(b);
        System.out.print("Sum: ");
        sum.display();
        Complex product = a.multiplyTo(b);
        System.out.print("Product: ");
        product.display();
        System.out.print("Conjugate of a: ");
        a.conjugate().display();
        System.out.println("Magnitude of b: " + b.magnitude());
        System.out.println("-----------------------------------------------------------------------------");
         


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("--------------------- Question Three ---------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book1 = new Book("123456789", "Java Programming", author, "Tech Books Publishing", 49.99);
        Book book2 = new Book("123456789", "Advanced Java", author, "Tech Books Publishing", 59.99);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Are the books the same? " + book1.equals(book2));
        System.out.println("-----------------------------------------------------------------------------");
    }
}