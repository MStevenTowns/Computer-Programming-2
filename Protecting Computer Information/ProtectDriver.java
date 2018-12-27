/*
M. Steven Towns
Protecting Info Assignment
3/12/2014
*/

import java.io.*;
import java.util.*;

public class ProtectDriver{
	public static void main (String []args)
	{
		Scanner sc = new Scanner (System.in);
 
		System.out.print("Input File name: ");
		String infile = new String(sc.nextLine());
	 
		System.out.print("Output File name: ");
		String outfile = new String(sc.nextLine());
	 
		Protect myProtected = new Protect(infile, outfile);
	 
		myProtected.openFiles();
		System.out.println(myProtected.encode());
		myProtected.closeFiles();
	}
}