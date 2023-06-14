import java.util.Scanner;

public class Problem3_100377444 {

	public static void main(String[] args) {
		int N;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the numbers of elements you want to add in the array: ");
	    N = input.nextInt();	
	   
	    double [] array = new double[N];
		
	    System.out.println("The average is " + average(array));
	    input.close();
	}
	
	
	public static double average(double[] array) {
		double average = 0;
		double sum = 0;
		System.out.println("Enter the array: ");
		for(int i = 0; i< array.length; i++) {
			Scanner input = new Scanner(System.in);
			array[i]= input.nextDouble();
			//double sum = 0;
			sum += array[i];
			average = sum/array.length;
			//System.out.println("Average = "+ average);
	}
		return average;

	}
	public static double average(int [] array) {
		int average = 0;
		int sum = 0;
		System.out.print("Enter the array: ");
		for(int i = 0; i< array.length; i++) {
			Scanner input = new Scanner(System.in);
			array[i]= input.nextInt();
			sum += array[i];
			average = sum/array.length;
		}
		return average;
	}
}
