import java.util.Scanner;

public class Problem2_100377444 {

  public static void main(String[] args) {
	//input
	String name;
	double hours;
	double pay;
	double  ft;
	double st;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter employee's name: ");
	name = input.next();
	System.out.print("Enter the number of hours worked in a week: ");
	hours = input.nextDouble();
	System.out.print("Enter hourly pay rate: ");
	pay = input.nextDouble();
	System.out.print("Enter federal tax withholding rate: ");
	ft = input.nextDouble();
	System.out.print("Enter state tax withholding rate: ");
	st = input.nextDouble();
	//process
	double gp = hours*pay;
	double f = gp*ft;
	double s = gp*st;
	double d = f+s;
	double net = gp - d;
	//output
	System.out.println("\n");
	System.out.println("Employee Name: "+ name);
	System.out.println("Hours Worked: " + hours);
	System.out.println("Pay Rate: $"+ pay);
	System.out.println("Gross Pay: $"+ gp);
	System.out.println("Deductions:");
	System.out.println("   Federal Withholding ("+ ft*100 + ")% : $" + f);
	System.out.println("   State Withholding ("+ st*100 + ")% : $" + s);
	System.out.println("Total Deduction: "+ d);
	System.out.println("Net Pay: $" + net);

	input.close();
	}

}
