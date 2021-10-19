package chess;

public class Pawn extends Piece {

    public Pawn(PieceColour p){
      if(p == PieceColour.WHITE)
      {
        colour = PieceColour.WHITE;
        setSymbol("♙");
      }
      else
      {
        colour = PieceColour.BLACK;
        setSymbol("♟︎");
      }
    }

    
    public boolean isLegitMove(int i1, int j1, int i2, int j2)
    {
      boolean ok = false;
      if(this.getSymbol().equals("♙"))
      {
        if(i1 == 6 && j1 == j2 && !Board.hasPiece(i2,j2))
        {
          if(i2 == i1-1 || i2 == i1-2)
            ok = true;
        }
        if(j1 == j2 && i2 == i1-1 && !Board.hasPiece(i2,j2))
          ok = true;
        if((i1 == i2+1 && j1 == j2+1 && Board.hasPiece(i2,j2)) || (i1 == i2+1 && j1 == j2-1 && Board.hasPiece(i2,j2)))
          ok = true;
      }
      else
       
      {
        if(i1 == 1 && j1 == j2 && !Board.hasPiece(i2,j2))
        {
          if(i2 == i1+1 || i2 == i1+2)
            ok = true;
        }
        if(j1 == j2 && i2 == i1+1 && !Board.hasPiece(i2,j2))
          ok = true;
        if((i1 == i2-1 && j1 == j2+1 && Board.hasPiece(i2,j2)) || (i1 == i2-1 && j1 == j2-1 && Board.hasPiece(i2,j2)))
          ok = true;
      }

      return ok;
    }
   
    

}