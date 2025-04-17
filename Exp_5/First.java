package Exp_5;
import java.util.Scanner;
import java.lang.Math;
abstract class Shape{
    double a,b;
    Shape(){}
    abstract double area();    
}
class Triangle extends Shape{
    double a,b,c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double area(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
class Rectangle extends Shape{
    double a,b;
    Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    double area(){
        return a*b;
    }
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    double area(){
        return Math.PI*r*r;
    }
}
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of triangle: ");
        Triangle t = new Triangle(sc.nextDouble(),sc.nextDouble() ,sc.nextDouble() );
        System.out.println("Area: "+t.area());

        System.out.print("Enter dimensions of rectangle: ");
        Rectangle r = new Rectangle(sc.nextDouble() ,sc.nextDouble() );
        System.out.println("Area: "+r.area());

        System.out.print("Enter radius of circle: ");
        Circle c = new Circle(sc.nextDouble() );
        System.out.println("Area: "+c.area());
        sc.close();
    }
}
