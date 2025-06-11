public class ReverseFixedLetters
{
    //input : a12345z output : z54321a.
    public static void main(String[] args) {
        String input = "a12345z";
        //take the first leter
        char firstletter = input.charAt(0);
        //take the last letter
        char lastletter = input.charAt(input.length()-1);

        //take the middle letters
        String Middle = input.substring(1,input.length()-1);
        //storing the reverse letters
        String Reverse = "";

        for (int i = Middle.length()-1; i >=0 ; i--)
        {
            Reverse += Middle.charAt(i);
        }

        String Result =  firstletter + Reverse + lastletter;

        System.out.println("Your Result is :" + Result);


    }
}
