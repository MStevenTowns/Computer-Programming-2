/*
M. Steven Towns
Black Jack
2/19/2014
*/

import java.io.*; 
import java.util.*; 

public class BlackJack
{
	public static void main(String[] args)
	{
		Deck myDeck=new Deck();
		int choice=0;
		System.out.println("1) shuffle\n2)hit");
		if (choice==1)
		{
			myDeck.shufle(myDeck);
		}
		if (choice==2)
		{
			myDeck.dealOne();
		}
	}
}