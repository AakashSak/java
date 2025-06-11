public class RemoveDuplicatesInWord {
    public static void main(String[] args) {
        String input = "developer cat apple abca"; // Removed unnecessary commas
        String[] ss = input.split(" "); // Corrected string splitting

        String output = "";
        for (int i = 0; i < ss.length; i++) {
            output += removeRepeated(ss[i]) + " "; // Corrected array handling
        }

        System.out.println(output.trim()); // Removes extra spaces at the end
    }

    public static String removeRepeated(String word) {
        char[] letters = word.toCharArray();
        String result = "";

        for (int i = 0; i < letters.length; i++) {
            boolean exists = false;

            // Check if character already exists in the result string
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == letters[i]) {
                    exists = true;
                    break;
                }
            }

            // Append character only if it's not already present
            if (!exists) {
                result += letters[i]; // Using simple string concatenation
            }
        }
        return result;
    }
}
