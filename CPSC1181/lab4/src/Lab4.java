import java.util.Scanner;

/**This project is submitted by Simran
 * In this I will do some mathematical calculations and check for different errors and throw exceptions
 */
public class Lab4 {
    public static void main(String[] args) {
    boolean run=true;

        String operator = null;
        while (run){
            try {

                System.out.println("Let's do some calculations.\nEnter the expression. Please add spaces between numbers and operator:");
                Scanner input = new Scanner(System.in);
                int x = input.nextInt();
                operator = input.next();
                int y = input.nextInt();


                switch (operator) {
                    case "+":
                        System.out.println("x + y = " + (x + y));
                        break;
                    case "-":
                        System.out.println("x - y = " + (x - y));
                        break;
                    case "*":
                        System.out.println("x*y = " + (x * y));
                        break;
                    case "/":
                        System.out.println("x/y = " + (x / y));
                        break;
                    case "%":
                        System.out.println("x%y = " + (x % y));
                        break;
                    case "q":
                        run=false;
                        break;
                    default:
                        throw new IllegalArgumentException();

                }
            } catch (IllegalArgumentException exception) {
                System.out.println("Operator is incorrect");
            } catch (ArithmeticException exception) {
                System.out.println("Divide / zero, input is invalid");
            } catch (Exception InputMismatchException) {
                System.out.println("Input must be integer.");
            }

        }

    }
}

