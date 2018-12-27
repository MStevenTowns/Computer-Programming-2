import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import javax.swing.JOptionPane;


public class Arcadia{
	
	//GUI
	private static void GUI(){
		
		//Fields
		//Give name of programs to be run
		String[] gameName = {"Shooter", "Snake", "Sudoku", "TRTLR", "Astroids", "Number Cracker", "Quit"};
		
		//Element creation
		JFrame frame = new JFrame("Arcadia");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		//Element Attributes
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(200, 250));
		
		//Element Styling
		panel.setBackground(new Color(0,0,102));
		
		//Margin
		panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		//number of buttons
		JButton[] buttons = new JButton[7];
		
		JLabel l=new JLabel("Choose a Game:");
		l.setForeground(new Color(255,255,255));
		
			buttons[0] = new JButton(gameName[0]);
			buttons[0].setForeground(new Color(255,255,255));
			buttons[0].setBackground(new Color(96,96,96));
			Border compound = BorderFactory.createCompoundBorder(new EmptyBorder(0,0,0,0), new EmptyBorder(10, 0, 10, 0));
			buttons[0].setBorder(compound);
			
			buttons[1] = new JButton(gameName[1]);
			buttons[1].setForeground(new Color(255,255,255));
			buttons[1].setBackground(new Color(0,102,0));
			buttons[1].setBorder(compound);
			
			buttons[2] = new JButton(gameName[2]);
			buttons[2].setForeground(new Color(0,0,0));
			buttons[2].setBackground(new Color(255,255,255));
			buttons[2].setBorder(compound);
			
			buttons[3] = new JButton(gameName[3]);
			buttons[3].setForeground(new Color(0,0,0));
			buttons[3].setBackground(new Color(255,255,0));
			buttons[3].setBorder(compound);
			
			buttons[4] = new JButton(gameName[4]);
			buttons[4].setForeground(new Color(255,255,255));
			buttons[4].setBackground(new Color(0,0,0));
			buttons[4].setBorder(compound);
			
			buttons[5] = new JButton(gameName[5]);
			buttons[5].setForeground(new Color(0,204,0));
			buttons[5].setBackground(new Color(0,0,0));
			buttons[5].setBorder(compound);
			
			buttons[6] = new JButton(gameName[6]);
			buttons[6].setForeground(new Color(255,255,255));
			buttons[6].setBackground(new Color(255,0,0));
			buttons[6].setBorder(compound);

		buttons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		}); 
		
		buttons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// Turtle Shooter				
				try{
					Process p;
					p = Runtime.getRuntime().exec("java Shooter");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
			}
		});
		
		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//Execute when button is pressed
				try{
					Process p;
					p = Runtime.getRuntime().exec("python Snake.py");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
				
			}
		});
		
		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//Execute when button is pressed
				try{
					Process p;
					p = Runtime.getRuntime().exec("java Sudoku");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
			}
		}); 
		
		buttons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try{
					Process p;
					p = Runtime.getRuntime().exec("java TRTLR");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
			}
		}); 
		
		buttons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try{
					Process p;
					p = Runtime.getRuntime().exec("java Astroids");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
			}
		});
		
		buttons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try{
					Process p;
					p = Runtime.getRuntime().exec("java Number_Cracker");
					p.waitFor();
				}
				catch (Exception x){
					x.printStackTrace();
					System.exit(0);
				}
			}
		});
				
		//Assigning Element
		c.ipadx = 100;
		c.insets = new Insets(3,2,3,2);
		c.fill = GridBagConstraints.CENTER;
		
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 0;
		
		panel.add(l, c);
		
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		c.ipadx = 20;
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		for (int i = 0; i < buttons.length; i++){
				c.gridx = 1;
				c.gridy = 2 + i;
			panel.add(buttons[i], c);
		}
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	
	//Main 
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				GUI();
			}
		});
	}
}
