//control flow 
public class weather
{
    public static void main(String args[])
    {
        int weather=1; //raining 1=raining, 2=sunny, 3=cloudy.
        
        if (weather==1)
        {
            System.out.println("bring an umbrella");
        }
        else if(weather ==2)
        {
            System.out.println("Wear sunglasses.");
        }
        else
        {
            System.out.println("Just go outside normally.");
        }
    }
}
