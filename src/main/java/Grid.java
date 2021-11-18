public class Grid {
    public void displayGrid(String[][] twoDLocations) {
        //Row 1
        System.out.print(" " + twoDLocations[0][0] + " |");
        System.out.print(" " + twoDLocations[0][1] + " |");
        System.out.print(" " + twoDLocations[0][2] + " \n");
        System.out.println("-----------");
        //Row 2
        System.out.print(" " + twoDLocations[1][0] + " |");
        System.out.print(" " + twoDLocations[1][1] + " |");
        System.out.print(" " + twoDLocations[1][2] + " \n");
        System.out.println("-----------");
        //Row 3
        System.out.print(" " + twoDLocations[2][0] + " |");
        System.out.print(" " + twoDLocations[2][1] + " |");
        System.out.print(" " + twoDLocations[2][2] + " \n");
    }
}
