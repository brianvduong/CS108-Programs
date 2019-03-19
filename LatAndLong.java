import java.util.Arrays;

/**
*  Program 2a
*  1-2 Line Description of class/program
*  CS108-1 
*  5/31/18
*  Brian Duong
*/
public class LatAndLong 
{
	public String getIdentificationString()
	{
		return("Program 2, Brian Duong");
	}
	
	public static void printArrays(Double [] array1, Double [] array2)
	{
		int i;
		for(i=0; i < array1.length; i++)
		{
			System.out.format("%10.6f\t%10.6f\n", array1[i], array2[i]);
		}
	}
	
    public static double distanceFrom(double x1, double y1, double x2, double y2) 
    {
        double lat1 = Math.toRadians(x1);
        double long1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double long2 = Math.toRadians(y2);
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
        Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * 6371;
    }

	
	public static void main (String [] args)
	{
		Double [] latitude = {48.858093, -3.070000, 27.173891, 51.501476, -22.9519};
		Double [] longitude = {2.294694, 37.349998, 78.042068, -0.140634, -43.2104};
		
		printArrays(latitude, longitude);
		
		System.out.println("");
		
		System.out.println("Distance in kilometers: " + distanceFrom(latitude[1], longitude[1], latitude[3], longitude[3]));
		
		Arrays.sort(latitude);
		
		System.out.println("");
		
		printArrays(latitude, longitude);

	}
}
