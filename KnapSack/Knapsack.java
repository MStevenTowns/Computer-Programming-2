/* 
M. Steven Towns
Knapsack Assignment
1/27/2013
*/


//0-1 knapsack problem
//12 loops (all nested)
//store values in array

/*
cr wv bs mt sd sp r sv ss sl cl y         weight = none
0  0  0  0  0  0  0 0  0  0  0  0         Science = none

cr wv bs mt sd sp r sv ss sl cl y         weight = some       better :)
0  0  0  0  0  0  0 0  0  0  0  1         Science = 4

cr wv bs mt sd sp r sv ss sl cl y         weight = some       even better :)
0  0  0  0  0  0  0 0  0  0  1  0         Science = 6







*/

import java.io.*;
import java.util.*;

public class Knapsack
{
	public static void main(String[]args)
	{
		int cr, wv, bs, mt, sd, sp, r, sv, ss, sl, cl, y, rating, weight, max=0;
		for (cr=0; cr<=1;cr++)
		{
			for(wv=0;wv<=1;wv++)
			{
				for (bs=0;bs<=1;bs++)
				{
					for(mt=0;mt<=1;mt++)
					{
						for(sd=0;sd<=1;sd++)
						{
							for(sp=0;sp<=1;sp++)
							{
								for (r=0;r<=1;r++)
								{
									for (sv=0;sv<=1;sv++)
									{
										for(ss=0;ss<=1;ss++)
										{
											for (sl=0;sl<=1;sl++)
											{
												for (cl=0;cl<=1;sl++)
												{
													for (y=0;y<=1;y++)
													{
														//cr, wv, will be 0 or 1
														rating=(cr*6)+(wv*3)+(bs*4)+(mt*8)+(sd*7)+(sp*7)+(r*8)+(sv*5)+(ss*2)+(sl*8)+(cl*6)+(y*4);
														weight=(cr*80)+(wv*25)+(bs*224)+(mt*65)+(sd*127)+(sp*188)+(r*104)+(sv*7)+(ss*92)+(sl*324)+(cl*36)+(y*22);
														int count=0;
														if ((weight<700)&&(rating>max)&&(count<20))
														{
															//record best choices
															max=rating;
															System.out.println(cr+" "+wv+" "+bs+" "+mt+" "+sd+" "+sp+" "+r+" "+sv+" "+ss+" "+sl+" "+cl+"  "+y);
															count++;
															break;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}