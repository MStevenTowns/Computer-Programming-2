/*
M. Steven Towns
Report Graph
1/21/2014
*/ 

import java.io.*;
import java.util.*;

public class GraphDriver
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Input File name: ");
		String infile = new String(sc.nextLine());
		
		System.out.print("Output File name: ");
		String outfile = new String(sc.nextLine());
		
		Graph data=new Graph(infile, outfile);
		
		data.openFiles();
		data.reportFile();
		data.closeFiles();
		System.out.println("Done");
	}
}