import java.util.*;

class PrintCombinations {

    // This function will be invoked by Coddy to test your solution
    public static void printCombinations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        // Start recursion with the largest possible number and work downwards
        findCombinations(n, combination, n, result);

        // Sort the combinations lexicographically
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if (a.get(i) != b.get(i)) {
                    return a.get(i) - b.get(i); // Compare elements to sort lexicographically
                }
            }
            return a.size() - b.size(); // If they are the same up to the smallest size, compare by size
        });

        // Print the combinations
        for (List<Integer> comb : result) {
            for (int i = 0; i < comb.size(); i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                System.out.print(comb.get(i));
            }
            System.out.println();
        }
    }

    // Recursive function to find all valid combinations
    private static void findCombinations(int n, List<Integer> combination, int start, List<List<Integer>> result) {
        // If the remaining sum is zero, add the current combination to the result
        if (n == 0) {
            result.add(new ArrayList<>(combination)); // Add a copy of the combination
            return;
        }

        // Try numbers from 'start' down to 1 to ensure reverse order
        for (int i = start; i >= 1; i--) {
            // If adding 'i' doesn't exceed the remaining sum, continue
            if (i <= n) {
                combination.add(i);  // Add number 'i' to the combination
                findCombinations(n - i, combination, i, result);  // Recurse with the reduced sum, allowing repetition of 'i'
                combination.remove(combination.size() - 1);  // Backtrack by removing the last added number
            }
        }
    }
}

class COMBO {
    public static void main(String[] args) {
        // Example usage
        PrintCombinations.printCombinations(4);
    }
}