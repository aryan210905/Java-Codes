class Person{
    String name;
    int age;
    Person(){
        this.name = null;
        this.age = -1;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Student extends Person{
    long studentId;
    Student(){
        super();
        this.studentId = -1;
    }
    Student(String name, int age, long studentId){
        super(name,age);
        this.studentId = studentId;
    }
    void showDetails(){
        super.showDetails();
        System.out.println("Student ID: "+studentId);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student("Aryan",19,1004);
        s1.showDetails();               
    }
}
