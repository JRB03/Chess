/**
empty square
@author Jack Basinet
@version 5.22.21
*/
public class Empty extends ChessPeice
{
  public boolean enPassant;

  public Empty(boolean ep)
  {
    enPassant = ep;
  }

  @Override
  public void update()
  {
    enPassant = false;
  }
}
