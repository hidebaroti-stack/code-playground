/* Problem 1 — Given an array, check if any number appears twice. Return true if duplicate exists, false if not.
[1, 2, 3, 4] → false
[1, 2, 3, 1] → true */

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateHashMap {
    //Method to check if any number appears twice
    public static boolean searchDuplicate(int[] nums) {

        //Create an empty HashMap to store key and values
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            //If number already exits in  the map, duplicate found
            if (map.containsKey(num)) {
                return true;
            }
            //Otherwise, put it with count = 1
            map.put(num, 1);
        }
        return false; //No duplicates found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(searchDuplicate(nums));
        scanner.close();
    }
}
/*
 ---------------- DRY RUN EXAMPLE ----------------
 Input:
 nums = [1, 2, 3, 1]

 Step-by-step:
 1️⃣ num = 1 → map = {} → not found → add → map = {1=1}
 2️⃣ num = 2 → map = {1=1} → not found → add → map = {1=1, 2=1}
 3️⃣ num = 3 → map = {1=1, 2=1} → not found → add → map = {1=1, 2=1, 3=1}
 4️⃣ num = 1 → map = {1=1, 2=1, 3=1} → FOUND → duplicate → return true

 Output:
 Result = true
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
 Result = false
 -------------------------------------------------
*/