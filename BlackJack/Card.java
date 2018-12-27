/*
M. Steven Towns
Black Jack
2/19/2014
*/

import java.io.*; 
import java.util.*; 

public class Card
{
	// pass face and suit
	//then assign value from face

	//toString - converts object to string
		//override the default toString
		//can just concatenate line 47
		
	//setters and getters
	//getters 
	public static int points;
	public static String faceValue,name,suit;
	public Card(String n,int s)
	{
		faceValue="";
		points=0;
		name="";
		suit="";
		
		
	}
	public String getFaceValue()
	{
		return this.faceValue;
	}
	public String getSuit()
	{
		return "";
	}
	public int getPoints()
	{
		return 0;
	}
	//Setters
	public void setFaceValue(String f)
	{
		this.faceValue=f;
	}
	public String getSuit(String s)
	{
		return "";
	}
	public void setPoints(int p)
	{
		this.points=p;
		//this.points=p;
		//this means that you can rename p to points, and it won't confuse program
	}


	public boolean compareCardValue(Card c)
	{
		if(0>1) return true;
		else return false;
	}

	public String toString()
	{
		return ("The "+this.getFaceValue()+" of "+this.getSuit("")+" has a value of "+this.getPoints());
	}

	public static String figureName(int i)
	{
		switch(i)
		{
			case 1:
			return "Ace";
			case 11:
			return "Jack";
			case 12:
			return "Queen";
			case 13:
			return "King";
			default:
			if (i<=0||i>=14) return "error";
			else 
			return ""+i;
		}
	}
	public static String figureSuit(int x)
	{
		switch(x)
		{
			case 1:
			return "Hearts";
			case 2:
			return "Diamonds";
			case 3:
			return "Clubs";
			case 4:
			return "Spades";
		}
		return "";
	}
}