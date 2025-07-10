public class student
{
    private String sName, cName;
    private long contact;
    private StudentAddress address;

    student(String sName, String cName, long contact, StudentAddress address)
    {
        this.sName = sName;
        this.cName = cName;
        this.contact = contact;
        this.address = address;
    }

    public String getsName() {
        return sName;
    }

    public String getcName() {
        return cName;
    }

    public long getContact() {
        return contact;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void detailsOfStudents()
    {
        System.out.println("Student Name is :"+ getsName());
        System.out.println("Student Class is :"+ getcName());
        System.out.println("Student Contact Number :"+ getContact());
    }

    public static void main(String[] args)
    {
        student one = new student("Aadhi","10th-std",9876543210L,new StudentAddress("Vembakkam",604410L));
        student two = new student("Saikumar","10th-std",8917654320L,new StudentAddress("Kanchipuram",631503L));

        student [] students = {one,two};

        for (int i = 0; i < students.length; i++)
        {
         students[i].detailsOfStudents();
            System.out.println();
            students[i].address.detailsOfAddress();
            System.out.println();
        }
    }
}
