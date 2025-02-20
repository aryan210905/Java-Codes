package Practice.Inheritance;
class Person{
    String fname;
    String mname;
    String lname;
    int age;
    Person(){
        this.fname = null;
        this.mname = null;
        this.lname = null;
        this.age = -1;        
    }
    Person(String fname, String mname, String lname, int age){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.age = age;
    }
    void showDetails(){
        System.out.println("Name: "+fname+" "+mname+" "+lname);
        System.out.println("Age: "+age);
    }
}
class Student extends Person{
    long studentID;
    double marks;
    Student(){
        super();
        this.studentID = 0;
        this.marks = -1;            
    }
    Student(String fname, String mname, String lname, int age, long studentID, double marks){
        super(fname, mname, lname, age);
        this.studentID = studentID;
        this.marks = marks;
    }
    void showDetails(){
        super.showDetails();
        System.out.println("Student ID: "+studentID);
        System.out.println("Marks: "+marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aryan","Ritesh","Shah",19,6007,99);
        s1.showDetails();
        s2.showDetails();
    }   
}
