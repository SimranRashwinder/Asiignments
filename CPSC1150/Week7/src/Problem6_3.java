import java.util.Scanner;

public class Problem6_3 {
	public static void main(String[] args) {
   	 int n ;
   	 Scanner input = new Scanner(System.in);
   	 System.out.println("Enter a number: ");
   	 n = input.nextInt();
   	 
   	 if( isPalindrome(n)) {
   		 System.out.println("Palindrome");
   	 }
   	 else {
   		 System.out.println("is not Palindrome");
   	 }
    }
    public static int reverse(int n) {
   	 int r;
   	 int reverse =0;
   	 while(n!=0) {
   		 r = n%10;
   		 reverse = reverse*10 + r;
   		 n=n/10;
   	 }
		return reverse;
    }
    public static boolean isPalindrome(int n) {
   	 if(n!=reverse (n) ) 
        return false;
		return false ;
		
    }

}
