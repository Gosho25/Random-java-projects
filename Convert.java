public class Convert {
    public static int[] convert(int n) {
        String numStr = Integer.toString(n);

        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
}
