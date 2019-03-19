/**
*  Program 3a
*  Create a place class with other methods
*  CS108-1 
*  5/31/18
*  Brian Duong
*/
public class Place 
{
	public String getIdentificationString()
	{
		return("Program 2, Brian Duong");
	}
	
	String name;
	String description;
	GeoLocation location = new GeoLocation();
	
	public Place(String name, String desc, double latitude, double longitude)
	{
		this.name = name;
		description = desc;
		GeoLocation.latitude = latitude;
		GeoLocation.longitude = longitude;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setDescription(String desc)
	{
		description = desc;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setLocation(double latitude, double longitude)
	{
		location.setLatitude(latitude);
		location.setLongitude(longitude);
	}
	
	public void setLocation(GeoLocation location)
	{
		this.location = location;
	}
	
	public GeoLocation getLocation()
	{
		return location;
	}
	
	public String toString()
	{
		return name + "," + description + "," + "latitude:" + location.getLatitude() + "," + "longitude:" + location.getLongitude();
	}
}
