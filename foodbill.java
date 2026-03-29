import java.util.Scanner;

class foodbill
{
    public static void main(String args [])
    {
     float price;
     int quantity;
     float discount;
     float deliverycharge;
     
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the foodprise : ");
     price=sc.nextFloat();
     
     System.out.print("Enter the food quantity : ");
     quantity=sc.nextInt();
     
     System.out.print("Enter the discount amount : ");
     discount=sc.nextFloat();
     
     System.out.print("Enter the delivery charge : ");
     deliverycharge=sc.nextFloat();
     
     sc.close();
     
     float totalbill=price * quantity;
     
     float discountamount=totalbill*discount/100;
     
     float finalbill=(totalbill+deliverycharge)-discount;
     
     System.out.println("-----welcome-----");
     System.out.println("grand star hotel");
     System.out.print("");
     System.out.println("Your bill is");
     System.out.println("discount amount: " + discount);
     System.out.println("quantity : " + quantity);
     System.out.println("delivery charge : " + deliverycharge);
     System.out.println("Grand total : " + finalbill);
     System.out.println("Thank you, visit again");
     System.out.print("");

    }
}
