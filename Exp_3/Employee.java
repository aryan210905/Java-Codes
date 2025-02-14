
// exp-4
import java.util.Scanner;
public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double salary;
    public void getData(){
        System.out.println("Enter name of employee: ");
        this.name = sc.next();
        System.out.println("Enter salary of employee: ");
        this.salary = sc.nextDouble();
        System.out.println("Successfully added data");
    }
    public void putData(){
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.getData();
        emp1.putData();

        emp2.getData();
        emp2.putData();


    }
}
