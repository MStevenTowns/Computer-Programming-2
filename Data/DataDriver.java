/*
M. Steven Towns
Data Assignment
1/24/2013
*/

//charAt(98).equals(CharAt(99)

import java.io.*;
import java.util.*;

public class DataDriver
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Input File name: ");
		String infile = new String(sc.nextLine());
		
		System.out.print("Output File name: ");
		String outfile = new String(sc.nextLine());
		
		Data dataFix = new Data(infile, outfile);
		
		dataFix.openFiles();
		dataFix.fixFile();
		dataFix.closeFiles();
	}
}