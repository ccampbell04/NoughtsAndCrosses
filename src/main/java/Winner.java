public class Winner {
    private boolean XWinner = false;
    private boolean OWinner = false;

    public boolean checkWin(String[][] twoDLocations) {
        boolean GameWon = false;
        //Check if middle square is populated
        if(twoDLocations[1][1].equals("O")) {
            NoXMiddle(twoDLocations);
            OMiddle(twoDLocations);
        } else if(twoDLocations[1][1].equals("X")) {
            NoOMiddle(twoDLocations);
            XMiddle(twoDLocations);
        } else {
            noMiddle(twoDLocations);
        }

        if (XWinner || OWinner) {
            GameWon = true;
        }

        return GameWon;
    }

    public void NoXMiddle(String[][] twoDLocations) {
        //Possible winning combos:
        //X | X | X
        //X |   | X
        //X | X | X
        //Check if X has won
        //Determine if X is in the top left
        if(twoDLocations[0][0].equals("X")) {
            //Checks for possible wins
            if(twoDLocations[0][1].equals("X")) {
                //Check for 3 in a row on top
                if(twoDLocations[0][2].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }else if(twoDLocations[1][0].equals("X")) {
                //Check for 3 in a row on left-hand side
                if(twoDLocations[2][0].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }
            //This next if checks the bottom and right
        } else if(twoDLocations[2][2].equals("X")) {
            //Checks for possible wins
            if(twoDLocations[2][1].equals("X")) {
                //Check for 3 in a row on the bottom
                if(twoDLocations[2][0].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }else if(twoDLocations[1][2].equals("X")) {
                //Check for 3 in a row on the right
                if(twoDLocations[0][2].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }
        }
    }

    public void XMiddle(String[][] twoDLocations) {
        NoXMiddle(twoDLocations);

        if(!XWinner) {
            //Check diagonals
            if(twoDLocations[0][0].equals("X")) {
                if(twoDLocations[2][2].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            } else if(twoDLocations[0][2].equals("X")) {
                if(twoDLocations[2][0].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }

            //Check vertical and horizontal
            if(twoDLocations[0][1].equals("X")) {
                if(twoDLocations[2][1].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            } else if(twoDLocations[1][0].equals("X")) {
                if(twoDLocations[1][2].equals("X")) {
                    XWinner = true;
                    System.out.println(XWinMessage());
                }
            }
        }
    }

    public void NoOMiddle(String[][] twoDLocations) {
        //Check if O has won
        //This first if checks the top and left
        //Determine if O is in the top left
        if(twoDLocations[0][0].equals("O")) {
            //Checks for possible wins
            if(twoDLocations[0][1].equals("O")) {
                //Check for 3 in a row on top
                if(twoDLocations[0][2].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            }else if(twoDLocations[1][0].equals("O")) {
                //Check for 3 in a row on left-hand side
                if(twoDLocations[2][0].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            }
            //This next if checks the bottom and right
        } else if(twoDLocations[2][2].equals("O")) {
            //Checks for possible wins
            if(twoDLocations[2][1].equals("O")) {
                //Check for 3 in a row on the bottom
                if(twoDLocations[2][0].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            }else if(twoDLocations[1][2].equals("O")) {
                //Check for 3 in a row on the right
                if(twoDLocations[0][2].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            }
        }
    }

    public void OMiddle(String[][] twoDLocations) {
        NoOMiddle(twoDLocations);

        if(!OWinner) {
            //Check diagonals
            if(twoDLocations[0][0].equals("O")) {
                if(twoDLocations[2][2].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            } else if(twoDLocations[0][2].equals("O")) {
                if (twoDLocations[2][0].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
                //Check vertical and horizontal
            } else if(twoDLocations[0][1].equals("O")) {
                if(twoDLocations[2][1].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            } else if(twoDLocations[1][0].equals("O")) {
                if(twoDLocations[1][2].equals("O")) {
                    OWinner = true;
                    System.out.println(OWinMessage());
                }
            }
        }
    }

    public void noMiddle(String[][] twoDLocations) {
        NoOMiddle(twoDLocations);
        NoXMiddle(twoDLocations);
    }

    public String XWinMessage() {
        String message = "Player X wins";
        return message;
    }
    public String OWinMessage() {
        String message = "Player O wins";
        return message;
    }
}
