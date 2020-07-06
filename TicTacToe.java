class TicTacToe extends GameTemplate
{
  public void startGame()
  {
    System.out.println("Tic Start Game");
    System.out.println("Num Players: " + numPlayers);
    System.out.println("Max Num Turns: " + maxNumTurns);
    System.out.println("");

    board = new TicTacToeBoard();
    board.init();
  }
  public void takeTurn()
  {
    int turn = 0;
    UnitTest userInput = new UnitTest();
    while (turn < maxNumTurns) {

      System.out.println("Tac Take Turn: " + turn);

      TicTacToeCell cell = userInput.test1(turn);
      board.updateBoard(cell.row, cell.column, cell.value);

      printBoard();

      boolean winner = checkWinner();
      if (winner) {
        printWinner();
        break;
      }

      turn++;
      currentPlayer ^= 1;
    }
  }
  public void endGame()
  {
    System.out.println("Toe End Game");
  }

  private boolean checkWinner()
  {
    return board.checkWinner();
  }
  private void printWinner()
  {
    System.out.println("Player " + currentPlayer + " WON!");
  }
  public void printBoard()
  {
    System.out.println("Current board...");
    board.print();
  }

  int numPlayers = 2;
  int maxNumTurns = 9;
  int currentPlayer = 0;
  TicTacToeBoard board;
}
