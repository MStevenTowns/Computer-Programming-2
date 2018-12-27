/*
M. Steven Towns
Magic Box Assignment
1/10/2014
*/

import java.io.*;
import java.util.*;

public class Magic
{
	private int rows;
	public Magic(int size)
	{
		rows=size;
	}
	int table[][];
	
	public void buildMagic()
	{
		table= new int[rows][rows]; //Sets the size of the array
		int row, column;
		for (row=0;row<rows;row++)
		{
			for(column=0;row<rows;row++)
			{
				table[row][column]=0;
			}
		}
		row=(rows-1);
		column=((rows/2));
		table[row][column]=1;
		for (int i=2; i<=rows*rows; i++) 
		{
			if (table[(row+1)%rows][(column+1)%rows]==0) //checks to see if next space is occupied, even if wrapping is needed
			{
                row=((row + 1) % rows); //aligns the row for the next number, wrapping as needed
                column=((column + 1) % rows); //aligns the column for the next number, wrapping as needed
            }
            else //if occupied places number below original number, wrapping as needed
			{
                row=((row - 1 + rows) % rows); //shifts down 1 unit, wrapping as needed
            }
			table[row][column]=i;//Places number
		}
	}	
	public void printMagic()
	{
		for (int i=rows;i!=0;i--)
		{
			System.out.println("\n");// 1 to put next row on next line the "\n" is to give space for cosmetic reasons
			for (int x=1; x<=rows;x++) //control column
			{
				if ((table[i-1][x-1])<10) 
				{
					System.out.print(" ");//lines up the numbers, giving space between them
				}
				if ((table[i-1][x-1])<100) //lines up numbers
				{
					System.out.print(" ");
				}
				System.out.print((table[i-1][x-1])+ " ");
			}
		}	
	}	
}