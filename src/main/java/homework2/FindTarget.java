package homework2;

import java.util.Random;
import java.util.Scanner;

public class FindTarget {
    static String[][] board = new String[6][6];
    static int randomX;
    static int randomY;
    static int inputtedRow;
    static int inputtedColumn;


    public static void table() {
        //Creating and displaying table


        for (int x = 0; x < 6; x++) {
            System.out.println();
            for (int y = 0; y < 6; y++) {
                if (x == 0 && y == 0) {
                    board[x][y] = "X";
                } else if (x == 0 && y > 0) {
                    board[x][y] = String.valueOf(y);
                } else if (y == 0 && x > 0) {
                    board[x][y] = String.valueOf(x);
                } else {
                    board[x][y] = "-";
                }
                System.out.print(board[x][y] + "|");
            }
        }

    }

    public static void input() {
        // Inputting row and column number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row number: ");
        inputtedRow = scanner.nextInt();

        System.out.print("Enter column number: ");
        inputtedColumn = scanner.nextInt();

        check();
    }

    public static void check() {
        //Checking if found or not the target cell
        if (inputtedRow == randomX && inputtedColumn == randomY) {
            System.out.print("Congrats! You won!");
        } else {
            for (int x = 0; x < 6; x++) {
                System.out.println();
                for (int y = 0; y < 6; y++) {
                    if (x == 0 && y == 0) {
                        board[x][y] = "X";
                    } else if (x == 0 && y > 0) {
                        board[x][y] = String.valueOf(y);
                    } else if (y == 0 && x > 0) {
                        board[x][y] = String.valueOf(x);
                    } else if (x == inputtedRow && y == inputtedColumn) {
                        board[x][y] = "*";
                    } else if (board[x][y] == "*") {
                        board[x][y] = "*";
                    } else {
                        board[x][y] = "-";
                    }
                    System.out.print(board[x][y] + "|");
                }
            }
            System.out.println();
            input();
        }
    }

    public static void randomTarget() {
        // Generating random target
        Random r = new Random();
        int low = 1;
        int high = 6;
        randomX = r.nextInt(high - low) + low;
        randomY = r.nextInt(high - low) + low;

    }
}
