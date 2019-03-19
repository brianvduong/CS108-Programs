import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GenMethods 
{
	public String getIdentificationString()
	{
		return("Program 9a, Brian Duong");
	}
	
	public static <E> ArrayList <E> removeDuplicates(ArrayList <E> list)
	{
	    LinkedHashSet<E> dataSet = new LinkedHashSet<E>(list.size());
	    dataSet.addAll(list);
	    ArrayList<E> noDups = new ArrayList<E>(dataSet.size());
	    noDups.addAll(dataSet);
	    return noDups;
	}
	
	public static <E> void shuffle(ArrayList <E> list)
	{
		Random rand = new Random(340L);
		for(int i = 0; i < 30; ++i) 
		{
			Collections.shuffle(list, rand);
		}
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list) 
	{
		E large = list.get(0);
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i).toString().compareTo(large.toString()) > 0)
			{
				large = list.get(i);
			}
		}
		return large;
	}
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	{
	    for (int i = 0; i < list.length; i++)
	    {
	        if (key.equals(list[i]))
	        {
	            return i;
	        }
	     }
	     return -1;
	}
	
	public static <E extends Comparable<E>> E max(E[] list)
	{
		E large = list[0];
		for (int i = 0; i < list.length; i++)
		{
			if(list[i].toString().compareTo(large.toString()) > 0)
			{
				large = list[i];
			}
		}
		return large;
	}
	
	public static <E extends Comparable<E>> E Max(E[][] list)
	{
		E large = list[0][0];
		for(int i = 0; i < list.length; i++)
		{
			for(int g = 0; g < list[0].length; g++)
			{
				if(list[i][g].toString().compareTo(large.toString()) > 0)
				{
					large = list[i][g];
				}
			}
		}
		return large;
	}
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Integer [] list = new Integer[n];
		for(int i = 0; i < list.length; i++)
		{
			list[i] = scan.nextInt();
		}
		
		LinkedList <Integer> linked = new LinkedList <Integer>(Arrays.asList(list));
		
		System.out.println(Arrays.toString(list));
		
		System.out.println(linked);
		
		int k = scan.nextInt();
		
		if(linearSearch(list,k) >= 0)
		{
			System.out.println("Key " + k + " was found at position " + linearSearch(list, k));
		}
		else
		{
			System.out.println("Key " + k + " was not found");
		}

		System.out.println(max(list) + " is the max element");
		
		int m = scan.nextInt();
		int p = scan.nextInt();
		
		Integer[][] list2 = new Integer[m][p];
		
		for(int row = 0; row < m; row++)
		{
			for(int col = 0; col < p; col++)
			{
				list2[row][col] = scan.nextInt();
			}
		}
		
		for(int row = 0; row < m; row++)
		{
		    for(int col = 0; col < p; col++)
		    {
		        System.out.print(list2[row][col] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println(Max(list2) + " is the max element");
		
		ArrayList<Integer> alist = new ArrayList<Integer>(linked);
		
		System.out.println(alist);
		
		System.out.println(removeDuplicates(alist));
		
		shuffle(alist);
		
		System.out.println(removeDuplicates(alist));
		
		System.out.println(max(alist) + " is the max element");



	}
}
