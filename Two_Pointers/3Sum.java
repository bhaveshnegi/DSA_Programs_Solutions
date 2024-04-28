package DSA_Programs_Solutions.Two_Pointers;

public class 3Sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            if (nums==null || n<3) return new ArrayList<>();
            Set<List<Integer>> result = new HashSet<>();
            Arrays.sort(nums);
            for(int i=0;i<n-2;i++){
                int j = i+1;
                int k = n-1;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                    else if(sum<0){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }
}
