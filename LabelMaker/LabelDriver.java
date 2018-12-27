/*
M. Steven Towns
Label Maker Assignment
Code used from Carl Frank(with permission)
1/9/2013
*/

import java.io.*;
import java.util.*;
 
public class LabelDriver {
 
  public static void main (String [] args) {
 
    Scanner sc = new Scanner (System.in);
 
    System.out.print("Input File name: ");
    String infile = new String(sc.nextLine());
 
    System.out.print("Output File name: ");
    String outfile = new String(sc.nextLine());
 
    Label labelMaker = new Label(infile, outfile);
 
    labelMaker.openFiles();
    labelMaker.copyFile();
    labelMaker.closeFiles();
	}
}