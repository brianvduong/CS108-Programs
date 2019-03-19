/**
*  Program 2c
*  Calculator
*  CS108-1 
*  5/31/18
*  Brian Duong
*/
import java.lang.Math;
public class Calculator 
{
	public String getIdentificationString()
	{
		return("Program 2, Brian Duong");
	}
	
	public int add(int num1, int num2) 
	{
        return num1 + num2;
    }

    public int subtract(int num1, int num2) 
    {
        return num1 - num2;
    }

    public int divide(int num1, int num2) 
    {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) 
    {
        return num1 * num2;
    }

    public int squared(int num1) 
    {
        return num1 * num1;
    }

    public double squareRoot(double num1) 
    {
        double squareRoot = Math.sqrt(num1);
        return squareRoot;
    }

    public double power(double num1, double num2) 
    {
        double toThePower = Math.pow(num1, num2);
        return toThePower;
    }
    
    public static void main (String [] args)
    {
    	Calculator test = new Calculator();

    	System.out.println(test.add(50, 50));
    	System.out.println(test.subtract(100, 50));
    	System.out.println(test.divide(100, 20));
    	System.out.println(test.multiply(100, 10));
    	System.out.println(test.squared(12));
    	System.out.println(test.squareRoot(16.0));
    	System.out.println(test.power(2, 7));
    	
    }
	
}
