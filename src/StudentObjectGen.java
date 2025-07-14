public class StudentObjectGen
{
    public static void main(String[] args)
    {
        //initialize the value
        StudentObject ref1 = new StudentObject("Eicibeth",04);
        StudentObject ref2 = new StudentObject("Harinarayan",99);
        StudentObject ref3 = new StudentObject("Vishva",91);
        StudentObject ref4 = new StudentObject("Narmadha",29);
        StudentObject ref5 = new StudentObject("Valatharasan",35);
        System.out.println();

        //printing the details

//        ref1.details();
//        ref2.details();
//        ref3.details();
//        ref4.details();
//        ref5.details();

        StudentObject [] Students = {ref1,ref2,ref3,ref4,ref5};
        for (int i = 0; i < Students.length; i++)
        {
            if (Students[i].mark<35)
                Students[i].details();
        }
    }
}
