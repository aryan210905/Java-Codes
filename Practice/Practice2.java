class Bank{
    long accountNo;
    String accountHolderName;
    String dateOfOpening;
    double interestRate;
    Bank(){
        this.accountNo = -1;
        this.accountHolderName = null;
        this.dateOfOpening = null;
        this.interestRate = -1;
    }
    Bank(long accountNo, String accountHolderName, String dateOfOpening, double interestRate){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.dateOfOpening = dateOfOpening;
        this.interestRate = interestRate;
    }
    void showDetails(){
        System.out.println("Account Number: "+accountNo);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Date of account opening: "+dateOfOpening);
        System.out.println("Interest Rate: "+interestRate + "%");
    }
    void interest(double newInterestRate){
        System.out.println("Current interest Rate: "+interestRate+"%");
        interestRate = newInterestRate;
        System.out.println("New interest Rate: "+interestRate+"%");
    }
}
class SBI extends Bank{
    SBI(long accountNo, String accountHolderName, String dateOfOpening, double interestRate){
        super(accountNo, accountHolderName, dateOfOpening, interestRate);
    }
    void interest(double newInterestRate){
        System.out.println("SBI BANK:");
        super.interest(newInterestRate);
    }
}
class HDFC extends Bank{
    HDFC(long accountNo, String accountHolderName, String dateOfOpening, double interestRate){
        super(accountNo, accountHolderName, dateOfOpening, interestRate);
    }
    void interest(double newInterestRate){
        System.out.println("HDFC BANK:");
        super.interest(newInterestRate);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        SBI sbi = new SBI(10000,"ABC","24/5/2004",4.9);
        sbi.showDetails();
        sbi.interest(10.5);
        HDFC hdfc = new HDFC(2000,"XyZ","1/1/1999",3.5);
        hdfc.showDetails();
        hdfc.interest(2.5);
    }
    
}
