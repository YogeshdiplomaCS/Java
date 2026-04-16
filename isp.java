import java.io.*; 
interface Movable { 
 void move( ); 
} 
interface Soundable { 
 void makeSound( ); 
} 
class RobotToy implements Movable, Soundable 
{ 
 public void move( ) { 
 System.out.println("Robot is moving..."); 
 } 
 public void makeSound( ) { 
 System.out.println("Robot says: Beep Beep!"); 
 } 
} 
class DollToy implements Soundable 
{ 
 public void makeSound( ) 
 { 
 System.out.println("Doll says: Hello!"); 
 } 
} 
public class ToyFactory
{ 
 public static void main(String[ ] args) 
 { 
 RobotToy robot = new RobotToy( ); 
 DollToy doll = new DollToy( ); 
 robot.move( ); 
 robot.makeSound( ); 
 doll.makeSound( ); 
 } 
}
