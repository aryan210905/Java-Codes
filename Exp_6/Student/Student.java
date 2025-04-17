package Exp_6.Student;
public class Student{
    int rollNo;
    String name;
    String branch;
    double marks;
    public Student(){}
    public Student(int rollNo, String name, String branch){
        this.rollNo = rollNo;
        this.name = name;
        this.branch=branch;
    }
    public void showMarks(double marks){
        if(marks>100 || marks<0) System.out.println("Invalid Marks!");
        this.marks = marks;
        this.showStudentDetails();
    }
    public void showStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Branch: "+branch);
        System.out.println("Marks: "+marks);
    }
}