/*
M. Steven Towns
Data Assignment
1/24/2013
*/

import java.io.*;
import java.util.*;

public class Data
{
	private String inputFileName, outputFileName;
	private Scanner fin;                  // Scanner for file input
	private PrintWriter fout;             // PrintWriter for file output
 
    public Data (String infile, String outfile) //constructor
	{    
		inputFileName = infile;
		outputFileName = outfile;
	}
	public void openFiles() 
	{
		try 
		{
			fout = new PrintWriter(new FileWriter(outputFileName), true);
			fin = new Scanner(new File(inputFileName));
		}
 
		catch (IOException e) 
		{
			System.out.println("Error opening files.");
		}
	}
	public void fixFile()
	{
		String file, good, rent, own;
		while (fin.hasNextLine())
		{
			file=fin.nextLine();
			good=file.substring(0,98);
			rent=file.substring(98,99);
			own=file.substring(99);
			if (rent.equals(own))
			{
				rent=" ";
				own=" ";
			}
			//print to output file
			fout.println(good+rent+own);
		}
	}
	public void closeFiles()  // close files
	{
		fin.close( ); // Less Important
        fout.close( ); // VERY Important
	}
}