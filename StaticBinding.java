import java.lang.*; 
class StaticBinding 
{ 
 void display(int a) 
 { 
 System.out.println("Integer value: " + a); 
 } 
 void display(String b) 
 { 
 System.out.println("String value: " + b); 
 } 
 public static void main(String[ ] args) 
 { 
 StaticBinding obj = new StaticBinding( ); 
 obj.display(10); 
 obj.display("Hello"); 
 } 
}
