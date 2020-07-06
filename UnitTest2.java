class UnitTest2 extends UnitTestTemplate
{
  // winner: player 1
  // win tactic: row middle
  public TicTacToeCell run(int turn)
  {
    if (turn == 0) {
      return new TicTacToeCell(0, 0, 1);
    }
    else if (turn == 1) {
      return new TicTacToeCell(1, 0, 2);
    }
    else if (turn == 2) {
      return new TicTacToeCell(0, 1, 1);
    }
    else if (turn == 3) {
      return new TicTacToeCell(1, 1, 2);
    }
    else if (turn == 4) {
      return new TicTacToeCell(2, 2, 1);
    }
    else if (turn == 5) {
      return new TicTacToeCell(1, 2, 2);
    }
    else {
      System.out.println("TicTacToeCell: Too many turns");
      return new TicTacToeCell(0, 0, 0);
    }
  }
}
