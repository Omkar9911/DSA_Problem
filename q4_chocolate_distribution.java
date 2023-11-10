import java.util.Arrays;

public class q4_chocolate_distribution {

    public static int minDiffChocolates(int[] arr, int n, int m) {
        if (m > n) {
            return -1; // Not enough chocolates to distribute to all students
        }

        // Sort the array
        Arrays.sort(arr);

        // Initialize variables to track minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Find the minimum difference by comparing subsets of m packets
        for (int i = 0; i <= n - m; i++) {
            int currentDiff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n = arr.length;
        int m = 7; // Number of students

        int result = minDiffChocolates(arr, n, m);
        System.out.println("Minimum difference: " + result);
    }
}
