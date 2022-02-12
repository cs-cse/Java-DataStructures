import java.util.HashSet;

public class ValidSudoku {
//    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//    Each row must contain the digits 1-9 without repetition.
//    Each column must contain the digits 1-9 without repetition.
//    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//
//Note:
//
//    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//    Only the filled cells need to be validated according to the mentioned rules.

    public boolean isValidSudoku(char[][] board) {

            HashSet<String> seen = new HashSet<>();

            for(int i =0;i<9;i++)
            {
                for(int j = 0;j<9;j++)
                {   char ch = board[i][j];
                    if(ch != '.')
                    {  if(!seen.add(ch + "found in row" + i)||  // storing element with row number
                            !seen.add(ch + "found in column" + j)|| // storing element with column number
                            !seen.add(ch + "found in box" + i/3 +"-"+j/3)
                    ) // storing element with box number

                        return false;

                    }
                }

            } return true;
        }

}
