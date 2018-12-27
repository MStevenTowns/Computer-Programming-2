/*
M. Steven Towns
Magic Box
1/15/2014
due Friday
*/

import java.io.*;
import java.util.*;

public class MagicDriver
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=0;
		boolean go=false;
		while (go==false)
		{
			System.out.print("How many units wide do you want your magic square?: ");
			String rowin=sc.next(); //takes user input
			try
			{
				size=Integer.parseInt(rowin); //takes input and changes it to a number (if possible)
			}
			catch(Exception e)
			{
				size=0;
			}
			if (size%2==1) //makes sure the number is odd
			{
				go=true;
				System.out.println();
			}
			if ((size>15)||(size<1)) //makes sure the box will fit inside the command prompt
			{
				go=false;
			}
			if (go==false)
			{	
				System.out.println("Try again, pick an odd number under 16 \n");
			}
		}
		Magic myBox = new Magic(size);
		myBox.buildMagic();
		myBox.printMagic();
	}
}