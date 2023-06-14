/**This project is created by Simran, course :CPSC 1181, ASSIGNMENT 4
 * I used all the 4 classes provided by professor
 * This BankTester class have main method  which is used to test Bank and BankAccount class and handle the errors.
 * I will use scanner to get input from user.
 */

import java.util.Scanner;
public class BankTester {
    public static void main(String[] args) {
        Bank b = new Bank();  // bank object to store the accounts
        int accountNum;
        double balance;
        boolean run = true;
        // Scanner is used to
        // 12
        // take input
        Scanner in = new Scanner(System.in);
        /** I am going to create the menu first to instruct the user
         * I will give some number examples like 1 to add account....7 to stop the program
         * I am using switch statements in this and numbers are used as cases and userInput to take the input from user
         */

        while(run){
            System.out.println("Menu for using the Bank(Enter the number for the task you want to perform): \n1 to add a new account \n2 to get the balance \n3 to deposit the money \n4 to Withdraw the money \n5 to find an account with maximum balance and minimum balance \n6 to exit the process");
            int userInput = 0;
            userInput = in.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("Enter the account number:");
                    accountNum = in.nextInt();
                    System.out.println("Enter the balance:");
                    balance = in.nextDouble();
                    BankAccount a = new BankAccount(accountNum, balance);
                    b.addAccount(a);
                    System.out.println("New account have " +  a);
                    break;

                case 2:
                    System.out.println("Enter the account number:");
                    accountNum = in.nextInt();
                    BankAccount c = Bank.find(accountNum);
                    System.out.println("New account have " + c.getBalance());
                    break;

                case 3:
                    System.out.println("Enter the account number:");
                    accountNum = in.nextInt();
                    BankAccount d = Bank.find(accountNum);
                    System.out.println("Enter the amount you want to add:");
                    double amounts = in.nextDouble();
                    Bank.deposit(accountNum,amounts);
                    System.out.println("New account have " + d);
                    break;

                case 4:
                    System.out.println("Enter the account number:");
                    accountNum = in.nextInt();
                    BankAccount e = Bank.find(accountNum);
                    System.out.println("Enter the amount you want to withdraw:");
                    double withdrawAmounts = in.nextDouble();
                    Bank.withdraw(accountNum,withdrawAmounts);
                    System.out.println("New account have " + e);
                    break;

                case 5:
                    System.out.println("Enter 1 for account with maximum balance and 2 for minimum balance::");
                    int i = in.nextInt();
                    if(i == 1){
                        double aL = 0;
                        Bank.count(aL);
                        Bank.getMaximum();
                    }
                    if(i == 2){
                        Bank.getMinimum();
                    }
                    break;

                case 6:
                    run = false;
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.print("error");

            }

        }
    }
}
