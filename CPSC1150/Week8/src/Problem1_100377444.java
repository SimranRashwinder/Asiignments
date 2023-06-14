import java.util.Scanner;

public class Problem1_100377444 {

	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a = input.nextInt();
		reverseDisplay(a);

		input.close();
	}
	
	public static void reverseDisplay(int b) {
		if (b>0) {
			System.out.print(b%10);
			reverseDisplay(b/10);
		}
	}

}
