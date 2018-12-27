/**Board: Sudoku Board builder
* @author Caitlyn Hallett
* @version 1.5 May 15, 2014
*/
public class Board
{
	/**creates 9 * 9 board with toggle-ability*/
	public int[][][] board = new int[9][9][2];
	
	/**@param a : decides which premade board to use*/
	Board(int a)
	{
		for(int x = 0; x < 9; x++){
			for(int y = 0; y < 9; y++){
				board[x][y][1] = 1;
			}
		}
		switch(a){
			case 1: 
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			case 7:
				seven();
				break;
			case 8:
				eight();
				break;
			case 9:
				nine();
				break;
			case 10:
				ten();
				break;
		}
	}
	
	/**@param a : number of squares to blank out*/
	void toggle(int a)
	{
		int x = (int)(Math.random()*9);
		int y = (int)(Math.random()*9);
		for(int i = 0; i < a; i++){
			while(board[x][y][1] == 0){
				x = (int)(Math.random()*9);
				y = (int)(Math.random()*9);
			}
			board[x][y][1] = 0;
		}
	}

	void print()
	{
		for(int x = 0; x < 9; x++){
			for(int y = 0; y < 9; y++){
				if(board[x][y][1] == 0){
					System.out.print("X");
				}
				else{
					System.out.print(board[x][y][0]);
				}
			}
			System.out.println();
		}
	}
	
	/**@param x: mouse x-coordinate
	*@return board index corresponding
	*/
	int cipherX(double x)
	{
		int boardx = 9;
		if(x < -215 && x >= -245){
			boardx = 0;
		}
		if(x < -185 && x >= -215){
			boardx = 1;
		}
		if(x < -155 && x >= -185){
			boardx = 2;
		}
		if(x < -125 && x >= -155){
			boardx = 3;
		}
		if(x < -95 && x >= -125){
			boardx = 4;
		}
		if(x < -65 && x >= -95){
			boardx = 5;
		}
		if(x < -35 && x >= -65){
			boardx = 6;
		}
		if(x < -5 && x >= -35){
			boardx = 7;
		}
		if(x < 25 && x >= -5){
			boardx = 8;
		}
		return boardx;
	}
	
	/**@param y: mouse x-coordinate
	*@return board index corresponding
	*/
	int cipherY(double y)
	{
		int boardy = 9;
		if(y < 245 && y >= 215){
			boardy = 0;
		}
		if(y < 215 && y >= 185){
			boardy = 1;
		}
		if(y < 185 && y >= 155){
			boardy = 2;
		}
		if(y < 155 && y >= 125){
			boardy = 3;
		}
		if(y < 125 && y >= 95){
			boardy = 4;
		}
		if(y < 95 && y >= 65){
			boardy = 5;
		}
		if(y < 65 && y >= 35){
			boardy = 6;
		}
		if(y < 35 && y >= 5){
			boardy = 7;
		}
		if(y < 5 && y >= -25){
			boardy = 8;
		}
		return boardy;
	}
	
	/**premade boards*/
	void one()
	{
		board[0][0][0] = 1;
		board[0][1][0] = 8;
		board[0][2][0] = 6;
		board[0][3][0] = 4;
		board[0][4][0] = 2;
		board[0][5][0] = 7;
		board[0][6][0] = 3;
		board[0][7][0] = 9;
		board[0][8][0] = 5;
		board[1][0][0] = 4;
		board[1][1][0] = 3;
		board[1][2][0] = 7;
		board[1][3][0] = 9;
		board[1][4][0] = 1;
		board[1][5][0] = 5;
		board[1][6][0] = 6;
		board[1][7][0] = 8;
		board[1][8][0] = 2;
		board[2][0][0] = 5;
		board[2][1][0] = 9;
		board[2][2][0] = 2;
		board[2][3][0] = 6;
		board[2][4][0] = 8;
		board[2][5][0] = 3;
		board[2][6][0] = 7;
		board[2][7][0] = 4;
		board[2][8][0] = 1;
		board[3][0][0] = 3;
		board[3][1][0] = 6;
		board[3][2][0] = 9;
		board[3][3][0] = 1;
		board[3][4][0] = 4;
		board[3][5][0] = 2;
		board[3][6][0] = 5;
		board[3][7][0] = 7;
		board[3][8][0] = 8;
		board[4][0][0] = 2;
		board[4][1][0] = 5;
		board[4][2][0] = 1;
		board[4][3][0] = 8;
		board[4][4][0] = 7;
		board[4][5][0] = 9;
		board[4][6][0] = 4;
		board[4][7][0] = 6;
		board[4][8][0] = 3;
		board[5][0][0] = 7;
		board[5][1][0] = 4;
		board[5][2][0] = 8;
		board[5][3][0] = 5;
		board[5][4][0] = 3;
		board[5][5][0] = 6;
		board[5][6][0] = 2;
		board[5][7][0] = 1;
		board[5][8][0] = 9;
		board[6][0][0] = 6;
		board[6][1][0] = 1;
		board[6][2][0] = 5;
		board[6][3][0] = 3;
		board[6][4][0] = 9;
		board[6][5][0] = 4;
		board[6][6][0] = 8;
		board[6][7][0] = 2;
		board[6][8][0] = 7;
		board[7][0][0] = 9;
		board[7][1][0] = 2;
		board[7][2][0] = 4;
		board[7][3][0] = 7;
		board[7][4][0] = 5;
		board[7][5][0] = 8;
		board[7][6][0] = 1;
		board[7][7][0] = 3;
		board[7][8][0] = 6;
		board[8][0][0] = 8;
		board[8][1][0] = 7;
		board[8][2][0] = 3;
		board[8][3][0] = 2;
		board[8][4][0] = 6;
		board[8][5][0] = 1;
		board[8][6][0] = 9;
		board[8][7][0] = 5;
		board[8][8][0] = 4;
	}
	
	void two()
	{
		board[0][0][0] = 4;
		board[0][1][0] = 5;
		board[0][2][0] = 9;
		board[0][3][0] = 6;
		board[0][4][0] = 7;
		board[0][5][0] = 8;
		board[0][6][0] = 1;
		board[0][7][0] = 2;
		board[0][8][0] = 3;
		board[1][0][0] = 3;
		board[1][1][0] = 7;
		board[1][2][0] = 2;
		board[1][3][0] = 9;
		board[1][4][0] = 1;
		board[1][5][0] = 4;
		board[1][6][0] = 8;
		board[1][7][0] = 6;
		board[1][8][0] = 5;
		board[2][0][0] = 6;
		board[2][1][0] = 8;
		board[2][2][0] = 1;
		board[2][3][0] = 3;
		board[2][4][0] = 2;
		board[2][5][0] = 5;
		board[2][6][0] = 9;
		board[2][7][0] = 7;
		board[2][8][0] = 4;
		board[3][0][0] = 1;
		board[3][1][0] = 2;
		board[3][2][0] = 3;
		board[3][3][0] = 4;
		board[3][4][0] = 5;
		board[3][5][0] = 7;
		board[3][6][0] = 6;
		board[3][7][0] = 8;
		board[3][8][0] = 9;
		board[4][0][0] = 7;
		board[4][1][0] = 9;
		board[4][2][0] = 4;
		board[4][3][0] = 8;
		board[4][4][0] = 6;
		board[4][5][0] = 2;
		board[4][6][0] = 5;
		board[4][7][0] = 3;
		board[4][8][0] = 1;
		board[5][0][0] = 8;
		board[5][1][0] = 6;
		board[5][2][0] = 5;
		board[5][3][0] = 1;
		board[5][4][0] = 9;
		board[5][5][0] = 3;
		board[5][6][0] = 7;
		board[5][7][0] = 4;
		board[5][8][0] = 2;
		board[6][0][0] = 2;
		board[6][1][0] = 1;
		board[6][2][0] = 6;
		board[6][3][0] = 7;
		board[6][4][0] = 3;
		board[6][5][0] = 9;
		board[6][6][0] = 4;
		board[6][7][0] = 5;
		board[6][8][0] = 8;
		board[7][0][0] = 5;
		board[7][1][0] = 4;
		board[7][2][0] = 7;
		board[7][3][0] = 2;
		board[7][4][0] = 8;
		board[7][5][0] = 1;
		board[7][6][0] = 3;
		board[7][7][0] = 9;
		board[7][8][0] = 6;
		board[8][0][0] = 9;
		board[8][1][0] = 3;
		board[8][2][0] = 8;
		board[8][3][0] = 5;
		board[8][4][0] = 4;
		board[8][5][0] = 6;
		board[8][6][0] = 2;
		board[8][7][0] = 1;
		board[8][8][0] = 7;
	}
	
	void three()
	{
		board[0][0][0] = 4;
		board[0][1][0] = 9;
		board[0][2][0] = 2;
		board[0][3][0] = 3;
		board[0][4][0] = 1;
		board[0][5][0] = 5;
		board[0][6][0] = 6;
		board[0][7][0] = 7;
		board[0][8][0] = 8;
		board[1][0][0] = 8;
		board[1][1][0] = 1;
		board[1][2][0] = 3;
		board[1][3][0] = 9;
		board[1][4][0] = 6;
		board[1][5][0] = 7;
		board[1][6][0] = 4;
		board[1][7][0] = 5;
		board[1][8][0] = 2;
		board[2][0][0] = 7;
		board[2][1][0] = 5;
		board[2][2][0] = 6;
		board[2][3][0] = 4;
		board[2][4][0] = 2;
		board[2][5][0] = 8;
		board[2][6][0] = 3;
		board[2][7][0] = 1;
		board[2][8][0] = 9;
		board[3][0][0] = 3;
		board[3][1][0] = 4;
		board[3][2][0] = 7;
		board[3][3][0] = 8;
		board[3][4][0] = 9;
		board[3][5][0] = 2;
		board[3][6][0] = 1;
		board[3][7][0] = 6;
		board[3][8][0] = 5;
		board[4][0][0] = 5;
		board[4][1][0] = 2;
		board[4][2][0] = 8;
		board[4][3][0] = 1;
		board[4][4][0] = 7;
		board[4][5][0] = 6;
		board[4][6][0] = 9;
		board[4][7][0] = 4;
		board[4][8][0] = 3;
		board[5][0][0] = 1;
		board[5][1][0] = 6;
		board[5][2][0] = 9;
		board[5][3][0] = 5;
		board[5][4][0] = 4;
		board[5][5][0] = 3;
		board[5][6][0] = 8;
		board[5][7][0] = 2;
		board[5][8][0] = 7;
		board[6][0][0] = 9;
		board[6][1][0] = 7;
		board[6][2][0] = 5;
		board[6][3][0] = 6;
		board[6][4][0] = 3;
		board[6][5][0] = 1;
		board[6][6][0] = 2;
		board[6][7][0] = 8;
		board[6][8][0] = 4;
		board[7][0][0] = 6;
		board[7][1][0] = 8;
		board[7][2][0] = 4;
		board[7][3][0] = 2;
		board[7][4][0] = 5;
		board[7][5][0] = 9;
		board[7][6][0] = 7;
		board[7][7][0] = 3;
		board[7][8][0] = 1;
		board[8][0][0] = 2;
		board[8][1][0] = 3;
		board[8][2][0] = 1;
		board[8][3][0] = 7;
		board[8][4][0] = 8;
		board[8][5][0] = 4;
		board[8][6][0] = 5;
		board[8][7][0] = 9;
		board[8][8][0] = 6;
	}
	
	void four()
	{
		board[0][0][0] = 1;
		board[0][1][0] = 9;
		board[0][2][0] = 5;
		board[0][3][0] = 6;
		board[0][4][0] = 8;
		board[0][5][0] = 2;
		board[0][6][0] = 4;
		board[0][7][0] = 7;
		board[0][8][0] = 3;
		board[1][0][0] = 8;
		board[1][1][0] = 3;
		board[1][2][0] = 7;
		board[1][3][0] = 9;
		board[1][4][0] = 1;
		board[1][5][0] = 4;
		board[1][6][0] = 5;
		board[1][7][0] = 6;
		board[1][8][0] = 2;
		board[2][0][0] = 4;
		board[2][1][0] = 6;
		board[2][2][0] = 2;
		board[2][3][0] = 3;
		board[2][4][0] = 7;
		board[2][5][0] = 5;
		board[2][6][0] = 8;
		board[2][7][0] = 9;
		board[2][8][0] = 1;
		board[3][0][0] = 2;
		board[3][1][0] = 8;
		board[3][2][0] = 4;
		board[3][3][0] = 1;
		board[3][4][0] = 3;
		board[3][5][0] = 6;
		board[3][6][0] = 7;
		board[3][7][0] = 5;
		board[3][8][0] = 9;
		board[4][0][0] = 5;
		board[4][1][0] = 1;
		board[4][2][0] = 6;
		board[4][3][0] = 2;
		board[4][4][0] = 9;
		board[4][5][0] = 7;
		board[4][6][0] = 3;
		board[4][7][0] = 4;
		board[4][8][0] = 8;
		board[5][0][0] = 9;
		board[5][1][0] = 7;
		board[5][2][0] = 3;
		board[5][3][0] = 4;
		board[5][4][0] = 5;
		board[5][5][0] = 8;
		board[5][6][0] = 2;
		board[5][7][0] = 1;
		board[5][8][0] = 6;
		board[6][0][0] = 3;
		board[6][1][0] = 4;
		board[6][2][0] = 8;
		board[6][3][0] = 5;
		board[6][4][0] = 6;
		board[6][5][0] = 9;
		board[6][6][0] = 1;
		board[6][7][0] = 2;
		board[6][8][0] = 7;
		board[7][0][0] = 7;
		board[7][1][0] = 2;
		board[7][2][0] = 9;
		board[7][3][0] = 8;
		board[7][4][0] = 4;
		board[7][5][0] = 1;
		board[7][6][0] = 6;
		board[7][7][0] = 3;
		board[7][8][0] = 5;
		board[8][0][0] = 6;
		board[8][1][0] = 5;
		board[8][2][0] = 1;
		board[8][3][0] = 7;
		board[8][4][0] = 2;
		board[8][5][0] = 3;
		board[8][6][0] = 9;
		board[8][7][0] = 8;
		board[8][8][0] = 4;
	}
	
	void five()
	{
		board[0][0][0] = 2;
		board[0][1][0] = 5;
		board[0][2][0] = 6;
		board[0][3][0] = 7;
		board[0][4][0] = 9;
		board[0][5][0] = 8;
		board[0][6][0] = 1;
		board[0][7][0] = 3;
		board[0][8][0] = 4;
		board[1][0][0] = 9;
		board[1][1][0] = 3;
		board[1][2][0] = 8;
		board[1][3][0] = 6;
		board[1][4][0] = 1;
		board[1][5][0] = 4;
		board[1][6][0] = 2;
		board[1][7][0] = 5;
		board[1][8][0] = 7;
		board[2][0][0] = 4;
		board[2][1][0] = 7;
		board[2][2][0] = 1;
		board[2][3][0] = 5;
		board[2][4][0] = 2;
		board[2][5][0] = 3;
		board[2][6][0] = 8;
		board[2][7][0] = 6;
		board[2][8][0] = 9;
		board[3][0][0] = 6;
		board[3][1][0] = 9;
		board[3][2][0] = 4;
		board[3][3][0] = 1;
		board[3][4][0] = 5;
		board[3][5][0] = 2;
		board[3][6][0] = 3;
		board[3][7][0] = 7;
		board[3][8][0] = 8;
		board[4][0][0] = 1;
		board[4][1][0] = 2;
		board[4][2][0] = 3;
		board[4][3][0] = 4;
		board[4][4][0] = 8;
		board[4][5][0] = 7;
		board[4][6][0] = 6;
		board[4][7][0] = 9;
		board[4][8][0] = 5;
		board[5][0][0] = 5;
		board[5][1][0] = 8;
		board[5][2][0] = 7;
		board[5][3][0] = 9;
		board[5][4][0] = 3;
		board[5][5][0] = 6;
		board[5][6][0] = 4;
		board[5][7][0] = 2;
		board[5][8][0] = 1;
		board[6][0][0] = 3;
		board[6][1][0] = 1;
		board[6][2][0] = 9;
		board[6][3][0] = 2;
		board[6][4][0] = 4;
		board[6][5][0] = 5;
		board[6][6][0] = 7;
		board[6][7][0] = 8;
		board[6][8][0] = 6;
		board[7][0][0] = 7;
		board[7][1][0] = 4;
		board[7][2][0] = 2;
		board[7][3][0] = 8;
		board[7][4][0] = 6;
		board[7][5][0] = 9;
		board[7][6][0] = 5;
		board[7][7][0] = 1;
		board[7][8][0] = 3;
		board[8][0][0] = 8;
		board[8][1][0] = 6;
		board[8][2][0] = 5;
		board[8][3][0] = 3;
		board[8][4][0] = 7;
		board[8][5][0] = 1;
		board[8][6][0] = 9;
		board[8][7][0] = 4;
		board[8][8][0] = 2;
	}
	
	void six()
	{
		board[0][0][0] = 1;
		board[0][1][0] = 2;
		board[0][2][0] = 6;
		board[0][3][0] = 7;
		board[0][4][0] = 5;
		board[0][5][0] = 8;
		board[0][6][0] = 9;
		board[0][7][0] = 3;
		board[0][8][0] = 4;
		board[1][0][0] = 9;
		board[1][1][0] = 4;
		board[1][2][0] = 7;
		board[1][3][0] = 3;
		board[1][4][0] = 6;
		board[1][5][0] = 2;
		board[1][6][0] = 5;
		board[1][7][0] = 1;
		board[1][8][0] = 8;
		board[2][0][0] = 3;
		board[2][1][0] = 5;
		board[2][2][0] = 8;
		board[2][3][0] = 4;
		board[2][4][0] = 1;
		board[2][5][0] = 9;
		board[2][6][0] = 2;
		board[2][7][0] = 7;
		board[2][8][0] = 6;
		board[3][0][0] = 5;
		board[3][1][0] = 9;
		board[3][2][0] = 1;
		board[3][3][0] = 2;
		board[3][4][0] = 3;
		board[3][5][0] = 6;
		board[3][6][0] = 8;
		board[3][7][0] = 4;
		board[3][8][0] = 7;
		board[4][0][0] = 2;
		board[4][1][0] = 6;
		board[4][2][0] = 4;
		board[4][3][0] = 8;
		board[4][4][0] = 7;
		board[4][5][0] = 1;
		board[4][6][0] = 3;
		board[4][7][0] = 5;
		board[4][8][0] = 9;
		board[5][0][0] = 7;
		board[5][1][0] = 8;
		board[5][2][0] = 3;
		board[5][3][0] = 5;
		board[5][4][0] = 9;
		board[5][5][0] = 4;
		board[5][6][0] = 6;
		board[5][7][0] = 2;
		board[5][8][0] = 1;
		board[6][0][0] = 8;
		board[6][1][0] = 7;
		board[6][2][0] = 9;
		board[6][3][0] = 1;
		board[6][4][0] = 2;
		board[6][5][0] = 3;
		board[6][6][0] = 4;
		board[6][7][0] = 6;
		board[6][8][0] = 5;
		board[7][0][0] = 6;
		board[7][1][0] = 1;
		board[7][2][0] = 2;
		board[7][3][0] = 9;
		board[7][4][0] = 4;
		board[7][5][0] = 5;
		board[7][6][0] = 7;
		board[7][7][0] = 8;
		board[7][8][0] = 3;
		board[8][0][0] = 4;
		board[8][1][0] = 3;
		board[8][2][0] = 5;
		board[8][3][0] = 6;
		board[8][4][0] = 8;
		board[8][5][0] = 7;
		board[8][6][0] = 1;
		board[8][7][0] = 9;
		board[8][8][0] = 2;
	}
	
	void seven()
	{
		board[0][0][0] = 4;
		board[0][1][0] = 2;
		board[0][2][0] = 9;
		board[0][3][0] = 3;
		board[0][4][0] = 5;
		board[0][5][0] = 1;
		board[0][6][0] = 6;
		board[0][7][0] = 7;
		board[0][8][0] = 8;
		board[1][0][0] = 3;
		board[1][1][0] = 5;
		board[1][2][0] = 6;
		board[1][3][0] = 7;
		board[1][4][0] = 8;
		board[1][5][0] = 2;
		board[1][6][0] = 9;
		board[1][7][0] = 1;
		board[1][8][0] = 4;
		board[2][0][0] = 7;
		board[2][1][0] = 8;
		board[2][2][0] = 1;
		board[2][3][0] = 4;
		board[2][4][0] = 9;
		board[2][5][0] = 6;
		board[2][6][0] = 3;
		board[2][7][0] = 5;
		board[2][8][0] = 2;
		board[3][0][0] = 5;
		board[3][1][0] = 4;
		board[3][2][0] = 2;
		board[3][3][0] = 6;
		board[3][4][0] = 7;
		board[3][5][0] = 9;
		board[3][6][0] = 1;
		board[3][7][0] = 8;
		board[3][8][0] = 3;
		board[4][0][0] = 1;
		board[4][1][0] = 9;
		board[4][2][0] = 3;
		board[4][3][0] = 2;
		board[4][4][0] = 4;
		board[4][5][0] = 8;
		board[4][6][0] = 5;
		board[4][7][0] = 6;
		board[4][8][0] = 7;
		board[5][0][0] = 8;
		board[5][1][0] = 6;
		board[5][2][0] = 7;
		board[5][3][0] = 1;
		board[5][4][0] = 3;
		board[5][5][0] = 5;
		board[5][6][0] = 4;
		board[5][7][0] = 2;
		board[5][8][0] = 9;
		board[6][0][0] = 2;
		board[6][1][0] = 3;
		board[6][2][0] = 4;
		board[6][3][0] = 5;
		board[6][4][0] = 6;
		board[6][5][0] = 7;
		board[6][6][0] = 8;
		board[6][7][0] = 9;
		board[6][8][0] = 1;
		board[7][0][0] = 6;
		board[7][1][0] = 7;
		board[7][2][0] = 8;
		board[7][3][0] = 9;
		board[7][4][0] = 1;
		board[7][5][0] = 4;
		board[7][6][0] = 2;
		board[7][7][0] = 3;
		board[7][8][0] = 5;
		board[8][0][0] = 9;
		board[8][1][0] = 1;
		board[8][2][0] = 5;
		board[8][3][0] = 8;
		board[8][4][0] = 2;
		board[8][5][0] = 3;
		board[8][6][0] = 7;
		board[8][7][0] = 4;
		board[8][8][0] = 6;
	}
	
	void eight()
	{
		board[0][0][0] = 1;
		board[0][1][0] = 6;
		board[0][2][0] = 8;
		board[0][3][0] = 4;
		board[0][4][0] = 7;
		board[0][5][0] = 9;
		board[0][6][0] = 5;
		board[0][7][0] = 2;
		board[0][8][0] = 3;
		board[1][0][0] = 5;
		board[1][1][0] = 7;
		board[1][2][0] = 2;
		board[1][3][0] = 8;
		board[1][4][0] = 3;
		board[1][5][0] = 6;
		board[1][6][0] = 1;
		board[1][7][0] = 9;
		board[1][8][0] = 4;
		board[2][0][0] = 4;
		board[2][1][0] = 9;
		board[2][2][0] = 3;
		board[2][3][0] = 5;
		board[2][4][0] = 1;
		board[2][5][0] = 2;
		board[2][6][0] = 6;
		board[2][7][0] = 7;
		board[2][8][0] = 8;
		board[3][0][0] = 9;
		board[3][1][0] = 1;
		board[3][2][0] = 7;
		board[3][3][0] = 2;
		board[3][4][0] = 6;
		board[3][5][0] = 3;
		board[3][6][0] = 8;
		board[3][7][0] = 4;
		board[3][8][0] = 5;
		board[4][0][0] = 3;
		board[4][1][0] = 4;
		board[4][2][0] = 5;
		board[4][3][0] = 7;
		board[4][4][0] = 8;
		board[4][5][0] = 1;
		board[4][6][0] = 2;
		board[4][7][0] = 6;
		board[4][8][0] = 9;
		board[5][0][0] = 8;
		board[5][1][0] = 2;
		board[5][2][0] = 6;
		board[5][3][0] = 9;
		board[5][4][0] = 4;
		board[5][5][0] = 5;
		board[5][6][0] = 3;
		board[5][7][0] = 1;
		board[5][8][0] = 7;
		board[6][0][0] = 2;
		board[6][1][0] = 8;
		board[6][2][0] = 4;
		board[6][3][0] = 6;
		board[6][4][0] = 5;
		board[6][5][0] = 7;
		board[6][6][0] = 9;
		board[6][7][0] = 3;
		board[6][8][0] = 1;
		board[7][0][0] = 7;
		board[7][1][0] = 3;
		board[7][2][0] = 9;
		board[7][3][0] = 1;
		board[7][4][0] = 2;
		board[7][5][0] = 8;
		board[7][6][0] = 4;
		board[7][7][0] = 5;
		board[7][8][0] = 6;
		board[8][0][0] = 6;
		board[8][1][0] = 5;
		board[8][2][0] = 1;
		board[8][3][0] = 3;
		board[8][4][0] = 0;
		board[8][5][0] = 4;
		board[8][6][0] = 7;
		board[8][7][0] = 8;
		board[8][8][0] = 2;
	}
	
	void nine()
	{
		board[0][0][0] = 7;
		board[0][1][0] = 5;
		board[0][2][0] = 6;
		board[0][3][0] = 2;
		board[0][4][0] = 3;
		board[0][5][0] = 8;
		board[0][6][0] = 4;
		board[0][7][0] = 9;
		board[0][8][0] = 1;
		board[1][0][0] = 4;
		board[1][1][0] = 2;
		board[1][2][0] = 8;
		board[1][3][0] = 1;
		board[1][4][0] = 6;
		board[1][5][0] = 9;
		board[1][6][0] = 3;
		board[1][7][0] = 5;
		board[1][8][0] = 7;
		board[2][0][0] = 9;
		board[2][1][0] = 1;
		board[2][2][0] = 3;
		board[2][3][0] = 5;
		board[2][4][0] = 7;
		board[2][5][0] = 4;
		board[2][6][0] = 6;
		board[2][7][0] = 2;
		board[2][8][0] = 8;
		board[3][0][0] = 8;
		board[3][1][0] = 6;
		board[3][2][0] = 9;
		board[3][3][0] = 7;
		board[3][4][0] = 1;
		board[3][5][0] = 3;
		board[3][6][0] = 2;
		board[3][7][0] = 4;
		board[3][8][0] = 5;
		board[4][0][0] = 5;
		board[4][1][0] = 7;
		board[4][2][0] = 2;
		board[4][3][0] = 8;
		board[4][4][0] = 4;
		board[4][5][0] = 6;
		board[4][6][0] = 1;
		board[4][7][0] = 3;
		board[4][8][0] = 9;
		board[5][0][0] = 1;
		board[5][1][0] = 3;
		board[5][2][0] = 4;
		board[5][3][0] = 9;
		board[5][4][0] = 2;
		board[5][5][0] = 5;
		board[5][6][0] = 8;
		board[5][7][0] = 7;
		board[5][8][0] = 6;
		board[6][0][0] = 3;
		board[6][1][0] = 4;
		board[6][2][0] = 1;
		board[6][3][0] = 3;
		board[6][4][0] = 5;
		board[6][5][0] = 7;
		board[6][6][0] = 9;
		board[6][7][0] = 8;
		board[6][8][0] = 2;
		board[7][0][0] = 6;
		board[7][1][0] = 8;
		board[7][2][0] = 7;
		board[7][3][0] = 4;
		board[7][4][0] = 9;
		board[7][5][0] = 2;
		board[7][6][0] = 5;
		board[7][7][0] = 1;
		board[7][8][0] = 3;
		board[8][0][0] = 2;
		board[8][1][0] = 9;
		board[8][2][0] = 5;
		board[8][3][0] = 3;
		board[8][4][0] = 8;
		board[8][5][0] = 1;
		board[8][6][0] = 7;
		board[8][7][0] = 6;
		board[8][8][0] = 4;
	}
	
	void ten()
	{
		board[0][0][0] = 2;
		board[0][1][0] = 3;
		board[0][2][0] = 8;
		board[0][3][0] = 4;
		board[0][4][0] = 7;
		board[0][5][0] = 5;
		board[0][6][0] = 6;
		board[0][7][0] = 9;
		board[0][8][0] = 1;
		board[1][0][0] = 4;
		board[1][1][0] = 5;
		board[1][2][0] = 9;
		board[1][3][0] = 6;
		board[1][4][0] = 8;
		board[1][5][0] = 1;
		board[1][6][0] = 3;
		board[1][7][0] = 7;
		board[1][8][0] = 2;
		board[2][0][0] = 6;
		board[2][1][0] = 7;
		board[2][2][0] = 1;
		board[2][3][0] = 2;
		board[2][4][0] = 3;
		board[2][5][0] = 9;
		board[2][6][0] = 8;
		board[2][7][0] = 5;
		board[2][8][0] = 4;
		board[3][0][0] = 9;
		board[3][1][0] = 1;
		board[3][2][0] = 3;
		board[3][3][0] = 5;
		board[3][4][0] = 6;
		board[3][5][0] = 4;
		board[3][6][0] = 2;
		board[3][7][0] = 8;
		board[3][8][0] = 7;
		board[4][0][0] = 8;
		board[4][1][0] = 2;
		board[4][2][0] = 6;
		board[4][3][0] = 3;
		board[4][4][0] = 9;
		board[4][5][0] = 7;
		board[4][6][0] = 1;
		board[4][7][0] = 4;
		board[4][8][0] = 5;
		board[5][0][0] = 5;
		board[5][1][0] = 4;
		board[5][2][0] = 7;
		board[5][3][0] = 1;
		board[5][4][0] = 2;
		board[5][5][0] = 8;
		board[5][6][0] = 9;
		board[5][7][0] = 3;
		board[5][8][0] = 6;
		board[6][0][0] = 3;
		board[6][1][0] = 6;
		board[6][2][0] = 5;
		board[6][3][0] = 9;
		board[6][4][0] = 4;
		board[6][5][0] = 2;
		board[6][6][0] = 7;
		board[6][7][0] = 1;
		board[6][8][0] = 8;
		board[7][0][0] = 1;
		board[7][1][0] = 8;
		board[7][2][0] = 2;
		board[7][3][0] = 7;
		board[7][4][0] = 5;
		board[7][5][0] = 3;
		board[7][6][0] = 4;
		board[7][7][0] = 6;
		board[7][8][0] = 9;
		board[8][0][0] = 7;
		board[8][1][0] = 9;
		board[8][2][0] = 4;
		board[8][3][0] = 8;
		board[8][4][0] = 1;
		board[8][5][0] = 6;
		board[8][6][0] = 5;
		board[8][7][0] = 2;
		board[8][8][0] = 3;
	}
}