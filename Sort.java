import java.util.Arrays;

public class Sort {
    public static String sort(String word) {
        // Convert the string to a character array
        char[] charArray = word.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);
    }
}
