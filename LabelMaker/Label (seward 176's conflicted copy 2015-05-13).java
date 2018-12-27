/*
M. Steven Towns
Label Maker Assignment
Code used from Carl Frank(with permission)
1/9/2013
*/

import java.util.*;
import java.io.*;
 
public class Label {
 
  private String inputFileName, outputFileName;
 
  private Scanner fin;                  // Scanner for file input
  private PrintWriter fout;             // PrintWriter for file output
 
    public Label (String infile, String outfile) {    //constructor
    inputFileName = infile;
    outputFileName = outfile;
  }
 
  public void openFiles() {
 
    try {
      fout = new PrintWriter(new FileWriter(outputFileName), true);
      fin = new Scanner(new File(inputFileName));
    }
 
    catch (IOException e) {
      System.out.println("Error opening files.");
    }
 
  }
 
  public void copyFile() {
    String s;
    int x;
    int len;
	String file, name, address, city, state;
 
    while (fin.hasNextLine()) 
	{
		file=fin.nextLine();
	    name = file.substring(0, 24);
		address = file.substring(24, 45);
		city = file.substring(45, 61);
		city = (city.trim() +",");
		// use trim to delete white-space
		state = (file.substring(61,63) + "  "+file.substring(63));
		s = (name + "\n" +address+ "\n" +city+ " " +state);
        fout.println(name); //name on first line
		fout.println(address); //Address on second
		fout.println(city + " " +state); //city, state, and zip on one line
		fout.println(); //double-space after label 
    }
 
  }
 
  public void closeFiles() {  // close files
 
        fin.close( ); // Less Important
        fout.close( ); // VERY Important
   }
 
}