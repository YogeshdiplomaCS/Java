import java.util.Scanner;

class atm
{
    public static void main(String args [])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the balance : ");
    double balance=sc.nextDouble();
    
    //System.out.append(null);
    System.out.print("Enter the withdrawal amount : ");
    double withdrawal=sc.nextDouble();
    
    sc.close();
    
    if(withdrawal >= balance)
    {
        System.out.println("Transaction denied : inefficient balance !");
    }
    else if((balance - withdrawal) < 1000)
    {
        System.out.println("minimum balance is 1000 not can be withdrawal it");
    }
    else
    {
        balance=balance-withdrawal;
        System.out.println("Transaction is successfull!!!");
        System.out.println("curent balance is : " + balance );
    }
    }
    }
