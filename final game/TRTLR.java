/**TRTLR: A colorful, simon-says-esque video game
* @author Caitlyn Hallett
* @version 1.2 May 15, 2014
*/

import java.util.Scanner;
import java.io.*;

public class TRTLR
{
	/**method that returns a char equal to the user selection
	 *char compared to random generated string
	 *determined my mouse coordinates when clicked
	 *
	 *@throws InterruptedException: for pausing thread
	 *@param x: mouse Y coordinate, unique to each choice
	 *@return returns character corresponding with choice
	 */
	 
	static char getInt(Turtle a)
	{
		while(a.mouseButton() == false){
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException e){
			}
		}
		int x = (int)a.canvasY(1.0 * a.mouseY());
		if(x < -215){
			return 'a';
		}
		if(x < -178){
			return 'b';
		}
		if(x < -142){
			return 'c';
		}
		if(x < -107){
			return 'd';
		}
		if(x < -71){
			return 'e';
		}
		if(x < -36){
			return 'f';
		}
		if(x < 0){
			return 'g';
		}
		if(x < 36){
			return 'n';
		}
		if(x < 71){
			return 'm';
		}
		if(x < 107){
			return 'l';
		}
		if(x < 142){
			return 'k';
		}
		if(x < 178){
			return 'j';
		}
		if(x < 215){
			return 'i';
		}
		return 'h';
	}
	
	private static Turtle one;
	public static void quitGame() 
	{	
		one.exit();
		System.exit(0);
	}
	
	/**Main method
	*/
	public static void main(String[] args)
	{
		/**The manual labor of the program*/
		one = new Turtle(-250,-250);
		one.onKey("quitGame","Escape");
		one.bgpic("street.jpeg");
		one.shape("Turtle.png");
		one.shapeSize(50,50);
		one.speed(500);
		one.up();
		one.hide();
		
		/**turtle in control of fancy screens stating right/wrong*/
		Turtle screen = new Turtle();
		screen.hide();
		
		/**int lives to track incorrect guesses
		*int rounds to track length of sequence needed
		*empty string seq to build
		*boolean for comparing user guess to sequence
		*/
		int lives = 3;
		int rounds = 1;
		String seq = "";
		boolean correct = true;
		
	/**where action of game occurs
	*continues until lives reach zero
	*/
	while(lives > 0){
		/**adds new character to seq
		*character corresponds to command
		*/
		if(correct){
		int random = ((int)(Math.random() * 14)) + 1;
		switch(random){
			case 1: seq += "a";
				break;
			case 2: seq += "b";
				break;
			case 3: seq += "c";
				break;
			case 4: seq += "d";
				break;
			case 5: seq += "e";
				break;
			case 6: seq += "f";
				break;
			case 7: seq += "g";
				break;
			case 8: seq += "h";
				break;
			case 9: seq += "i";
				break;
			case 10: seq += "j";
				break;
			case 11: seq += "k";
				break;
			case 12: seq += "l";
				break;
			case 13: seq += "m";
				break;
			case 14: seq += "n";
				break;
		}
		}
		/**executes string seq for player*/
		for(int i = 0; i < seq.length(); i++){
			switch(seq.charAt(i)){
				case 'a': one.setPosition(-250,-234);
					one.face(0,-234);
					break;
				case 'b': one.setPosition(250,-198);
					one.face(0,-198);
					break;
				case 'c': one.setPosition(-250,-162);
					one.face(0,-162);
					break;
				case 'd': one.setPosition(250,-126);
					one.face(0,-126);
					break;
				case 'e': one.setPosition(-250,-90);
					one.face(0,-90);
					break;
				case 'f': one.setPosition(250,-54);
					one.face(0,-54);
					break;
				case 'g': one.setPosition(-250,-18);
					one.face(0,-18);
					break;
				case 'h': one.setPosition(250,234);
					one.face(0,234);
					break;
				case 'i': one.setPosition(-250,198);
					one.face(0,198);
					break;
				case 'j': one.setPosition(250,162);
					one.face(0,162);
					break;
				case 'k': one.setPosition(-250,126);
					one.face(0,126);
					break;
				case 'l': one.setPosition(250,90);
					one.face(0,90);
					break;
				case 'm': one.setPosition(-250,54);
					one.face(0,54);
					break;
				case 'n': one.setPosition(250,18);
					one.face(0,18);
					break;
			}
			one.show();
			one.forward(550);
			one.hide();
		}
		
		System.out.println("\n\n\n");
		System.out.println("Round: " + rounds);
		System.out.println("lives left: " + (lives - 1));
		
		/**@throws InterruptedException e : pauses thread*/
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException e){
		}
		screen.shape("Turn.png");
		screen.shapeSize(500,500);
		screen.show();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
		}
		screen.hide();
		
		/**Waits for user input data ans stores it*/
		String play = "";
		for(int i = 0; i < seq.length(); i++){
			char input = getInt(one);
			switch(input){
				case 'a': one.setPosition(-250,-234);
					one.face(0,-234);
					break;
				case 'b': one.setPosition(250,-198);
					one.face(0,-198);
					break;
				case 'c': one.setPosition(-250,-162);
					one.face(0,-162);
					break;
				case 'd': one.setPosition(250,-126);
					one.face(0,-126);
					break;
				case 'e': one.setPosition(-250,-90);
					one.face(0,-90);
					break;
				case 'f': one.setPosition(250,-54);
					one.face(0,-54);
					break;
				case 'g': one.setPosition(-250,-18);
					one.face(0,-18);
					break;
				case 'h': one.setPosition(250,234);
					one.face(0,234);
					break;
				case 'i': one.setPosition(-250,198);
					one.face(0,198);
					break;
				case 'j': one.setPosition(250,162);
					one.face(0,162);
					break;
				case 'k': one.setPosition(-250,126);
					one.face(0,126);
					break;
				case 'l': one.setPosition(250,90);
					one.face(0,90);
					break;
				case 'm': one.setPosition(-250,54);
					one.face(0,54);
					break;
				case 'n': one.setPosition(250,18);
					one.face(0,18);
					break;
			}
			one.speed(500);
			one.show();
			one.forward(550);
			play += input;
			one.hide();
		}
		
		/**compares user guess to seq*/
		boolean test = false;
		for(int i = 0; i < seq.length(); i++){
			if(seq.charAt(i) != play.charAt(i)){
				test = true;
			}
		}
		if(test){
			correct = false;
			lives--;
			screen.shape("Red.png");
			screen.shapeSize(500,500);
			screen.show();
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
			}
			screen.hide();
		}
		else{
			correct = true;
			rounds++;
			screen.shape("Green.png");
			screen.shapeSize(500,500);
			screen.show();
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
			}
			screen.hide();
		}
	}
	
		screen.shape("game over.png");
		screen.shapeSize(500,500);
		screen.show();
		
		/**@throws InterruptedException e : pauses thread*/
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
	}
}