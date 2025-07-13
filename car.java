public class car
{
    private String cName,cColor;
    private double cPrice;
    private CarEngine carEngine;
    private static String owner ="Sak";

    car (String cName,String cColor,double cPrice,CarEngine carEngine)
    {
        this.cName=cName;
        this.cColor=cColor;
        this.cPrice=cPrice;
        this.carEngine=carEngine;
    }

    public String getcName()
    {
        return cName;
    }

    public String getcColor() {
        return cColor;
    }

    public double getcPrice()
    {
        return cPrice;
    }

    public CarEngine getCarEngine()
    {
        return carEngine;
    }

    public static String getOwner() {
        return owner;
    }

    public void drive()
    {
        System.out.println(owner+"Drving the"+cName);
    }
    public void detailsOfCar()
    {
        System.out.println("Your Car Name :"+ getcName());
        System.out.println("Your Car Color :"+ getcColor());
        System.out.println("Your Car Price :"+ getcPrice());
        System.out.println("Owner of  Car is :"+getOwner());
    }

    public static void main(String[] args) {
        car car1 = new car("Kiger","White-Black",150000,new CarEngine("Petrol","71hp","Manual"));
        car car2 = new car("Audi-Q4","Black",7200000,new CarEngine("Petrol","282Hp","DCT"));

        car [] cars ={car1,car2};

        for (int i = 0; i < cars.length; i++)
        {
          cars[i].detailsOfCar();
            System.out.println();
          cars[i].carEngine.detailsOfEngine();
            System.out.println();
        }
    }
}
