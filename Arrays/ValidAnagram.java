package DSA_Programs_Solutions.Arrays;

import java.util.Arrays;

public class ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
    
            Arrays.sort(sChars);
            Arrays.sort(tChars);
    
            return Arrays.equals(sChars, tChars);
        }
    }
}
