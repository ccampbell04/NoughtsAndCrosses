public class UpdateSelection {
    public static final String X = "X";
    public static final String O = "O";
    String currentPlayer;

    public void playerSelection(String[][] twoDLocations, int playerInput, String whichPlayer) {
        if (whichPlayer.equals(X)) {
            currentPlayer = X;
        } else if (whichPlayer.equals(O)) {
            currentPlayer = O;
        }

        switch(playerInput) {
            case 1: twoDLocations[0][0] = currentPlayer;
                break;
            case 2: twoDLocations[0][1] = currentPlayer;
                break;
            case 3: twoDLocations[0][2] = currentPlayer;
                break;
            case 4: twoDLocations[1][0] = currentPlayer;
                break;
            case 5: twoDLocations[1][1] = currentPlayer;
                break;
            case 6: twoDLocations[1][2] = currentPlayer;
                break;
            case 7: twoDLocations[2][0] = currentPlayer;
                break;
            case 8: twoDLocations[2][1] = currentPlayer;
                break;
            case 9: twoDLocations[2][2] = currentPlayer;
                break;
        }
    }
}
