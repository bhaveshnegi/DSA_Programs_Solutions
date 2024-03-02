package DSA_Programs_Solutions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            // Create a HashMap to store the elements and their indices
            Map<Integer, Integer> numToIndex = new HashMap<>();

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
            
                // Check if the complement exists in the HashMap
                if (numToIndex.containsKey(complement)) {
                    // Return the indices of the two numbers that add up to the target
                    return new int[] { numToIndex.get(complement), i };
                }
            
                // If the complement does not exist, add the current number and its index to the HashMap
                numToIndex.put(nums[i], i);
            }

            // If no solution is found, return an empty array or throw an exception
            return new int[0];
        }
    }

    // public static void main(String[] args) {
    //     Solution twosum = new Solution();
    //     int[] nums = { 2, 7, 11, 15 };
    //     int target = 9;
    //     int[] result = twosum.twoSum(nums, target);

    //     // Print the indices of the two numbers that add up to the target
    //     System.out.println(result[0] + " " + result[1]);
    // }
}
