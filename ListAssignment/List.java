/*
M. Steven Towns
List Assignment
2/3/2014
*/

import java.io.*;
import java.util.*;

public class List
{

	public void List()
	{
		
	}
	public void print(int size)
	{
		if (size==0)
		{
			System.out.println("Your list is empty.");
		}
		else 
		{
			for (int x=0; x<size;x++)
			{
				System.out.println(x);
			}
		}
	}

	// Search
	public int search(int value,int size)
	{
		int status=-1;
		int x=0;
		while ((x<size)&&(x!=value)) //test if "<" instead of "!=" value or use arrays.sort
		{
			x++;
		}
		if (x<size) 
		{
			status=x;
		}
		return status;
	}

	public int delete(int v,int size)
	{
		int status=-1;
		if (this.search(v,size)>=0)
		{
			int x=0;
			while ((x<size)&&(x!=v)) //test if "<" instead of "!=" value or use arrays.sort
			{
				x++;
			}
			if (x<size) 
			{
				status=x;
			}
		}
		return status;
	//replace with next number
	//for loop?
	//dont have to remove bottom number
	//decrement size
	//call search
	// if search returns -1 print error message
	}
	public int add (int size, int v)
	{
		int status=-1;
		if (this.search(v,size)==-1)
		{
			
			int x=0;
			while ((x<size)&&(x!=v)) //test if "<" instead of "!=" value or use arrays.sort
			{
				x++;
			}
			if (x<size) 
			{
				status=x;
			}
			return status;
		}
		return status;
	}
	
}