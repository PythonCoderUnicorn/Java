import java.util.Scanner;

public class methods2
{
	static double myPI = 3.14159; // Class variable
	
	public static void main(String[] args)
	{
		//System.out.println(addThem(1,2));
		int d = 5;
		try2Change(d);
		System.out.println(" main d= " +d);
		
	}
	
	public static void try2Change(int d)
	{
		d = d+1; 	// this d become a new d because its in own method
		System.out.println(" try2Change d= " +d);
	}
	/*
	public static int addThem(int a, int b)
	{
		int c = a+b;
		return c;
	} */



}
