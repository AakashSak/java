public class DemoStaticEx2
{

        static
        {
            int a =30;
        System.out.println("JavaScript :"+ a);
        System.out.println("JavaScript :"+ DemoStaticEx2.a);
    }
    static boolean a=true;
    static String b = "java";

    static {
        System.out.println(a);
        System.out.println(DemoStaticEx2.a);
    }

    public static void main(String[] args) {
        System.out.println("Hi from Main");
        //solve();
        System.out.println("Bye from Main");
    }

    public static void solve() // we are not called the method so it will not print
    {
        System.out.println("Solving");
    }
    {
        System.out.println("Python");//non-static Multi line initializer will not print.
    }
}
