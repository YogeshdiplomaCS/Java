import java.io.*; 
class BalanceException extends Exception 
{ 
 BalanceException(String message) 
 { 
 super(message); 
 } 
} 
public class ExceptionDemo 
{ 
 static void checkBalance(double balance) throws BalanceException 
 { 
 if (balance < 1000) 
 { 
 throw new BalanceException("Balance is less than minimum required!"); 
 } 
 else 
 { 
 System.out.println("Balance is sufficient."); 
 } 
 } 
 public static void main(String[ ] args) 
 { 
 try 
 { 
 checkBalance(500); 
 } 
 
 catch (BalanceException e) 
 { 
 System.out.println("Exception caught: " + e.getMessage()); 
 } 
 } 
 }
