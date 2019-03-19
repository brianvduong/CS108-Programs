/**
*  Program 4b
*  Change transpose and modify to transpose2
*  CS108-1 
*  6/7/18
*  Brian Duong
*/
public class Transpose2 
{
	private int[][] array;
	
	public Transpose2(int rows, int cols)
	{
		array = createPatterned2DArray(rows, cols);	
	}
	
	public int getRows()
	{
		return array.length;
	}
	
	public int getCols()
	{
		return array[0].length;
	}
	
	public String getIdentificationString()
	{
		return("Program 4, Brian Duong");
	}
	
	private int[][] createPatterned2DArray(int numRows, int numCols) 
	{
		int[][] arr = new int[numRows][numCols];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; ++j) 
			{
				arr[i][j] = 10 + ((i + 1) * numRows) + j;
			}
		}
		return arr; // returns newly created array to calling entity
	}
		
	public void print2DArray(int[][] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; ++j) 
			{
				System.out.printf("%-4d", a[i][j]);  // formatted output
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void print2DArray()
	{
		this.print2DArray(array);
	}

	public void print2DArrayTransposed(int[][] a, int numRows, int numCols) 
	{

		for (int i = 0; i < numCols; i++) 
		{
			for (int j = 0; j < numRows; ++j) 
			{
				System.out.printf("%-4d",a[j][i]); // formatted output
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void print2DArrayTransposed()
	{
		this.print2DArrayTransposed(array, getRows(), getCols()); 
	}
}
