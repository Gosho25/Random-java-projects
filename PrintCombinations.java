import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class PrintCombinations {
    public static void printCombinations(int num) {
        List<Integer> combination = new ArrayList<>();
        findCombinations(num, 1, combination);
    }

    // Recursive function to find all combinations
    private static void findCombinations(int target, int start, List<Integer> combination) {
        // If the target sum is 0, print the current combination
        if (target == 0) {
            // Print the combination in the required order
            List<Integer> reversedCombination = new ArrayList<>(combination);
            Collections.reverse(reversedCombination); // Reverse the combination to match expected order
            for (int i = 0; i < reversedCombination.size(); i++) {
                System.out.print(reversedCombination.get(i));
                if (i < reversedCombination.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // To move to the next line after printing a combination
            return;
        }

        // Explore all numbers starting from 'start' to 'target'
        for (int i = start; i <= target; i++) {
            // If the current number is less than or equal to the remaining target, add it to the combination
            combination.add(i);
            // Recurse with the reduced target and the current number
            findCombinations(target - i, i, combination);
            // Backtrack by removing the last number
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Test cases
        printCombinations(6);
        System.out.println();
        printCombinations(2);
        System.out.println();
        printCombinations(3);
        System.out.println();
        printCombinations(5);
        System.out.println();
        printCombinations(4);
    }
}
