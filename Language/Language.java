/*
M. Steven Towns
Language Assignment
4/15/2014
*/

import java.io.*;
import java.util.*;

public class Language{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Output File Name: ");
		String outfile=new String(sc.nextLine());
		if (outfile.equals("")) outfile="Output.txt";
		
		CharStack myStack=new CharStack(outfile);
		
		myStack.openFiles();
		myStack.test();
		myStack.closeFiles();
		
	}
}