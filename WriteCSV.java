import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCSV 
{
	public String getIdentificationString()
	{
		return("Program 5a, Brian Duong");
	}
	
	public static void main(String[] args) 
	{
        //  Grading program needs hardcoded filename. Oh, well. "
        String inputFilename = "coords.txt";
        String outputFilename = changeFileExtToCsv(inputFilename);  

        // Open files
        Scanner input = openInput(inputFilename); //TODO:  call method to open input file
        PrintWriter output = openOutput(outputFilename); //TODO:  call method to open output file

        // TODO:  Read input line, replace all spaces with commas, 
                //               and write output line
        while (input.hasNextLine()) 
        {
        	String newInput = input.nextLine().replaceAll(" ", ",");
        	output.println(newInput);
        }

        // TODO: close streams
        output.close();
        
    }
	
    /**
     * Changes file extension to ".csv"
     * @param filename
     * @return
     */
    public static String changeFileExtToCsv(String filename) 
    {
        return filename.substring(0,filename.lastIndexOf('.')) + ".csv";
    }
    
    /**
     * Open input for reading
     * @param filename
     * @return
     */
    public static Scanner openInput(String filename) 
    {
        Scanner in = null;
        try 
        {
            File infile = new File(filename);
            in = new Scanner(infile);
        } 
        catch (FileNotFoundException e) 
        {
            //e.printStackTrace();
            System.out.println(filename + " could not be found");
            System.exit(0);
        }
        return in;
    }
    
    /**
     * Open output for writing
     * @param filename
     * @return
     */
    public static PrintWriter openOutput(String filename) 
    {
        //TODO:  Write method to open a PrintWriter ;  use openInput() as a guide
    	PrintWriter out = null;
    	try
    	{
    		File outfile = new File(filename);
    		out = new PrintWriter(outfile);
    	}
    	catch (FileNotFoundException e)
    	{
    		System.out.println(filename + " could not be found");
    		System.exit(0);
    	}
    	return out;
    }

}
