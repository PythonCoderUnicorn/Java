import java.util.Scanner;

public class java3
{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print(" your favorite number: ");
		
		if (userInput.hasNextInt())
		{
			//.hasNextDouble
			//.hasNextFloat
			int numEntered = userInput.nextInt();
			//nextDouble()
			//nextFloat()
			//nextLine()
			System.out.println(" you entered " + numEntered);
			
			int numEnteredTimes2 = numEntered + numEntered;
			System.out.println(numEntered + " + " + numEntered + " = " + numEnteredTimes2);
			
			int numAbs = Math.abs(numEntered);
			int whichISbigger = Math.max(5,7);
			double numSqrt = Math.sqrt(5.23);
			int numCeiling = (int) Math.ceil(5.23);
			int numFloor = (int) Math.floor(5.23);
			int numRound = (int) Math.round(5.23);
			System.out.println(numAbs);
			System.out.println(whichISbigger);
			System.out.println(numSqrt);
			System.out.println(numCeiling);
			System.out.println(numFloor);
			System.out.println(numRound);
			
			int randomNum = (int) (Math.random() * 11);
			System.out.println(" - - - Random Number " + randomNum);
		} 
		else 
		{
		System.out.println("enter an integer next time");
		}
		
	}

}
