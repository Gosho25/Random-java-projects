public class Capitalize {
    public static String capitalize(String s) {
        String[] words = s.split(" ");

        StringBuilder capitalizedText = new StringBuilder();

        for (String word : words) {
            capitalizedText.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }
        return capitalizedText.toString().trim();
    }
}
