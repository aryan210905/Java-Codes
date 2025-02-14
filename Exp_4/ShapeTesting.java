import java.lang.Math;
class Shape{
    double a;
    double b;
    Shape(){
        this.a = 0;
        this.b = 0;
    }
    Shape(double a,double b){
        this.a = a;
        this.b = b;
    }
    void getData(double a,double b){
        this.a = a;
        this.b = b;
    }
    double display_area(){return 0.0;}
}
class RectangleClass extends Shape{
    RectangleClass(){
        super();
    }
    RectangleClass(double a,double b){
        super(a,b);
    }
    double display_area(){
        return a*b;
    }
}
class TriangleClass extends Shape{
    double c;
    TriangleClass(){
        super();
    }
    TriangleClass(double a,double b,double c){
        super(a,b);
        this.c = c;
    }
    double display_area(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class ShapeTesting{
    public static void main(String[] args) {
        Shape sh;
        sh = new RectangleClass(1,2);
        System.out.println(sh.display_area());

        sh = new TriangleClass(3,4,5);
        System.out.println(sh.display_area());
    }
}
