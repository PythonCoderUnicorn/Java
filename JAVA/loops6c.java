import java.util.Scanner;

public class loops6c
{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String cont_YorN = "Y";
		
		int h = 1;
		while(cont_YorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.println("Continue Y or N ?");
			cont_YorN = userInput.nextLine();
			h++;
		}
		
	
	}

}
