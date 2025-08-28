
public class SudokuSolver {

    private static boolean isSafe(char[][] board, int row, int col, int num) {
        // row & col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
            if (board[row][i] == (char) (num + '0')) {
                return false;
            }
        }
        // grid
        int strRow = row / 3 * 3;
        int strCol = col / 3 * 3;
        // number checking in grid 
        for (int i = strRow; i < strRow + 3; i++) {
            for (int j = strCol; j < strCol + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;

                }
            }
        }
        return true;
    }

    private static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col != board.length - 1) {
            newRow = row;
            newCol = col + 1;

        } else {
            newRow = row + 1;
            newCol = 0;
        }
        if (board[row][col] != '.') {
            if (helper(board, newRow, newCol)) {
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
        return true;
    }

    private static boolean solveSudoku(char[][] board) {
        return helper(board, 0, 0);
    }

    // print sudoku
    private static void printSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] jd) {
        int n = 9;
        char[][] sudokuSize = new char[n][n];
        sudokuSize[0][1] = '2';
        sudokuSize[1][1] = '6';
        sudokuSize[5][3] = '3';

        boolean isSolved = solveSudoku(sudokuSize);
        if (isSolved) {
            printSudoku(sudokuSize);
        }

    }
}
