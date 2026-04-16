import java.lang.*; 
import java.util.Scanner; 
public class StudentMarks { 
 public static void main(String[ ] args) 
 { 
 Scanner sc = new Scanner(System.in); 
 int students = 2; 
 int subjects = 3; 
 int[ ][ ] marks = new int[students][subjects]; 
 for (int i = 0; i < students; i++) 
 { 
 System.out.println("Enter 3 Subjects marks for Student:"+(i+1)); 
 for (int j = 0; j < subjects; j++) 
 { 
 marks[i][j] = sc.nextInt(); 
 } 
 } 
 System.out.println("\nMarks Table:"); 
 for (int i = 0; i < students; i++) 
 { 
 for (int j = 0; j < subjects; j++) 
 { 
 System.out.print(marks[i][j] + " "); 
 } 
 System.out.println(); 
 } 
 } 
}
