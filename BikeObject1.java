public class BikeObject1
{
    private String bikeName;
    private String bikeColor;
    private double bikePrice;
    private BikeEngine engine;

    BikeObject1(String bikeName, String bikeColor, double bikePrice, BikeEngine engine)
    {
        this.bikeName = bikeName;
        this.bikeColor = bikeColor;
        this.bikePrice = bikePrice;
        this.engine = engine;
    }
    public String getBikeName()
    {
        return bikeName;
    }
    public String getBikeColor()
    {
        return bikeColor;
    }
    public double getBikePrice()
    {
        return bikePrice;
    }
    public BikeEngine engine()
    {
        return engine;
    }
    public void detailsOfBike()
    {
        System.out.println("your Bike Name :"+getBikeName());
        System.out.println("your Bike Color :"+ getBikeColor());
        System.out.println("Your Bike Price :"+ getBikePrice());
    }
}
