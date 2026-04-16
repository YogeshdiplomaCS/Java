import java.lang.*; 
class Account 
{ 
 int accountNumber; 
 String holderName; 
 Account(int accountNumber, String holderName) 
 { 
 this.accountNumber = accountNumber; 
 this.holderName = holderName; 
 } 
 void displayDetails( ) 
 { 
 System.out.println("Account Number: " + accountNumber); 
 System.out.println("Holder Name: " + holderName); 
 } 
} 
class SavingsAccount extends Account 
{ 
 double balance; 
 SavingsAccount(int accountNumber, String holderName, double balance) 
 { 
 super(accountNumber, holderName); 
 this.balance = balance; 
 } 
 void display( ) 
 { 
 displayDetails(); // inherited method 
 System.out.println("Balance: " + balance); 
 } 
} 

public class inheritancedemo
{ 
 public static void main(String[ ] args) 
 { 
 SavingsAccount sa = new SavingsAccount(12345, "Johnny", 15000); 
 sa.display( ); 
 } 
}
