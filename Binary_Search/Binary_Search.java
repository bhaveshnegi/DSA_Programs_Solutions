package DSA_Programs_Solutions.Binary_Search;

public class Binary_Search {
    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int s = 0;
            int e = n - 1;
    
            while (s<=e){
                int mid = s+(e-s)/2;
                if(target<nums[mid]){
                    e = mid -1;
                }
                else if(target>nums[mid]){
                    s = mid +1;
                }
                else {
                    return mid;
                }
            }
            return -1;
            
        }
    }
}
