import java.lang.*; 
class EncapsulationDemo { 
 private String accountNumber; 
 private String accountHolderName; 
 private double balance; 
 public String getAccountNumber( ) { 
 return accountNumber; 
 } 
 public String getAccountHolderName( ) { 
 return accountHolderName; 
 } 
 public double getBalance( ) { 
 return balance; 
 } 
 public void setAccountNumber(String accNo) { 
 accountNumber = accNo; 
 } 
 public void setAccountHolderName(String name) { 
 accountHolderName = name; 
 }
public void setBalance(double bal) { 
 if (bal >= 0) { 
 balance = bal; 
 } else { 
 System.out.println("Invalid balance!"); 
 } 
 } 
 public void deposit(double amount) { 
 if (amount > 0) { 
 balance += amount; 
 System.out.println("Deposited: " + amount); 
 } else { 
 System.out.println("Invalid deposit!"); 
 } 
 } 
 public void withdraw(double amount) { 
 if (amount <= balance) { 
 balance -= amount; 
 System.out.println("Withdrawn: " + amount); 
 } else { 
 System.out.println("Insufficient balance!"); 
 } 
 } 
} 
public class Main { 
 public static void main(String[] args) { 
 BankAccount acc = new BankAccount(); 
 acc.setAccountNumber("ACC1001"); 
 acc.setAccountHolderName("John"); 
 acc.setBalance(5000); 
 acc.deposit(2000); 
 acc.withdraw(3000); 
 acc.withdraw(6000); 
 System.out.println("\n--- Account Details ---"); 
 System.out.println("Account Number: " + acc.getAccountNumber()); 
 System.out.println("Account Holder Name: " + acc.getAccountHolderName()); 
 System.out.println("Balance: " + acc.getBalance()); 
 } 
}
