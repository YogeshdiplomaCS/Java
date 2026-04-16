import java.lang.*; 
 import java.util.Scanner; 
public class PasswordChecker 
{ 
 public static void main(String[ ] args) { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter password: "); 
 String password = sc.nextLine( ); 
 boolean upper = false, lower = false, digit = false, special = false; 
 for (int i = 0; i < password.length( ); i++) 
 { 
 char ch = password.charAt(i); 
 if (Character.isUpperCase(ch)) upper = true; 
 else if (Character.isLowerCase(ch)) lower = true; 
 else if (Character.isDigit(ch)) digit = true; 
 else special = true; 
 } 
 if (password.length( ) < 8) { 
 System.out.println("Weak Password"); 
 } else if (upper && lower && digit && special) { 
 System.out.println("Strong Password"); 
 } else { 
 System.out.println("Medium Password"); 
 } 
 } 
}
