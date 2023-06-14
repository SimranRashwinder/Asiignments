import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class W9Demo1 {
	
	public static void main(String arg[]) {
		try {
			String sourceFilename = "./src/MOCK_DATA.csv";
			String destinationFile = "./src/Result";
			
			// this is for reading the file
			File f = new File(sourceFilename);
			Scanner readFile = new Scanner(f);
			
			
			
			// this is for writing to a file
			FileWriter fw = new FileWriter(destinationFile,false); // default: true (append)
			PrintWriter pw = new PrintWriter(fw);
			
			String data;
			String elements[];
			ArrayList<Employee> aEmp = new ArrayList<Employee>();
			
			Employee emp;
			while(readFile.hasNextLine()) {
				data = readFile.nextLine(); // reads per row
				elements = data.split(",");
				display(data, elements);
				
				// instantiate an object to allocate a new memory location
				emp = new Employee(
						Integer.parseInt(elements[0]),  // converting first element to an int
						elements[1], // passing firstname
						elements[2], // passing lastname
						elements[3], // passing the email
						Double.parseDouble(elements[4]) // converting the salary to double 
						);
				
				aEmp.add(emp) ; // add the object into the array list
			}

			writeToFile(pw,aEmp);
			readFile.close();
			fw.close();
			
			
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	// to display to console, review of vargs
	static void display(String original, String ...value) {
		System.out.println("Original data: " + original);
		System.out.println("# of elements: " + value.length);
		for (int x=0 ;x < value.length; x++) {
			System.out.printf("   value[%d] = %s\n", x,value[x]);
		}
		System.out.println("\n");
	}
	
	// write to file
	static void writeToFile(PrintWriter dest, ArrayList<Employee> value) {
		Employee emp;
		for (int x=0 ;x < value.size(); x++) {
			emp = value.get(x); // get a reference to the Object
			// when writing to a text file, you can use comma delimited or fixed length 
			// this is comma delimited
			dest.printf("%d,%s,%s,%s,%.2f,%.2f\n", emp.getId(), emp.getFirstname(),emp.getLastname(),
					emp.getEmail(),
					emp.getSalary(),
					emp.getBonus());
		}
	}
}



