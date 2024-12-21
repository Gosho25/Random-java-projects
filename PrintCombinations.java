import java.util.ArrayList;
import java.util.List;

class PrintCombinations {

    // This function is the entry point for the combination generation
    public static void printCombinations(int num) {
        List<List<Integer>> allCombinations = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        // Start the combination finding process
        findCombinations(num, num, currentCombination, allCombinations);

        // Print the number (this is the first line of the output)
        System.out.println(num);

        // Print each combination in the required reverse order
        for (int i = allCombinations.size() - 1; i >= 0; i--) {
            List<Integer> combination = allCombinations.get(i);
            for (int number : combination) {
                System.out.print(number + " ");
            }
            System.out.println(); // Move to the next line after printing each combination
        }
    }

    // Recursive function to find all valid combinations that sum to 'target'
    private static void findCombinations(int target, int currentNum, List<Integer> currentCombination, List<List<Integer>> allCombinations) {
        // Base case: if the target is 0, we found a valid combination
        if (target == 0) {
            allCombinations.add(new ArrayList<>(currentCombination)); // Store the combination
            return;
        }

        // Start from 'currentNum' and go down to 1 to prevent duplicates
        for (int i = currentNum; i >= 1; i--) {
            if (i <= target) {  // Only proceed if 'i' is within the remaining target
                currentCombination.add(i); // Add 'i' to the current combination
                findCombinations(target - i, i, currentCombination, allCombinations); // Recur with the reduced target
                currentCombination.remove(currentCombination.size() - 1); // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        printCombinations(5);
    }
}
