/*
M. Steven Towns
Link List Assignment
3/31/2014
*/

import java.io.*;
import java.util.*;

public class Node
{
	//data members
	private int value;
	private Node next, prev;
	
	//constructors
	Node()
	{
		value=0;
		next=null;
		prev=null;
	}
	Node(int v)
	{
		value=v;
		next=null;
		prev=null;
	}
	Node(int v, Node n)
	{
		value=v;
		next=n;
		prev=null;
	}
	Node(int v, Node n, Node p)
	{
		value=v;
		next=n;
		prev=p;
	}
	
	//Methods
	public void setValue(int v)
	{
		value=v;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setNext(Node n)
	{
		next=n;
	}
	public void setPrev(Node p)
	{
		prev=p;
	}
	
	public Node getNext()
	{
		return next;
	}
	public Node getPrev()
	{
		return prev;
	}
	public String toString()
	{
		String result="Node value= "+getValue()+"\n";
		return result;
	}
}