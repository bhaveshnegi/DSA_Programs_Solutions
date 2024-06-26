package DSA_Programs_Solutions.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c:s.toCharArray()){
                if(c=='('){
                    stack.push(')');
                }
                else if(c=='['){
                    stack.push(']');
                }
                else if(c=='{'){
                    stack.push('}');
                }
                else if(stack.isEmpty() || stack.pop()!= c){
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
