package week3;

import java.util.Scanner;

public class Problem4_5_100377444 {

	public static void main(String[] args) {
		//input
		double n;
		double s;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides:");
		n = input.nextDouble();
		System.out.print("Enter the side:");
        s = input.nextDouble();
        //process
        double Area = (n*Math.pow(s, 2))/(4*(Math.tan(Math.PI/n)));
        
        //output
        System.out.print("Tne area of the polygon is "+Area);
        
        input.close();
	}

}
