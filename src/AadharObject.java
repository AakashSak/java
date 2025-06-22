import java.util.*;
public class AadharObject
{
//    -aadhar name,-aadhar no,-aadhar contact ,-aadhar address
    static Scanner ref = new Scanner(System.in);

    private String name;
    private long aadharno;
    private long contact;
    private String address;

    AadharObject( String name , long aadharno , long contact , String address)
    {
        this.name=name;
        this.aadharno=aadharno;
        this.contact=contact;
        this.address=address;
    }

    public boolean doverification()
    {
        System.out.println("Enter the contact number");
        long user_contact = ref.nextLong();
        if (contact==user_contact)
        {
            int sys_otp = (int) (Math.random()*9999+9999);
            System.out.println("Enter the otp");
            System.out.println(sys_otp);
            int user_otp = ref.nextInt();
            if (user_otp==sys_otp)
                return true;
        }
        return false;
    }

    public String getName ()
    {
        return name;
    }

    public long getAadharno()
    {
        return  aadharno;
    }
    public long getContact()
    {
        return contact;
    }
    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        if (doverification())
        {
            this.name=name;
            System.out.println("Name was updated");
        }
        else
        {
            System.out.println("Verification was failed so try again later");
        }
    }

    public void setContact(long contact)
    {
        if (doverification())
        {
            this.contact=contact;
            System.out.println("Contact Was updated");
        }
        else
        {
            System.out.println("Verification was failed so try again later");
        }
    }
    public void setAddress(String address)
    {
        if (doverification())
        {
            this.address=address;
        }
    }

}
