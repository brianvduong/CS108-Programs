import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
*  Program 4b
*  RandomArray class
*  CS108-1 
*  6/7/18
*  Brian Duong
*/
public class RandomArray 
{

	public static int[] createXArray(int x) throws ArrayIndexOutOfBoundsException
	{
	    if (x < 0)
	    {
	        throw new ArrayIndexOutOfBoundsException(); 
	    }
	    
	    int[] xArray = new int[x];
	    int temp = x;
	    for(int i = 0; i < xArray.length; i++)
	    {
	    	xArray[i] = temp;
	    	temp--;
	    }
	    
	    return xArray;
	}     
	
	public static int[] createYArray(int y, int [] xArray) throws ArrayIndexOutOfBoundsException
	{
		if(y < 1)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int x = xArray.length;
		xArray = createXArray(x);
		int[] yArray = new int[y];
		Random rand = new Random(123L);
		
		for(int i = 0; i < yArray.length; i++)
		{
			yArray[i] = xArray[rand.nextInt(x)];
		}
		
		return yArray;
	}
	
	public static void printArray(int[] array) throws FileNotFoundException 
	{
		PrintWriter out = new PrintWriter("output.txt");
		
		try{
			if(out == null)
				throw new FileNotFoundException();
			
		for(int i = 0; i < array.length; i++)
			{
				out.print(array[i] + " ");
			}
			out.print("\n");	
			
		}finally
		{
			 if (out != null)
			 {
			 	out.close();
			 }
		}
	}
	
	
	public String getIdentificationString()
	{
		return("RandomArray, Brian Duong");
	}
	
	public static void main(String [] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		printArray(createXArray(x));
		printArray(createYArray(y, createXArray(x)));
	}
	
	
	
}
