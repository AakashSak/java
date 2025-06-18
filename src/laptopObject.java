public class laptopObject
{
    String brand;
    String color;
    double price;
    static String owner = "Aakash";

    public void writtingCode()
    {
        System.out.println(owner+" is Useing to write codes in\t"+brand + "\tlaptop");
    }

    public void watchingmovies()
    {
        System.out.println(owner+" is Useing to watch movies in\t"+brand + "\tlaptop");
    }

    public laptopObject()
    {

    }
    public laptopObject(String b,String c,double p)
    {
        brand =b;
        color=c;
        price=p;
    }

    public void details()
    {
        System.out.println("Laptop brand is :"+brand);
        System.out.println("Laptop color is :"+color);
        System.out.println("Laptop price is :"+price);
        System.out.println("Laptop owner name is :"+owner);
    }
}
