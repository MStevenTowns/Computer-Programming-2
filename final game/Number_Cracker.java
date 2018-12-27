/** Creates a number deciphering game 
* @author Alex Garza
* @author Catlyn Hallett
* @version 2.0 May 20,2014
*/

import java.util.Scanner;
import java.applet.*;
import java.awt.*;

public class Number_Cracker
{
	/** changes the displayed numbers 
	*@param Turtle a: manual labor
	*@param int count: the number to be displayed
	*@param int space: number corresponding with area
	*@param Color GREEN: indicates right/wrong
	*/
	static void display(Turtle a, int count, int space, Color GREEN)
	{
		a.clear();
		a.setDirection(0);
		a.width(10);
		a.up();
		int bit = 10;
		int side = 80;
		if(space == 1){
			a.setPosition(-120, 120);
		}
		else if(space == 2){
			a.setPosition(-120, -120);
		}
		else if(space == 3){
			a.setPosition(20, 120);
		}
		else if (space == 4){
			a.setPosition(20, -120);
		}
		else if(space == 5){
			a.setPosition(-220, 70);
			bit = bit / 2;
			side = side / 2;
		}
		else if(space == 6){
			a.setPosition(-220, -70);
			bit = bit / 2;
			side = side / 2;
		}
		
		switch(count){
			case 0:
					a.penColor("gray");
				for(int i = 0; i < 4; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
				for(int i = 0; i < 3; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
				break;
			case 1:
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				for(int i = 0; i < 2; i++){
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				break;
			case 2:
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				for(int i = 0; i < 2; i++){
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				for(int i = 0; i < 2; i++){
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
				break;
			case 3:
				for(int i = 0; i < 3; i++){
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(20);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				for(int i = 0; i < 2; i++){
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
				break;
			case 4:
				a.penColor(GREEN);
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
				a.penColor("gray");
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				break;
			case 5:
				a.penColor(GREEN);
				for(int i = 0; i < 3; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.penColor(GREEN);
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);	
				break;
			case 6:
					a.penColor(GREEN);
				for(int i = 0; i < 4; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
				break;
			case 7:
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor(GREEN);
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor("gray");
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
					a.penColor(GREEN);
				for(int i = 0; i < 2; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
				break;
			case 8:
					a.penColor(GREEN);
				for(int i = 0; i < 4; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.left(90);
				for(int i = 0; i < 3; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
				break;
			case 9:
					a.penColor(GREEN);
				for(int i = 0; i < 3; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}
					a.penColor("gray");
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.penColor(GREEN);
				for(int i = 0; i < 3; i++){
					a.forward(bit);
					a.down();
					a.forward(side);
					a.up();
					a.forward(bit);
					a.right(90);
				}	
				break;
		}
	}
	
	public static void quitGame() 
	{	
		bob.exit();
		System.exit(0);
	}
	private static Turtle bob;
	/** Creates the Game */
	public static void main(String[] args)
	{
		Color GREEN = new Color(0,255,0);
		Color RED = new Color(255,0,0);
		bob = new Turtle();
		bob.onKey("quitGame","Escape");
		bob.setCanvasSize(500,500);
		bob.bgcolor("black");
		bob.hide();
		bob.speed(0);
		
		Turtle check = bob.clone();
		check.shape("Check.png");
		check.setPosition(175, 0);
		check.stamp();
		
		boolean win = false;
		int num[] = new int[4];
		for (int x = 0; x < 4; x++)
		{
			num[x]=((int)(Math.random()*10));
		}
		
		Turtle aye = bob.clone();
		Turtle bee = bob.clone();
		Turtle cee = bob.clone();
		Turtle dee = bob.clone();
		Turtle scoreA = bob.clone();
		Turtle scoreB = bob.clone();
		
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int correct = 0;  //num is in right place
		int right = 0;	//num is in code
			
		display(aye, countOne, 1, GREEN);
		display(bee, countTwo, 2, GREEN);
		display(cee, countThree, 3, GREEN);
		display(dee, countFour, 4, GREEN);
		
		for (int x = 0; x < 8; x++)
		{
			double xCo;
			double yCo;
			int test = 1;
			while(test != 0){
				while(!bob.mouseButton()){
					try{
						Thread.sleep(1);
					}
					catch(InterruptedException e){
					}
				}
				xCo = bob.canvasX(bob.mouseX());
				yCo = bob.canvasY(bob.mouseY());
				if(xCo < 0 && xCo > -160){
					if(yCo > 0 && yCo < 240){
						test = 1;
						if(countOne == 9){
							countOne = 0;
						}
						else{
							countOne++;
						}
						display(aye, countOne, test, GREEN);
					}
					if(yCo < 0 && yCo > -240){
						test = 2;
						if(countTwo == 9){
							countTwo = 0;
						}
						else{
							countTwo++;
						}
						display(bee, countTwo, test, GREEN);
					
					}
				}
				else if(xCo > 160){
					if(yCo > -20 && yCo < 20){
						test = 0;
					}
				}
				else if(xCo > 0){
					if(yCo > 0 && yCo < 240){
						test = 3;
						if(countThree == 9){
							countThree = 0;
						}
						else{
							countThree++;
						}
						display(cee, countThree, test, GREEN);
					}
					if(yCo < 0 && yCo > -240){
						test = 4;
						if(countFour == 9){
							countFour = 0;
						}
						else{
							countFour++;
						}
						display(dee, countFour, test,GREEN);
					
					}
				}
				try{
					Thread.sleep(150);
				}
				catch(InterruptedException e){
				}
			}
			
			int guess[] = new int[4];
			guess[0] = countOne;
			guess[1] = countTwo;
			guess[2] = countThree;
			guess[3] = countFour;
			
			for (int q = 0; q < 4; q++)
			{
				if (guess[q] == num[q]) correct++;
				if (guess[q] == num[0] || guess[q] == num[1] || guess[q] == num[2] || guess[q] == num[3]) right++;
			}
			
			display(scoreA, correct, 5, GREEN);
			display(scoreB, right, 6, GREEN);
			
			if (correct == 4) 
			{
				win = true;
				break;
			}
			else{
				correct = 0;
				right = 0;
			}
		}
		
		if(win){
			display(aye, num[0], 1, GREEN);
			display(bee, num[1], 2, GREEN);
			display(cee, num[2], 3, GREEN);
			display(dee, num[3], 4, GREEN);
			display(scoreA, 4, 5, GREEN);
			display(scoreB, 4, 6, GREEN);
		}
		else{
			display(aye, num[0], 1, RED);
			display(bee, num[1], 2, RED);
			display(cee, num[2], 3, RED);
			display(dee, num[3], 4, RED);
			display(scoreA, 8, 5, RED);
			display(scoreB, 8, 6, RED);
		}
	}
}
