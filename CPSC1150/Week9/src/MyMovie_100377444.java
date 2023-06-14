import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyMovie_100377444 {

	public static void main(String[] args) {
		
		try {
			String sourceFilename = "./src/netflix_titles.csv";
			String destinationFile = "./src/Resultfile.xlsx";
			
			// this is for reading the file
			File f = new File(sourceFilename);
			Scanner readFile = new Scanner(f);
			
			
			
			// this is for writing to a file
			FileWriter fw = new FileWriter(destinationFile,false); // default: true (append)
			PrintWriter pw = new PrintWriter(fw);
			
			String data;
			String elements[];
			ArrayList<Movie> aMov = new ArrayList<Movie>();
			Movie.rentFee = 6;//per day
			
			Movie mov;
			readFile.nextLine();
			while(readFile.hasNextLine()) {
				data = readFile.nextLine(); // reads per row
				elements = data.split(",");
				display(data, elements);
				
				 //instantiate an object to allocate a new memory location				
				mov= new Movie(
						elements[0],//passing the title
						Integer.parseInt(elements[1]),//passing the release_year
						Integer.parseInt(elements[2].substring(0, elements[2].length()-4))
						
						
						);
				
				aMov.add(mov) ; // add the object into the array list
			}
			
			writeToFile(pw, aMov);
			
			int rent;
			double amount;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 1 to rent a movie or 2 to exit: ");
			rent = input.nextInt();
			if(rent == 1) {
				for (int i = 0; i < aMov.size(); i++) {
					if (aMov.get(i).getDate_borrowed() == null) {
					  System.out.println(i+1 + ". " + aMov.get(i).getTitle());
					  
					  
				  }
				}
				int N;
				System.out.println("How many movies would you like to select?");
				N = input.nextInt();
				String [] movieName = new String [N];
				System.out.println("Enter the movies you want to select: ");
				for(int i = 0; i<N; i++) {
					movieName[i]  =input.next();
				}
				
				Date d = new Date();
				Date dueDate = new Date();
				Calendar date_borrowed = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
				
				System.out.printf("Current date is %s\n" ,sdf.format(d));
				
				
				System.out.println("How many days would you like to borrow?");
				int days_borrowed = input.nextInt();
		
				new GregorianCalendar();
				date_borrowed.add(Calendar.DATE, days_borrowed);
				dueDate = date_borrowed.getTime();
				System.out.print("You have it upto: ");
				System.out.printf(sdf.format(dueDate));
				
				System.out.println("\n");
				
				amount = N*days_borrowed*Movie.rentFee;
				System.out.println("Your total amount is $" + amount);
				
				int userinput;
				System.out.println("Press 1 if you want to continue selecting or press 2 to exit");
				userinput = input.nextInt();
				if(userinput == 1) {
					writeToFile(pw, aMov);
					System.out.println("The movies you rented are:" + Arrays.toString(movieName));
					System.out.println("You borrowed it on " + sdf.format(d) +" for " + days_borrowed +" days at the rate of " + Movie.rentFee + " per day per movie and you can have it upto " +  sdf.format(dueDate));
					System.out.println("Your total amount becomes: $" + amount);
					writeToFile(pw, aMov);

				}else {
					System.out.println("You exited.");
					
					
					System.exit(0);
					
					
				}
				}
			else {
				System.out.println("You exited.");
				System.exit(0);
			}

			writeToFile(pw, aMov);
			readFile.close();
			fw.close();
			input.close();
			
				
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	static void display(String original, String ...value) {
		System.out.println( original);
		for (int x=0 ;x < value.length; x++) {
			System.out.printf("   value[%d] = %s\n", x,value[x]);
		}
		System.out.println("\n");
	}
	
	// write to file
	static void writeToFile(PrintWriter destinationFile, ArrayList<Movie> value) {
		Movie mov;
		for (int x=0 ;x < value.size(); x++) {
			mov = value.get(x); 
			destinationFile.printf("%s,%d,%d\n",
					mov.getTitle(), 
					mov.getRelease_year(),
					mov.getDuration());
					
			
		}
		}
		
}


