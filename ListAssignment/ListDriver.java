/*
M. Steven Towns
List Assignment
2/3/2014
*/

import java.io.*;
import java.util.*;

public class ListDriver
{
	public static void main(String [] args)
	{
		while (go)
		{
			List myList=new List();
			System.out.println("1) Add\n2)Delete");
			int x=1;
			if (x==1)
			{
				myList.add(x,x);
			}
			else if(x==2)
			{
				myList.delete(x,x);
			}
		}
	}
}