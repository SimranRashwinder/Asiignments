import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Gomoku_game_100377444 {
	
  public static void main(String[] args) {
		
		int menu ;
		String player1 = null;
		String player2 = null;
		int x;
		int y;
		int a;
		int color=0;
		///Date d = sdf.format(c1.getTime());
		boolean freeSpace =false;
		System.out.println("Menu");
		System.out.println("1. Show the Winners");
		System.out.println("2. Play");
		System.out.println("3. Exit");
		System.out.println("Enter 1, 2 or 3: ");
		Scanner input = new Scanner(System.in);
		menu = input.nextInt();
		
		
			
		if(menu ==1) {
			System.out.println("WINNERS are here");
			}
		else if(menu == 3) {
			System.out.println("You exited the game");
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
			double [][]gameBoard = new double[16][16];
		
			//for black 
			for (int i =0; i<2; i++) {
				System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
	      		x = input.nextInt();
				y = input.nextInt();
				
				while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
				gameBoard[x][y] = 1;
				generateBoard(gameBoard);
			}
		   //for white
		   System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		   x = input.nextInt();
	       y = input.nextInt();
			
	       while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
				System.out.println("Invalid coordinate x! or y!");
				System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
	      		x = input.nextInt();
				y = input.nextInt();	
				
			}
		   gameBoard[x][y] = 2;
		   generateBoard(gameBoard);
		   
		   //for player 2
		   System.out.println("Now its turn for " + player2);
		   System.out.println("You have three options: ");
		   System.out.println("1. Play as black");
		   System.out.println("2. Play as white: ");
		   System.out.println("3. Place two more stones: ");
		    
		   System.out.println("Select 1,2,or3:");
		   a = input.nextInt();
		   
		
		  
		   if(a==1) {
			   System.out.println("You are ready to play as black and now" + player1 + "need to play as white and select the position where to put the 2nd white stone.");
			   //2nd white
			   System.out.println("Enter the coordinates where you want to add the other white stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 2;
			   generateBoard(gameBoard);
			   
			   //now each player have to add atleast 3 more stones or play for 3 times
			   for(int i=0; i<3;i++) {
			   System.out.println("Turn for " + player2);
			   System.out.println("Enter the coordinates where you want to add the stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 2;
			   generateBoard(gameBoard);
			   
			   System.out.println("Turn for " + player1);
			   System.out.println("Enter the coordinates where you want to add the stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 1;
			   generateBoard(gameBoard);
			   }
			   			   
			  do { 
				  System.out.println("Turn for " + player2);
			   System.out.println("Enter the coordinates where you want to add the stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 2;
			   generateBoard(gameBoard);
			   
			   System.out.println("Turn for " + player1);
			   System.out.println("Enter the coordinates where you want to add the stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 1;
			   generateBoard(gameBoard);
			   
			   
			   
			   }while(( winner(x, y, gameBoard)== false)|| freeSpace == true);
					   
		   }else if(a == 2) {
			   System.out.println("Enter the coordinates where you want to add the other white stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 2;
			   generateBoard(gameBoard);
			   
			   System.out.println(player1 +" will have first turn");
			   System.out.println("Enter the coordinates where you want to add stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 1;
			   generateBoard(gameBoard);
			   
			   if(winner(x,y,gameBoard)== true || freeSpace==false ) {
				   System.out.println("Enter the coordinates where you want to add the white stone:");
				   x = input.nextInt();
				   y = input.nextInt();
				   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
						System.out.println("Invalid coordinate x! or y!");
						System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
			      		x = input.nextInt();
						y = input.nextInt();	
						
					}
				   gameBoard[x][y] = 2;
				   generateBoard(gameBoard);
				   
				   //for white stone
				   System.out.println("Enter the coordinates where you want to add the black stone:");
				   x = input.nextInt();
				   y = input.nextInt();
				   
				   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
						System.out.println("Invalid coordinate x! or y!");
						System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
			      		x = input.nextInt();
						y = input.nextInt();	
						
					}
				   gameBoard[x][y] = 1;
				   
				   generateBoard(gameBoard);
				   
			   }
			   
			   
			   
			   
			   
			   
		   }else if(a == 3) {
			   System.out.println("Now, you want need to place 2 stones: ");
			   //for black stone
			   System.out.println("Enter the coordinates where you want to add the other black stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 1;
			   generateBoard(gameBoard);
			   
			   //for white stone
			   System.out.println("Enter the coordinates where you want to add the other white stone:");
			   x = input.nextInt();
			   y = input.nextInt();
			   
			   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
					System.out.println("Invalid coordinate x! or y!");
					System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
		      		x = input.nextInt();
					y = input.nextInt();	
					
				}
			   gameBoard[x][y] = 2;
			   
			   generateBoard(gameBoard);
			  
			   //1st player choosing the color
			   System.out.println("Now, its turn for the first player to choose the color. Please enter 1 for black or 2 for white color: ");
			   color = input.nextInt();
			   if(color == 1) {
				   System.out.println("So, " + player1 + " you chose black color(X) and its "+player2+"'s turn first");
				   
				   System.out.println("Enter the coordinates where you want to add the stone:");
				   x = input.nextInt();
				   y = input.nextInt();
				   
				   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
						System.out.println("Invalid coordinate x! or y!");
						System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
			      		x = input.nextInt();
						y = input.nextInt();	
						
					}
				   gameBoard[x][y] = 2;
				   
				   generateBoard(gameBoard);
				   
				   while(winner(x,y,gameBoard) == false || freeSpace == true) {
					   
					   System.out.println("Enter the coordinates where you want to add the stone:");
					   x = input.nextInt();
					   y = input.nextInt();
					   
					   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
							System.out.println("Invalid coordinate x! or y!");
							System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
				      		x = input.nextInt();
							y = input.nextInt();	
					   }
					     gameBoard[x][y] = 1;
					   
					     generateBoard(gameBoard);
					     
					    System.out.println("Enter the coordinates where you want to add the stone:");
					        x = input.nextInt();
					        y = input.nextInt();
					   
				        while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
							System.out.println("Invalid coordinate x! or y!");
							System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
				      		x = input.nextInt();
							y = input.nextInt();	
							
						}
					   
					    gameBoard[x][y] = 2;
					   
					    generateBoard(gameBoard);
				   }
				   
				   
				   
			   }else if(color == 2) {
				   System.out.println("So, " + player1 + " you chose white color(O) and you will have your turn first  ");
				   
				   System.out.println("Enter the coordinates where you want to add the stone:");
				   x = input.nextInt();
				   y = input.nextInt();
				   
				   while((x < 1 || x > 15) || (y < 1 || y > 15) || gameBoard[x][y] != 0 ) {
						System.out.println("Invalid coordinate x! or y!");
						System.out.println("Enter coordinate x (ROW)and y (COLUMN): ");
			      		x = input.nextInt();
						y = input.nextInt();	
						
					}
				   }
				   gameBoard[x][y] = 2;
				   
				   generateBoard(gameBoard);
			   }
		}
		
		try {
			
			//for calendar
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = (Calendar)c1.clone(); // to prevent altering the original date
			
			c2.add(Calendar.DATE, 1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm");
			//System.out.println("The game started at "+sdf.format(c1.getTime()));
			
			
			//System.out.println("The game ended at " +sdf.format(c2.getTime()));
			
			long timeDiff = c2.getTimeInMillis() - c1.getTimeInMillis();
			long minutes = timeDiff / 60000;
			//System.out.printf("minutes = %d , in hours = %2d \n",minutes,minutes/60);
			
			System.out.printf("Date and time of the start of competetion is %s\n",sdf.format(c1.getTime()));
			System.out.printf("Name of first player is %s\n", player1);
	        System.out.printf("Name of second player is %s\n", player2);
	        System.out.printf("The winner is", winner(0, 0, null));
	        System.out.printf("Date and time of the end of competetion is %d\n",sdf.format(c2.getTime()));
	        System.out.printf("The compettion held for about %d = hours ,minutes =  %2d \n",minutes,minutes/60);
	        
			
			
			String destinationFile = "./src/Result";
		       // this is for writing to a file
				FileWriter fw = new FileWriter(destinationFile,false); // default: true (append)
				PrintWriter pw = new PrintWriter(fw);
				pw.printf("Date and time of the start of competetion is",sdf.format(c1.getTime()));
		        pw.printf("Name of first player is", player1);
		        pw.printf("Name of second player is", player2);
		        pw.printf("Date and time of the end of competetion is",sdf.format(c2.getTime()));
		        pw.printf("The winner is", winner(0, 0, null));
		        pw.printf("The compettion held for about %d = hours ,minutes =  %2d \n",minutes,minutes/60);
		        
		        pw.close();
		        }
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}

		}   
			
  
  
  public static void generateBoard(double [][] gameBoard) {
	  
		System.out.println("================================================");
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
		
	    System.out.println("================================================="); 
	    System.out.println();
  }    
  public static boolean winner(int row, int column, double [][] gameBoard) {
	  if((gameBoard[row][column]==gameBoard[row+1][column])&& (gameBoard[row+1][column] == gameBoard[row+2][column])&&(gameBoard[row+2][column]==gameBoard[row+3][column])&&(gameBoard[row+3][column]==gameBoard[row+4][column])) {
		  return true;
	  }
	  if((gameBoard[row][column]==gameBoard[row][column+1])&& (gameBoard[row][column+2] == gameBoard[row][column+1])&&(gameBoard[row][column+2]==gameBoard[row][column+3])&&(gameBoard[row][column+3]==gameBoard[row][column+4])) {
		  return true;
	  }
	  if((gameBoard[row][column]==gameBoard[row+1][column+1])&& (gameBoard[row+1][column+1] ==gameBoard[row+2][column+2])&&(gameBoard[row+2][column+2]==gameBoard[row+3][column+3])&&(gameBoard[row+3][column+3]==gameBoard[row+4][column+4])) {
		  return true;
	  }
	  
	return false;  }
  }


