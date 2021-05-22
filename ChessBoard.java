import java.io.*

/**
The Chess Board
@author Jack Basinet
@version 5.22.21
*/
public class ChessBoard
{
  public static final int FILES = 8;
  public static final int RANKS = 8;

  public static final int[] PEICE_VALUES = {1,3,3,5,9,infinity};

  public static final ArrayList<Position> START_POS = {new Position('a',0),new Position('b',0),
                                                    new Position('c',0),new Position('d',0),
                                                    new Position('e',0),new Position('f',0),
                                                    new Position('g',0),new Position('a',7),
                                                    new Position('b',7),new Position('c',7),
                                                    new Position('d',7),new Position('e',7),
                                                    new Position('f',7),new Position('g',7)};

  public static final int CICONVERT = 97;

  public ChessPeice[][] gameBoard;

  public int whiteScore;
  public int blackScore;

  public boolean checkBlack;
  public boolean checkWhite;

  public int moveCount;

  /**
  constuctor
  */
  public ChessBoard()
  {
    gameBoard = new ChessPeice[FILES][RANKS];
    for(ChessPeice[] f: gameBoard) { for(ChessPeice p: f) { p = new Empty(); } }

    whiteScore = 0;
    blackScore = 0;

    moveCount = 0;

    //set up pawns
    for(int p = 0; p < FILES; p++) { gameBoard[p][1] = new Pawn(new Position(makeCar(p),1),Chess.WHITE,this); }
    for(int p = 0; p < FILES; p++) { gameBoard[p][1] = new Pawn(new Position(makeCar(p),6),Chess.BLACK,this); }

    //set up white peices
    gameBoard[0][0] = new Rook(START_POS[0],Chess.WHITE,this);
    gameBoard[1][0] = new Knight(START_POS[1],Chess.WHITE,this);
    gameBoard[2][0] = new Bishop(START_POS[2],Chess.WHITE,this);
    gameBoard[3][0] = new Queen(START_POS[3],Chess.WHITE,this);
    gameBoard[4][0] = new King(START_POS[4],Chess.WHITE,this);
    gameBoard[5][0] = new Bishop(START_POS[5],Chess.WHITE,this);
    gameBoard[6][0] = new Knight(START_POS[6],Chess.WHITE,this);
    gameBoard[7][0] = new Rook(START_POS[7],Chess.WHITE,this);

    //set up black peices
    gameBoard[0][7] = new Rook(START_POS[0],Chess.BLACK,this);
    gameBoard[1][7] = new Knight(START_POS[1],Chess.BLACK,this);
    gameBoard[2][7] = new Bishop(START_POS[2],Chess.BLACK,this);
    gameBoard[3][7] = new Queen(START_POS[3],Chess.BLACK,this);
    gameBoard[4][7] = new King(START_POS[4],Chess.BLACK,this);
    gameBoard[5][7] = new Bishop(START_POS[5],Chess.BLACK,this);
    gameBoard[6][7] = new Knight(START_POS[6],Chess.BLACK,this);
    gameBoard[7][7] = new Rook(START_POS[7],Chess.BLACK,this);

  }

  /**
  Moves a peice
  @param color black or whiteScore
  @param move the move the player wants to make
  @return boolean whether a legal move
  */
  public boolean Move(boolean color, String move)
  {
    moveCount++;
    return false;
  }

  /**
  Gets the peice in some Position
  @param pos the positions
  @return ChessPeice the peice in that position
  */
  public ChessPeice getPeice(Position pos)
  {
    int f = makeInt(pos.file);
    int r = pos.rank;
    return gameBoard[f][r];
  }

  //between index and pos form
  private int makeInt(char c) { return (int)(c-CICONVERT); }
  private char makeChar(int i) { return (char)(i+CICONVERT); }

  /**
  Prints the board
  @return String the board, printable
  */
  public String toString()
  {
    return "";
  }
}
