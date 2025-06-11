public class RemoveDuplicatesInWord {
    public static void main(String[] args) {
        String input = "developer cat apple abca";
        String[] ss = input.split(" ");

        String output = "";

        for (int i = 0; i < ss.length; i++)
        {
            output  +=  removeRepeated(ss[i]) + " ";
        }

        System.out.println(output.trim());
    }

    public static String removeRepeated(String word) {
        char[] letters = word.toCharArray();
        String result = "";

        for (int i = 0; i < letters.length; i++) {
            boolean exists = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == letters[i]) {
                    exists = true;
                    break;
                }
            }


            if (!exists) {
                result += letters[i];
            }
        }
        return result;
    }
}
