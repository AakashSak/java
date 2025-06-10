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

        // tryin to compare the address
        System.out.println(sentence1==sentence2);
        //trying to compare the content
        System.out.println(sentence1.equals(sentence2));
        //trying to compare the content ignorint case
        System.out.println(sentence1.equalsIgnoreCase(sentence2));

    }
}
