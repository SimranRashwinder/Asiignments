public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount(int anAccountNumber){

        balance = 0;
        accountNumber = anAccountNumber;
        if(anAccountNumber<1000 || anAccountNumber>9999){
           throw new BankAccountException("Bank account number is incorrect!");
        }
    }

    public BankAccount(int anAccountNumber, double initialBalance){

        balance = initialBalance;
        accountNumber = anAccountNumber;
        if(initialBalance<0){
            throw new BankAccountException("Balance should be grater than Zero. ");
        }
    }

    public double getBalance() {

        return balance;
    }

    public int getAccountNumber(){

        return accountNumber;
    }

    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount){
        if (balance< amount){
            throw new BankAccountException("Balance is not adequate.");
        }else
        balance -= amount;

    }

    @Override
    public String toString(){

        return "Account Number: " + accountNumber + "  balance: " + balance;
    }
}


