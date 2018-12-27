/*
M. Steven Towns
Link List Assignment
3/31/2014
*/

import java.io.*;
import java.util.*;

public class LinkedList 
{
	// fields
	private Node head;

	//constructors
	LinkedList() 
	{
		head = null;
	}
	
   //Methods
	public void addToFront(int v) //I broke the fucker
	{
		Node newNode = new Node(v, head);
		head.setPrev(newNode);
		head = newNode;
		head.setPrev(null);
		
	}
	public void removeFromFront(Node front)
	{
		head=front.getNext();
	}
	
	public void delete(int v) //Broken
	{
		Node current=head;
		int x=this.find(v);
		
		for(int i=0;i<x;i++)
		{
			current=current.getNext();
		}
		System.out.println("prev"+current.getPrev());
		System.out.println("next"+current.getNext());
		(current.getPrev()).setNext(current.getNext());
	}
	
	public int find(int v) //works
	{
		int send=1;
		Node current=head;
		while ((current!=null))
		{
			current=current.getNext();
			send++;
			if (current.getValue()==v) return send;
		}
		if (current==null) send=-1;
		return send;
		
	}
	
	public void printNodes () //iterative solution
	{
		Node current = head;
		System.out.println();
		while (current != null) 
		{
			//System.out.println(current.getValue() + "\n");
			System.out.println(current);
			current = current.getNext();
		}
	}
    //recursive solution
	public void printNodes2() 
	{
		pnr(head);
	}

	private void pnr(Node current) 
	{
		if (current !=null) 
		{
			System.out.println(current.getValue() + "\n");
			pnr(current.getNext());  		
		}
	}
  
	public void printNodes3() //print reverse
	{
		pnrr(head);
	}

	private void pnrr(Node current) 
	{
		if (current !=null) 
		{
			pnrr(current.getNext());  
			System.out.println(current.getValue() + "\n");
		}
	}
}
