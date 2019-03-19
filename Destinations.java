/**
*  Program 6a
*  Array list of destinations
*  CS108-1 
*  6/13/18
*  Brian Duong
*/
import java.util.ArrayList;

public class Destinations 
{
	public String getIdentificationString()
	{
		return("Program 6a, Brian Duong");
	}
	
    public static void main(String[] args) 
    {
        ArrayList<Place> places = initList();

        // ToDo: Print each Place using enhanced for-loop showing polymorphism
        for(Place place : places)
        {
        	System.out.println(place);
        }

        // ToDo: For each Eatery, print numeric rating followed by a space followed by appropriate 'stars'
        for(Place place: places)
        {
        	if(place instanceof Eatery)
        	{
        		System.out.println(((Eatery) place).getRating() + " " + ((Eatery) place).ratingToStars());
        	}
        }

        // ToDo: For each Restaurant, print its name followed by a space followed by its description
        for(Place place: places)
        {
        	if(place instanceof Attraction)
        	{
        		System.out.println(place.getName() + " " + place.getDescription());
        	}
        }

        // ToDo: Test Tea Station's latitude and longitude against Tender Greens', print true or false
        if(places.get(1).equals(places.get(2)))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }

        // ToDo: Compare Original Pancake House and Tender Greens cuisine, print true or false
        Eatery pancake = (Eatery)places.get(0);
        Eatery greens = (Eatery)places.get(2);
        if(pancake.getCuisine().equals(greens.getCuisine()))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }

        // ToDo: Test Birch Aquarium and SD Zoo types, print true or false
       Attraction birch = (Attraction)places.get(4);
       Attraction zoo = (Attraction)places.get(5);
       if(birch.getType() == (zoo.getType()))
       {
       	System.out.println("true");
       }
       else
       {
       	System.out.println("false");
       }

    }

    private static ArrayList<Place> initList() 
    {
        ArrayList<Place> list = new ArrayList<>();
        Eatery[] restaurants = {
                new Eatery("Original Pancake House","Breakfast",32.815274,-117.1546500,"casual dining",14.0,4),
                new Eatery("Tea Station","Asian cafe with tea drinks",32.76049,-117.06739,"casual dining",8.0,3),
                new Eatery("Tender Greens","2400 Historic Decatur Rd",32.73547,-177.21601,"casual dining",26.0,4)
        };
        Attraction[] fun = {
                new Attraction("PetCo Park","Padres Baseball",32.708129,-117.157036,37.0,0),
                new Attraction("Birch Aquarium at Scripps Institution of Oceanography",
                        "Fish Aquarium",32.865776,-117.250518, 18.50, 1),
                new Attraction("San Diego Zoo","Animal Park",32.735316,-117.149046,52.0,2)
        };
        for (Eatery e : restaurants)
            list.add(e);
        for (Attraction a : fun)
            list.add(a);

        return list;
    }
}