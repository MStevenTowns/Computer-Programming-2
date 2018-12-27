//	Einstein.java		Author: Lewis/Loftus/Cocking

/*
M. Steven Towns 
Applets
3/14/2014
*/

import java.applet.*;
import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Einstein extends Applet
{
	// draws a quotation by Albert Einstein among some shapes.
	
    public void paint (Graphics page)
    {
     page.drawRect (50, 50, 40, 40);    // square
     page.drawRect (60, 80, 225, 30);   // rectangle
     page.drawOval (75, 65, 20, 20);    // circle
     page.drawLine (35, 60, 100, 120);  // line
 
     page.drawString ("Out of clutter, find simplicity.", 110, 70);
     page.drawString ("-- Albert Einstein", 130, 100);
 
   }
}
