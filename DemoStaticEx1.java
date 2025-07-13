public class DemoStaticEx1
{
    static  boolean a = true;
    {
        System.out.println("Hi im NSMLI");
    }
    int b = 20;
    public static void solve()
    {
        System.out.println("solving..");
    }

    public static void main(String[] args) {
        System.out.println("Hi am main");
        System.out.println(a);
        System.out.println(d);
        System.out.println("Bye from main");
    }
    static double d = 2.3;
    static {
        System.out.println("Hi am SMLI");
    }
}
