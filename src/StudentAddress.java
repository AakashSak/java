public class StudentAddress
{
    private String city;
    private long pincode;

    StudentAddress (String city , long pincode)
    {
        this.city=city;
        this.pincode=pincode;
    }

    public String getCity() {
        return city;
    }
    public long getPincode()
    {
        return pincode;
    }

    public void detailsOfAddress()
    {
        System.out.println("City name :"+getCity());
        System.out.println("Pin-code :"+ getPincode());
    }
}
