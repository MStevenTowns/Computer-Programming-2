/*
M. Steven Towns
CompareSorts
4/16/2014
*/

import java.io.*;
import java.util.*;

public class CompareSorts
{
	public static int bubble(int[] nums)
	{
		boolean test = true;
		int count = 0;
		while(test)
		{
			test = false;
			for(int i = 0; i < 49; i++)
			{
				if(nums[i] > nums[i + 1])
				{
					int hold=nums[i+1];
					nums[i+1]=nums[i];
					nums[i]=hold;
					test = true;
				}
			}
			count++;
		}
		return count;
	}
	public static int select(int[] nums)
	{
		boolean test2 = true;
		int count = 0;
		int lowInd;
		
		for(int i = 0; i < 49; i++)
		{
			lowInd = i;
			for(int j = i + 1; j < 50; j++)
			{
				if(nums[j] < nums[lowInd])
				{
					lowInd = j;
				}
			}
			if(nums[i] != nums[lowInd])
			{
				count++;
			}
			int mid = nums[i];
			nums[i]=nums[lowInd];
			nums[lowInd] = mid;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] nums=new int[50];
		for(int i=0;i<50;i++)
		{
			nums[i]=(int)(Math.random()*1000);
		}
		int[] numsOther=new int[50];
		for(int i=0;i<50;i++)
		{
			numsOther[i]=nums[i];
		}
		int bubbleCount=bubble(nums);
		int selectCount=select(numsOther);
		
		System.out.println("\nBubble swaps: "+bubbleCount);		
		System.out.print("Selection swaps: "+selectCount+"\n");
	}
}