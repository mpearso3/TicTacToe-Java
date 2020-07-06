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
