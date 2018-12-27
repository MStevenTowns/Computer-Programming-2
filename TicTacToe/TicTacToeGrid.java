/*
M. Steven Towns
TicTacToeDriver
1/15/2014
*/

import java.io.*;
import java.util.*;

class TicTacToeGrid {

	private String[][] board;
    
	public TicTacToeGrid()
    {
		board= new String[3][3];
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				board[x][y] = " ";
			}
		}
    }
    
    boolean isWin(String s)
	{
		for(int x = 0; x < 3; x++)
		{
			if(board[x][0] == s && board[x][1] == s && board[x][2] == s) 
				{	
					return true;
				}
		}
		
		for(int y = 0; y < 3; y++)
		{
			if(board[0][y] == s && board[1][y] == s && board[2][y] == s) 
				{
					return true;
				}
		}
		
		if(board[0][0] == s && board[1][1] == s && board[2][2] == s) 
			{
				return true;
			}
		if(board[0][2] == s && board[1][1] == s && board[2][0] == s) 
			{
				return true;
			}
		return false;
    }
	
	boolean tie()
	{
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				if (board[x][y] == " ") return false;
			}
		}
		return true;
	}
    
    boolean play(int x, int y, String s)
	{
		if(x<0 || x>2 || y<0 || y>3) return false;
		if(board[x][y].equals(" ")) board[x][y] = s;
		else return false;
		return true;
    }
    
    void computer()
	{
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				if(play(x,y,"O"))
				{
					if (isWin("O")) return;
					else board[x][y] = " ";
				}
			}
		}
		
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				if(play(x,y,"X"))
				{
					if (isWin("X"))
					{
						board[x][y] = "O";
						return;
					}
					else board[x][y] = " ";
				}
			}
		}
		int x = (int)(Math.random()*3);
		int y = (int)(Math.random()*3);
		while(play(x,y,"O") == false)
		{
			x = (int)(Math.random()*3);
			y = (int)(Math.random()*3);
		}
	}
	
	public void end(int x)
	{
		//this.print();
		if (x==0) System.out.println("It's a tie!");
		else if (x==1) System.out.println("You win!");
		else if (x==2) System.out.println("The computer wins");
	}
	
    void print()
    {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n                                    1   2   3");
		System.out.println("                                      |   |");
		
		System.out.println("                                 1  "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
		System.out.println("                                      |   |");
		System.out.println("                                   -----------");
		System.out.println("                                      |   |");
		
		System.out.println("                                 2  "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
		System.out.println("                                      |   |");
		System.out.println("                                   -----------");
		System.out.println("                                      |   |");
		System.out.println("                                 3  "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
		System.out.println("                                      |   |\n");
	}
}
