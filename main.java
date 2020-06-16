class Main
{
  public static void main(String[] strings)
  {
    System.out.println("main");

    TicTacToe tic = new TicTacToe();
    tic.run();
  }
}

abstract class GameTemplate
{
  public abstract void startGame();
  public abstract void takeTurn();
  public abstract void endGame();

  public void run()
  {
    startGame();

    takeTurn();

    endGame();
  }
}

class TicTacToe extends GameTemplate
{
  public void startGame()
  {
    System.out.println("Tic Start Game");
  }
  public void takeTurn()
  {
    System.out.println("Tac Take Turn");
  }
  public void endGame()
  {
    System.out.println("Toe End Game");
  }
}
