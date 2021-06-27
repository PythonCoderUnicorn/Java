public class java4
{
	public static void main(String[] args)
	{
		int randomNum = (int) (Math.random() *50);
		
		if (randomNum <= 25)
		{
			System.out.println(" The random number is <= 25 ");
		}
		else if (randomNum != 26)
		{	
			System.out.println(" random number is != 26 ");
		}
		else if (randomNum >40)
		{	
			System.out.println(" random number is > 40");
		}
		else if (randomNum == 55)
		{	
			System.out.println(" random number is = 55!! ");
		}
		else
		{
			System.out.println(" nothing worked ");
		}
		
		System.out.println(" random number is " + randomNum);
		
		//------- logical operators
		if (!(false))
		{
			System.out.println("\n I turned false into true");
		}
		if ((true) & (true))
		{
			System.out.println(" true & true ");
		}
	}





}
