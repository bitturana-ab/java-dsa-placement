
public class SudokuSolver {

    private static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col != board.length - 1) {
            newRow = row;
            newCol = col;

        } else {
            newRow = row + 1;
            newCol = 0;
        }
        if (board[row][col] != '.') {
            if (helper(board, row, col)) {
                return true;
            } else {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, newRow, newCol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }

                }
            }
        }
        return false;
    }

    private static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] jd) {

    }
}
