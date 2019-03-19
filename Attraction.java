
public class Attraction extends Place
{
	int type;
	double price;
	
	public Attraction(String name, String desc, double latitude, double longitude, double price, int type)
	{
		this.name = name;
		this.description = desc;
		GeoLocation.latitude = latitude;
		GeoLocation.longitude = longitude;
		this.type = type;
		this.price = price;
		if(type == 0)
		{
			name = "amusement park";
		}
		else if(type == 1)
		{
			name = "aquarium";
		}
		else
		{
			name = "zoo";
		}
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public int getType()
	{
		return type;
	}
	
	public boolean hasAnimals()
	{
		if(type == 1 || type == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		if(hasAnimals() == true)
		{
			return name + " (latitude:" + GeoLocation.latitude + ",longitude:" + GeoLocation.longitude + ")" + "\n\tTickets average $" + price + "0" + " and feature exciting animals";
		}
		else
		{
			return name + " (latitude:" + GeoLocation.latitude + ",longitude:" + GeoLocation.longitude + ")" + "\n\tTickets average $" + price + "0";
		}

	}
}