public class bikeObject
{
    static String owner = "AAKASH S";
    String BikeBrand = "KTM";
    String BikeModel = "Adventure-390";
    String BikeColor = "Orange";
    double BikrePrice = 455000.2f;

    public void run()
    {
        System.out.println(BikeBrand+"\n" +BikeModel+"Running");
    }
    public void stop()
    {
        System.out.println(BikeBrand+"\n" +BikeModel+"is Stoped");
    }

    public void details()
    {
        System.out.println("Bike Brand name is " +BikeBrand);
        System.out.println("Bike Model name is " +BikeModel);
        System.out.println("Bike Color name is " +BikeColor);
        System.out.println("Bike Price  is " +BikrePrice);
    }
}
