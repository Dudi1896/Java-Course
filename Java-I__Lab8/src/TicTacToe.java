import java.util.Scanner;

public class TicTacToe {
    final private static char[][] gameArray = new char[3][3];
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printGame(gameArray);

            makeAmove(gameArray, 'X' );
            printGame(gameArray);
            if (checkForWin(gameArray,'X')) {
                System.out.println("X player won");
                systemRestart();
            } else if(checkForDraw(gameArray)) {
                System.out.println(("Its a draw"));
                systemRestart();
            }

            makeAmove(gameArray, 'O' );
            printGame(gameArray);
            if (checkForWin(gameArray,'O')) {
                System.out.println("O player won");
                systemRestart();
            } else if(checkForDraw(gameArray)) {
                System.out.println(("Its a draw"));
                systemRestart();
            }
        }
    }

    //Print initial game board to display
    public static void printGame(char[][] array) {
        for(int row=0; row<3; row++){
            System.out.print( "| ");
            for (int column=0; column<3; column++){
                System.out.print(array[row][column] != '\u0000' ?  array[row][column] + " | ": "  |");
            }
            System.out.println("\n-------------");
        }
        System.out.println();
    }

    public static void makeAmove(char[][] array, char player){
        boolean done = false;

        do{
            System.out.print("Enter a row for player" + player + ": ");
            int row = userInput.nextInt();

            System.out.print("Enter a column for player" + player + ": ");
            int column = userInput.nextInt();

            if(array[row][column]== '\u0000') {
                array[row][column] = player;
                done = true;
            }
            else
                System.out.println("This cell is already occupied. Try a different cell");
        }
        while (!done);

    }

    public static boolean checkForWin(char[][] arrayIndex, char ch){
        //Iterate through rows to check for a win
        for (int i=0; i<3; i++)
            if (ch == arrayIndex[i][0] && ch == arrayIndex[i][1] && ch == arrayIndex[i][2]) return true;

        //Iterate through columns to check for a win
        for (int i=0; i<3; i++)
            if (ch == arrayIndex[0][i] && ch == arrayIndex[1][i] && ch == arrayIndex[2][i]) return true;

        //Iterate through to check for diagonal win
        if (ch == arrayIndex[0][0] && ch == arrayIndex[1][1] && ch == arrayIndex[2][2]) return true;

        //Iterate through to check for diagonal win
        if (ch == arrayIndex[0][2] && ch == arrayIndex[1][1] && ch == arrayIndex[2][0]) return true;

        return false; //by default the method is false because no win has been determined.
    }

    public static boolean checkForDraw(char[][] array) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (array[i][j] == '\u0000') return false;

        return true; // All cells are now occupied
    }

    public static void systemRestart() {
        System.out.print("\nWould you like to Try again? (Y/N): ");

        if (!(userInput.hasNext("y")) )
            System.exit(0);
    }
}