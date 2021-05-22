/**
A Chess ChessPeice
@author Jack Basinet
@version 5.22.21
*/
public class ChessPeice()
{
  public boolean color;

  public Position pos;

  public ArrayList<Position> moves;

  private gameBoard game;

  // constructor
  public ChessPeice(Position p,boolean c,gameBoard g)
  {
    color = c;
    pos = p;
    moves = new ArrayList<Position>();
    game = g;

  }

  /**
  Moves the peice
  @param l the file of the moves
  @param n the rank of the moves
  @return whether the move is legal
  */
  public boolean move(char f,int r)
  {
    Position mpos = new Position(f,r);
    if(legalMove(mpos))
    {
      pos = mpos;
      this.update();
      return true;
    }
    return false;
  }

  //updates peice for moves
  public void update() {};

  /**
  checks if a move is legal
  @param mpos the moves position
  @return whether the move is legal
  */
  public boolean legalMove(Position mpos)
  {
    int r = mpos.rank;
    char f = mpos.file;
    for(Position m: moves)
    {
      if(m.rank == r && m.file == f) {return true}
    }
    return false;
  }
}
