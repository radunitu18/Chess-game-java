package chess;

public class Bishop extends Piece {

    public Bishop(PieceColour p){
      if(p == PieceColour.WHITE)//set the symbol and the colour
        {
          setSymbol("♗");
          colour = PieceColour.WHITE;
        }
      else
      {
        setSymbol("♝");
        colour = PieceColour.BLACK;
      }
    }

    
    public boolean isLegitMove(int i1, int j1, int i2, int j2)
    {
      boolean ok = false;
      boolean hasMetPiece = false;
      int i3, j3;

      if(i1<i2 && j1 <j2) // if moving down to the right of the board
      {
        i3=i1;//use other variables for coordinates so we keep the origin of the piece
        j3=j1;
        while(i3!=i2 && j3!=j2)
        {
          j3++;//increment them untill they are equal to the destination (or not)
          i3++;
          if(Board.hasPiece(i3,j3) && i3!=i2 && j3!=j2)
                hasMetPiece = true;//check if any piece is in the way
        }
        
        if(i3 == i2 && j3 == j2 && hasMetPiece == false && !Board.hasPiece(i2,j2))//if there is no piece at the destination and there is no piece in the way
          ok = true;
        else
          if(i3 == i2 && j3 == j2 && hasMetPiece == false && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())// if there is no piece in the way and the piece at the destination is not the same colour
            ok = true;
        
      }


      if(i1<i2 && j1 >j2) // if moving down to the left of the board
      {
        i3=i1;//use other variables for coordinates so we keep the origin of the piece
        j3=j1;
        while(i3!=i2 && j3!=j2)
        {
          j3--;//increment them untill they are equal to the destination (or not)
          i3++;
      if(Board.hasPiece(i3,j3) && i3!=i2 && j3!=j2)
                hasMetPiece = true;
        }
         if(i3 == i2 && j3 == j2 && hasMetPiece == false && !Board.hasPiece(i2,j2))
          ok = true;
        else
          if(i3 == i2 && j3 == j2 && hasMetPiece == false && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())
            ok = true;
      }


      if(i1>i2 && j1 <j2)
      {
        i3=i1;
        j3=j1;
        while(i3!=i2 && j3!=j2)
        {
          j3++;
          i3--;
        if(Board.hasPiece(i3,j3) && i3!=i2 && j3!=j2)
                hasMetPiece = true;
        }
         if(i3 == i2 && j3 == j2 && hasMetPiece == false && !Board.hasPiece(i2,j2))
          ok = true;
        else
          if(i3 == i2 && j3 == j2 && hasMetPiece == false && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())
            ok = true;
          
      }


      if(i1>i2 && j1 >j2)
      {
        i3=i1;
        j3=j1;
        while(i3!=i2 && j3!=j2)
        {
          j3--;
          i3--;
        if(Board.hasPiece(i3,j3) && i3!=i2 && j3!=j2)
                hasMetPiece = true;
        }
         if(i3 == i2 && j3 == j2 && hasMetPiece == false && !Board.hasPiece(i2,j2))
          ok = true;
        else
          if(i3 == i2 && j3 == j2 && hasMetPiece == false && Board.getPiece(i2,j2).getColour() != Board.getPiece(i1,j1).getColour())
            ok = true;
      }

      return ok;

    }
}
