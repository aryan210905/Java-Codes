
import java.util.Scanner;
import java.lang.Math;
class Shape{
    double l;
    double b;
    double a;
    double c;

    Shape(){}
    Shape(double l){
        this.l = l;
    }
    Shape(double l,double b){
        this.l = l;
        this.b = b;
    }
    Shape(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class Square extends Shape{
    Square(){}
    Square(double l){
        super(l);
    }
    double area(){
        return l*l;
    }
}
class Rectangle extends Shape{
    Rectangle(){}
    Rectangle(double l,double b){
        super(l,b);
    }
    double area(){
        return l*b;
    }
}
class Triangle extends Shape{
    Triangle(){}
    Triangle(double a,double b, double c){
        super(a,b,c);
    }
    double area(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square(sc.nextDouble());
        Rectangle rec = new Rectangle(sc.nextDouble(),sc.nextDouble());
        Triangle tr = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        System.out.println("Area of square: "+sq.area());
        System.out.println("Area of rectangle: "+rec.area());
        System.out.println("Area of triangle: "+tr.area());
        sc.close();
    }
}