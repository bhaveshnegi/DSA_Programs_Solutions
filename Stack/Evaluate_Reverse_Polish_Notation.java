package DSA_Programs_Solutions.Stack;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stk = new Stack<>();
    
            for (String tok : tokens) {
                if (tok.equals("+")) {
                    int n1 = stk.pop();  
                    int n2 = stk.pop();  
                    int res = n2 + n1;  
                    stk.push(res);       
                } else if (tok.equals("-")) {
                    int n1 = stk.pop();  
                    int n2 = stk.pop();  
                    int res = n2 - n1;   
                    stk.push(res);       
                } else if (tok.equals("*")) {
                    int n1 = stk.pop();  
                    int n2 = stk.pop();  
                    int res = n2 * n1;   
                    stk.push(res);       
                } else if (tok.equals("/")) {
                    int n1 = stk.pop();  
                    int n2 = stk.pop();  
                    int res = n2 / n1;  
                    stk.push(res);       
                } else {
                    stk.push(Integer.parseInt(tok)); 
                }
            }
            return stk.pop();
        }
    }
}
