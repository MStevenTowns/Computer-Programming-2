/*
M. Steven Towns
Protecting Info Assignment
3/12/2014
*/

import java.io.*;
import java.util.*;

public class Protect
{
	private String inputFileName, outputFileName;
 
	private Scanner fin;                  // Scanner for file input
	private PrintWriter fout;             // PrintWriter for file output
 
    public Protect (String infile, String outfile) 
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
	public String encode()
	{
		System.out.println();
		String write="";
		int cases=fin.nextInt();
		boolean run;
		for (int a=0;a<=cases;a++);
		{
			run=true;
			fin.nextLine();
			int shift=fin.nextInt()%26;
			while (run)
			{
				String line=fin.nextLine();
				if (line.equals("STOP"))
				{
					run=false;
				}
				else
				{
					for (int i=0;i<line.length();i++)
					{
						char letter=line.charAt(i);
						if (isAlpha(letter)==true){
						
							if (isUpperCase(letter))
							{
								letter+=shift;
								if (letter<65) letter+=26;
								else if (letter>90) letter-=26;
							}
							else if (isLowerCase(letter));
							{
								letter+=shift;
								if (letter<97) letter+=26;
								else if (letter>122) letter-=26;
							}
						}
						write+=letter;
					}
				}	
			}
		}
		return write;
	}
	
	public static boolean isUpperCase(char s)
	{
		if (s>=65&&s<=90) return true;
		return false;
	}
	public static boolean isLowerCase(char s)
	{
		if (s>=97&&s<=122) return true;
		return false;
	}
	public static boolean isAlpha(char s)
	{
		if (isLowerCase(s)||isUpperCase(s)) return true;
		return false;
	}
	
	public void closeFiles()  // close files
	{
		fin.close( ); // Less Important
        fout.close( ); // VERY Important
	}
}