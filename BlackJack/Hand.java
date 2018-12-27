/*
M. Steven Towns
Black Jack
2/19/2014
*/

import java.io.*; 
import java.util.*; 

public class Hand
{
	//instance variable
	Card[]card=new Card[5];
	int numCards=0;
	
	// constructors
	Hand(Card c1, Card c2)
	{
		card[0]=c1;
		card[1]=c2;
		numCards=2;
	}


	public String showAllCards()
	{
		String s="This hand has these cards:\n";
		for(int i=0; i<numCards;i++)
		{
			s+=card[i]+"\n";
		}
		return s;
	}

	public void hit(Card c)
	{
		card[numCards]=c;
		numCards++;
	}	
}