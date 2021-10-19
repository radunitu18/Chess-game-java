package chess;

public class King extends Piece {

    public King(PieceColour p){
      if(p == PieceColour.WHITE)
        {
          colour = PieceColour.WHITE;
        setSymbol("♔");
        }
      else
      {
        colour = PieceColour.BLACK;
        setSymbol("♚");
      }
    }

    
    public boolean isLegitMove(int i1, int j1, int i2, int j2)
    {
      boolean ok = false;

      if(i1==i2+1 && Board.hasPiece(i2,j2))
      {
        if(j1==j2+1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;

        if(j1==j2-1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;

        if(j1==j2 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;
      }
      else
      if(i1==i2-1 && Board.hasPiece(i2,j2))
      {
        if(j1==j2+1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;

        if(j1==j2-1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;

        if(j1==j2 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;
      }
      else
      if(i1==i2 && Board.hasPiece(i2,j2))
      {
        if(j1==j2+1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;

        if(j1==j2-1 && Board.getPiece(i2,j2).getColour() != this.getColour())
          ok = true;
      }



      if(i1==i2+1 && !Board.hasPiece(i2,j2))
      {
        if(j1==j2+1)
          ok = true;

        if(j1==j2-1)
          ok = true;

        if(j1==j2)
          ok = true;
      }
      else
      if(i1==i2-1 && !Board.hasPiece(i2,j2))
      {
        if(j1==j2+1)
          ok = true;

        if(j1==j2-1)
          ok = true;

        if(j1==j2)
          ok = true;
      }
      else
      if(i1==i2 && !Board.hasPiece(i2,j2))
      {
        if(j1==j2+1)
          ok = true;

        if(j1==j2-1)
          ok = true;
      }

      return ok;
      
    }
}