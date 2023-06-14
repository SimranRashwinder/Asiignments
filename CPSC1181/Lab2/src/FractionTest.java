import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner to take input
        int option = 0;
        // I used do while loop to continue the program until user enters 1 to stop
        do {
            System.out.println("Enter the numerator of 1st fraction:");

            int a = input.nextInt();

            System.out.println("Enter the denominator of 1st fraction:");
            int b = input.nextInt();

            System.out.println("Enter the numerator of 2nd fraction:");
            int c = input.nextInt();

            System.out.println("Enter the denominator of 2nd fraction:");
            int d = input.nextInt();

            Fraction f1 = new Fraction(a, b); //1st fraction
            Fraction f2 = new Fraction(c, d); //2nd fraction
            Fraction f3 = f1.add(f2);  //addition
            Fraction f4 = f1.multiply(f2);   //multiplication
            Fraction f5 = f1.subtract(f2);   //subtraction

            System.out.println(f3);
            System.out.println(f4);
            System.out.println(f5);

            System.out.println("Enter 1 to stop or 0 to continue!");
            option = input.nextInt();
        } while (option !=1);

    }
}