import java.util.Scanner;

public class W5D5 {

	public static void main(String[] args) {
		int u[] = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i <u.length; i++) {
			System.out.println("Enter a number:");
			u[i]= input.nextInt();
		} 
        System.out.println(adding("somethiong",u));
        input.close();
	}

	static int adding (String msg; int...val) {
		int sum =0;
		System.out.println("");
		
	}


