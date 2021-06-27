import java.util.Arrays;

public class arrays
{
	public static void main(String[] args)
	{
	// index number
	int[] randomArray;
	int[] numberArray = new int[10]; // the size of the array
	
	randomArray = new int[20];
	randomArray[1] =2;
	String[] stringArray ={"just","random","words"};
	
	
	for(int i =0; i<numberArray.length; i++)
	{	
		numberArray[i] = i; 
	}
	
	int k =1;
	while(k <= 41){	System.out.println('-'); k++;	}
	System.out.println();
	
	
	for(int x=0; x < numberArray.length; x++)
	{	
		System.out.println("| "+ x +" "); 
	}
	System.out.println("|");
	
	k =1;
	while(k <=41) {System.out.println('-'); k++; }
	System.out.println();
	
	// multi dimesnional array
	String[][] multiArray = new String[10][10];
	for(int i=0; i <multiArray.length; i++)
	{ 
		for(int j=0; j <multiArray[i].length; j++)
		{
			multiArray[i][j] = i + " "+j;
		}
	}
	
	k =1;
	while(k <= 61) {System.out.println('-'); k++; }
	System.out.println();
	
	for(int i=0; i < multiArray.length; i++)
	{ 
		for(int j=0; j <multiArray[i].length; j++)
		{
			System.out.println("|" + multiArray[i][j] +" ");
		}
		System.out.println("|");
	}
	
	k =1;
	while(k <= 61) {System.out.println('-'); k++; }
	System.out.println();
	
	for(int i=0; i < multiArray.length; i++)
	{ 
		for(int j=0; j <multiArray[i].length; j++)
		{
			System.out.println("|" + multiArray[i][j] +" ");
		}
		System.out.println("|");
	}
	
	for(int row : numberArray)
	{ System.out.println(row); }
	System.out.println("\n");
	
	}
}
