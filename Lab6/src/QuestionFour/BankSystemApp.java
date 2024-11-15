package QuestionFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankSystemApp {
    public static void main(String[] args) {
       
        List<BankAccount> accounts = new ArrayList<>();
        
       
        SavingsAccount savings1 = new SavingsAccount(1000, 0.05);  
        SavingsAccount savings2 = new SavingsAccount(500, 0.03); 
        CheckingAccount checking1 = new CheckingAccount(1500);
        CheckingAccount checking2 = new CheckingAccount(2000);

        accounts.add(savings1);
        accounts.add(savings2);
        accounts.add(checking1);
        accounts.add(checking2);

       
        System.out.println("Initial Balances:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

       
        savings1.deposit(200);
        savings2.withdraw(100);
        savings1.addInterest();
        savings2.addInterest();

        System.out.println("\nBalances after transactions and interest:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

       
        checking1.transfer(300, savings1);
        checking2.transfer(500, checking1);
        checking1.deductFees();
        checking2.deductFees();

        System.out.println("\nBalances after transfers and fee deductions:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        Collections.sort(accounts);

        System.out.println("\nAccounts sorted by balance (descending):");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}

