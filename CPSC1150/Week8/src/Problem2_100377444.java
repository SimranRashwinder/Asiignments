import java.util.Scanner;

public class Problem2_100377444 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String A = input.nextLine();
		System.out.println("Enter a charater from the string: ");
		char B = input.next().charAt(0);
		input.close();
		System.out.println(count(A,B));

	}
	
	public static int count(String str, char a) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if (a == str.charAt(i)) {
				
				count++;
			}
			else if(a != str.charAt(i)) {
				count = 0;
			}
		}
		return count;
		
	}

}
