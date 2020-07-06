import java.util.ArrayList;

class TicTacToeBoard
{
  ArrayList<Integer> R0;
  ArrayList<Integer> R1;
  ArrayList<Integer> R2;

  ArrayList<String> playerCharacters;

  public void init()
  {
    R0 = new ArrayList<Integer>();
    R0.add(0);
    R0.add(0);
    R0.add(0);
    R1 = new ArrayList<Integer>();
    R1.add(0);
    R1.add(0);
    R1.add(0);
    R2 = new ArrayList<Integer>();
    R2.add(0);
    R2.add(0);
    R2.add(0);

    playerCharacters = new ArrayList<String>();
    playerCharacters.add(" ");
    playerCharacters.add("X");
    playerCharacters.add("O");

    // R0.get(index);
    // R0.set(index, value);
    // R0.remove(index);
    // R0.clear();
    // R0.size();
  }
  public void print()
  {
    System.out.println("");
    System.out.println(" " + playerCharacters.get(R0.get(0)) + " | " + playerCharacters.get(R0.get(1)) + " | " + playerCharacters.get(R0.get(2)) + " ");
    System.out.println("-----------");
    System.out.println(" " + playerCharacters.get(R1.get(0)) + " | " + playerCharacters.get(R1.get(1)) + " | " + playerCharacters.get(R1.get(2)) + " ");
    System.out.println("-----------");
    System.out.println(" " + playerCharacters.get(R2.get(0)) + " | " + playerCharacters.get(R2.get(1)) + " | " + playerCharacters.get(R2.get(2)) + " ");
    System.out.println("");
  }

  private boolean checkRowWinner(ArrayList<Integer> Row)
  {
    for (Integer row : Row) {
      if (row == 0) {
        return false;
      }
    }

    if (Row.get(0) == Row.get(1)) {
      if (Row.get(1) == Row.get(2)) {
        return true;
      }
    }
    return false;
  }
  private boolean checkColumnWinner(Integer column)
  {
    Integer value0 = R0.get(column);
    Integer value1 = R1.get(column);
    Integer value2 = R2.get(column);

    if ((value0 == 0) || (value1 == 0) || (value2 == 0)) {
      return false;
    }

    if (value0 == value1) {
      if (value1 == value2) {
        return true;
      }
    }
    return false;
  }
  public boolean checkWinner()
  {
    /*
      R0: 0 1 2
      R1: 0 1 2
      R2: 0 1 2

      check any rows: R0: 0 1 2 / R1: 0 1 2 / R2: 0 1 2
      check columns: R0-2: 0 0 0 / 1 1 1 / 2 2 2
      check diagonals: R0-2: 0 1 2 / R2-0: 0 1 2
    */

    boolean winner = checkRowWinner(R0);
    winner |= checkRowWinner(R1);
    winner |= checkRowWinner(R2);

    winner |= checkColumnWinner(0);
    winner |= checkColumnWinner(1);
    winner |= checkColumnWinner(2);
    return winner;
  }

  private void updateCell(ArrayList<Integer> rowList, int column, int value)
  {
    if (rowList.get(column) == 0) {
      rowList.set(column, value);
    }
  }
  public void updateBoard(int row, int column, int value)
  {
    if (row == 0) {
      updateCell(R0, column, value);
    }
    else if (row == 1) {
      updateCell(R1, column, value);
    }
    else if (row == 2) {
      updateCell(R2, column, value);
    }
    else {
      System.out.println("picked a row not in board");
    }
  }
};
