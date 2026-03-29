import java.util.Scanner;

class autocharge
{
    public static void main(String arge [])
    {
        float distance;
        int rate ;
        int waitingcharge;
        
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the distance travelled (km) : ");
     distance=sc.nextFloat();
     
     System.out.print("Enter the rate per km : ");
     rate=sc.nextInt();
     
     System.out.print("Enter the waiting charge : ");
     waitingcharge=sc.nextInt();
     
     sc.close();
     
     double fare=(distance*rate)+waitingcharge;
     
     if (distance>20)
     {
     double extracharge=fare*0.10; 
     double extc=fare+extracharge;
     System.out.println("total fare is extracharge applied 10 percent: " + extc);
     }else
     {
         System.out.println("fare is : " + fare);
     }
    }
    }
