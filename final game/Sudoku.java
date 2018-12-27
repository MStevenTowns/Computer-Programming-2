/**Sudoku: An Interactive Turtle() Adventure for the Mind
* @author Caitlyn Hallett
* @version 1.5 May 15, 2014
*/
import java.util.Scanner;
import java.io.*;

/**main game driver*/
public class Sudoku
{
	/**Determines which square mouse is pointing to
	*@param Turtle a: needed to determine mouse coordinates
	*@return int for number of correct answer of selected square
	*/
	static int cipher(Turtle a)
	{
		int test = 0;
		if(a.canvasY(a.mouseY()) > -115 && a.canvasY(a.mouseY()) < -85){
			if((a.canvasX(a.mouseX()) > -245 && a.canvasX(a.mouseX()) < -215)){
				test = 1;
			}
			if((a.canvasX(a.mouseX()) > -195 && a.canvasX(a.mouseX()) < -165)){
				test = 2;
			}
			if((a.canvasX(a.mouseX()) > -145 && a.canvasX(a.mouseX()) < -115)){
				test = 3;
			}
			if((a.canvasX(a.mouseX()) > -95 && a.canvasX(a.mouseX()) < -65)){
				test = 4;
			}
			if((a.canvasX(a.mouseX()) > -45 && a.canvasX(a.mouseX()) < -15)){
				test = 5;
			}
			if((a.canvasX(a.mouseX()) > 5 && a.canvasX(a.mouseX()) < 35)){
				test = 6;
			}
			if((a.canvasX(a.mouseX()) > 55 && a.canvasX(a.mouseX()) < 85)){
				test = 7;
			}
			if((a.canvasX(a.mouseX()) > 105 && a.canvasX(a.mouseX()) < 135)){
				test = 8;
			}
			if((a.canvasX(a.mouseX()) > 155 && a.canvasX(a.mouseX()) < 185)){
				test = 9;
			}
		}
			return test;
	}
	private static Turtle one;
	public static void quitGame() 
	{	
		one.exit();
		System.exit(0);
	}
	public static void main(String[] args)
	{
		
		/** int boardNo for number of premade board
		*Board object
		*int toggle for number of squares to hide
		*int diff for selected difficulty
		*/
		int boardNo;
		Board sudoku;
		int toggle;
		int diff;
		
		/**Turtle for manual labor: draws board, stamps number icons*/
		one = new Turtle();
		one.onKey("quitGame","Escape");
		one.speed(0);
		one.up();
		
		one.shape("Diff.png");
		one.shapeSize(500,500);
		while(one.mouseButton() == false){
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException p){
			}
		}
		
		if(one.mouseX() > 84){
			diff = 3;
		}
		else if(one.mouseX() > -83){
			diff = 2;
		}
		else{
			diff = 1;
		}
		
		boardNo = ((int)(Math.random() * 10)) + 1;
		sudoku = new Board(boardNo);
		toggle = 45 + (diff * 3);
		sudoku.toggle(toggle);
				
		for(int x = 0; x < 9; x++){
			for(int y = 0; y < 9; y++){
				if(sudoku.board[x][y][1] == 1){
					switch(sudoku.board[x][y][0]){
						case 1:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("one.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 2:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("two.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 3:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("three.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 4:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("four.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 5:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("five.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 6:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("six.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 7:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("seven.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 8:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("eight.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
						case 9:
							one.setPosition((x * 30) - 230, (y * -30) + 230);
							one.shape("nine.png");
							one.shapeSize(30, 30);
							one.stamp();
							break;
					}
				}
				else{
					one.setPosition((x * 30) - 230, (y * -30) + 230);
					one.shape("square");
					one.fillColor("white");
					one.shapeSize(30, 30);
					one.stamp();
				}
			}
		}
		
		/**another Turtle for manual labor, draws lines*/
		Turtle lines = new Turtle();
		lines.hide();
		lines.penColor("gray");
		lines.width(5);
		lines.up();
		
		lines.setPosition(-246, 156);
		lines.down();
		lines.forward(270);
		lines.up();
		lines.setPosition(-246, 66);
		lines.down();
		lines.forward(270);
		lines.up();
		
		lines.setPosition(-156, 246);
		lines.face(-156, 0);
		lines.down();
		lines.forward(270);
		lines.up();
		lines.setPosition(-66, 246);
		lines.down();
		lines.forward(270);
		lines.up();
		lines.face(0, -24);
		
		/**Turtles for displaying options(1-9) and following mouse*/
		Turtle a = one.clone();
		Turtle b = one.clone();
		Turtle c = one.clone();
		Turtle d = one.clone();
		Turtle e = one.clone();
		Turtle f = one.clone();
		Turtle g = one.clone();
		Turtle h = one.clone();
		Turtle i = one.clone();
		
		a.setPosition(-230, -100);
		a.shape("one.png");
		a.shapeSize(30, 30);
		a.speed(1);
		a.show();
		b.setPosition(-180, -100);
		b.shape("two.png");
		b.shapeSize(30, 30);
		b.speed(1);
		b.show();
		c.setPosition(-130, -100);
		c.shape("three.png");
		c.shapeSize(30, 30);
		c.speed(1);
		c.show();
		d.setPosition(-80, -100);
		d.shape("four.png");
		d.shapeSize(30, 30);
		d.speed(1);
		d.show();
		e.setPosition(-30, -100);
		e.shape("five.png");
		e.shapeSize(30, 30);
		e.speed(1);
		e.show();
		f.setPosition(20, -100);
		f.shape("six.png");
		f.shapeSize(30, 30);
		f.speed(1);
		f.show();
		g.setPosition(70, -100);
		g.shape("seven.png");
		g.shapeSize(30, 30);
		g.speed(1);
		g.show();
		h.setPosition(120, -100);
		h.shape("eight.png");
		h.shapeSize(30, 30);
		h.speed(1);
		h.show();
		i.setPosition(170, -100);
		i.shape("nine.png");
		i.shapeSize(30, 30);
		i.speed(1);
		i.show();
		
		int correct = 0;
		while(correct < toggle){
			while(a.mouseButton() == false || cipher(a) == 0){
				try{
					Thread.sleep(1);
				}
				catch(InterruptedException p){
				}
			}
		int test = cipher(a);
		
		/**series of ifs displaying user guesses on screen/board*/
		if(test == 1){
				a.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				a.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				a.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				a.forward(1);
			}
			
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 1){
						one.shape("one.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("oneB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			a.setPosition(-230, -100);
			a.face(250, -100);
		}
		
		if(test == 2){
				b.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				b.forward(1);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				b.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				b.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 2){
						one.shape("two.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("twoB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			b.setPosition(-180, -100);
			b.face(250, -100);
		}
		
		if(test == 3){
				c.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				c.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				c.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				c.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 3){
						one.shape("three.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("threeB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			c.setPosition(-130, -100);
			c.face(250, -100);
		}
		
		if(test == 4){
				d.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				d.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				d.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				d.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 4){
						one.shape("four.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("fourB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			d.setPosition(-80, -100);
			d.face(250, -100);
		}
		
		if(test == 5){
				e.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				e.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				e.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				e.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 5){
						one.shape("five.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("fiveB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			e.setPosition(-30, -100);
			e.face(250, -100);
		}
		
		if(test == 6){
				f.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				f.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				f.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				f.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 6){
						one.shape("six.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("sixB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			f.setPosition(20, -100);
			f.face(250, -100);
		}
		
		if(test == 7){
				g.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				g.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				g.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				g.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 7){
						one.shape("seven.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("seven.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			g.setPosition(70, -100);
			g.face(250, -100);
		}
		
		if(test == 8){
				h.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				h.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				h.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				h.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 8){
						one.shape("eight.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("eight.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			h.setPosition(120, -100);
			h.face(250, -100);
		}
		
		if(test == 9){
				i.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				i.forward(10);
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException p){
				}
			while(a.mouseButton() == false){
				i.face(a.canvasX(a.mouseX()),a.canvasY(a.mouseY()));
				i.forward(1);
			}
			int x = sudoku.cipherX(a.canvasX(a.mouseX()));
			int y = sudoku.cipherY(a.canvasY(a.mouseY()));
			if(x != 9 && y!= 9){
				if(sudoku.board[x][y][1] == 0){
					if(sudoku.board[x][y][0] == 9){
						one.shape("nine.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
						correct++;
					}
					else{
						one.shape("nineB.png");
						one.shapeSize(30, 30);
						one.setPosition((x * 30) - 230, (y * -30) + 230);
						one.stamp();
					}
				}
			}
			
			i.setPosition(170, -100);
			i.face(250, -100);
		}
		}
		System.out.print("Winner!\n\n");
		
		System.out.println("Would you like to play again?");
	}
}