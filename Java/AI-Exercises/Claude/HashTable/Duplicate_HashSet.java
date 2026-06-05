/* Problem 1 — Given an array, check if any number appears twice. Return true if duplicate exists, false if not.
[1, 2, 3, 4] → false
[1, 2, 3, 1] → true */

import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    //Method to check if any number appears twice in the array
    public static boolean searchDuplicate(int[] nums){
        //HandSet collection stores unique Integer Objects only
        HashSet<Integer> set = new HashSet<>();
                                                                                        //Alternative, enhanced loop
        for (int num : nums) { //for-each loop to iterate over arrays or collections    //for(int i = 0; i < nums.length; i++) {
            if(set.contains(num)) { //Number in set? duplicate found                    //    int num = nums[i];
                return true;                                                            // }
            }                                                                           //As we don't need the index
            set.add(num);//Otherwise, add the number to the set
        }
        return false; //No duplicates found after full iteration
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
 1️⃣ num = 1 → set = {} → not found → add → set = {1}
 2️⃣ num = 2 → set = {1} → not found → add → set = {1, 2}
 3️⃣ num = 3 → set = {1, 2} → not found → add → set = {1, 2, 3}
 4️⃣ num = 1 → set = {1, 2, 3} → FOUND → duplicate → return true

 Output:
 Result = true
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
 Result = false
 -------------------------------------------------
*/