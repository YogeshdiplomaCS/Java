import java.io.*; 
public class FileDemo 
{ 
 public static void main(String[ ] args) 
 { 
 try{ 
 FileReader fr = new FileReader("D:\\input.txt"); 
 FileWriter fw = new FileWriter("D:\\output.txt"); 
 int ch; 
 while ((ch = fr.read()) != -1) 
 { 
 fw.write(ch); 
 } 
 fr.close(); 
 fw.close(); 
 System.out.println("File copied successfully!"); 
 } 
 catch (IOException e) 
 { 
 System.out.println("Error: " + e.getMessage()); 
 } 
 } 
} 
