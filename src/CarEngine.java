public class CarEngine
{
    private String Etype,hp,transmission;

    CarEngine(String Etype ,String hp,String transmission)
    {
        this.Etype=Etype;
        this.hp=hp;
        this.transmission=transmission;
    }
    public String getEtype()
    {
        return Etype;
    }

    public String getHp() {
        return hp;
    }

    public String getTransmission() {
        return transmission;
    }

    public void eStart()
    {
        System.out.println("Your car engine was in idle");
    }

    public void detailsOfEngine()
    {
        System.out.println("Your Car Engine type :"+ getEtype());
        System.out.println("Your Car Engine Horse Power :"+getHp());
        System.out.println("Your Car Engine Transmission :"+getTransmission());
    }
}
