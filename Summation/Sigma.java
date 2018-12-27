/*
M. Steven Towns
Summation Assignment
3/12/2014
*/

import java.io.*;
import java.util.*;

public class Sigma
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nGive me a number: ");
		int number=sc.nextInt();
		int num=summation(number);
		System.out.print("\nThe summation of "+number+" is equal to: "+num+"\n");
	}
	public static int summation(int n)
	{
		int result=0;
		if(n>0)
		{
			result=(n+summation(n-1));
			return result;
		}
		else 
		{
			return 0;
		}
	}
}