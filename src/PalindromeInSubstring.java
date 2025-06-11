import java.util.*;
public class PalindromeInSubstring {
    static Scanner ref = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your Input");
        String s = ref.nextLine();
//
        int PalindromCount = 0;
        List<String> Palindromes = new ArrayList<>();
//Genetrate the all possibility for substring
        System.out.println("Posiblity of all Substring");

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);
                System.out.print(sub + ",");

                if (isPalindrom(sub) && sub.length() > 1) {
                    Palindromes.add(sub);
                    PalindromCount++;
                }
            }
            System.out.println();
        }
        // Print finded posibile palindromes
        System.out.println("\nPalindrome Substrings Found:");
        System.out.println(Palindromes);

        // Print the count of palindrome occurrences
        System.out.println("\nTotal Palindromes Found: " + PalindromCount);

    }
    // Function to check if a string is a palindrome with equals.IgnoreCase
    public static boolean isPalindrom(String str)
    {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

    }
}
