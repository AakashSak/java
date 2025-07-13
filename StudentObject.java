public class StudentObject
{
    String name;
    double mark;
    static String school = "Victoria Mt Higer Secondary School";

    StudentObject (String name, double mark)
    {
        this.name = name;
        this.mark = mark;
    }
    public void details ()
    {
        System.out.println("Student name is "+name);
        System.out.println("Student mark is "+mark);
        System.out.println("Student school name is "+school);
    }
}
