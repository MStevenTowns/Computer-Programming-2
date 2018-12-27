/*
M. Steven Towns
Acronym Assignment
1/31/2014
*/

import java.io.*; 
import java.util.*; 

public class Acronym
{ 
    private static String transform(String input) 
    { 
		String out="";
        if(input.length() < 1) return ""; 
		if(input.equals("of")||input.equals("and")||input.equals("the"));
        else
        {
            out=input.substring(0,1).toUpperCase();
        } 
		return out;
	}
    public static void main(String[] args) 
    { 
		Scanner sc;
        try
        {
            sc=new Scanner(new File("Acronym.in"));
        } 
        catch (IOException e) 
        { 
            String[] placeHolder = new String[1]; 
            System.out.println("file not found"); 
			sc=new Scanner(System.in);
        } 
		int num=sc.nextInt();
		//System.out.println(num);
        for(int i=0;i<=num;i++) 
        { 
			String output=""; 
            String[] input=((sc.nextLine()).split(" ")); 
			//System.out.println(input.length);
            for(int j=0;j<input.length;j++) 
            { 
				output+=transform(input[j]);
            }
			System.out.println(output);
			//System.out.println("hi");
        }
	}
}
