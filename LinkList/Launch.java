/*
M. Steven Towns
Link List Assignment
3/31/2014
*/

import java.io.*;
import java.util.*;

public class Launch
{
	public static void main(String[] args){
	LinkedList myList=new LinkedList();
	Scanner sc=new Scanner (System.in);
	boolean run=true;
	int num, in;
	String ans;
	do{
		System.out.println("\n1: Add a node\n2: Print nodes\n3: Find a value\n4: Delete\n5: Quit");
		System.out.print("What do you want to do?: ");
		in=sc.nextInt();
		switch(in){
			case 1:
				System.out.print("\nWhat is the value of the node?: ");
				num=sc.nextInt();
				myList.addToFront(num);
				break;
			case 2:
				myList.printNodes();
				break;
			case 3:
				System.out.print("\nWhat is the value of the node?: ");
				num=sc.nextInt();
				int test=myList.find(num);
				//System.out.println(test);
				if (test>=0){
					System.out.println("\nThe node is number "+(test)+" in the list.");
				}
				else {
					System.out.print("That number is not currently in the list, would you like to add it?: ");
					ans=sc.next();
					ans=ans.substring(0,1);
					if ((ans.toLowerCase()).equals("y")){
						myList.addToFront(num);
					}
				}
				break;
			case 4:
				System.out.print("What value do you wish to delete?: ");
				num=sc.nextInt();
				if (myList.find(num)>=0)
				{
					myList.delete(num);
				}
				break;
			default:
				run=false;
		}
	}while (run);
	}
}