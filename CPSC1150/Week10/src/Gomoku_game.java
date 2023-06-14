import java.util.Scanner;

public class Gomoku_game {
	
   public static void main(String[] args) {
		
		int menu ;
		String player1;
		String player2;
		int x;
		int y;
		int a;
		String color;
		System.out.println("Menu");
		System.out.println("1. Show the Winners");
		System.out.println("2. Play");
		System.out.println("3. Exit");
		System.out.println("Enter 1, 2 or 3: ");
		Scanner input = new Scanner(System.in);
		menu = input.nextInt();
		if(menu ==1) {
			System.out.println("WINNERS");
			}
		else if(menu == 2) {
			System.out.println("Play the game");
			
			System.out.println("Enter the name of first player: ");
			player1 =input.next();
			System.out.println("Enter the name of second player: ");
			player2 = input.next();
			
			System.out.println("The first player places three stones, two black and one white on the board. The second player then selects one of the three options: play as black, play as white and place another white stone or place two other stones, one black and one white and let the first player choose the color.");
			System.out.println("In this case 'X' will represent black stone and 'O' will represent white stone");
			
			System.out.println("Now, its turn for " + player1 );
			
			
//			System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
//			x = input.nextInt();
//			y = input.nextInt();
//			
//			double [][]gameBoard = new double[16][16];
//			System.out.println("==============================================");
//			
//			for (int row = 0; row < gameBoard.length; row++) {
//				for (int column = 0; column < gameBoard[row].length; column++) {
//				    if(row == 0 && column!=0) {
//				    	System.out.printf("%2d|", column);
//				    }
//				    else if (column == 0 && row!=0) {
//				    	System.out.printf("%2d|",row);
//				    }
//				    else if(row == x && column == y) {
//				    	System.out.print("X |");
//				    }
//				    else
//				    	System.out.print( "  |" );
//				}   
//				    System.out.println();
//				}
//			
//		    System.out.println("============================================");
//		}
		   double [][]gameBoard = new double[16][16];
		   //for black 
		   for (int i =0; i<2; i++) {
			   System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
				x = input.nextInt();
				y = input.nextInt();
				
				gameBoard[x][y] = 1;
				//gameBoard[x][y] = 2;
				
				
				System.out.println("==============================================");
				
				for (int row = 0; row < gameBoard.length; row++) {
					for (int column = 0; column < gameBoard[row].length; column++) {
					    if(row == 0 && column!=0) {
					    	System.out.printf("%2d|", column);
					    }
					    else if (column == 0 && row!=0) {
					    	System.out.printf("%2d|",row);
					    } else if (gameBoard[row][column] == 1) {
					    	
					    	System.out.print("X |");
					    }else if (gameBoard[row][column] == 1) {
					    	System.out.print("O |");
					    }
					    else
					    	System.out.print( "  |" );
					    
					}   
					    System.out.println();
					}
				
			    System.out.println("============================================"); 
			    System.out.println();
			    
		   }
		   //for white
		   System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
			x = input.nextInt();
			y = input.nextInt();
			
			gameBoard[x][y] = 2;
			

			for (int row = 0; row < gameBoard.length; row++) {
				for (int column = 0; column < gameBoard[row].length; column++) {
				    if(row == 0 && column!=0) {
				    	System.out.printf("%2d|", column);
				    }
				    else if (column == 0 && row!=0) {
				    	System.out.printf("%2d|",row);
				    } else if (gameBoard[row][column] == 1) {
				    	
				    	System.out.print("X |");
				    }else if (gameBoard[row][column] == 2) {
				    	System.out.print("O |");
				    }
				    else
				    	System.out.print( "  |" );
				    
				}   
				    System.out.println();
				}
			
		    System.out.println("============================================"); 
		    System.out.println();
			
		    //for player2 
			
		   System.out.println("Now its turn for " + player2);
		   System.out.println("You have three options: ");
		   System.out.println("1. Play as black");
		   System.out.println("2.Play as white: ");
		   System.out.println("3.Place two more stones: ");
		    
		   System.out.println("Select 1,2,or3:");
		   a = input.nextInt();
		   if(a==1) {
			   System.out.println("You are ready to play as black and now first player need to select the options.");
			   
		   }else if(a == 2) {
			   System.out.println("Enter the coordinates where you want to add the other white stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   gameBoard[x][y] = 2;
			   for (int row = 0; row < gameBoard.length; row++) {
					for (int column = 0; column < gameBoard[row].length; column++) {
					    if(row == 0 && column!=0) {
					    	System.out.printf("%2d|", column);
					    }
					    else if (column == 0 && row!=0) {
					    	System.out.printf("%2d|",row);
					    } else if (gameBoard[row][column] == 1) {
					    	
					    	System.out.print("X |");
					    }else if (gameBoard[row][column] == 2) {
					    	System.out.print("O |");
					    }
					    else
					    	System.out.print( "  |" );
					    
					}   
					    System.out.println();
					}
			   
		   }else if(a == 3) {
			   System.out.println("Now, you want need to place 2 stones: ");
			   //for black stone
			   System.out.println("Enter the coordinates where you want to add the other black stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   gameBoard[x][y] = 1;
			   for (int row = 0; row < gameBoard.length; row++) {
					for (int column = 0; column < gameBoard[row].length; column++) {
					    if(row == 0 && column!=0) {
					    	System.out.printf("%2d|", column);
					    }
					    else if (column == 0 && row!=0) {
					    	System.out.printf("%2d|",row);
					    } else if (gameBoard[row][column] == 1) {
					    	
					    	System.out.print("X |");
					    }else if (gameBoard[row][column] == 2) {
					    	System.out.print("O |");
					    }
					    else
					    	System.out.print( "  |" );
					    
					}   
					    System.out.println();
					}
			   //for white stone
			   System.out.println("Enter the coordinates where you want to add the other white stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   gameBoard[x][y] = 2;
			   for (int row = 0; row < gameBoard.length; row++) {
					for (int column = 0; column < gameBoard[row].length; column++) {
					    if(row == 0 && column!=0) {
					    	System.out.printf("%2d|", column);
					    }
					    else if (column == 0 && row!=0) {
					    	System.out.printf("%2d|",row);
					    } else if (gameBoard[row][column] == 1) {
					    	
					    	System.out.print("X |");
					    }else if (gameBoard[row][column] == 2) {
					    	System.out.print("O |");
					    }
					    else
					    	System.out.print( "  |" );
					    
					}   
					    System.out.println();
					}
			  System.out.println("Now, its turn for the first player to choose the color.Please enter X or O for the color: ");
			  color = input.next();
		   }
		    
		}
		
		else if(menu == 3) {
			System.out.println("You exited");
	
	}
		input.close();
}

}
