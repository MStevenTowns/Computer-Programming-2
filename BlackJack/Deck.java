/*
M. Steven Towns
Black Jack
2/19/2014
*/

import java.io.*; 
import java.util.*; 

public class Deck
{
	private static Card[]myDeck=new Card[52];
	//Constructor
	public void Deck()
	{
		int counter=0; 
		for (int i=1;i<=13;i++)
		{
			for(int j=1;j<=4;j++)
			myDeck[counter]=new Card(Card.figureName(i),(j));
			counter++;
		}
	}

	public void printDeck()
	{
		for(int k=0;k<=52;k++)
		{
			System.out.println("The Card is"+k);
		}
	}

	public int dealOne()
	{
		int nextToDeal=0;
		int nextCard=nextToDeal;
		nextToDeal++;
		return nextCard;
	}

	//write this
	public void shufle(Deck d)
	{
		int cardY=0;
		int cardX=0;
		int cardTemp=0;
		for (int i=0;i<1000;i++)
		{
			cardX=(int)Math.random()*51;
			cardY=(int)Math.random()*51;
		}
	}
}