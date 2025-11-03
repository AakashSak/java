import java.util.*;
public class AadharObject
{
    private String name,address;
    private long contact,aadharNo;

    static Scanner ref = new Scanner(System.in);

    AadharObject (String name,String address,long contact,long aadharNo)
    {
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.aadharNo=aadharNo;
    }
//contact verification
    public boolean doVerification() throws Exception
    {
        System.out.print("Enter the Contact NO:");
        long user_contact = ref.nextLong();
        if (contact == user_contact)
        {
            System.out.print("Enter the OTP :"); Thread.sleep(3000);
            int sys_otp =  1000 + (int) (Math.random() * 9000 );
            System.out.println(sys_otp);
            int user_otp = ref.nextInt();
            if (user_otp == sys_otp)
            {
                return true;
            }

        }
        System.out.println("Verification was failed. Plz try again later");
        return false;

    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public long getContact()
    {
        return contact;
    }

    public long getAadharNo()
    {
        return aadharNo;
    }

    //Setter Methods name,address,contact,aadhar_no
    public void setName(String name) throws Exception
    {
        if (doVerification())
        {
            this.name=name;
            System.out.println("Verification Success. Your Name was updated Successfully");
        }
        else {
            System.out.println("Verification was failed & Name was not Updated");
        }
    }

    public void setAddress(String address) throws Exception
    {
        if (doVerification())
        {
            this.address=address;
            System.out.println("Verification Success. Your Address was updated Successfully");
        }
        else {
            System.out.println("Verification was failed & Address was not Updated");
        }
    }

    public void setContact(long contact)throws Exception
    {
        if (doVerification())
        {
            this.contact=contact;
            System.out.println("Verification Success. Your Contact was updated Successfully");
        }
        else {
            System.out.println("Verification was failed & Contact was not Updated");
        }
    }

}
