package chess;

public class CheckInput {
	
	//This method requires your input
	public static boolean checkCoordinateValidity(String input){
		if(input.length()!=2)//if the input is not 2 chars then false
			return false;
		else
		{
			char[] checker = new char[2];//get the input
			checker[0]=input.charAt(0);
			checker[1]=input.charAt(1);
			int a = Character.getNumericValue(checker[0]);
				if((a <= 8 && a >= 1)&&(checker[1] >= 'a' && checker[1] <= 'h'))//check to see if it is valid
					return true;
				else
					return false;
		}
	}
}
