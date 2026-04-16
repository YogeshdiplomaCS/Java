import java.lang.*; 
class Animal{ 
 void sound( ) { 
 System.out.println("Animal makes sound"); 
 } 
} 
class Dog extends Animal { 
 void sound( ) { 
 System.out.println("Dog barks"); 
 } 
} 
public class DynamicBinding { 
 public static void main(String[ ] args) { 
 Animal obj; 
 obj = new Dog(); 
 obj.sound(); 
 } 
}
