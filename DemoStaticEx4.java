public class DemoStaticEx4
{
    static {
        System.out.println("Hi am SMLI-1 of A");
    }
    static double pi =3.14;

    public static void main(String[] args) {
        System.out.println("hello marks");
    }

    static {
        System.out.println("Hi am SMLI-2 of A");
    }
}
class B {
    static {
        System.out.println("Hi am SMLI1-B");
    }
    static float marks = 92.5f;

    public static void main(String[] args) {
        System.out.println("Hi am main of B");
        System.out.println(DemoStaticEx4.pi);
        System.out.println(DemoStaticEx4.pi);
        System.out.println("Bye from main of B");
    }
}
