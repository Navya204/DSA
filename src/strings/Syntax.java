
package strings;
import java.util.*;

public class Syntax{
    private static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char currentPlayer = 'X';

    public static void printBoard() {
        for (char[] row : board) {
            System.out.println(" " + row[0] + " | " + row[1] + " | " + row[2]);
            System.out.println("---+---+---");
        }
    }

    public static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    public static boolean isFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }

    public static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column: 0 1): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe! (Player vs Player Mode)");
        printBoard();
        while (true) {
            playerMove();
            printBoard();
            if (checkWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isFull()) {
                System.out.println("It's a draw!");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}