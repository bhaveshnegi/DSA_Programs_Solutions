package DSA_Programs_Solutions.Arrays;

public class Valid_Sudoku {
    class Solution{
        public boolean isValidSudoku(char[][] board) {
            HashSet seen = new HashSet();
            for (int i=0; i<9; ++i) {
                for (int j=0; j<9; ++j) {
                    if (board[i][j] != '.') {
                        String str = "(" + board[i][j] + ")";
                        if (!seen.add("row"+i+str) || !seen.add("col"+j + str) || !seen.add("box"+i/3*3 + str + j/3)){
                            return false;
                        }
                    }
                }
            }
            return true;
                
        }
    }
    
}
