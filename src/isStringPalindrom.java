import java.util.*;
public class isStringPalindrom
{
   static Scanner ref = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your Input");
        String Sentence = ref.nextLine();
        //make empty string
        String reverse = "";
        System.out.println("Your given Input is : " +Sentence);
        for (int i = Sentence.length()-1; i >=0 ; i--)
        {
          reverse = reverse + Sentence.charAt(i);
        }
        if (Sentence.equalsIgnoreCase(reverse))
        {
            System.out.println("It is Palindrom");
        }
        else
        {
            System.out.println("Not a Palindrom");
        }
    }
}
