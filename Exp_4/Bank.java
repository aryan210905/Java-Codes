class BankAccount{
    long AccNo;
    String AccHolderName;
    String DateOfOpening;
    double interestRate;
    double balance;

    BankAccount(){
        this.AccNo = 0;
        this.AccHolderName = null;
        this.DateOfOpening = null;
        this.interestRate = 0.0;
        this.balance = 0.0;
    }
    BankAccount(long AccNo, String AccHolderName, String DateOfOpening, double interestRate, double balance){
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.DateOfOpening = DateOfOpening;
        this.interestRate = interestRate;
        this.balance = balance;
    }
    void displayDetails(){
        System.out.println("Account number: "+AccNo);
        System.out.println("Account holder name: "+AccHolderName);
        System.out.println("Date of account opening: "+DateOfOpening);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Balance amount: "+balance);
    }
    void openAccount(long AccNo, String AccHolderName, String DateOfOpening, double interestRate, double balance){
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.DateOfOpening = DateOfOpening;
        this.interestRate = interestRate;
        this.balance = balance;
    }
    double checkBalance(){
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    double minBalance;
    double withdrawlLimit;
    SavingsAccount(long AccNo, String AccHolderName, String DateOfOpening, double interestRate, double balance, double minBalance, double withdrawlLimit ){
        super(AccNo, AccHolderName, DateOfOpening, interestRate,balance);
        this.minBalance = minBalance;
        this.withdrawlLimit = withdrawlLimit;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Minimum Balance: "+minBalance);
        System.out.println("Withdrawal limit: "+withdrawlLimit);
    }
    void openAccount(long AccNo, String AccHolderName, String DateOfOpening, double interestRate, double balance, double minBalance, double withdrawlLimit){
        super.openAccount(AccNo, AccHolderName, DateOfOpening, interestRate, balance);
        this.minBalance = minBalance;
        this.withdrawlLimit = withdrawlLimit;
        System.out.println("Succesfully opened new account");
    }
    double deposit(double amountToDeposit){
        double currentBalance = super.balance;
        currentBalance += amountToDeposit;
        return currentBalance;
    }
    double withdraw(double amountToWithdraw){
        if(amountToWithdraw > withdrawlLimit){
            System.out.println("Withdrawl amount greater than limit");
            return -1;
        }
        double currentBalance = super.balance;
        if(amountToWithdraw > currentBalance){
            System.out.println("Withdrawl amount greater than bank balance");
            return -1;
        }
        currentBalance -= amountToWithdraw;
        return currentBalance;
    }
}

class FixedDepositAccount extends BankAccount{
    double tenure;
    String maturityDate;
    double penalty;
    FixedDepositAccount(long AccNo, String AccHolderName, String DateOfOpening, double interestRate, double balance, double tenure,String maturityDate, double penalty){
        super(AccNo, AccHolderName, DateOfOpening, interestRate,balance);
        this.tenure = tenure;
        this.maturityDate = maturityDate;
        this.penalty = penalty;
    }
    double calInterest(){
        double currentBalance = super.balance;
        double interestRate = super.interestRate;
        return currentBalance * (interestRate / 100);
    } 
}
class Bank{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(100, "Aryan Shah", "10-12-2023", 5, 100000, 1000, 10000);
        sa.displayDetails();
        System.out.println("After deposit, current balance: "+sa.deposit(50000));
        System.out.println("After withdrawl, current balance: "+sa.withdraw(9000));        
        sa.checkBalance();

        FixedDepositAccount fd = new FixedDepositAccount(101, "Jay Patel", "1-1-2014", 10, 100000, 3, "1-1-2017", 5000);
        fd.displayDetails();
        fd.calInterest();
    }
}