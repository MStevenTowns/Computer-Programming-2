/**Shooter: A game for shooting turtles
* @author M. Steven Towns
* @version 1.0.3 May 18, 2014
*/



import java.io.*;
import java.util.*;

/**Main game driver*/
public class Shooter
{
	private static Turtle t1,t2,player,write;
	private static int shots,kills,escape,count=0,range=30,size=900;
	private static double speed=20;
	
	/**This runs when the program is started*/
	public static void main(String[] args)
	{
		playField();
		t1.onKey("quitGame","Escape");
		t1.onKey("isInRange","Space");
		player.onClick("isInRange", player, false, false, false);
		while(true)	moveTurtles();
	}
	
	public static void playField()//Sets up the play field and turtles
	{
		t1=new Turtle();
		t1.shape("Shoot.png");
		t2=new Turtle();
		t2.shape("Shoot.png");
		player=new Turtle();
		write=new Turtle();
		write.hide();
		write.up();
		player.up();
		player.shape("Crosshair.png");
		player.shapeSize(range,range);
		player.fillColor("Black");
		player.speed(0);
		t1.up();
		t2.up();
		start(t1);
		start(t2);
		player.setCanvasSize(size,size); //use this to set size of window
		player.zoom(-size/2,0,size/2,size);
		player.backgroundMode(0);
		player.bgpic("pond.jpeg");
	}
	/** Determines if the turtles have reached the edge of the screen
	*@return boolean: if the turtle is outside of the screen
	*/
	public static boolean offScreen(Turtle t)
	{
		boolean out=false;
		if (t.getY()>size) out=true;
		return out;
	}
	
	/**moves turtles across the screen */
	public static void moveTurtles()
	{
		double xPos=t1.canvasX(t1.mouseX());
		double yPos=t1.canvasY(t1.mouseY());
		player.setPosition(xPos,yPos);
		if (player.mouseButton()==false)  
		{
			count=0;
		}
		if (player.mouseButton1()&&count==0) isInRange();
		if (offScreen(t1)) 
		{
			start(t1);
			escape++;
		}
		if (offScreen(t2)) 
		{
			start(t2);
			escape++;
		}
		t1.speed(speed);
		t2.speed(speed);
		t1.forward(10);
		t2.forward(10);
	}
	
	/**puts the turtles on the bottom facing the top
	*/
	public static void start(Turtle t)
	{
		t.hide();
		t.shape("Shoot.png");
		t.setPosition((Math.random()*size)-size/2,0);
		t.face((Math.random()*size)-size/2,size);
		t.fillColor("Light Green");
		t.show();
	}
	
	/**Determines if a turtle is within range of the mouse*/
	public static void isInRange()
	{
		shots++;
		double xPos=t1.canvasX(t1.mouseX());
		double yPos=t1.canvasY(t1.mouseY());
		player.setPosition(xPos,yPos);
		if (range>distance(t1.getX(),xPos,t1.getY(),yPos))
		{
			killTurtle(t1);
		}
		if (range>distance(t2.getX(),xPos,t2.getY(),yPos))
		{
			killTurtle(t2);
		}		
	}

	/**Kills the turtle, leaving gore*/
	public static void killTurtle(Turtle t)
	{
		t.fillColor("Red");
		kills++;
		count++;
		write.write(Integer.toString(kills),"Arial",50,1,100,-100);
		t.shape("Headless.png");
		t.stamp();
		start(t);
		if (speed>10)speed-=.5;
		
	}

	/**This exits the game*/
	public static void quitGame() 
	{	
		t1.exit();
		System.exit(0);
	}
	
	/**Used to find the distance between two points
	@param x1: x-cord of first point
	@param x2: x-cord of second point
	@param y1: y-cord of first point
	@param y2: y-cord of second point
	@return dist: double value of the distance between the points
	*/
	private static double distance(double x1,double x2, double y1, double y2)//distance between 2 points
	{
		double part1=(x1-x2)*(x1-x2);
		double part2=(y1-y2)*(y1-y2);
		double dist=Math.sqrt(part1+part2);
		return dist;
	}
	
}