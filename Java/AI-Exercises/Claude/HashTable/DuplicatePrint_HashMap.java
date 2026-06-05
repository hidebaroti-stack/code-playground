/* Problem 2 — Given an array of numbers, find the first number that appears more than once and return it.
[4, 6, 2, 6, 4] → 6  (6 appears twice, and appears first as a repeat) */

import java.util.HashMap;
import java.util.Scanner;

public class DuplicatePrint {

    public static int duplicatePrint(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1; //For no duplicate
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(duplicatePrint(nums));
        scanner.close();
    }
}

/*
 ---------------- DRY RUN EXAMPLE ----------------
 Input:
 nums = [4, 6, 2, 6, 4]

 Step-by-step:
 1️⃣ num = 4 → map = {} → not found → add → map = {4=1}
 2️⃣ num = 6 → map = {4=1} → not found → add → map = {4=1, 6=1}
 3️⃣ num = 2 → map = {4=1, 6=1} → not found → add → map = {4=1, 6=1, 2=1}
 4️⃣ num = 6 → map = {4=1, 6=1, 2=1} → FOUND → duplicate → return 6

 Output:
 Result = 6
 -------------------------------------------------
*/

/*
 ---------------- DRY RUN EXAMPLE ----------------
 Input:
 nums = [1, 2, 3, 4]

 Step-by-step:
 1️⃣ num = 1 → map = {} → not found → add → map = {1=1}
 2️⃣ num = 2 → map = {1=1} → not found → add → map = {1=1, 2=1}
 3️⃣ num = 3 → map = {1=1, 2=1} → not found → add → map = {1=1, 2=1, 3=1}
 4️⃣ num = 4 → map = {1=1, 2=1, 3=1} → not found → add → map = {1=1, 2=1, 3=1, 4=1}

 Loop ends → no duplicates found

 Output:
 Result = -1
 -------------------------------------------------
*/
