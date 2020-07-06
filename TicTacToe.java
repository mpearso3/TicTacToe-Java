import java.util.ArrayList;

class TicTacToe extends GameTemplate
{
  public void startGame()
  {
    System.out.println("Tic Start Game");
    System.out.println("Num Players: " + numPlayers);
    System.out.println("Max Num Turns: " + maxNumTurns);
    System.out.println("");
  }
  public void takeTurn()
  {
    ArrayList<UnitTestTemplate> tests = new ArrayList<UnitTestTemplate>();
    tests.add(new UnitTest1());
    tests.add(new UnitTest2());
    tests.add(new UnitTest3());
    tests.add(new UnitTest4());
    tests.add(new UnitTest5());
    tests.add(new UnitTest6());
    tests.add(new UnitTest7());
    tests.add(new UnitTest8());

    int testIndex = 0;
    for (UnitTestTemplate test : tests) {

      System.out.println("---------------------------------------------");
      System.out.println("STARTING TEST " + testIndex);

      board = new TicTacToeBoard();
      board.init();
      currentPlayer = 0;

      int turn = 0;
      while (turn < maxNumTurns) {

        System.out.println("Tac Take Turn: " + turn);

        TicTacToeCell cell = test.run(turn);
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
      System.out.println("");
      System.out.println("END TEST " + testIndex);
      System.out.println("---------------------------------------------");
      testIndex++;
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
