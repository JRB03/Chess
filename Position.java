/**
A position
@author Jack Basinet
@version 5.22.21
*/
public class Position
{
  public char file;

  public int rank;

  public boolean pwnAtk;

  private Position(char f, int r)
  {
    file = f;
    rank = r;

    pwnAtk = false;
    enPassant = false;
  }

  //for movement
  private Position up(int x) { if(rank < 8-(x-1)) { return new Position(rank+x,file); } else { return null; } }
  private Position down(int x) { if(rank > 1+(x-1)) { return new Position(rank-x,file); } else { return null; } }
  private Position left(int x) { if(file > 'a'+(x-1)) { return new Position(rank,file-x); } else { return null; } }
  private Position right(int x) { if(file < 'h'-(x-1)) { return new Position(rank,file+x); } else { return null; } }

}
