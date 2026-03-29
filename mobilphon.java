import java.lang.*;
//constructor overloading
class mobilphon
{
    String brand;
    String model;
    double price;

    mobilphon(){
    brand="vivo";
    model="galaxy 10";
    price=12000.0;
}
    mobilphon(String b, String m, double p)
    {
        brand=b;
        model=m;
        price=p;
    }
    void displaydetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
    }
}

class main
{
    public static void main(String args [])
    {
        mobilphon phon1=new mobilphon();
        
        mobilphon phon2=new mobilphon("Apple", "iphone 14", 50000.0);
        
        System.out.println("mobilr phone 1 details: ");
        phon1.displaydetails();
        
        System.out.println("mobilr phone 2 details: ");
        phon2.displaydetails();
    }
}
