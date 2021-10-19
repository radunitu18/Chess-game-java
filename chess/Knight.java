package chess;

public class Knight extends Piece {

    public Knight(PieceColour p){
      if(p == PieceColour.WHITE)
      {
        colour = PieceColour.WHITE;
        setSymbol("♘");
      }
      else
      {
        colour = PieceColour.BLACK;
        setSymbol("♞");
      }
    }

    
    public boolean isLegitMove(int i1, int j1, int i2, int j2)
    {
       boolean ok = false;
      if((i1 == i2+2 && j1 == j2+1 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2+2 && j1 == j2+1 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2+2 && j1 == j2-1 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2+2 && j1 == j2-11 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2-2 && j1 == j2+1 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2-2 && j1 == j2+1 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2-2 && j1 == j2-1 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2-2 && j1 == j2-1 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2+1 && j1 == j2-2 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2+1 && j1 == j2-2 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2+1 && j1 == j2+2 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2+1 && j1 == j2+2 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2-1 && j1 == j2-2 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2-1 && j1 == j2-2 && !Board.hasPiece(i2,j2)))
        ok = true;
      else
      if((i1 == i2-1 && j1 == j2+2 && Board.hasPiece(i2,j2) && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())||(i1 == i2-1 && j1 == j2+2 && !Board.hasPiece(i2,j2)))
        ok = true;

      return ok;
    }


} 


