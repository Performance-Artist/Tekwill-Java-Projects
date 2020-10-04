import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final char EMPTY_SPACE_CHAR = '_';
    private static final char PLAYER_ONE_CHAR = 'X';
    private static final char PLAYER_TWO_CHAR = 'O';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = new char[9];

        Arrays.fill(array, EMPTY_SPACE_CHAR);

        printState(array);

        int i = 2;//1
        while (true) {
            System.out.print("Enter the coordinates: ");

            String first = sc.next();//1
            String second = sc.next();//1

            if (!Character.isDigit(first.charAt(0)) || !Character.isDigit(second.charAt(0))) {
                System.out.println("You should enter numbers!");
                continue;
            }

            int n = Integer.parseInt(first);
            int m = Integer.parseInt(second);
            int x = n + 8 - 3 * m; // don't ask why. ☼ It's magic ☼

            if (n < 1 || n > 3 || m < 1 || m > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (array[x] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                array[x] = i % 2 != 0 ? PLAYER_TWO_CHAR : PLAYER_ONE_CHAR;
                i++;

                boolean xWins = checkHasWon(PLAYER_ONE_CHAR, array);
                boolean oWins = checkHasWon(PLAYER_TWO_CHAR, array);

                printState(array);

                if (xWins) {
                    System.out.println(PLAYER_ONE_CHAR + " wins");
                    break;
                } else if (oWins) {
                    System.out.println(PLAYER_TWO_CHAR + " wins");
                    break;
                } else if (i == 9) {
                    System.out.println("Draw");
                    break;
                }

            }
        }
    }

    /**
     * Prints the game stat represented by the provided array.
     *
     * @param array the array representing the game.
     */
    private static void printState(char[] array) {
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");
    }

    /**
     * Check weather provided character has won.
     *
     * @param c     char to check ('X' or 'O')
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if game provided char won, <code>false</code> otherwise.
     */
    private static boolean checkHasWon(char c, char... array) {
        return checkDiagonals(c, array) || checkColumns(c, array) || checkRows(c, array);
    }

    /**
     * Checks if provided char has on in the diagonals.
     * There are only two possible diagonals on positions 0 4 8 and 2 4 6.
     *
     * @param c     char to check ('X' or 'O')
     * @param array the array of 9 characters (the game)
     * @return <code>true</code> if game provided char won, <code>false</code> otherwise.
     */
    private static boolean checkDiagonals(char c, char... array) {
        return hasWon(c, array[0], array[4], array[8]) || hasWon(c, array[2], array[4], array[6]);
    }

    /**
     * Checks if the provided column has the provided character all along (ex. 'X','X','X' or 'O','O','O').
     *
     * @param c     char to check ('X' or 'O')
     * @param array the array representing the column (should have 3 elements).
     * @return <code>true</code> if column is full of same character, <code>false</code> otherwise.
     */
    private static boolean checkColumns(char c, char... array) {
        for (int i = 0; i < 3; i++) {
            if (hasWon(c, array[i], array[i + 3], array[i + 6])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the provided row has the provided character all along (ex. 'X','X','X' or 'O','O','O').
     *
     * @param c     char to check ('X' or 'O')
     * @param array the array representing the row (should have 3 elements).
     * @return <code>true</code> if row is full of same character, <code>false</code> otherwise.
     */
    private static boolean checkRows(char c, char... array) {
        for (int i = 0; i < 9; i += 3) {
            if (hasWon(c, array[i], array[i + 1], array[i + 2])) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasWon(char c, char... array) {
        return (c * 3) == array[0] + array[1] + array[2];
    }
}
