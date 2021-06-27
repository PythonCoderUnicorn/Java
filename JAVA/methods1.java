import java.util.Scanner;

public class methods1
{
	static double myPI = 3.14159; // Class variable
	
	public static void main(String[] args)
	{
		addThem(1,2);
		System.out.println(" Global " + myPI);
	}
	
	public static int addThem(int a, int b)
	{
		double smallPI = 3.140; // local var
		double myPI = 3.0;
		System.out.println(" local " + myPI);
		return 1;
	}



}
