public class BikeEngine
{
    private String engineType;
    private int cc;
    private  String transmission;

    BikeEngine (String engineType, int cc, String transmission)
    {
        this.engineType=engineType;
        this.cc=cc;
        this.transmission=transmission;
    }
    public String getEngineType()
    {
        return engineType;
    }
    public int getCc()
    {
        return cc;
    }

    public String getTransmission()
    {
        return transmission;
    }

    public void detailsOfEngine()
    {
        System.out.println("Bike Engine type :"+ getEngineType());
        System.out.println("Bike CC :"+ getCc());
        System.out.println("Bike Transmission :"+ getTransmission());
    }
}
