import javax.sound.midi.Soundbank;

public class FlipLetters
{
    public static void main(String[] args) {
        String input = "Apple cat fox Kiwi";
        String [] letters = input.split(" ");
        
        String Result ="";
        for (int i = 0; i < letters.length; i++) {

            char firstLetter = letters[i].charAt(0);
            String balanceLetters = letters[i].substring(1);

            if (Character.isLowerCase(firstLetter))
            {
                Result += Character.toUpperCase(firstLetter) + balanceLetters + " ";
            } else if (Character.isUpperCase(firstLetter))
            {
             Result += Character.toLowerCase(firstLetter) + balanceLetters + " ";
            }
        }
        System.out.println("Your Given Input is : " + input);
        System.out.println("Your Result is : " + Result.trim());
    }
}
