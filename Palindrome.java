import java.util.Scanner;
class Palindrome 
{
    public static void main(String args [])
    {
        int n,m,a=0,x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=s.nextInt();
        m=n;
        while(n>0)
        {
            x=n % 10;
            a=a*10+x;
            n=n/10;
            
        }
        if (a==m)
        {
            System.out.println("Given number " + m + " is palindrome");
            
        }
        else
        {
            System.out.println("Given numbe r" + m + " is not palindrome");
        }
        
    }
    
}
