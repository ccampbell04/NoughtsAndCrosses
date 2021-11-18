import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Grid grid = new Grid();
        UpdateSelection selection = new UpdateSelection();
        Winner win = new Winner();
        Scanner scan = new Scanner(System.in);

        String playerX = "X";
        String playerO = "O";
        int numTurns = 0;
        boolean gameWon = false;

        String[][] twoDLocations = {{"1","2","3"},
                {"4","5","6"}, {"7","8","9"}};

        while (numTurns<10){
            //Player X
            grid.displayGrid(twoDLocations);
            System.out.println("Player X turn: ");
            //Receive input
            int playerXInput = scan.nextInt();
            numTurns++;
            //Place selection on grid
            selection.playerSelection(twoDLocations, playerXInput, playerX);
            //Check if player has won
            gameWon = win.checkWin(twoDLocations);
            if (gameWon || numTurns>=9 ) {
                break;
            }
            //Player O
            grid.displayGrid(twoDLocations);
            System.out.println("Player O turn: ");
            //Receive input
            int playerOInput = scan.nextInt();
            numTurns++;
            //Place selection on grid
            selection.playerSelection(twoDLocations, playerOInput, playerO);
            //Check if player has won
            gameWon = win.checkWin(twoDLocations);
            if (gameWon || numTurns>=9 ) {
                break;
            }
            grid.displayGrid(twoDLocations);
            System.out.println("\n");
        }

        grid.displayGrid(twoDLocations);

        if(numTurns == 9 && !gameWon) {
            System.out.println("Draw!");
        }
    }
}