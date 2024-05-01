package DSA_Programs_Solutions.Two_Pointers;

public class Container_With_Most_Water {
    class Solution {
        public int maxArea(int[] height) {
            int n=height.length;
            int left = 0;
            int right =n-1;
            int result = 0;
            while(left<right){
                int h= Math.min(height[left],height[right]);
                int w = right - left;
                int sum=h*w;
                result = Math.max(sum,result);
                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
            return result;
        }
    }
}
