/*
M. Steven Towns
Language Assignment
4/15/2014
*/

import java.util.*;
import java.io.*;
 
public class CharStack {
 
	private String inputFileName, outputFileName;
	private String words[];
 
	private Scanner fin;                  // Scanner for file input
	private PrintWriter fout;             // PrintWriter for file output
 
	public CharStack (String outfile) {    //constructor
		outputFileName = outfile;
	}
 
	public void openFiles() {
		try {
			fout = new PrintWriter(new FileWriter(outputFileName), true);
		}
 
		catch (IOException e) {
			System.out.println("Error opening files.");
		}
 
	}
	public void closeFiles() {fout.close( );}
	
	public void test(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Give me a word: ");
		String word=sc.nextLine();
		System.out.println(word);
		int size=word.length();
		boolean hold=true;
		if (size%2==1){
			if (word.substring(size/2,size/2+1).equals("$")){
				for (int i=0;i<size/2;i++){
					if (!word.substring(i,i+1).equals(word.substring(size-(i+1),size-i))){
						hold=false;
					}
				}
			}
			else hold=false;
		}
		else hold=false;
		if (hold){
			push(word);
		}
	}
	public void push(String w){
		fout.println(w);
	}
}