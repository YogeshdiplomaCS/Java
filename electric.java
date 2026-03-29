import java.util.Scanner;

class electric
{
    public static void main(String arge [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the category 1-domestic 2-commercial 3-industrial : ");
        int category=sc.nextInt();
        
        System.out.print("Enter the units of electricity consumed : ");
        int units=sc.nextInt();
        
        double totalbill;
        double rate=0;
        
        switch(category)
        {
            case 1:
                rate=6;
                break;
                
            case 2:
                rate=8;
                break;
            
            case 3:
                rate=10;
                break;
                
            default:
                System.out.println("invalid category selected!!!");
                return;
        }
        
        totalbill=units*rate;
        
        System.out.println("rate per the unit: " + rate);
        System.out.println("total bill is : " + totalbill);
        
      
    }
}
