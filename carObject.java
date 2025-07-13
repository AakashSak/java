public class carObject //step - 1 Creating a blue print
{
    String carName;
    String carColor;
    double carPrice;
    static String owner = "Aakash";

    public void run()
    {
        System.out.println(carName+" is Running");
    }

    public void stop()
    {
        System.out.println(carName+"is Stoped");
    }

    public void details()
    {
        System.out.println("Car name is :"+carName);
        System.out.println("Car color is :"+carColor);
        System.out.println("Car price is :"+carPrice);
        System.out.println("Car owner was :"+owner);
    }
}
