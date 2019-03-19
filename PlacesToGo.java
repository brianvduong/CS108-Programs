
/**
*  Program 6b
*  Create a comparable class and a driver class.
*  CS108-1 
*  6/14/18
*  Brian Duong
*/
import java.util.ArrayList;
import java.util.Collections;

public class PlacesToGo 
{
	public static void main(String[]args)
	{
		//creates an array list of places
		ArrayList<Place> list = new ArrayList<>();
	
		//creates a list of places and adds two places
		Place[] places = 
			{
					new Place("New York", "One very large city", 100.2, 150.1283),
					new Place("Los Angeles", "City of angels", 54.89, -100.30)
			};
	
		//creates a list of eateries and adds two eateries
		Eatery[] eateries = 
			{
					new Eatery("Chilis", "American sized food", 36.265, 127.387, "American", 30, 3),
					new Eatery("Panda Express", "My Favorite Place", -117.479, -27.968, "Chinese", 10, 4)
			};
	
		//creates a list of attractions and adds two attraction s
		Attraction[] attracts = 
			{
					new Attraction("County Fair", "Janky rides", -23.27, 237.387, 25, 3),
					new Attraction("San Diego Zoo", "Harambe lives in our hearts", -45.27, 28.39, 40, 1)
			};
	
		//adds the list of places, eateries, and attractions to the array list
		for (Place p: places)
			list.add(p);
		for (Eatery e : eateries)
			list.add(e);
		for (Attraction a : attracts)
			list.add(a);
    
		//prints out all the places in the array list
		for(Place place: list)
		{
			System.out.println(place);
		}
		
		//prints out an empty line
		System.out.println("");
		
		//uses the compareTo method to sort the array list
		Collections.sort(list);
		
		//prints out all the places in the array list after it has been sorted
		for(Place place: list)
		{
			System.out.println(place);
		}
	}
}
