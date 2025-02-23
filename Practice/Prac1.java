class Parent{
    int a;
    Parent(){a=5;}
    Parent(int a){
        this.a = a;
    }
    void show(){
        System.out.println("In parent class");
    }
}
class Child extends Parent{
    int b;
    Child(){
        super();
        b = 1;
    }
    Child(int a,int b){
        super(a);
        this.b = b;
    }
    void show(){
        System.out.println("In child class");
    }
}

class Prac1{
    public static void main(String[] args) {
        Parent p = new Child(2,4);
        System.out.println(p);
        p.show();
        System.out.println(p.a);
    }
}