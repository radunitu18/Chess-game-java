package chess;
import java.io.Console;
public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play(){
		while (!gameEnd){
			Console keyboard = System.console();
			boolean whiteMove = true;
			Piece p;
			if(whiteMove)
			{
				System.out.println("------ White move ------");//get the input and check validity for white move
				String origin = keyboard.readLine("Enter origin: ");
				if(origin.equals("END"))
				{
					System.out.println("Black wins!");
					break;
				}
				else
				if( CheckInput.checkCoordinateValidity(origin) == false)
					{
						System.out.println("You have entered a wrong move. Try again!");
						while(!CheckInput.checkCoordinateValidity(origin))
						origin = keyboard.readLine("Enter origin: ");

					}
				String destination = keyboard.readLine("Enter destination:");
				if( CheckInput.checkCoordinateValidity(destination) == false)
					{
						System.out.println("You have entered a wrong move. Try again!");
						while(!CheckInput.checkCoordinateValidity(destination))
						destination = keyboard.readLine("Enter destination: ");
					}

					int i1,i2,j1,j2;//get the coordinates and transform them into ints
					i1 = (int) origin.charAt(0);
			        j1 = (int) origin.charAt(1);
			        i1-=49;
			        j1-=97;
			        i2 = (int) destination.charAt(0);
			        j2 = (int) destination.charAt(1);
			        i2-=49;
			        j2-=97;
			        p = Board.getPiece(i1,j1);
			        if(p.isLegitMove(i1,j1,i2,j2))//check if the move is valid
			        	gameEnd=Board.movePiece(i1,j1,i2,j2,p);//check to see if the king has been captured, if so end the game



			        Board.printBoard();//reprint the board

				whiteMove = false;//end turn
			}
			if(gameEnd)
				{
					System.out.println("White is the winner!");
					break;
				}
			if(!whiteMove)
			{
				System.out.println("------ Black move ------");//get the input and check validity for black move
				String origin = keyboard.readLine("Enter origin: ");
				if(origin.equals("END"))
					{
						System.out.println("White wins!");
						break;
					}
				else
				if( CheckInput.checkCoordinateValidity(origin) == false)
					{
						System.out.println("You have entered a wrong move. Try again!");
						while(!CheckInput.checkCoordinateValidity(origin))
						origin = keyboard.readLine("Enter origin: ");

					}
				String destination = keyboard.readLine("Enter destination:");
				if( CheckInput.checkCoordinateValidity(destination) == false)
					{
						System.out.println("You have entered a wrong move. Try again!");
						while(!CheckInput.checkCoordinateValidity(destination))
						destination = keyboard.readLine("Enter destination: ");
					}

					int i1,i2,j1,j2;//get the coordinates and transform them into ints
					i1 = (int) origin.charAt(0);
			        j1 = (int) origin.charAt(1);
			        i1-=49;
			        j1-=97;
			        i2 = (int) destination.charAt(0);
			        j2 = (int) destination.charAt(1);
			        i2-=49;
			        j2-=97;
			        p = Board.getPiece(i1,j1);
			        if(p.isLegitMove(i1,j1,i2,j2))//check if the move is valid
			        	gameEnd=Board.movePiece(i1,j1,i2,j2,p);//check to see if the king has been captured, if so end the game

			        Board.printBoard();//reprint the board

				whiteMove = true;//end turn
			}
			if(gameEnd)
			{
				System.out.println("Black is the winner!");
				break;
			}
		}
	}

	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
