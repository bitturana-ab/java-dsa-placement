
import java.util.ArrayList;
import java.util.List;

public class NQueenSafeChess {

    private static void Helper(char[][] board, List<List<String>> allBoard, int col) {
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                Helper(board, allBoard, col+1);
                board[row][col] ='.';
            }
        }

    }

    private static void printChess() {
    }

    private List<List<String>> solveNQueen(int n) {
    }

    public static void main(String[] jd) {

    }
}
