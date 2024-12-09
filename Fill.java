import java.util.Arrays;

public class Fill {
    public static int[] rotate(int[] arr) {
        Arrays.fill(arr, arr.length);
        return arr;
    }
}
