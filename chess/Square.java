package chess;

//This class requires your input
public class Square {
	private boolean hasPiece;
	private Piece p;

	public boolean hasPiece(){
		if(p!=null)
			hasPiece=true;
		else
			hasPiece=false;

		return hasPiece;
	}

	public  void setPiece(Piece pIn){
		p = pIn;
	}

	public Piece getPiece(){
		return p;
	}

	public void removePiece(){
		p = null;
	}
}
