
class Employee{
    double eid;
    double salary;
    String fname;
    String lname;
    Employee(){
        this.eid = 0;
        this.salary = -1;
        this.fname = null;
        this.lname = null;
    }
    Employee(double eid, double salary, String fname, String lname){
        this.eid = eid;
        this.salary = salary;
        this.fname = fname;
        this.lname = lname;
    }
    void showEmployeeDetails(){
        System.out.println("Employee id: "+eid);
        System.out.println("Employee name: "+fname+" "+lname);
        System.out.println("Employee salary: "+salary);
    }
    double incrementSalary(double incrementRate){
        salary = salary + (salary * (incrementRate/100));
        return salary;
    }
}
class SoftwareEngineer extends Employee{
    String projectName;
    String position;
    double teamId;
    String teamLeadName;
    SoftwareEngineer(){
        super();
        this.projectName = null;
        this.position = null;
        this.teamId = 0;
        this.teamLeadName = null;
    }
    SoftwareEngineer(double eid, double salary, String fname, String lname, String projectName, String position,
                      double teamId, String teamLeadName){
        super(eid,salary,fname,lname);
        this.projectName = projectName;
        this.position = position;
        this.teamId = teamId;
        this.teamLeadName = teamLeadName;
    }
    void showTeamDetails(){
        super.showEmployeeDetails();
        System.out.println("Software engineer position: "+position);
        System.out.println("Team id: "+teamId);
        System.out.println("Team project: "+projectName);
        System.out.println("Team leader name: "+teamLeadName);
    }
    void changeTeam(String newProjectName, double newTeamId, String newTeamLeadName){
        this.projectName = newProjectName;       
        this.teamId = newTeamId;
        this.teamLeadName = newTeamLeadName;
        System.out.println("Successfully changed team of employee "+fname+" "+lname);
    }
}
class Manager extends Employee{
    long noOfEmployeesManaging;
    Manager(){
        super();
        this.noOfEmployeesManaging = -1;
    }
    Manager(double eid, double salary, String fname, String lname, long noOfEmployeesManaging){
        super(eid,salary,fname,lname);
        this.noOfEmployeesManaging = noOfEmployeesManaging;
    }
    void showManagerDetails(){
        super.showEmployeeDetails();
        System.out.println("Number of employees managed by "+fname+" "+lname+" are: "+noOfEmployeesManaging);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        SoftwareEngineer se1 = new SoftwareEngineer();

        SoftwareEngineer se2 = new SoftwareEngineer(1,100,"Aryan","Shah","AI Chatbot","Senior SE",394,"Jay Singhania");
        
        Manager mg1 = new Manager();
        
        Manager mg2 = new Manager(150,10000,"Krish","Gupta",500);

        
        se1.showTeamDetails();    
        se2.showTeamDetails();
        System.out.println("New salary: "+se2.incrementSalary(5));
        se2.changeTeam("AI interface", 500, "Rahil Shah");
        se2.showTeamDetails();
        mg1.showManagerDetails();
        mg2.showManagerDetails();                  
    }
}
