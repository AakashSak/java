public class DemoStaticEx3
{

    static
    {
        int a =10;
        System.out.println("JavaScript :"+ a);
        System.out.println("JavaScript :"+ DemoStaticEx3.a);
    }
    static boolean a=true;
    int b = 20;
  //  static String b = "java";


    public static void main(String[] args) {
        //System.out.println("Hi from Main");
        //solve();
        int a =25;
        System.out.println("X"+a);
        System.out.println("Hello world");
    }

    public static void solve() // we are not called the method so it will not print
    {
        System.out.println("Solving");
    }
    static {
        System.out.println("Hi am SMLI2"+a);
    }

}

