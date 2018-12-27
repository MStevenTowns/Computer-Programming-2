/*
M. Steven Towns
Report Graph
1/21/2014
*/

import java.io.*;
import java.util.*;

public class Graph
{
	private String inputFileName, outputFileName;
	private Scanner fin;                  // Scanner for file input
	private PrintWriter fout;             // PrintWriter for file output
	
	public Graph (String infile, String outfile) //constructor
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
	
	public void reportFile()
	{
		String file,stars,good;
		double nums;
		while (fin.hasNextLine())
		{
			file=fin.nextLine();
			good=file.substring(0,50);
			nums=Double.parseDouble(file.substring(50,53));
			nums=nums/2;
			stars="";
			for (int i=0;i<nums;i++)
			{
				stars+="*";
			}
			fout.println(good+stars);
			if (fin.hasNextLine()) file=fin.nextLine();
		}
	}
	
	public void closeFiles()  // close files
	{
		fin.close( ); // Less Important
        fout.close( ); // VERY Important
	}
}