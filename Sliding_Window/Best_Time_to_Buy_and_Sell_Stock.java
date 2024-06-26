package DSA_Programs_Solutions.Sliding_Window;

public class Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0) {
                return 0; 
            }
    
            int min = prices[0]; 
            int max = 0; 
    
            for (int i = 1; i < prices.length; i++) {
                
                min = Math.min(min, prices[i]); 
                max = Math.max(max, prices[i] - min);
            }
    
            return max;   
        }
    }
}
