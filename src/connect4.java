import java.util.Scanner;

public class ConnectFour {

    public static void main(String[] args) {


        boolean player1 = true;
        boolean player2 = false;

        int p1turn = 0;
        int p2turn = 0;

        boolean turn = true;

        int[][] board = new int[6][7];


        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 5; column++) {

                board[row][column] = ' ';

            }
        }

        printBoard(board);
        int winner = 0;
        while (winner == 0) {

            if (turn) {
                System.out.println("Player1 go ahead.");
            }
            if (player1) {
                askColumn(board, 1);
            } else {
                System.out.println("Player 2 turn");
            }
            if (player2) {
                askColumn(board, 2);
            }
        }

        winner = Whowon(board);
        turn = !turn;

        if (player1 == true && player2 == false && winner == 2) {
            if (player2 == true && player1 == false && winner == 1) {
                System.out.println("You lost lol");
            } else if (winner == 1) {
                System.out.println("Player 1 is winner");
            } else if (winner == 2) {
                System.out.println("winner is player 2");
            } else {
                System.out.println("tied play again");
            }
        }
    }
}