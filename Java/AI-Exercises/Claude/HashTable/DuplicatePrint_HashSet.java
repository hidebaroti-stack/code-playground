/* Problem 2 — Given an array of numbers, find the first number that appears more than once and return it.
[4, 6, 2, 6, 4] → 6  (6 appears twice, and appears first as a repeat) */
import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicateSet {

    // Method to find the first duplicate number
    public static int firstDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If number already exists in the set, it's the first duplicate
            if (set.contains(num)) {
                return num;
            }
            // Otherwise, add it to the set
            set.add(num);
        }
        return -1; // For no duplicate
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(firstDuplicate(nums));
        scanner.close();
    }
}

/*
 ---------------- DRY RUN EXAMPLE ----------------
 Input:
 nums = [4, 6, 2, 6, 4]

 Step-by-step:
 1️⃣ num = 4 → set = {} → not found → add → set = {4}
 2️⃣ num = 6 → set = {4} → not found → add → set = {4, 6}
 3️⃣ num = 2 → set = {4, 6} → not found → add → set = {4, 6, 2}
 4️⃣ num = 6 → set = {4, 6, 2} → FOUND → duplicate → return 6

 Output:
 Result = 6
 -------------------------------------------------
*/

/*
 ---------------- DRY RUN EXAMPLE ----------------
 Input:
 nums = [1, 2, 3, 4]

 Step-by-step:
 1️⃣ num = 1 → set = {} → not found → add → set = {1}
 2️⃣ num = 2 → set = {1} → not found → add → set = {1, 2}
 3️⃣ num = 3 → set = {1, 2} → not found → add → set = {1, 2, 3}
 4️⃣ num = 4 → set = {1, 2, 3} → not found → add → set = {1, 2, 3, 4}

 Loop ends → no duplicates found

 Output:
 Result = -1
 -------------------------------------------------
*/