import java.util.*;
public class CompareString
{
    //To read the String and Compare the String
    static Scanner ref = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your First Statments");
        String sentence1 = ref.nextLine();

        System.out.println("Enter your Second Statments");
        String sentence2 = ref.nextLine();

        System.out.println("First Sentence"+sentence1);
        System.out.println("Second Sentence" + sentence2);

        System.out.println(sentence1==sentence2);

    }
}
