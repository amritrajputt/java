package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = 'X';
            }
            
        }
        solveNQueens(0,board); //row,board
    }

    private static void solveNQueens(int row, char[][] board) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q'; // agar safe h to Queen place kro
                solveNQueens(row + 1, board); // place krne k baad next row ke liye function call kro taaki next row me
                                              // v queen aa paaye
                board[row][col] = 'X'; // backtrack kro kyunki sare valid paath dhundhne hai
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;
        // check column me khi koi queen to nhi hai
        int i = row - 1;// why row-1? kyunki current row me to rkhi hi h Queen to uper hi check krna h n
        while (i >= 0) {
            if (board[i][col] == 'Q')
                return false; // agar mil jaye tow hi return false krdo
            i--; // agar [i][col] pe queen na ho to or uper jaao
        }
        // check left diagonal
        i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        // check right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
}
