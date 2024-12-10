import java.util.HashMap;
import java.util.Map;

public class OccurClass {
    public static int occurMax(int[] a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Initialize variables to track the number with the maximum frequency
        int maxFrequency = 0;
        int maxNum = a[0];

        // Iterate through the frequency map to find the number with the maximum frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxNum = entry.getKey();
            }
        }

        return maxNum;
    }
}
