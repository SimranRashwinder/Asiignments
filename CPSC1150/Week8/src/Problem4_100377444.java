import java.util.Scanner;

public class Problem4_100377444 {
	
	public static void main(String[] args) {
		int N;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of elements that you want in the array: ");
		N = input.nextInt();
		
		double [] array = new double[N];
		
		
		System.out.println(" The minimum value is " + min(array));
		
		input.close();
	}
	
	public static double min(double[] array) {
		double min = array[0];
		System.out.print("Enter the array: ");
		for(int i = 0; i< array.length; i++) {
			Scanner input = new Scanner(System.in);
			array[i]= input.nextDouble();
			if (array[i]< min) {
				min = array[i];
			}
		}
		return min;
	}
	
	



}
