class MinFind {
    private static int minNum = Integer.MAX_VALUE;

    public static int minFind(int num, int k) {
        // Convert the number to a string to manipulate digits
        char[] numArr = Integer.toString(num).toCharArray();

        // Start the backtracking process
        backtrack(numArr, 0, k);

        return minNum;
    }

    // Backtracking function
    private static void backtrack(char[] numArr, int start, int k) {
        // Base case: If no swaps are left, return
        if (k == 0) {
            return;
        }

        // Iterate through the array to try every possible swap
        for (int i = start; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                // Swap only if the swap results in a smaller number
                if (i != j && numArr[i] > numArr[j]) {
                    // Swap the digits
                    swap(numArr, i, j);

                    // Convert char array to integer and check for the minimum number
                    int newNum = Integer.parseInt(new String(numArr));
                    minNum = Math.min(minNum, newNum);

                    // Recursively backtrack with one less allowed swap
                    backtrack(numArr, i + 1, k - 1);

                    // Swap back to backtrack
                    swap(numArr, i, j);
                }
            }
        }
    }

    // Helper function to swap two digits
    private static void swap(char[] numArr, int i, int j) {
        char temp = numArr[i];
        numArr[i] = numArr[j];
        numArr[j] = temp;
    }
}