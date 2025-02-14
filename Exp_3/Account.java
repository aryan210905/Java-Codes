
import java.util.Scanner;
// exp 7
public class Account {
    private String accountNo;
    private String name;
    private double balance;
    Account(String accountNo,String name,double balance){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    public  void displayData(){
        System.out.println("Account number: " + this.accountNo);
        System.out.println("Name of account holder: " + this.name);
        System.out.println("Bank balance: " + this.balance);
    }
    public String getAccountNo(){
        return this.accountNo;
    }
    public static void searchAccount(String inputAccNo, Account[] acc){
        int n = acc.length;
        for(int i=0;i<n;i++){
            if(inputAccNo.equals(acc[i].getAccountNo())){
                acc[i].displayData();
                return;
            }
        }
        System.out.println("Account not found");
    }

    public static void main(String[] args) {
        Account acc1 = new Account("1","AAA",1000);
        Account acc2 = new Account("2","BBB",1000);
        Account acc3 = new Account("3","CCC",1000);
        Account acc4 = new Account("4","DDD",1000);
        Account acc5 = new Account("5","EEE",1000);

        Scanner sc = new Scanner(System.in);

        Account[] arr = {acc1,acc2,acc3,acc4,acc5};

        System.out.print("Enter account number to search: ");
        String inputAccNo = sc.next();
        searchAccount(inputAccNo, arr);
        sc.close();
    }
}
