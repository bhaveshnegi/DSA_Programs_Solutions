package DSA_Programs_Solutions.Stack;

import java.util.Stack;

public class Daily_Temperatures {
    public class Solution {
    
      public int[] dailyTemperatures(int[] temperatures) {
    
        Stack<Integer> stack = new Stack<>();
    
        int n = temperatures.length;
        int[] result = new int[n];
    
        for(int i = n - 1; i >= 0; i--) {
          while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
            stack.pop();
          }
          if(!stack.isEmpty()) {
            result[i] = stack.peek() - i;
          }
          stack.push(i);
        }
    
        return result;
      }
    
    }
}
