public class laptopObjectGen
{
    public static void main(String[] args) {
        //parameter
        laptopObject ref1 = new laptopObject("HP","Metalic-Black",72000.00);
        System.out.println(ref1);
        ref1.details();
        System.out.println();
        //empty value

        laptopObject ref2 = new laptopObject();
        System.out.println(ref2);
        ref2.details();
        System.out.println();

        //2nd parameter

        laptopObject ref3 = new laptopObject("Apple-Macbook","Metalic-Silver",110000.00);
        ref3.details();
        System.out.println();

        ref1.writtingCode();
        ref3.watchingmovies();

    }
}
