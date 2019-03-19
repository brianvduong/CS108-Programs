
public class Eatery extends Place
{
	double cost;
	String cuisine;
	int starRating;
	
	public Eatery(String name, String desc, double latitude, double longitude, String cuisine, double cost, int starRating)
	{
		this.name = name;
		this.description = desc;
		GeoLocation.latitude = latitude;
		GeoLocation.longitude = longitude;
		this.cost = cost;
		this.cuisine = cuisine;
		this.starRating = starRating;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public String getCuisine()
	{
		return cuisine;
	}
	
	public int getRating()
	{
		return starRating;
	}
	
	public String ratingToStars()
	{
		if(starRating == 1)
		{
			return "*";
		}
		if(starRating == 2)
		{
			return "**";
		}
		if(starRating == 3)
		{
			return "***";
		}
		if(starRating == 4)
		{
			return "****";
		}
		if(starRating == 5)
		{
			return "*****";
		}
		else
		{
			return "";
		}
	}
	
	public String getCostToSymbols()
	{
		if(cost < 25.0)
		{
			return "$";
		}
		else if(cost < 50.0)
		{
			return "$$";
		}
		else if(cost < 75.0)
		{
			return "$$$";
		}
		else if(cost < 100.0)
		{
			return "$$$$";
		}
		else if(cost >= 100.0)
		{
			return "$$$$$";
		}
		else
		{
			return "";
		}
	}
	public String toString()
	{
		return name + " (latitude:" + GeoLocation.latitude + ",longitude:" + GeoLocation.longitude + ")" + "\n\tPrice: " + getCostToSymbols() + "\n" + "\tRating: " + ratingToStars();
	}
}