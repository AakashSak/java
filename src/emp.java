public class emp {
    String  empname ;
    String dept;
    int empno ;
    double salary;
    static String Industry = "Foxen";

    public void working ()
    {
        System.out.print("Employees are working in"+dept);

    }

    public emp (String empname,String dept , int empno,double salary)
    {
        this.empname = empname;
        this.dept=dept;
        this.empno=empno;
        this.salary=salary;
    }


    public void details()
    {
        System.out.println("Employee name is :"+empname);
        System.out.println("Employee department is :"+dept);
        System.out.println("Employee employee-no is :"+empno);
        System.out.println(empname+"\tsalary is :"+salary);
        System.out.println("Industry name is :"+Industry);

    }

    public static void main (String[]args)
    {
        emp [] employes = { new emp("Prakash","software devlopmet",2345,25000),
                new emp("Karthik","Software Testing",13245,32000),
                new emp("Narayan","Cyber Security",32451,45000)

    };
        for (int i = 0; i < employes.length; i++) {
            if (employes[i].salary>30000)
            {
                //System.out.println(employes[i].empname);
                employes[i].details();
            }
        }

        }
}