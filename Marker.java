import java.util.ArrayList;

public class Marker extends GeoLocation
{
	protected String description;
	protected String iconLabel;
	protected String iconUrl;
	protected GeoLocation loc;
	protected String name;
	
	public Marker()
	{
		
	}
	
	public Marker(boolean location, boolean url)
	{
		
	}
	
//	public boolean fillMarker(ArrayList<String> values)
//	{
//		
//	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getIconLabel()
	{
		return iconLabel;
	}
	
	public double getLatitude()
	{
		return getLatitude();
	}
	
	public double getLongitude()
	{
		return getLongitude();
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean hasGeoLocation()
	{
		if(loc != null)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean hasIconUrl()
	{
		if(iconUrl != null)
		{
			return true;
		}
		else
			return false;
	}
	
	public void setDescription(String val)
	{
		description = val;
	}
	
	public void setIconLabel(String val)
	{
		iconLabel = val;
	}
	
	public void setIconUrl(String val)
	{
		iconUrl = val;
	}
	
	public void setLatitude(double val)
	{
		setLatitude(val);
	}
	
//	public void setLatitude(String val)
//	{
//		loc.getLatitude(val);
//	}
//	
//	public void setDescription(String val)
//	{
//		description = val;
//	}
//	
//	public void setDescription(String val)
//	{
//		description = val;
//	}
}
