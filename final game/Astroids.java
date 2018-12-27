/** A simple Astroid game
*@author Alex Garza
*@version 1.0.1 May 20, 2014
*/

public class Astroids
{
	/** creates Turtles */
	private static Turtle carlos, asterone, astertwo, asterthree;
	/** moves ship up*/
	public static void up()
	{
			carlos.setDirection(90);
			carlos.forward(15);
	}
	/** moves ship down*/
	public static void down()
	{
			carlos.setDirection(270);
			carlos.forward(15);
	}
	/** moves ship left*/
	public static void left()
	{
			carlos.setDirection(180);
			carlos.forward(15);
	}
	/** moves ship right*/
	public static void right()
	{
			carlos.setDirection(0);
			carlos.forward(15);
	}
	/** Distance formula 
	*@param x1    first X value
	*@param x2    second X value
	*@param y1    first y value
	*@param y2    second X value
	*@return      returns the distance
	*/
	public static double distance(double x1, double x2, double y1, double y2)
	{
		double part1=(x1-x2)*(x1-x2);
		double part2=(y1-y2)*(y1-y2);
		double dist=(Math.sqrt(part1+part2));
		return dist;
	}
	public static void quitGame() 
	{	
		carlos.exit();
		System.exit(0);
	}
	/** Creates game board, asteroids, and coordinates player movement*/
	public static void main(String [] args)
	{
		asterone = new Turtle();
		asterone.up();
		asterone.setPosition(0,500,90);
		asterone.shape("Astroid.png");
		asterone.shapeSize(100,100);
		asterone.face(0,0);
		carlos = new Turtle();
		carlos.bgcolor("black");
		carlos.setCanvasSize(600,600);
		carlos.zoom(-300,-300,300,300);
		carlos.up();
		carlos.shape("arrow");
		carlos.fillColor("white");
		carlos.setPosition(0,0,90);
		carlos.onKey("quitGame","Escape");
		carlos.onKey("up","Up",false,true);
		carlos.onKey("down","Down",false,true);
		carlos.onKey("left","Left",false,true);
		carlos.onKey("right","Right",false,true);
		int count=0;
		for(int r=0;r<100;r++)
		{
			if(asterone.getX()>400||asterone.getX()<-400||asterone.getY()>400||asterone.getY()<-400)
			{
				if (asterone.getY()<-400) 
				{
					asterone.setPosition(-500,-500,0);
					asterone.setPosition(-500,500,0);
				}
				int a=(int)(Math.random()*8);
				asterone.setPosition(0,500,270);
				if (a==1) asterone.setPosition(0,290,270);
				if (a==2) asterone.setPosition(290,290,225);
				if (a==3) asterone.setPosition(290,0,180);
				if (a==4) asterone.setPosition(290,-290,135);
				if (a==5) 
				{
					asterone.setPosition(500,500,0);
					asterone.setPosition(500,0,0);
					asterone.setPosition(0,-290,90);
				}
				if (a==6) asterone.setPosition(-290,-290,45);
				if (a==7) asterone.setPosition(-290,0,0);
				if (a==8) asterone.setPosition(-290,290,315);
				for (int c=0;c<100;c++)
				{
					asterone.speed(25);
					asterone.forward(10);
					if (50>distance(asterone.getX(),carlos.getX(),asterone.getY(),carlos.getY())){
						System.exit(0);
					}
					if (carlos.getX()<-300){
							double y=(carlos.getY());
							carlos.setPosition(300,y,180);
							carlos.forward(25);
					}
					if (carlos.getX()>300){
							double y=(carlos.getY());
							carlos.setPosition(-300,y,0);
							carlos.forward(25);
					}
					if (carlos.getY()<-300){
							double x=(carlos.getX());
							carlos.setPosition(x,300,270);
							carlos.forward(25);
					}
					if (carlos.getY()>300){
							double x=(carlos.getX());
							carlos.setPosition(x,-300,90);
							carlos.forward(25);
					}
				}	
			}	
			
		}	
	}
}
