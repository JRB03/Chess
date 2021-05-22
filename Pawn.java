/**
a pawn
@author Jack Basinet
@version 5.22.21
*/
public class Pawn extends ChessPeice
{

  //constuctor
  public Pawn(Position p, boolean c,gameBoard g)
  {
    super(p,c,g);
    this.update();
    if(color) { moves.add(pos.up(2)); }
    else { moves.add(pos.down(2)); }
  }

  //updates moves
  @Override
  public void update()
  {
    if(color) { moves = {pos.up(1),pos.left(1).up(1),pos.right(1).up(1)}; }
    else { moves = {pos.down(1),pos.left(1).down(1),pos.right(1).down(1)}; }

    moves.get(1).pwnAtk = true;
    moves.get(2).pwnAtk = true;

    for(Position move: moves)
    {
      ChessPeice peiceAhead = game.getPeice(move);
      if(move.pwnAtk && (peiceAhead instanceof Empty && peiceAhead.enPassant) || peiceAhead.color != color) { moves.remove(move); }
      else if(peiceAhead instanceof Empty) { moves.remove(move); }
    }
  }
}
