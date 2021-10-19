package chess;

public class Rook extends Piece{

    public Rook(PieceColour p){
      if(p == PieceColour.WHITE)
        {
        setSymbol("♖");
        colour = PieceColour.WHITE;
        }
      else
      {
        colour = PieceColour.BLACK;
        setSymbol("♜");
      }
    }
    
    public boolean isLegitMove(int i1, int j1, int i2, int j2)
    {
      boolean ok = false;
      if((i1==i2 || j1==j2) && !(i1==i2 && j1==j2))
      {
        ok = true;
      }
      if(i1==i2)
      {
        while(j1<j2)
        {
          j1++;
          if(Board.hasPiece(i1,j1) && j1 != j2)
          {
            ok = false;
            break;
          }
          else
            if(Board.hasPiece(i1,j1) && j1 == j2 && Board.getPiece(i1,j1).getColour() != this.getColour())
              ok = true;
            else
              if(Board.hasPiece(i1,j1) && j1 == j2 && Board.getPiece(i1,j1).getColour() == this.getColour())
                ok = false;
        }

        while(j2<j1)
        {
          j1--;
          if(Board.hasPiece(i1,j1) && j1 != j2)
          {
            ok = false;
            break;
          }
          else
            if(Board.hasPiece(i1,j1) && j1 == j2 && Board.getPiece(i1,j1).getColour() != this.getColour())
              ok = true;
            else
              if(Board.hasPiece(i1,j1) && j1 == j2 && Board.getPiece(i1,j1).getColour() == this.getColour())
                ok = false;
        } 
      }
      else
        if(j1 == j2)
        {
          while(i1<i2)
          {
            i1++;
            if(Board.hasPiece(i1,j1) && i1 != i2)
            {
              ok = false;
              break;
            }
            else
              if(Board.hasPiece(i1,j1) && i1 == i2 && Board.getPiece(i1,j1).getColour() != this.getColour())
                ok = true;
              else
                if(Board.hasPiece(i1,j1) && i1 == i2 && Board.getPiece(i1,j1).getColour() == this.getColour())
                  ok = false;
          }

          while(i1>i2)
          {
            i1--;
            if(Board.hasPiece(i1,j1) && i1 != i2)
            {
              ok = false;
              break;
            }
            else
              if(Board.hasPiece(i1,j1) && i1 == i2 && Board.getPiece(i1,j1).getColour() != this.getColour())
                ok = true;
              else
                if(Board.hasPiece(i1,j1) && i1 == i2 && Board.getPiece(i1,j1).getColour() == this.getColour())
                  ok = false;
          }


        }

      return ok;

    }
}
