import java.util.Scanner;

public class methods3
{
	static int randomNumber;  // Class variable
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println(" -- " +getRandomNum());
		int guessResult =1;
		int randomGuess =0;
		
		while(guessResult !=-1)
		{
			System.out.println(" Guess a number between 0 and 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println(" yes the random # is: " + randomGuess);
	}
	
	public static int getRandomNum()
	{
		randomNumber = (int) (Math.random()*51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if(guess ==randomNumber)
		{ return -1; }
		else
		{ return guess; }
	}
	



}
